/**
 * 
 */
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