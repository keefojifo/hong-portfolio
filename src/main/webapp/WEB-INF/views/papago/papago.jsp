<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
<script src="/resources/js/ajax.js">
</script>

<style>
button{
  background:#1AAB8A;
  color:#fff;
  border:none;
  position:relative;
  height:60px;
  font-size:1.0em;
  padding:0 2em;
  cursor:pointer;
  transition:800ms ease all;
  outline:none;
}
button:hover{
  background:#fff;
  color:#1AAB8A;
}
button:before,button:after{
  content:'';
  position:absolute;
  top:0;
  right:0;
  height:2px;
  width:0;
  background: #1AAB8A;
  transition:400ms ease all;
}
button:after{
  right:inherit;
  top:inherit;
  left:0;
  bottom:0;
}
button:hover:before,button:hover:after{
  width:100%;
  transition:800ms ease all;
}
#nav-wrap .navs {
	width: 100%;
	position: relative;
	bottom: 0;
	color: rgb(48, 36, 36);
	display: flex;
	justify-content: space-around;
	margin: 18px;
	font-size: 20px;
}

#nav-wrap .navs>* {
	text-transform: uppercase;
	height: 50px;
}

#nav-wrap .navs>*>span {
	line-height: 50px;
}

#nav-wrap .navs>*:hover {
	color: rgb(231, 31, 155);
	border-block-color: rgb(175, 87, 116);
}

#wrap-container{
	margin : 0  auto; 
	border:1px solid balck; 
	height:500px;
	text-align:center;
}
#wrap1 {
	margin : 5px  auto; 
	width: 45%;
	height: 100%;
	display: flex;
	justify-content: space-around;
	float: left;
}

#wrap2 {
	width: 45%;
	height: 100%;
	margin : 5px  auto; 
	display: flex;
	justify-content: space-around;
	float: right;
}

#content-wrap {
	width:100%;
	padding: 0px;
	border: 1px solid rgb(169, 165, 172);
	text-align: center;
}

.content-box {
	width:100%;
	padding: 10px 20px 10px 20px;
	font-size: 18px;
}

.selectLang {
	width: 100%;
	padding: .8em .5em;
	border-radius: 0px;
	-webkit-appearance: none;
	-moz-appearance: none;
	appearance: none;
	font-size: 18px;
	background-color: rgb(193, 255, 174);
}


#wrap3 {
	clear:both;
	margin:0 auto;
	display: flex;
	justify-content: space-around;
}

#footer {
	line-height: 50px;
	text-align: center;
	width: 200px;
	height: 50px;
	margin: 10px auto;
	background-color: rgb(186, 248, 180);
	color: rgb(104, 93, 93);
	font-size: 20px;
	font-weight: 900;
}
</style>
<body>

	<div id="nav-wrap">
		<div class="container">
			<div class="navs">
				<div class="nav">
					 <a href="https://papago.naver.com/"><img alt="파파고 이미지" width="200" height="50" src="papago.png"/></a> 
				</div>
				<div class="nav">
					<span>웹사이트 번역</span>
				</div>
				<div class="nav">
					<span>GYM</span>
				</div>
				<div class="nav">
					<span>사전</span>
				</div>
			</div>
		</div>
	</div>
	<div id="wrap-container">
		<div id="wrap1">
			<div id="content-wrap">
				<div class="selectBox">
					<select id="source" class="selectLang">
						<option value="none">언어감지</option>
						<option value="ko">한국어</option>
						<option value="en">영어</option>
						<option value="ja">일본어</option>
						<option value="zh-CN">중국어(간체)</option>
						<option value="zh-TW">중국어(번체)</option>
						<option value="es">스페인어</option>
						<option value="fr">프랑스어</option>
						<option value="de">독일어</option>
						<option value="ru">러시아어</option>
		
						<option value="it">이탈리아어</option>
						<option value="vi">베트남어</option>
						<option value="th">태국어</option>
						<option value="id">인도네시아어</option>
					</select>
				</div>
				<div class="content-box">
					<textarea name="air_type"  placeholder="내용작성" id="text"
						style="width: 85%; height: 300px; border: 0; padding: 10px; overflow-y: hidden; background: clear;resize:none"></textarea>
				</div>
			</div>
		</div>
		<div id="wrap2">
			<div id="content-wrap">
				<div class="selectBox">
					<select id="target" class="selectLang">
						<option value="none">언어감지</option>
						<option value="ko">한국어</option>
						<option value="en">영어</option>
						<option value="ja">일본어</option>
						<option value="zh-CN">중국어(간체)</option>
						<option value="zh-TW">중국어(번체)</option>
						<option value="es">스페인어</option>
						<option value="fr">프랑스어</option>
						<option value="de">독일어</option>
						<option value="ru">러시아어</option>
		
						<option value="it">이탈리아어</option>
						<option value="vi">베트남어</option>
						<option value="th">태국어</option>
						<option value="id">인도네시아어</option>
				
					</select>
				</div>
				<div class="content-box">
					<textarea name="air_type"  placeholder="번역내용" id="result"
						style="width: 85%; height: 300px; border: 0; padding: 10px; overflow-y: hidden; background: clear;resize:none">
					
				
					
						</textarea>
				</div>
			</div>
		</div>
		<div id="wrap3">
			<div id="footer">
				<button id="btn">번역하기</button>
			</div>
		</div>
	</div>
<script>

$(document).ready(function(){
	 $('#btn').on('click',function(){
		 
		 if($('#source').val() && $('#target').val() == 'none'){
			 alert('언어 선택 값을 넣어주세요');
			 
		 }else{
		 
		 var param='source=' + $('#source').val();
		 param += '&target=' + $('#target').val();
		 param += '&text=' + $('#text').val();
		 
		
		 
		 alert(param);
		 
		 $.ajax({
			 url:'/papago',
			 method:'POST',
			 data:param,
			 success:function(ress){
				 $('#result').val(ress.result.translatedText);
				 console.log(ress);
				
			 },
			 error:function(res){
				 console.log(res);
			 }
			 
		 });
		 }})
	});
</script>
</body>
</html>