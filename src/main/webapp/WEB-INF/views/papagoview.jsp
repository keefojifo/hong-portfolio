
<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8">
<title>HTML5</title>
<style type="text/css">
    body {
        text-align: center;
        color: #FFF;
        width: 900px;
    }
    div#wapper {
        width: 100%;
        text-align: left;
        min-height: 300px;
        margin: 0 auto;
    }
    header, footer, nav, section {
        border: 1px solid #999;
        margin: 5px;
        padding: 10px;
    }
    header {
        height: 50px;
        background-color: white;
    }
    nav, section {
        float: left;
        height: 250px;
    }
    nav {
        background-color :whitesmoke;
        width: 96%;
    }
    section {
        background-color: whitesmoke;   
        width: 96%;
    }

    footer {
        height: 50px;
        background-color: white;
        position: relatiev;
        clear: both;
    }
   
    select {

width: 200px; 
padding: .8em .5em; 
font-family: inherit;  
background: url no-repeat 95% 50%; 
border: 1px solid #999;
border-radius: 0px; 
-webkit-appearance: none; 
-moz-appearance: none;
appearance: none;
}

button{
  background:#1AAB8A;
  color:#fff;
  border:none;
  position:relative;
  height:60px;
  font-size:1.6em;
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

</style>
 
</head>
<script
  src="https://code.jquery.com/jquery-3.4.1.min.js"
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous"></script>
<body>
    <div id="wapper">
        <!--í¤ëìì-->
        <header>
           
           <a href="https://papago.naver.com/"><img alt="ííê³  ì´ë¯¸ì§" width="200" height="50" src="papago.png"/></a> 
            
        </header>
        <!--번역창 1-->
        <nav>
            <select name="language" >
                <option value="none" selected>======언어선택======</option>
                <option value="ko">한국어</option>
                <option value="en">영어</option>
                <option value="ja">일본어</option>
                <option value="zh-CN">중국어 간체</option>
                <option value="zh-TW">중국어 번체</option>
                <option value="es">스페인어</option>
                <option value="fr">프랑스어</option>
                <option value="ru">러시아어</option>
                <option value="vi">베트남어</option>
                <option value="th">태국어</option>
                <option value="id">인도네시아어</option>
                <option value="de">독일어</option>
                <option value="it">이탈리아어</option>
           </select>
           <br>
            <textarea placeholder="번역할 내용을 입력하세요" style="width:800px;height:150px;font-size:30px;background-color: whitesmoke; border: 1px solid #1AAB8A; "></textarea>
            <button style="float:right">번역하기</button>
            </nav>
        <!--번역창 2-->
        <section>
                <select name="language" >
                        <option value="none" selected>======언어선택======</option>
                        <option value="ko">한국어</option>
                        <option value="en">영어</option>
                        <option value="ja">일본어</option>
                        <option value="zh-CN">중국어 간체</option>
                        <option value="zh-TW">중국어 번체</option>
                        <option value="es">스페인어</option>
                        <option value="fr">프랑스어</option>
                        <option value="ru">러시아어</option>
                        <option value="vi">베트남어</option>
                        <option value="th">태국어</option>
                        <option value="id">인도네시아어</option>
                        <option value="de">독일어</option>
                        <option value="it">이탈리아어</option>
                   </select>
                   <br>
                    <textarea placeholder="번역할 내용이 나오는 곳 입니다." style="width:800px;height:150px;font-size:30px;background-color: whitesmoke; border: 1px solid #1AAB8A;"></textarea>
                    
        </section>
        <!--풋터-->
        <footer style="color: #1AAB8A; ">designed by hong</footer>
    </div>
</body>
</html>
