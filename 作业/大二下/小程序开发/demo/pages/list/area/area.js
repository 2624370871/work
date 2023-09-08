// pages/list/area/area.js
Page({

  /**
   * 页面的初始数据
   */
  data: {

  },
getarea(e){
  var a=parseFloat(e.detail.value.a);
  var b=parseFloat(e.detail.value.b);
  var c=parseFloat(e.detail.value.c);
  if(a+b<=c||b+c<=a||a+c<=b){
    wx.showToast({
      title: '以上三条边不能构成三角形',
      icon:"none",
      duration:2000
    });
    this.clear();
    return;
  }else{
    var s=(a+b+c)/2;
    var area=Math.sqrt(s*(s-a)*(s-b)*(s-c))
  }
  this.setData({
    result:area
  })
},
clear(){
  this.setData({
    a:"",
    b:"",
    c:"",
    result:""
  })
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