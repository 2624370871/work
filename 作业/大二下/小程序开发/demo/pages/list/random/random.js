// pages/list/random/random.js

Page({

  /**
   * 页面的初始数据
   */
  data: {
  },
rand(){
    var randomArray=[];
    var sum=0;
    for(var i=0;i<6;i++){
      // 生成随机数
      var randomText=Math.random()*100;
      // 将随机数保留小数点后两位
      randomText=randomText.toFixed(2);
      // 将随机数添加到数组中
      randomArray.push(randomText);
      // 将随机数转化为数值并相加
      sum+=randomText*1;
      console.log(randomArray[i]);
    }
    // 将相加的和保留小数点后两位
    sum=sum.toFixed(2);
console.log(randomArray);

   this.setData({
randomArray:randomArray,
sum:sum,
   })
},
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad(options) {
    // 页面启动时调用函数
     this.rand();
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