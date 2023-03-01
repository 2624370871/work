//角色策略
function roles(){
	this.programmer=function(data){
		if(data>10000){
			return data*0.05;
		}else if(data>=2000){
			return 50
		}else{
			return 0;
		}
	}
	this.manager=function(data){
		if(data>20000){
			return data*0.2;
		}else{
			return data*0.1;
		}
	}
	this.salesman=function(data){
		if(data>100000){
		return data*0.3;
	}else if(data>=50000){
		return data*0.2;
	}else{
		return data*0.05;
	}
}
}
//提成对象
function bonus(){
	this.benefit=0;//项目收益
}
bonus.prototype.setBenefit=function(data){
	this.benefit=data;//设置项目收益
}
//设置bonus的原型链为roles
bonus.__proto__=new roles();

bonus.prototype.getBonus=function(role){
	return role(this.benefit);//通过角色策略方法计算返回提成
}
// 创建bonus的实例对象
var bonusCount=new bonus();

//角色策略筛选
var strategies={
	"1":function(){
		// 程序员角色策略计算
		return bonusCount.getBonus(bonus.programmer)
	},
	"2":function(){
		// 项目经理角色策略计算
		return bonusCount.getBonus(bonus.manager)
	},
	"3":function(){
		//销售人员角色策略计算
		return bonusCount.getBonus(bonus.salesman)
	}
}

function countFun(){
	// 获取项目收益值
	var benefit=document.getElementById("benefit").value;
	//获取选择的角色值
	var role=document.getElementById("roles").value;
	// 设置项目收益
	bonusCount.setBenefit(benefit);
	//角色策略对应的提成计算值
	document.getElementById("bonus").value=strategies[role]();
}