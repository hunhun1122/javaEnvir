<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/global.jsp" %>
<script type="text/javascript">
    $(function() {
    	 $('#belongorg').combotree({
             url : '${path }/organization/tree',
             parentField : 'pid',
             lines : true,
             panelHeight : 'auto',
             value : '${equipment.belongorg}'
         });
        $('#EquipEditForm').form({
            url : '${path }/equipment/edit',
            onSubmit : function() {
                progressLoad();
                var isValid = $(this).form('validate');
                if (!isValid) {
                    progressClose();
                }
                return isValid;
            },
            success : function(result) {
                progressClose();
                result = $.parseJSON(result);
                if (result.success) {
                    parent.$.modalDialog.openner_dataGrid.datagrid('reload');//之所以能在这里调用到parent.$.modalDialog.openner_dataGrid这个对象，是因为user.jsp页面预定义好了
                    parent.$.modalDialog.handler.dialog('close');
                } else {
                    parent.$.messager.alert('错误', result.msg, 'error');
                }
            }
        });
        
        $("#state").val('${equipment.state}');
       
    });
</script>
<div class="easyui-layout" data-options="fit:true,border:false">
    <div data-options="region:'center',border:false" title="" style="overflow: hidden;padding: 3px;">
        <form id="EquipEditForm" method="post">
            <table class="grid">
                <tr>
                    <td>所属部门</td>
                    <td><select id="belongorg" name="belongorg" style="width: 140px; height: 29px;" class="easyui-validatebox" data-options="required:true" "></select></td>
                </tr>
                
                 <tr>
                    <td>编号</td>
                    <td><input name="code" type="text" placeholder="请输入编号" class="easyui-validatebox span2" data-options="required:true" value="${equipment.code}"></td>
                </tr>
                
                
                <tr>
                    
                    <td>名称</td>
                    <td><input name="id" type="hidden"  value="${equipment.id}">
                    <input name="name" type="text" placeholder="请输入角色名称" class="easyui-validatebox" data-options="required:true" value="${equipment.name}"></td>
                </tr>
                <tr>
                    <td>排序</td>
                    <td><input name="seq"  class="easyui-numberspinner" style="width: 140px; height: 29px;" required="required" data-options="editable:false" value="${equipment.seq}"></td>
                </tr>
                <tr>
                    <td>状态</td>
                    <td >
                        <select id="state" name="state" class="easyui-combobox" data-options="width:140,height:29,editable:false,panelHeight:'auto'">
                            <option value="0">正常</option>
                            <option value="1">停用</option>
                        </select>
                    </td>
                </tr>
               
            </table>
        </form>
    </div>
</div>