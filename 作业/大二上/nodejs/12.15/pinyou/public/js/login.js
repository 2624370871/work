//循环精灵图
$(function() {
    $('.else').each(function(i, elm) {
        $(elm).css('background-position', `-${18+ i*52}px -7px`);
    })
});


//登陆方式
$(function() {
    $('#btn_1').on('click', function() {
        $(this).addClass('red');
        $('#btn_2').removeClass('red');
        $('#QR_code').show();
        $('#form').hide();
    });

    $('#btn_2').on('click', function() {
        $(this).addClass('red');
        $('#btn_1').removeClass('red');
        $('#form').show();
        $('#QR_code').hide();
    });


});

$(function () {
    $('#btn_login').on('click',function () {
        //用户名和密码不能为空
        var phone=$('#phone').val()
        var password=$('#password').val()
        if(phone.length==0||password.length==0){
          return alert('用户名或密码不能为空')
        }
        //ajax处理
        $.ajax({
            url:'/doLogin',
            type:'POST',
            data:{
                phone:phone,
                password:password
            },
            success:function (str) {
                //识别响应
                var json=eval("("+str+")");
                if(json.ok){
                    //记录登录信息
                     alert('登录成功'+json.msg+json.user);
                    //跳转到主页
                    window.location.href='/';
                }else{
                    //显示找不到手机号码的信息
                    alert(json.msg);
                }
            },
            error:function (err) {
                console.log(err)
            }
        })
    })
})