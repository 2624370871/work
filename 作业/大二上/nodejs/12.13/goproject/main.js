var http = require('http')
var fs = require('fs')
var path = require('path')
var url1 = require('url')
var server = http.createServer()
server.on('request',function(request,response){
	var url = request.url
	var reqObj = url1.parse(request.url,true)
	var pathname = reqObj.pathname
	if(url=='/'){
		fs.readFile(path.join(__dirname,'views/index.html'),'utf8',function(err,data){
			if(err){
				throw err
			}
			response.end(data)
		})
	}else if(url=='/login'){
		fs.readFile(path.join(__dirname,'views/login.html'),function(err,data){
			if(err){
				throw err
			}
			response.end(data)
		})
	}else if(url=='/register'){
		fs.readFile(path.join(__dirname,'views/register.html'),function(err,data){
			if(err){
				throw err
			}
			response.end(data)
		})
	}else if(pathname.startsWith('/public/')){
		fs.readFile(path.join(__dirname,pathname),function(err,data){
			if(err){
				return response.end(err.message)
			}
			response.end(data)
		})
	}else{
		fs.readFile(path.join(__dirname,'views/err.html'),function(err,data){
			if(err){
				throw err
			}
			response.end(data)
		})
	}
})
server.listen(3000,"127.0.0.1",function(){
	console.log("服务器启动成功")
}) 
