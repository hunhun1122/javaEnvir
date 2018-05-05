<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/global.jsp" %>
<script type="text/javascript">
    var appDataGrid;
    $(function() {
        appDataGrid = $('#appDataGrid').datagrid({
            url : '${path }/staff/dataGrid',
            striped : true,
            rownumbers : true,
            pagination : true,
            singleSelect : true,
            idField : 'id',
            sortName : 'id',
            sortOrder : 'asc',
            pageSize : 20,
            pageList : [ 10, 20, 30, 40, 50, 100, 200, 300, 400, 500 ],
            frozenColumns : [ [ {
                width : '100',
                title : 'id',
                field : 'id',
                hidden : true
            },
            {
                width : '100',
                title : '部门',
                field : 'departinfo',
                sortable : true
            }
            , {
                width : '80',
                title : '工号',
                field : 'gonghao',
                sortable : true
            } , {
                width : '80',
                title : '姓名',
                field : 'name',
                sortable : true
            },  {
                width : '150',
                title : '身份证',
                field : 'shenfenid',
                sortable : true
            }
            ,  {
                width : '150',
                title : '银行卡',
                field : 'yinhangka',
                sortable : true
            }, {
                width : '80',
                title : '数据状态',
                field : 'state',
                sortable : true,
                formatter : function(value, row, index) {
                    switch (value) {
                    case 0:
                        return '正常';
                    case 1:
                        return '停用';
                    }
                }
            }, {
                width : '80',
                title : '操作人员',
                field : 'createname',
                sortable : true
            }, {
                width : '140',
                title : '操作日期',
                field : 'createdate',
                sortable : true
            }
            
            
            , {
                field : 'action',
                title : '操作',
                width : 200,
                formatter : function(value, row, index) {
                    var str = '';                      
                        <shiro:hasPermission name="/staff/edit">
                            str += '&nbsp;&nbsp;|&nbsp;&nbsp;';
                            str += $.formatString('<a href="javascript:void(0)" class="role-easyui-linkbutton-edit" data-options="plain:true,iconCls:\'fi-pencil icon-blue\'" onclick="editEquipFun(\'{0}\');" >编辑</a>', row.id);
                        </shiro:hasPermission>
                        <shiro:hasPermission name="/staff/delete">
                            str += '&nbsp;&nbsp;|&nbsp;&nbsp;';
                            str += $.formatString('<a href="javascript:void(0)" class="role-easyui-linkbutton-del" data-options="plain:true,iconCls:\'fi-x icon-red\'" onclick="deleteEquipFun(\'{0}\');" >删除</a>', row.id);
                        </shiro:hasPermission>
                    return str;
                }
            } ] ],
            onLoadSuccess:function(data){              
                $('.role-easyui-linkbutton-edit').linkbutton({text:'编辑'});
                $('.role-easyui-linkbutton-del').linkbutton({text:'删除'});
            },
            toolbar : '#roleToolbar'
        });
    });

    function addEquipFun() {
        parent.$.modalDialog({
            title : '添加',
            width : 500,
            height : 300,
            href : '${path }/staff/addPage',
            buttons : [ {
                text : '确定',
                handler : function() {
                    parent.$.modalDialog.openner_dataGrid = appDataGrid;//因为添加成功之后，需要刷新这个treeGrid，所以先预定义好
                    var f = parent.$.modalDialog.handler.find('#EquipAddForm');
                    f.submit();
                }
            } ]
        });
    }

    function editEquipFun(id) {
        if (id == undefined) {
            var rows = appDataGrid.datagrid('getSelections');
            id = rows[0].id;
        } else {
            appDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
        }
        parent.$.modalDialog({
            title : '编辑',
            width : 500,
            height : 300,
            href : '${path }/staff/editPage?id=' + id,
            buttons : [ {
                text : '确定',
                handler : function() {
                    parent.$.modalDialog.openner_dataGrid = appDataGrid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                    var f = parent.$.modalDialog.handler.find('#EquipEditForm');
                    f.submit();
                }
            } ]
        });
    }

    function deleteEquipFun(id) {
        if (id == undefined) {//点击右键菜单才会触发这个
            var rows = appDataGrid.datagrid('getSelections');
            id = rows[0].id;
        } else {//点击操作里面的删除图标会触发这个
            appDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
        }
        parent.$.messager.confirm('询问', '您是否要停用当前数据？', function(b) {
            if (b) {
                progressLoad();
                $.post('${path }/staff/delete', {
                    id : id
                }, function(result) {
                    if (result.success) {
                        parent.$.messager.alert('提示', result.msg, 'info');
                        appDataGrid.datagrid('reload');
                    }
                    progressClose();
                }, 'JSON');
            }
        });
    }

    
</script>
<div class="easyui-layout" data-options="fit:true,border:false">
    <div data-options="region:'center',fit:true,border:false">
        <table id="appDataGrid" data-options="fit:true,border:false"></table>
    </div>
</div>
<div id="roleToolbar" style="display: none;">
    <shiro:hasPermission name="/staff/add">
        <a onclick="addEquipFun();" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'fi-plus icon-green'">添加</a>
    </shiro:hasPermission>
</div>