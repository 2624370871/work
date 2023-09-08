// pages/list/score/score.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
name:"",
chinese:"",
math:"",
score:"",
hidden:true
  },
  // 获取名字
nameinput(e){
  this.setData({
    name:e.detail.value
  })
},
// 获取语文成绩
chineseinput(e){
  this.setData({
    chinese:e.detail.value
  })
},
// 获取数学成绩
mathinput(e){
  this.setData({
    math:e.detail.value
  })
},
// 求平均成绩
submit(){
  // this.data获取页面的data对象
  var score=(parseFloat(this.data.chinese)+parseFloat(this.data.math))/2;
  this.setData({
    score:score,
    hidden:false
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