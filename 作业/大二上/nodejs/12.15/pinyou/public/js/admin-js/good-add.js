function check(form) {
    if ($("#goodname").val()==''){
        alert('商品名不能为空！')
        return false
    }
    if ($("#goodprice").val()==''){
        alert('商品价格不能为空！')
        return false
    }
    if ($("#goodcount").val()==''){
        alert('商品库存不能为空！')
        return false
    }
    if ($("#goodplace").val()==''){
        alert('商品库存不能为空！')
        return false
    }
    if ($("#goodweight").val()==''){
        alert('商品净含量不能为空！')
        return false
    }

    if ($("#goodimg").val()==''){
        alert('商品详情图不能为空！')
        return false
    }
}