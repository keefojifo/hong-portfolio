/**
 * 
 */
$(document).ready(function(){
	
	$('#loginbutton').on('click',function(){
	var param ={
			uiId:$('#uiId').val(),
			uiPwd:document.querySelector('#uiPwd').value,
	}
	param=JSON.stringify(param);
	alert(param);
	$.ajax({
		url:'/login',
		method:'POST',
		data:param,
		beforeSend:function(xhr){
			xhr.setRequestHeader('x-ajax','true');
		},
		contentType:'application/json',
		
		success:function(res){
			if(res.msg){
				alert(res.msg);
			}
			console.log(res);
		},
		error:function(res){
			console.log(res);
			
		}
	})
	
})
})