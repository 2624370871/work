// pages/list/canvasChange/canvasChange.js
var context=wx.createCanvasContext("canvas");
Page({

  /**
   * 页面的初始数据
   */
  data: {

  },
// 绘图
draw(){
context.strokeRect(0,0,50,50);
context.draw(true);
},
// 放大
scale(){
context.scale(2,2);
this.draw();
},
// 移动
translate(){
context.translate(25,25);
this.draw();
},
// 旋转
rotate(){
  context.rotate(30*Math.PI/180);
  this.draw();
}
})