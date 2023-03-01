var http= require('http')
var fs = require('fs')
var path = require('path')
var _ = require('underscore')
var server = http.createServer();
server.on('request',function(req,res){
	var url = req.url
	if(url=='/'){
		fs.readFile(path.join(__dirname,'index.html'),'utf8',function(err,data){
			if(err){
				throw err
			}
			var compiled = _.template(data)
			var htmlStr = compiled({
				title:'hello world',
				arr:[
					{name:'Jack'},
					{name:'rose'},
					{name:'levi'}
				]
			})
			res.end(htmlStr)
		})
	}
})
server.listen(3000,"127.0.0.1",function(){
	console.log("服务器启动成功")
}) 