$(function(){
	$("#btn").click(function(){
		$.post("/ssmdemo/json2", function(data){
			alert(data.name);
		}, "json")
		
	});
});