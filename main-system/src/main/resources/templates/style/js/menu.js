$(function () {
    $(".col-md-12").append("<div id='toolbar' style='padding: 8px 0px;'><a href='/menu/to_add_menu' class='btn btn-primary'>添加用户</a></div>");
})

function ajaxDel(id) {
    layer.msg('你确定要删除吗？', {
        time: 0 //不自动关闭
        , btn: ['删除', '取消']
        , yes: function (index) {
            $.ajax({
                url: "/menu/remove_menu",
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

