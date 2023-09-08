// pages/list/canvasReserve/canvasReserve.js
var context=wx.createCanvasContext('canvas');
Page({

  /**
   * 页面的初始数据
   */
  data: {

  },
  draw(e){
var x=e.detail.value.x;
var y=e.detail.value.y;
var r=e.detail.value.r;
context.arc(x,y,r,0,Math.PI*2)//通过获取的圆心和半径画圆
context.stroke();//画路径的边框
context.draw();//画布上显示绘图
},
clear(){
  context.draw();//画布清空
}
})