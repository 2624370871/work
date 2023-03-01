/* 引入路径模块，可用于文件上传寻址 */
var path=require('path')
//引入mysql第三方包
var mysql=require('mysql')

var pool=mysql.createPool({
    connectionLimit:100,
    host:'127.0.0.1',
    user:'root',
    password:'',
    database:'pinyougo'
})
/* 公开 */
module.exports={
    port:3000,
    host:'127.0.0.1',
    uploadsPath:path.join(__dirname,'/public/uploads/'),
    pool:pool
}