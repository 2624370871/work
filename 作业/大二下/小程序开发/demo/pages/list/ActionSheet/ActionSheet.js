// pages/list/ActionSheet/ActionSheet.js
var myItemList=['第一项','第二项','第三项','第四项']
Page({
showActionSheet(){
var that=this;
wx.showActionSheet({
  itemList: myItemList,
  itemColor:"#0000ff",
  success:function(res){
    that.setData({
      tapIndex:res.tapIndex,
      tapItem:myItemList[res.tapIndex]
    })
  },
  fail:function(res){
    that.setData({
      tapIndex:-1,
      tapItem:"取消"
    })
  }
})
},
  /**
   * 页面的初始数据
   */
  data: {

  },
})