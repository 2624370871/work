
$(function(){
	// 登录注册验证
	var state = false;
	$(".txtEmail").blur(function() {
		if ($(this).val() == '') {
			$(".emailTxt").text("邮箱不能为空");
		} else {
			if (/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\.[a-zA-Z0-9_-])+/.test($(this).val()) == false) {
				$(".emailTxt").text("邮箱格式不正确");
			} else {
				$(".emailTxt").text('邮箱输入正确').css("color","green");
				state = true;
			}
		}
	})
	
	$(".txtPhone").blur(function() {
		if ($(this).val() == '') {
			$(".phoneTxt").text("手机号不能为空");
		} else {
			if (/^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\d{8}$/.test($(this).val()) == false) {
				$(".phoneTxt").text("手机号格式不正确");
			} else {
				$(".phoneTxt").text('手机号输入正确').css("color","green");
				state = true;
			}
		}
})
})