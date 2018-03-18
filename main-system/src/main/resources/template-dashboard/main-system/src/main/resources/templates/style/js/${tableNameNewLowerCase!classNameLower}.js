<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign tableNameNew = table.tableNameNew>
<#assign tableNameNewLowerCase = table.tableNameNewLowerCase>
${r'$'}(function () {
    ${r'$'}(".col-md-12").append("<div id='toolbar' style='padding: 8px 0px;'><a href='/${tableNameNewLowerCase!classNameLower}/to_add_${tableNameNewLowerCase!classNameLower}' class='btn btn-primary'>添加用户</a></div>");
})

function ajaxDel(id) {
    layer.msg('你确定要删除吗？', {
        time: 0 //不自动关闭
        , btn: ['删除', '取消']
        , yes: function (index) {
            ${r'$'}.ajax({
                url: "/${tableNameNewLowerCase!classNameLower}/remove_${tableNameNewLowerCase!classNameLower}",
                data: {"id": id},
                type: 'POST',
                dataType: "json",
                success: function (data, msg, obj, referer) {
                    layer.msg(data.msg, {icon: 1}, function () {
                        if (data.referer) {
                            window.location.reload()
                            // operaModel.reloadPage(window);//返回带跳转地址
                        } else {
                            if (data.state == 'success') {
                                window.location.reload();
                            }
                        }
                    }, {time: 1000});
                }
            })
        }
    });

}

