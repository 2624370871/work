// pages/list/SystemInfo/SystemInfo.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    hide1:false,
    hide2:true
  },
  getSystemInfoSync(){//同步获取
  var that=this;
  var res=wx.getSystemInfoSync();//同步获取api函数
that.setData({
  hide1:false,
  hide2:true,
  msg:"同步",
  model:res.model,
  pixelRatio:res.pixelRatio,
  screenWidth:res.screenWidth,
  screenHeight:res.screenHeight,
  windowWidth:res.windowWidth,
  windowHeight:res.windowHeight,
  language:res.language,
  version:res.version,
  system:res.system,
  platform:res.platform,
  SDKVersion:res.SDKVersion
})
},
// 异步获取
getSystemInfo(){
  var that=this;
wx.getSystemInfo({//异步获取api函数
success:function(res){
that.setData({
  hide1:true,
  hide2:false,
  msg:"异步",
  model:res.model,
  pixelRatio:res.pixelRatio,
  screenWidth:res.screenWidth,
  screenHeight:res.screenHeight,
  windowWidth:res.windowWidth,
  windowHeight:res.windowHeight,
  language:res.language,
  version:res.version,
  system:res.system,
  platform:res.platform,
  SDKVersion:res.SDKVersion
})
}
})
}
})