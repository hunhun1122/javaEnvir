<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/global.jsp" %>
<script type="text/javascript">
    var appDataGrid;
    $(function() {
        appDataGrid = $('#appDataGrid').datagrid({
            url : '${path }/wabase/dataGrid',
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
                width : '60',
                title : '个人养老',
                field : 'yanglao1',
                sortable : true
            }
            , {
                width : '60',
                title : '个人医疗',
                field : 'yiliao1',
                sortable : true
            } , {
                width : '60',
                title : '个人失业',
                field : 'shiye1',
                sortable : true
            },  {
                width : '60',
                title : '个人生育',
                field : 'shengyu1',
                sortable : true
            }
            ,  {
                width : '60',
                title : '个人工伤',
                field : 'gongshang1',
                sortable : true
            },  {
                width : '60',
                title : '个人意外',
                field : 'yiwai1',
                sortable : true
            },  {
                width : '80',
                title : '个人公积金',
                field : 'gongjijin1',
                sortable : true
            }, {
                width : '60',
                title : '公司养老',
                field : 'yanglao2',
                sortable : true
            }
            , {
                width : '60',
                title : '公司医疗',
                field : 'yiliao2',
                sortable : true
            } , {
                width : '60',
                title : '公司失业',
                field : 'shiye2',
                sortable : true
            },  {
                width : '60',
                title : '公司生育',
                field : 'shengyu2',
                sortable : true
            }
            ,  {
                width : '60',
                title : '公司工伤',
                field : 'gognshang2',
                sortable : true
            },  {
                width : '60',
                title : '公司意外',
                field : 'yiwai2',
                sortable : true
            },  {
                width : '80',
                title : '公司公积金',
                field : 'gongjijin2',
                sortable : true
            }
            , {
                width : '60',
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
                width : '60',
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