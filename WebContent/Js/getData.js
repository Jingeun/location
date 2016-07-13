$(document).ready(function(){
	$.ajax({
		url: 'getDataServlet',
		type: 'post',
		data: {user_id: "test"},
		dataType: "text",
		success: function(data){
			alert(data);
		}
		,  error:function(request,status,error){
            alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
		}
	});
});