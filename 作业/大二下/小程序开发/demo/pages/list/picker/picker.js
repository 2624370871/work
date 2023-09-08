// pages/list/picker/picker.js
function Person(name,sex,birPlace,birDay,height,weight) {
  this.name=name;
  this.sex=sex;
  this.birPlace=birPlace;
  this.birDay=birDay;
  this.height=height;
this.weight=weight;
}
Page({

  /**
   * 页面的初始数据
   */
  data: {
    flag:true,
    sex: ['男', '女'],
    Sex:"男",
    BirDay: '2003-06-25',
    BirPlace: ['湖北省', '十堰市', '竹山县'],
  },
  bindSex: function(e) {
    this.sex=this.data.sex[e.detail.value]//获取性别的下标值
    this.setData({
      Sex:this.sex
    })
  },
  bindbirDay: function(e) {
    this.birDay=e.detail.value;
    this.setData({
      BirDay:this.birDay
    })
  },
  bindBirPlace: function (e) {
    this.birPlace=e.detail.value;
    this.setData({
      BirPlace:this.birPlace
    })
  },
  nameInput(e){
      this.name=e.detail.value
  },
  weightInput(e){
    this.weight=e.detail.value
},
heightInput(e){
  this.height=e.detail.value
},
  show(){
    var p=new Person(this.name,this.sex,this.birPlace,this.birDay,this.weight,this.height)
    this.setData({
      person:p,
      flag:false,
    })
  },
  del(){
    this.setData({
      person:"",
      flag:true
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