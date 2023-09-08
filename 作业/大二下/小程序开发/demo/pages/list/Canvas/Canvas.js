// pages/list/Canvas/Canvas.js
var context  = wx.createCanvasContext ('myCanvas')//创建画布上下文对象
Page({
  /**
   * 页面的初始数据
   */
  data: {

  },
//清除
clear(){
  context.draw()//清除画布内容
},
//画点
drawDot(){
  context.arc(150,150,10,0,Math.PI*2);//弧度=(Math.PI/180)*角度
  context.setFillStyle('pink');//设置填充样式
  context.fill();//对当前路径进行填充
  context.draw();//显示绘图效果
},
//画圆
drawCircle(){
  context.arc(150,110,100,0,Math.PI*2);//弧度=(Math.PI/180)*角度
  context.setStrokeStyle('red');//设置填充样式
  context.stroke();//画出路径的边框
  context.draw();//显示绘图效果
},
//画虚线
drawDash(){
  context.setStrokeStyle("orange");
  context.setLineDash([20,10]);//设置虚线样式
  context.setLineWidth(5);//设置虚线宽度
  context.moveTo(50,50);//起点
  context.lineTo(250,50);
  context.lineTo(150,200);
  context.lineTo(50,50);
  context.stroke();//画出当前路径的边框
  context.draw();
  context.setLineDash([0,0]);//恢复默认的线条样式
  context.setLineWidth(1);
},
//端点交点
capAndJoin() {
  context.setStrokeStyle('white');
  context.setLineWidth(10);
  context.setLineCap('round'); //设置线条端点样式
  context.setLineJoin('bevel'); //设置线条连接样式
  context.moveTo(50, 50);
  context.lineTo(200, 50);
  context.lineTo(50, 150);
  context.stroke();
  context.draw();
  context.setLineWidth(1); //恢复默认设置
  context.setLineCap('butt'); //恢复默认设置
  context.setLineJoin('mitter'); //恢复默认设置
},
//画字
drawText(){
  context.setFillStyle("blue");
  context.setFontSize(20);
  context.fillText("湖北科技职业学院",50,50);
  context.setTextBaseline("bottom");
  context.rotate(30*Math.PI/180);
  context.fillText("湖北科技职业学院",150,50);
  context.draw();
},
//圆形渐变
circularGrad(){
  var gradient=context.createCircularGradient(150,150,100);//创建圆形渐变对象
  gradient.addColorStop(0,'green');//渐变色起点
  gradient.addColorStop(1,'pink');//渐变色终点
  context.setFillStyle(gradient);//填充渐变颜色
  context.fillRect(50,50, 200, 200);
  context.draw();
},
//阴影矩形
shadowRect(){
  context.setFillStyle("orange");
  context.setShadow(20,20,30,"pink");
  context.fillRect(50,50,150,150);//矩形
  context.draw();
},
//半透明
tranSlucent(){
  context.setFillStyle("orange");
  context.setGlobalAlpha(0.6);//设置透明度
  context.fillRect(50,50,200,200);//矩形
  context.draw();
  context.setGlobalAlpha(1);//恢复默认透明度
}
})