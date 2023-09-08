// pages/list/exchange/exchange.js
Page({

  /**
   * 页面的初始数据
   */
  data: {

  }, 
    calc: function(e) {
      var C;
      C = e.detail.value.ipt;
      this.setData({
        M: (C / 6.8).toFixed(2), 
        Y: (C / 8.7).toFixed(2),
        G: (C / 0.8).toFixed(2),
        O: (C / 7.8).toFixed(2),
        H: (C / 0.0053).toFixed(2), 
        R: (C / 0.06).toFixed(2), 
      })    
    },
    reset: function() { 
      this.setData({ 
        M: '',
        Y: '',
        G: '',
        O: '',
        R: '',
        H: ''
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