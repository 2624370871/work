/* 引入expresss模块 */
var express=require('express')
var config=require('../config')
var pool=config.pool
/* 创建路由对象 */
var router=express.Router()

//sql语句
var sql
//参数对象
var pams=[]

//渲染静态页面
router.get('/login.html',function (req,res) {
   res.render('login.html')
})
router.get('/register.html',function (req,res) {
    res.render('register.html')
})

//功能实现
//读取数据库中商品分类，渲染到主页上
router.get('/',function (req,res) {
    //响应默认请求，跳转到'/index'路由
    res.redirect('/index')
})
router.get('/index',function (req,res) {
    //判断是不是已经登录的用户
    var userLogin=[];
    if(req.session.user){
       userLogin=req.session.user;
    }
    //查询商品类别表
    sql="select * from category"
    //利用连接池建立连接数据库
    pool.getConnection(function (err,connect) {
        //执行查询语句，datas为结果对象
        connect.query(sql,function (err,datas) {
       //练习7-3
            //根据访问量排序，查询前6名为结果
            sql="select * from goods_info order by visits_like desc limit 6"
            connect.query(sql,function (err,results) {
                //console.log(results)//后台打印结果对象，用于调试程序，正式运行时可注释
                //渲染index.html页面
                res.render("index.html",{category:datas, visitslike:results,user:userLogin})
            })

        })
        //释放连接
        connect.release()
    })
})


//注册
router.post('/doRegister',function (req,res) {
   console.log(req.body)//后台查看表单提交的数据。post方式。
    sql="insert into user_info (phone,password) value(?,?)"
    pams=[req.body.phone,req.body.password]
    pool.getConnection(function (err,connect) {
        connect.query(sql,pams,function (err,results) {
            if(err){
                console.log(err.message)
            }else{
                console.log(results)
               res.redirect('/login.html')
            }
        })
        connect.release()
    })
})
//登录
router.post('/doLogin',function (req,res) {
    console.log(req.body)
    sql="select * from user_info where phone=? and password=?"
    pams=[req.body.phone,req.body.password]
    pool.getConnection(function (err,connect) {
        connect.query(sql,pams,function (err,results) {
            if(err){
                console.log(err.message)
            }else{
                // console.log(results)
                //ajax送来的数据，要用json送回消息
                if(results.length>0){
                    //登录成功
                    str={
                        "ok":true,
                        "msg":"欢迎回来",
                        "user":results[0].nickname
                    }
                    //保存session
                    req.session.user=results[0]
                    return res.send(JSON.stringify(str))
                }else{
                    str={
                        "ok":false,
                        "msg":"用户名或密码错误"
                    }
                    return res.send(JSON.stringify(str))
                }
            }
        })
        connect.release()
    })
})

//我的购物车
router.get('/myCart',function (req,res) {
   //查看是否登录状态
    console.log(req.session.user)
    //判断是不是已经登录的用户
    if(req.session.user){
        //根据用户id查找购物车表
        sql="SELECT * FROM goods_info,user_cart WHERE goods_info.goods_id = user_cart.goods_id and user_cart.u_id=?"
        pams=[req.session.user.u_id]
        pool.getConnection(function (err,connect) {
            //执行查询语句，datas为结果对象
            connect.query(sql,pams,function (err,datas) {
                //渲染我的购物车
                console.log(datas)
                res.render('myCart.html',{user:req.session.user,goodsInCart:datas})
            })
            //释放连接
            connect.release()
        })

    }else{
        res.render('login.html')
    }
})
module.exports=router