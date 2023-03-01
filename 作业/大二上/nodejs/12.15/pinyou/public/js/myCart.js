$(function () {
    //改变购买数量
    $('.add').click(function() {
        var num = $(this).siblings("input[class*=num]").val()
        //在进行加减操作时，最小可购数量为1，最大可购数量为为库存，
        var max=parseInt($(this).siblings("input[class*=kucun]").val())
        if(num<max){
            num++;
        }else{
            alert("超过库存了！")
        }
        $(this).siblings("input[class*=num]").val(function() {
            return num
        })
        setTotal()
        cartsInfo()
    })

    $('.sub').click(function() {
        var num = $(this).siblings("input[class*=num]").val()
        // console.log(num);
        num--;
        num = num <= 1 ? num = 1 : num = num;
        $(this).siblings("input[class*=num]").val(function() {
            return num;
        })
        setTotal()
    })
    //获得焦点 与 失去焦点
    $('.num').blur(function() {
        var num = $(this).val();
        //如果当前文件框的值为空，则填写1
        $(this).val(num == '' ? '1' : num)
        var max=parseInt($(this).siblings("input[class*=kucun]").val())
        $(this).val(num > max ? max : num)
        setTotal()
    })
    //全选/取消点击事件
    $("#all").on('change',function () {
        let check = this.checked
        if (check) {
            /*
            * prop() 方法设置或返回被选元素的属性和值。
            * 当该方法用于返回属性值时，则返回第一个匹配元素的值。
            * 当该方法用于设置属性值时，则为匹配元素集合设置一个或多个属性/值对。
            * 根据官方的建议：具有 true 和 false 两个属性的属性，如 checked, selected 或者 disabled 使用prop()，其他的使用 attr()
            * */
            $(".checked_dx").find(":checkbox").prop('checked', true)
            $("#all").siblings("span").html("取消")
        } else {
            $(".checked_dx").find(":checkbox").prop('checked', false)
            $("#all").siblings("span").html("全选")
        }
        setTotal()
    })
    //监听商品复选框按钮
    $(".checked_dx").find(":checkbox").click(function () {
        //点击取消
        if (this.checked === false) {
            $("#all:first").prop('checked', false)
            $("#all").siblings("span").html("全选")
        }
        //点击选中
        else {
            let nocheckedList = $(".checked_dx").find(":checkbox:not(:checked)").length;
            if (nocheckedList === 0) {
                $("#all:first").prop('checked', true)
                $("#all").siblings("span").html("取消")
            }
        }
        setTotal()
    })

    //计算总价
    function setTotal() {
        //数量、总价、小计
        var num=0
        var sum=0
        var subtotal=0
        var sumNum=0;
        //遍历行
        $(".cartRow").each(function () {
            //行内商品数量
            num=parseInt($(this).find("input[class*=num]").val())
            //商品小计
            subtotal=num*parseFloat($(this).find("span[class*=dangjia]").text())
            //显示小计到页面
            $(this).find("span[class*=subtotal]").html(subtotal.toFixed(2))
            //checkbox选中状态可以用is(":checked")
            if($(this).find("input[class*=cartPid]").is(":checked")){
                sumNum+=num
                sum+=subtotal
            }
        })
        $("#total").html(sumNum+"件，合计"+sum.toFixed(2)+"元")
    }
    //调用
    setTotal()

    function cartsInfo() {
        //遍历行
        var goodsInCart=[]
        var user_id=$(".order_form_list").attr("id")
        $(".cartRow").each(function () {
            goods={goods_id:$(this).find("input[class*=cartPid]").val(),
            number:$(this).find("input[class*=num]").val(),
                u_id:user_id
            }
            goodsInCart.push(goods)
        })
        alert(goodsInCart[0].u_id)
    }
})