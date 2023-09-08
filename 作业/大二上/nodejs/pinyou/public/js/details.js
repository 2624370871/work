$(function() {
    $('.pic_list ul li>img').on('click', function() {
        console.log($(this).attr('src'));
        $('.pic_list ul li').each(function(index, ele) {
            $(ele).removeClass("red_border");

        });

        $(this).parent().addClass('red_border');

        $('.show_pic .small>img').attr('src', $(this).attr('src'));
        $('.big_pic>img').attr('src', $(this).attr('src'));

    })



    // 放大镜
    //父亲盒子 show_pic 距离顶部的距离
    var parentTop = $('.show_pic').get(0).offsetTop;
    var parentLeft = $('.show_pic').get(0).offsetLeft;

    // console.log(parentLeft, parentTop);

    //图片距离父亲盒子 顶部 和 左侧 的距离
    var top = $('.small>img').get(0).offsetTop;
    var left = $('.small>img').get(0).offsetLeft;
    console.log(left, top);

    $('.show_pic').on({
        mouseover: function() {
            $('.mask').show();
            $('.big_pic').show();
        },
        mouseleave: function() {
            $('.mask').hide();
            $('.big_pic').hide();
        }
    })


    $('.small>img').on('mousemove', function(evene) {
        var event = event || window.event; // 兼容写法
        var moveX = event.pageX - parentLeft - $('.small .mask').width(),
            moveY = event.pageY - parentTop - $('.small .mask').height();
        // console.log(moveX, moveY);
        var sumX = this.offsetWidth - $('.small .mask').width();
        var sumY = this.offsetHeight - $('.small .mask').height();

        if (moveX <= 0) {
            moveX = 0;
        } else if (moveX > sumX) {
            moveX = sumX;
        }

        if (moveY <= 0) {
            moveY = 0;
        } else if (moveY > sumY) {
            moveY = sumY;
        }

        //按比例计算 big 盒子 里面的 img 
        // $('.small .mask').css({ 'margin-top': `${top}px`, 'margin-left': `${left}px` })
        // $('.small .mask').css({ 'top': `${moveY}px`, 'left': `${moveX}px` });
        $('.small .mask').css({ 'top': `${top+moveY}px`, 'left': `${left+moveX}px` });

        $('.big_pic>img').get(0).style.left = -moveX * ($('.big_pic>img').get(0).offsetWidth / $('.small>img').get(0).offsetWidth) + "px";
        $('.big_pic>img').get(0).style.top = -moveY * ($('.big_pic>img').get(0).offsetHeight / $('.small>img').get(0).offsetHeight) + "px";
    })




    // 选项卡切换 
    console.log($('.parameter div ul li'));
    $('.parameter div ul li').on({
        click: function() {
            $(this).siblings("li").removeClass('border_red');
            $(this).addClass('border_red');
        },
        dblclick: function() {
            $(this).removeClass('border_red');
        }
    })


    //改变购买数量
    var num = 0;
    $('#add').click(function() {
        num++;
        $('.user_input>input').val(function() {
            return num;
        });
    })

    $('#sub').click(function() {
        num--;
        num = num < 0 ? num = 0 : num = num;
        $('.user_input>input').val(function() {
            return num;
        });
    })

});