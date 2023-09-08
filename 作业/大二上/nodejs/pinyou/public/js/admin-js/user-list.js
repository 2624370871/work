//拿到class里的值
var userval=document.getElementsByName("userval")
//需要填值的地方
var good=document.getElementsByClassName("showSex")
for (var i=0;i<=good.length;i++) {
    if (userval[i].value==0){
        good[i].innerHTML="未冻结"
    } else{
        good[i].innerHTML="已冻结"
    }
}