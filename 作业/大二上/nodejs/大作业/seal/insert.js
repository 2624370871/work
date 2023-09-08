var mysql=require('mysql')
var connection=mysql.createConnection({
	host:"localhost",
	user:"root",
	password:"root",
	database:"seal"
})
connection.connect()

var sql='insert into books(id,name) values ?'
var sqlValues=
[
	['2','php'],
	['3','web'],
	['4','android']
];

connection.query(sql,[sqlValues],function(err,result,fields){
	if(err){
		return console.log("查询失败"+err.message)
	}
	console.log(result)
})
connection.end();