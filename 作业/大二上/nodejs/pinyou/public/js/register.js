$(function() {
    //手机号格式判断
    var phoneNum = /^1[3-9]\d{9}$/;
    $('#user_phone').on('keyup', function() {
        if (phoneNum.test($(this).val())) {
            // console.log(phoneNum.test($(this).val()));

            $(this).attr('data-pass', 'true');
            $('.phone_alike>i').css('background-image', 'url(images/true.jpg)');
            $('.phone_alike>p').html("ok").css('color', 'green');
        } else {
            $(this).attr('data-pass', 'false');
            $('.phone_alike>p').html("手机号码格式不正确，请从新输入").css('color', 'red');
            $('.phone_alike>i').css('background-image', 'url(images/error.jpg)');
        }

        if ($(this).val().length == 0) {
            $('.phone_alike>i').css('background-image', '');
            $('.phone_alike>p').html("");
        }
    });

    //密码格式
    var password = /^[a-z0-9_-]{6,18}$/;
    $('#user_password').on('keyup', function() {
        if (password.test($(this).val())) {
            // console.log($(this).val());

            $(this).attr('data-pass', 'true');
            $('.login_alike>i').css('background-image', 'url(images/true.jpg)');
            $('.login_alike>p').html("ok").css('color', 'green');
        } else {
            $(this).attr('data-pass', 'false');
            $('.login_alike>p').html("请从新输入6~16位数密码").css('color', 'red');
            $('.login_alike>i').css('background-image', 'url(images/error.jpg)');
        }

        if ($(this).val().length == 0) {
            $('.login_alike>p').html("")
            $('.login_alike>i').css('background-image', '');
        }

        //密码强度
        if ($(this).val().length >= 6) {
            $('#ruo').css('background', 'red')
        } else {
            $('#ruo').css('background', '#ccc')
        }
        if ($(this).val().length >= 10) {
            $('#zhon').css('background', 'green')
        } else {
            $('#zhon').css('background', '#ccc')
        }
        if ($(this).val().length >= 14) {
            $('#qiang').css('background', 'yellow')
        } else {
            $('#qiang').css('background', '#ccc')
        }
    });

    //确认密码
    $('#true_password').on('keyup', function() {
        var str = $('#user_password').val()
        console.log($(this).val());
        if ($(this).val().length == 0) {
            $('.confirm_alike>i').css('background-image', '');
            $('.confirm_alike>p').html('');
        } else {
            if ($(this).val() === str) {
                $('.confirm_alike>i').css('background-image', 'url(images/true.jpg)');
                $('.confirm_alike>p').html('ok').css('color', 'green');
            } else {
                $('.confirm_alike>i').css('background-image', 'url(images/error.jpg)');
                $('.confirm_alike>p').html('密码不一致，请从新输入');
            }
        }
    });

    //同意协议
    $("#checkbox").on('click',function () {
        if($('#checkbox').is(":checked")){
            $('#btn_submit').removeAttr("disabled")
        }
    })
})