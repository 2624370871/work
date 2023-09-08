// pages/list/slider/slider.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    r:50,
    g:100,
    b:150,
    a:1
  },
change(e){
  var color=e.currentTarget.dataset.color//获取当前滑动条的data-color值
  var value=e.detail.value//获取当前滑动条的value值
  console.log(value)
  this.setData({
    [color]:value//将value赋值给color数组并渲染更新图层的颜色块
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