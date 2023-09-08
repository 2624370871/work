// pages/list/bind/bind.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    a:10,
    b:20,
    c:30,
    student:{
      stuId:210403020,
      stuName:"张三",
      stuBir:"2003-06-25"
    },
    array:[2018,2019,2020]
  },
btn(){
  this.setData({
    a:20,
    b:30,
    c:40,
    student:{
      stuId:210403001,
      stuName:"李四",
      stuBir:"2003-01-01"
    },
    array:[2008,2009,2010]
  })
},
btn1(){
  this.setData({
    a:10,
    b:20,
    c:30,
    student:{
      stuId:210403020,
      stuName:"张三",
      stuBir:"2003-06-25"
    },
    array:[2018,2019,2020]
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