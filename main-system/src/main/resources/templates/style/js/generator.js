function generator(){
     var fileUrl=$("#fileUrl").val();
     var tableName=$("#tableName").val();
     alert(fileUrl);
     $.ajax({
             url : '/generator/generator_code',
             cache : false,
             data : {"fileUrl":fileUrl,"tableName":tableName},
             type: 'POST',
             dataType : "json",
             success : function(data){
                 alert('12');
             }
           });
}
