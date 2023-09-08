// pages/list/stylefont/stylefont.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
size:"25px",
  },
  checkbox(e){
    var checkbox=[];
    var bold="";
    var italic="";
    var underline="";
    checkbox = e.detail.value
    for(var i=0;i<checkbox.length;i++){
      console.log(checkbox[i])
      if(checkbox[i]=='bold'){
        bold='bold';
      }
      if(checkbox[i]=='italic'){
        italic='italic';
      }
      if(checkbox[i]=='underline'){
        underline='underline';
      }
    }
    this.setData({
      bold:bold,
      italic:italic,
      underline:underline
    })
  },
  radio(e){
 this.setData({
   size:e.detail.value
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