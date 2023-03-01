/* 引入expresss模块 */
var express=require('express')
var config=require('../config')
var pool=config.pool
/* 创建路由对象 */
var adminRouter=express.Router()
//此处添加管理员路由
//展示管理员登录页面
adminRouter.get('/login',function(req,res){
    res.render('../views/adminViews/admin-login.html')
})
//完成管理登录功能
adminRouter.post('/dologin',function(req,res){
    var adminname=req.body.adminname
    var password=req.body.password
    //查找管理员
    pool.getConnection(function (err,conn) {
        if (err){
            console.log(err.message)
        } else{
            var sql='select * from t_admin where admin_name=?'
            conn.query(sql,[adminname],function (err,result) {
                if(result.length>0){
                    if (result[0].admin_password==password){
                        //登录成功，需要记录登录状态
                        adminname={'adminname':result[0].admin_name}
                        req.session.admin=adminname
                        res.redirect('/admin/index')
                    } else{
                        res.send("<script>alert('密码错误，请重新在输入！');window.location.href='/admin/login'</script>")
                    }
                } else{
                    res.send("<script>alert('没有该用户！请向一级管理员申请！');window.location.href='/admin/login'</script>")
                }
            })
            conn.release()
        }
    })
})
//完成退出功能
adminRouter.get('/loginout',function (req,res) {
    req.session.admin=null
    res.redirect('/admin/login')
})
//展示管理员首页
adminRouter.get('/index',function (req,res) {
    if(req.session.admin&&req.session.admin.adminname!=''){
        res.render('../views/adminViews/manager.html',{
            admin:req.session.admin
        })
    }else{
        res.redirect('/admin/login')
    }
})
//展示welcome页面
adminRouter.get('/welcome',function (req,res) {
    //执行联合查询
    pool.getConnection(function (err,conn) {
        if (err){
            console.log(err.message)
        } else{
            var sql='select Count(*) as sum from user_info union select Count(*) from goods_info union select Count(*) from user_order union select Count(*) from user_comments'
            conn.query(sql,function (err,result) {
                console.log(result)
                //得到用户总注册数
                //得到商品总数
                //得到订单总数
                //得到评论总数
                res.render('../views/adminViews/welcome.html',{
                    usersum:result[0].sum,
                    goodsum:result[1].sum,
                    ordersum:result[2].sum,
                    comsum:result[3].sum,
                    admin:req.session.admin
                })
            })
            conn.release()
        }
    })
})
//展示商品列表总数，渲染goods-list.html
adminRouter.get('/goodsList',function (req,res) {
    pool.getConnection(function (err,conn) {
        if (err){
            console.log(err.message)
        } else{
            var sql='select count(*) as sum from goods_info'
            conn.query(sql,function (err,result) {
                console.log(result)
                res.render('../views/adminViews/goods-list.html',{
                    sum:result[0].sum
                })
            })
            conn.release()
        }
    })
})
//分页展示商品列表
adminRouter.get('/goodsPage',function (req,res) {

    var page = req.query.page;
    console.log(page)
    var page = (--page)*5;
    sql="select * from goods_info limit ?,5"
    pam=[page]
    pool.getConnection(function (err,connect) {
        connect.query(sql,pam,function (err,results) {
            if (err) {
                throw err;
            }
            console.log(results)
            res.json(results);
        })
        connect.release()
    })
})
//展示用户列表
// adminRouter.get('/userList',adminCtrl.showUserlist)
// //展示留言列表
// adminRouter.get('/message',adminCtrl.showMessage)
// //展示用户详情页面
// adminRouter.get('/userDetail/:id',adminCtrl.showUserdetail)
// //冻结用户登录
// adminRouter.get('/setFreeze/:id',adminCtrl.setFree)
// //输入昵称查询用户
// adminRouter.get('/searchUser',adminCtrl.searchUser)
// //重置密码
// adminRouter.get('/resetpass/:id',adminCtrl.resetPass)

// //展示商品上架页面
// adminRouter.get('/goodAdd',adminCtrl.showGoodAdd)
// //完成商品上架功能
// adminRouter.post('/addGood',adminCtrl.addGood)
// //展示商品详情
// adminRouter.get('/goodDetail/:id',adminCtrl.showGoodDetail)
// //展示商品修改页面
// adminRouter.get('/goodEdit/:id',adminCtrl.showGoodEdit)
// //完成修改商品功能
// adminRouter.post('/doEdit/:id',adminCtrl.doGoodEdit)
// //修改商品状态(下架)
// adminRouter.get('/setGoodFreeze/:id',adminCtrl.setGoodFreeze)
// //查询商品
// adminRouter.get('/searchGood',adminCtrl.searchGood)
// //完成精准查询功能
// adminRouter.get('/classSearch',adminCtrl.cSearchGood)
// //展示订单列表
// adminRouter.get('/orderList',adminCtrl.showOrderlist)
// //展示订单详情
// adminRouter.get('/orderDetail/:id',adminCtrl.showOrderDetail)
// //管理员操作订单状态
// adminRouter.get('/setOrderFreeze/:id',adminCtrl.setOrderFree)
// //订单查询
// adminRouter.get('/searchOrder',adminCtrl.searchOrder)
// //查询是否处理订单
// adminRouter.get('/processSearch',adminCtrl.pSearchOrder)
// //展示评论列表
// adminRouter.get('/comList',adminCtrl.showComent)
// //展示评论详情页面
// adminRouter.get('/comDetail/:id',adminCtrl.showComdetail)
// //评论查询
// adminRouter.get('/searchCom',adminCtrl.searchCom)

//公开
module.exports=adminRouter