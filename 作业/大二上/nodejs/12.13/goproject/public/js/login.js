
$(document).ready(function(){
    $('#login').click(function(){
        var username=$("#phone").val()//电话
        var password=$("#password").val()//密码
        if (username==''){
            alert('电话不能为空，请重新输入！')
            return false
        }
        if (password==''){
            alert('密码不能为空，请重新输入！')
            return false
        }
    })
})

