// pages/list/Network/Network.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
status:"获取中...."
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad(options) {
var that=this;
wx.getNetworkType({
  success(res){
    that.setData({
      status:res.networkType
    })
  }
})
wx.onNetworkStatusChange(function(res){
  // 调用监听网络状态变化的函数
  if(res.isConnected){//如果联网状态，显示网络类型
    that.setData({
      status:res.networkType
    })
  }else{
    that.setData({
      status:"未联网！"
    })
  }
})
  },
  wifiStatus() {
    var that = this;
    wx.getConnectedWifi({
      success(res) {
        that.setData({
          wifiInfo: res.wifi
        });
      }
    });
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