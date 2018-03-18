function addNote(id,note){
         $.ajax({
        url : '/report/get_menus',
        data : {"id":id},
        cache : false,
        type: 'post',
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

 function updateResource(){
    var ids =$("input[name='name']");
    var names =$("input[name='id']");
    var parentIds =$("input[name='parentId']");
    var reses =$("input[name='res']");
    var sorts =$("input[name='sort']");
    var types =$("input[name='type']");
    var descriptions =$("input[name='description']");

    var jeans="{\"authResources\" : [";
    var jsondata=new Array()
    $.each(names,function(n,value){
        var item = {};
        item.id = ids[n].value;
        item.name = names[n].value;
        item.parentId = parentIds[n].value;
        jsondata[n] = item;
    });
    jeans=jeans.substring(0,jeans.length-1)
    jeans+="]}"
     $.ajax({
         url : '/report/update_resource',
         cache : false,
         data :JSON.stringify(jsondata),
         type: 'post',
         dataType : "json",
         contentType : "application/json;charset=utf-8",
         success : function(data){
             alert('12');
         }
       });
 }
 function forUpdate(button){
      if("for update"==button.innerText){
            $("#sample_2").attr("hidden","hidden");
            $("#sample_1").removeAttr("hidden");
            $("#"+button.id).text("update");
            $("#sample_1_wrapper").removeAttr("hidden");
            $("#sample_2_wrapper").attr("hidden","hidden");
      }else if("update"==button.innerText) {
            $("#sample_1").attr("hidden","hidden");
                   $("#sample_2").removeAttr("hidden");
                   $("#"+button.id).text("for update");
                   $("#sample_2_wrapper").removeAttr("hidden");
                   $("#sample_1_wrapper").attr("hidden","hidden");
             }
 }
function browseFolder(path) {
    try {
        var Message = "\u8bf7\u9009\u62e9\u6587\u4ef6\u5939"; //选择框提示信息
        var Shell = new ActiveXObject("Shell.Application");
        var Folder = Shell.BrowseForFolder(0, Message, 64, 17); //起始目录为：我的电脑
        //var Folder = Shell.BrowseForFolder(0, Message, 0); //起始目录为：桌面
        if (Folder != null) {
            Folder = Folder.items(); // 返回 FolderItems 对象
            Folder = Folder.item(); // 返回 Folderitem 对象
            Folder = Folder.Path; // 返回路径
            if (Folder.charAt(Folder.length - 1) != "\\") {
                Folder = Folder + "\\";
            }
            document.getElementById(path).value = Folder;
            return Folder;
        }
    }
    catch (e) {
        alert(e.message);
    }
}
function selectFolder(e) {
     var theFiles = e.target.files;
     var relativePath = theFiles[0].webkitRelativePath;
     $("#fileUrl").val(relativePath);
 }
