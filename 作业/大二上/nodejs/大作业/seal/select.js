var mysql=require('mysql')
var connection=mysql.createConnection({
	host:"localhost",
	user:"root",
	password:"root",
	database:"seal"
})
connection.connect()

var sql='select * from books'
connection.query(sql,function(err,result,fields){
	if(err){
		return console.log("查询失败"+err.message)
	}
	console.log(result)
})
connection.end();