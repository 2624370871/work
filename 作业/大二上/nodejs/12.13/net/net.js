var http = require('http')
var url = require('url')
var querystring = require('querystring')
var server = http.createServer()
server.on("request",function(request,response){
	// console.log('收到客户端请求，请求路径'+request.url)
	// var realpath = url.parse(request.url)
	// console.log(realpath)
	// console.log(realpath.pathname)
	// console.log(realpath.query)
	// console.log(querystring.parse(realpath.query))
	
	var url = request.url
	if(url=="/"){
		response.end('index')
	}else if(url=='/login'){
		response.end('login')
	}else if(url=="/reg"){
		response.end('res')
	}else{
		response.end('404')
	}
})
server.listen(3000,"127.0.0.1",function(){
	console.log("服务器启动成功")
}) 
