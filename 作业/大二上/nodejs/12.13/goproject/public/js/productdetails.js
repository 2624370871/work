/**
 * Created by JC on 2019/11/7.
 */
$(document).ready(function () {
    $('#btn1').css({
        'border':'1px solid orangered'
    })
    $('#btn1').attr('name','goods_version')

    $('#jiage2').css({'display':'none'})

    $('#btn3').css({
        'border':'1px solid orangered'
    })
    $('#btn3').attr('name','goods_color')

    if($('#btn4').text()==''){
        $('#btn4').css({
            'display':'none'
        })
    }
    console.log($('.bbdiv2'));

    $('#btn1').click(function () {
        $('#btn1').css({
            'border':'1px solid orangered'
        })
        $('#p_version').attr('name','p_version')
        $('#btn2').css({
            'border':'1px solid #cccccc'
        })
        $('#p_version2').removeAttr('name')
        $('#goods_price').attr('name','p_price')
        $('#goods_price2').removeAttr('name')
        $('#jiage2').css({'display':'none'})
        $('#jiage').css({'display':'block'})

    })
    $('#btn2').click(function () {
        $('#btn2').css({
            'border':'1px solid orangered'
        })
        $('#p_version2').attr('name','p_version')
        $('#btn1').css({
            'border':'1px solid #cccccc'
        })
        $('#p_version').removeAttr('name')
        $('#jiage').css({'display':'none'})
        $('#jiage2').css({'display':'block'})
        $('#goods_price2').attr('name','p_price')
        $('#goods_price').removeAttr('name')
    })


    $('#btn3').click(function () {

        $('#btn3').css({
            'border':'1px solid orangered'
        })
        $('#p_color').attr('name','p_color')
        $('#btn4').css({
            'border':'1px solid #cccccc'
        })
        $('#p_color2').removeAttr('name')

            $('.colone').css({
                'display':'block'
            })
            $('.coltwo').css({
                'display':'none'
            })
        $('#goods_img').attr('name','p_img')
        $('#goods_img2').removeAttr('name')

    })
    $('#btn4').click(function () {

        $('#btn4').css({
            'border':'1px solid orangered'
        })
        $('#p_color2').attr('name','p_color')
        $('#btn3').css({
            'border':'1px solid #cccccc'
        })
        $('#p_color').removeAttr('name')
            $('.colone').css({
                'display':'none'
            })
            $('.coltwo').css({
                'display':'block'
            })
        $('#goods_img2').attr('name','p_img')
        $('#goods_img').removeAttr('name')
    })

    var admindiv=document.getElementsByClassName('admindiv')
    var admcon=document.getElementsByClassName('admcon')

    for(var i=0;i<admindiv.length;i++){
        console.log(admcon[i].innerHTML)
        if(admcon[i].innerHTML==''){
            admindiv[i].style.display='none'
        }
    }

})

