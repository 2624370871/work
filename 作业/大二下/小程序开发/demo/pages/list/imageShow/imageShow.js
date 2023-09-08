// pages/list/imageShow/imageShow.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    image:'./image/image.png',
imgArray:[
  {
    text:'aspecFit:保持纵横比缩放图片，使图片完整的显示出来',
    mode:'aspectFit'
  },
  {
    text:'aspectFill:保持纵横比缩放图片，只保证图片的短边能完全显示出来',
    mode:'aspectFill'
  },
  {
    text:'widthFix:保持纵横比缩放图片，宽度完全显示出来',
    mode:'widthFit'
  },
  {
    text:'scaleToFill:不保持纵横比缩放图片，使图片的宽高完全拉伸至填满image元素',
    mode:'scaleToFill'
  },

  {
    text:'top:不缩放图片，只显示图片的顶部区域',
    mode:'top'
  },
  {
    text:'bottom:不缩放图片，只显示图片的底部区域',
    mode:'bottom'
  },
  {
    text:'center:不缩放图片，只显示图片的中间区域',
    mode:'center'
  },
  {
    text:'left:不缩放图片，只显示图片的左边区域',
    mode:'left'
  },
  {
    text:'right:不缩放图片，只显示图片的右边区域',
    mode:'right'
  },
  {
    text:'top,left:不缩放图片，只显示图片的左上边区域',
    mode:'top left'
  },
  {
    text:'top,right:不缩放图片，只显示图片的右上边区域',
    mode:'top right'
  },
  {
    text:'bottom,left:不缩放图片，只显示图片的左下角边区域',
    mode:'bottom left'
  },
  {
    text:'bottom,right:不缩放图片，只显示图片的右下角边区域',
    mode:'bottom right'
  },
]
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