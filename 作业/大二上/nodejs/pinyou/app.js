//引入第三方包
var express =require("express")/* 引入expresss模块 */
var config=require('./config')  //引入config.js
var userRouter=require('./router/user_router')  //引入user_router.js
var adminRouter=require('./router/admin_router')//引入admin_router.js
/* 引入body-parser模块 */
var bodyParse=require('body-parser')    //无需npmp安装，用于接收表单post方式提交的数据
/* 引入express-session模块 */
var session=require('express-session') //npm安装，用于服务器端session处理

/* 创建服务器 */
var app = express()
/*  公开资源 */
app.use("/public/",express.static("./public"))
app.use('/node_modules/',express.static('node_modules'))
/*  引入框架-模板 */
app.engine("html",require("express-art-template"))
//使用bodyParse
app.use(bodyParse.urlencoded({extended:false}))
app.use(bodyParse.json())
// 使用 session 中间件
app.use(session({
    secret :  'secret', // 对session id 相关的cookie 进行签名
    resave : true,
    saveUninitialized: false, // 是否保存未初始化的会话
    cookie : {
        maxAge : 1000 * 60 * 3*10, // 设置 session 的有效时间，单位毫秒
    },
}))
//挂载路由
app.use('/',userRouter)//用户路由
app.use('/admin',adminRouter)//管理员路由

//启动服务
app.listen(config.port,function () {
    console.log('服务器已经启动,请访问 http://'+config.host+':'+config.port)
})
module.exports=app;

