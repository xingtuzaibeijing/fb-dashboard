$(function () {
    layer.msg("121221", {icon: 2});
})
function ajaxDel(id){
    layer.msg("121221", {icon: 2});
    $.ajax({
        url : '/remove_resource/'+id,
        cache : false,
        type: 'GET',
        dataType : "json",
        success : function(data){
            $("#"+id+" li").remove();
            if(data!=null){
                $.each(data,function(n,value){
                    $("#"+id).append("<li class='nav-item start active open'> <a href='"+value.menuResource+"' class='nav-link ' target='mainFrame'> <i class='icon-bar-chart'></i> <span class='title'>"+value.menuName+"</span> <span class='selected'></span> </a></li>");
                });
                boo=false;
            }
        }
    });
}