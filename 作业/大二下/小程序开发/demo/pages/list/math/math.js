// pages/list/math/math.js
Page({
input(e){
    var x,y;
    x=e.detail.value;
    if(x<0){
      y=Math.abs(x);
    }else if(x<10){
      y=Math.exp(x)*Math.sin(x);
    }else if(x<20){
      y=Math.pow(x,3);
    }else{
      y=(3+2*x)*Math.log(x);
    }
    this.setData({
      y:y
    })
},
  /**
   * 页面的初始数据
   */
  data: {

  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad(options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady() {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow() {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide() {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload() {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh() {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom() {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage() {

  }
})