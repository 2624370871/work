	window.addEventListener('load', function() { // load事件 页面加载完成后 加载js  
	    // 轮播图区域开始；

	    //1.获取元素
	    var arrow_l = document.querySelector(".focus .arrow_l");
	    var arrow_r = document.querySelector(".focus .arrow_r");
	    var focus = document.querySelector(".focus");
	    var ul = focus.querySelector("ul");

	    //2.鼠标经过 nav 就显示隐藏的左右按钮
	    focus.addEventListener("mouseenter", function() {
	            arrow_l.style.display = "block";
	            arrow_r.style.display = "block";

	            //鼠标经过停止定时器
	            clearInterval(timer);
	            timer = null; //清除定时器变量
	        })
	        //.鼠标离开 nav 就隐藏左右按钮 
	    focus.addEventListener("mouseleave", function() {
	        arrow_l.style.display = "none";
	        arrow_r.style.display = "none";

	        //开启定时器
	        timer = setInterval(function() {
	            arrow_r.click();
	        }, 3000)
	    })

	    var focusWidth = focus.offsetWidth; //盒子（图片）的宽度
	    //3.动态的生成小圆点 有几张图就生成几个小圆点
	    var ul = focus.querySelector("ul");
	    var ol = focus.querySelector("ol.list");
	    //console.log(ul.children.length);
	    for (var i = 0; i < ul.children.length; i++) {
	        var li = document.createElement("li");
	        //记录当前小圆点的索引号 ，通过自定义属性来做
	        li.setAttribute("index", i);
	        ol.appendChild(li);
	        //4.在生成小圆点的同时 绑定点击事件
	        li.addEventListener("click", function() {
	            //(排他思想) 干掉所有人 把所有小 li 清楚 curter 类名
	            for (var i = 0; i < ol.children.length; i++) {
	                //console.log(ol.children.length);
	                ol.children[i].className = '';
	            }
	            //留下我自己 当前的小 li 添加类名 curter 类名
	            this.className = "curter";
	            //5.点击小圆点，移动图片 移动的是ul
	            //ul 移动的距离= 小圆点的索引号 乘以 图片的宽度 注意是负值
	            //由于图片的宽度 就是 nav 盒子的宽度 
	            // 当我们点击了某个小 li ，就拿到当前小 li 的索引号
	            var index = this.getAttribute("index");
	            // 当我们点击了某个 li 就要把这个 li 的索引号 给 num
	            num = index; // num 为全局变量
	            // 当我们点击了某个 li 就要把这个 li 的索引号 给 circle
	            circle = index;

	            animate(ul, -focusWidth * index);
	        });
	    }
	    //把 ol 里面的第一个默认选中状态 设置类名为 curent ，css中已经从写好样式
	    ol.children[0].className = "curter";

	    // 6. 克隆第一张图片（li） 放到 ul 最后面
	    // .cloneNode(true) 克隆节点  加 true 深克隆 复制 里面的子节点 加 false 浅克隆
	    var first = ul.children[0].cloneNode(true);
	    //添加到 ul 
	    ul.appendChild(first);

	    // 7.点击右侧按钮，图片滚动一张
	    var num = 0;
	    // circle 控制小点点的播放
	    var circle = 0;

	    //8. 点击右侧按钮
	    arrow_r.addEventListener("click", function() {
	        if (num == ul.children.length - 1) {
	            ul.style.left = 0;
	            num = 0;
	        }
	        num++;
	        animate(ul, -num * focusWidth);
	        // console.log(-num * focusWidth);

	        circle++;
	        if (circle == ol.children.length) {
	            circle = 0;
	        }
	        for (var i = 0; i < ol.children.length; i++) {
	            ol.children[i].className = '';
	        }
	        ol.children[circle].className = "curter";
	    });

	    // 9.点击左侧按钮
	    arrow_l.addEventListener("click", function() {
	        //console.log(ul.style.left)
	        if (num == 0) {
	            num = ul.children.length - 1;
	            ul.style.left = -num * focusWidth + "px";
	        }
	        num--;
	        animate(ul, -num * focusWidth);
	        // console.log(-num * focusWidth);

	        // .点击左侧按钮 ，小点点跟着一起变化 可以再声明一个控制小点点的播放
	        circle--;
	        // 如果circle < 0 说明是第一张图片，则橙色小点点改为第 4 个 小点点[3]
	        if (circle < 0) {
	            circle = ol.children.length - 1;

	        }
	        for (var i = 0; i < ol.children.length; i++) {
	            ol.children[i].className = '';
	        }
	        ol.children[circle].className = "curter";
	    });

	    var timer = setInterval(function() {
	        arrow_r.click();
	    }, 3000)

	    // 轮播图区域----结束；
	});