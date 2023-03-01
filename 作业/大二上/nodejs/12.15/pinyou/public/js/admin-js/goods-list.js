$(function () {
    var sum = $("#sum").val(); //获取共多少条数据
    $('#pagination1').jqPaginator({
        totalPages:Math.ceil(sum/5), //共有多少页
        visiblePages:5, //最多显示几页
        currentPage:1, //当前页
        onPageChange:function(num){  //这里的num 返回的是当前第几页
            getDatas(num)
        }
    })
    function getDatas(num) {
        $.ajax({
            type: 'get',
            url: '/admin/goodsPage',
            data: {page:num},
            dataType: 'json',
            success: function (results) {
                console.log(results)
                var html = '';
                for (var i = 0; i < results.length; i++) {
                    html += '<tr>';
                    html += '<td>'+ results[i].goods_id + '</td>';
                    html += '<td class="goodname">' + results[i].goods_name+ '</td>'
                    html += '<td>' + results[i].goods_price.toFixed(2) + '</td>'
                    html += '<td>' + results[i].brand_name + '</td>'
                    html +='<td><img src="../../public/images/goods_img/'+results[i].img_src+'"></td>'
                    html +='<td>' + results[i].goods_status + '</td>'
                    html +='<td><a href="/admin/goodDetail/'+ results[i].goods_id + '" title="查看商品详细信息"><span class="glyphicon glyphicon-search"></span></a>'
                    html +='&nbsp;&nbsp;&nbsp;<a href="/admin/goodEdit/'+ results[i].goods_id + '" title="修改"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>'
                    html += '</td></tr>';
                }
                $("#tab").html(html);
            }
        })
    }
})



