<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<script src="https://code.jquery.com/jquery-3.4.1.js"
	integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
	crossorigin="anonymous"></script>

<body>
	<div class="container">
		<label for="uiId">아이디 :</label> <input type="text" id="uiId"
			maxlength="10"><br> <label for="uiPwd">비밀번호 :</label> <input
			type="password" id="uiPwd" maxlength="10"><br>
		<button>로그인</button>
	</div>
	<script>
$(document).ready(function(){
	
	$('button').on('click',function(){
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
</script>

</body>
</html>