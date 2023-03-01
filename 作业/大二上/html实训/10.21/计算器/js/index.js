//计算对象
var calculator = {
				number:[],//用于保存输入的数字和符号数据
				numberClick:numberClick,//计算方法 
				operatorClick:operatorClick,
				equalClick:equalClick,
				cleanClick:cleanClick
			}
			//输入数字方法
			var numberClick =function (value){
				var val= document.getElementById("output").value;//获取显示框的内容
				//显示框为0时，输入0无效
				if(value=="0" && val=="0"){//如果输入的值为0，并且显示框显示为0
					return;//则返回
				}
				if(val=="0"){
					// 如果显示框为0,则去掉0，只显示输入值
					document.getElementById("output").value=value;
				}else{
					// 在显示框显示对应字符
					document.getElementById("output").value=val+value;
				}
			}
			
			// 输入运算符方法 
			var operatorClick =function (value){
				// 判断是否连续输入了两次运算符,运算符后面输入数字,不能连续输入多个运算符
				var val=document.getElementById("output").value;
				if(val[val.length-1]==" "){
					return;
				}
				//在显示框显示对应运算符
				document.getElementById("output").value=val+" "+value+" ";
			}
			var equalClick =function() {
				//分割算术数组
				number = document.getElementById("output").value.split(" ");
				//计算乘除
				for(var index=0;index < this.number.length;index++){
					if(this.number[index]=="*" || this.number[index] == "/"){
						// 若输入的字符最后为"乘"或"除"运算符,则在最后面加1
						if(this.number[index + 1]==""){
							this.number[index + 1]=1;
						}
						if(this.number[index] == "*"){
							// 删除数组内已计算数字,并添加计算后数字
							var index_num = Number(index);
							var firstNum = Number(this.number[index_num-1]);
							var secondNum=Number(this.number[index_num+1])
							var result=firstNum*secondNum
							this.number.splice(index_num-1,3,result)
						}else if(this.number[index]=="/"){
							// 删除数组内已计算数字,并添加计算后数字
							var index_num=Number(index);
							var firstNum=Number(this.number[index_num-1]);
							var secondNum=Number(this.number[index_num+1])
							var result=firstNum/secondNum
							this.number.splice(index_num-1,3,result)
						}
						index--;
					}
				}
				for(var index=0; index< this.number.length; index++){
					if(this.number[index]=="+" || this.number[index] == "-"){
						if(this.number[index] == "+"){
							// 删除数组内已计算数字,并添加计算后数字
							var index_num=Number(index);
							var firstNum=Number(this.number[index_num-1]);
							var secondNum=Number(this.number[index_num+1])
							var result=firstNum+secondNum
							this.number.splice(index_num-1,3,result)
						}else if(this.number[index]=="-"){
							// 删除数组内已计算数字,并添加计算后数字
							var index_num=Number(index);
							var firstNum=Number(this.number[index_num-1]);
							var secondNum=Number(this.number[index_num+1])
							var result=firstNum-secondNum
							this.number.splice(index_num-1,3,result)
						}
						index--;
					}
				}
				document.getElementById("output").value=number[0];
			}
			var cleanClick=function(){
				document.getElementById("output").value="";
			}
			var fn=function(){
				var val=document.getElementById("output").value;
				var reg=new RegExp("^\\d+([+*/-]z\\d+)+$");
				if(!reg.test(val)){
					alert("请输入正确的计算表达式");
					document.getElementById("output").value="";
					return false;
				}else{
					var reg1=/[+*/-]/g;
					var str=(val.match(reg1));
					var reg2=/\d+/g;
					var str2=(val.match(reg2));
					var str1=[];
					var res="";
					for(var i=0;i<str.length;i++){
						str1[i]=" "+str[i]+" ";
						res+=str2[i]+str1[i]
					}
					var res1=res+str[str2.length-1]
					document.getElementById("output").value=res1;
				}
			}