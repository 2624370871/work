// pages/list/location/location.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    longitude:114.4038,
    latitude:30.4712,
    markers:[{
      id:1,
      longitude:114.4038,
      latitude:30.4712,
      iconPath:"./image/location.png",
      width:"50px",
      label:{//标记点标签
        content:"我的位置",//标记点文本
        color:"#0000ff",//标记点文本颜色
        bgColor:"#ffff00",//标记点文本背景颜色
        fontSize:20
      }
    },
  {
    longitude:114.4038,
    latitude:30.4712,
    iconPath:"./image/location.png"
  }]
  },
  chooseLocation:function(){
  wx.chooseLocation({
    success:function(res){
      console.log(res)
    }
  })
},
openLocation:function(){
wx.getLocation({
  type:"gc102",
  success:function(res){
    wx.openLocation({
      latitude: res.latitude,
      longitude: res.longitude,
      scale:16
    })
  }
})
}
})