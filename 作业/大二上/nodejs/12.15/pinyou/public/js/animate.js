function animate(obj, target, callback) {
    //先清除以前的定时器
    clearInterval(obj.timer)

    obj.timer = setInterval(function() {
        //步长值写在定时器里面
        //把我们步长值改为整数，不要出现小数的问题
        //var step = Math.ceil((target - obj.offsetLeft) / 10);	

        var step = (target - obj.offsetLeft) / 10;
        step = step > 0 ? Math.ceil(step) : Math.floor(step);

        if (obj.offsetLeft == target) {
            //停止动画  本质就是停止定时器
            clearInterval(obj.timer);

            //判断有没有 callback 传入
            if (callback) {
                callback(); //如果有 就执行
            }
        }

        obj.style.left = obj.offsetLeft + step + "px";
    }, 15);
}