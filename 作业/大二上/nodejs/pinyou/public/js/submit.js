$(function() {

    //改变购买数量
    $('.add').click(function() {
        var num = $(this).siblings("input").val()
            // console.log(num);
        num++;
        $(this).siblings("input").val(function() {
            return num;
        })
    })

    $('.sub').click(function() {
        var num = $(this).siblings("input").val()
            // console.log(num);
        num--;
        num = num <= 1 ? num = 1 : num = num;
        $(this).siblings("input").val(function() {
            return num;
        })
    })

    //获得焦点 与 失去焦点
    $('.change>input').blur(function() {
        var num = $(this).val();
        // num = num = '' ? num = 1 : num = num;
        // console.log(num);
        $(this).val(num == '' ? '1' : num)
    })


})