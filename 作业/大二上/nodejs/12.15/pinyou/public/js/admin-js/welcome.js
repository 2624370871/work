function showtime() {
    var date=new Date()
    var year=date.getFullYear()
    var month=date.getMonth()+1
    var day=date.getDate()
    var hour=date.getHours()
    var min=date.getMinutes()
    var second=date.getSeconds()
    var weekday=["星期日","星期一","星期二","星期三","星期四","星期五","星期六"]
    var d=date.getDay()
    if (hour<10){
        hour="0"+hour
    }
    if (min<10) {
        min="0"+min
    }
    if (second<10){
        second="0"+second
    }
    document.getElementById("timer").innerHTML=("当前时间："+year+"-"+month+"-"+day+"&nbsp;"+weekday[d]+"&nbsp;"+hour+":"+min+":"+second)
    var span=document.getElementById("span")
    if (hour>=0 && hour<5){
        span.innerText="凌晨好！"
    }else if (hour<9){
        span.innerText="早上好！"
    } else if (hour<12){
        span.innerText="上午好！"
    } else if (hour<13){
        span.innerText="中午好！"
    }else if (hour<18){
        span.innerText="下午好！"
    }else if (hour<=23){
        span.innerText="晚上好！"
    }
}
var t=setInterval("showtime()",1000)