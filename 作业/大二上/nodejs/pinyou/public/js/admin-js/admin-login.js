function reg() {
    var adminname=document.getElementById("adminname").value
    if (adminname==''){
        alert("请输入用户名！")
        return false
    }
    var password=document.getElementById("password").value
    var regpass=/^[0-9a-z]{6,}$/i
    if (password==''){
        alert("请输入密码！")
        return false
    } else if (!regpass.test(password)){
        alert("密码为数字或者字母，必须大于等于6位")
        return false
    }
}