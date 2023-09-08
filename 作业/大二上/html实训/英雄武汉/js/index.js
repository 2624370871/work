$(function(){
	// 导航
	$("#banner1 li").click(function(){
		var index=$(this).index();
		var i=$(".i .index");
		$(i[index]).css("display","block").siblings().css("display","none");
	})
	
	// 背景色
	$("#banner1 li div").click(function(){
		$(this).css("background-color","#003366").parent().siblings().children().css("background-color","#065A9C");
	})
})
