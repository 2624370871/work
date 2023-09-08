// pages/list/NavigationBar/NavigationBar.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
title:''//初始化标题
  },
  inputTitle(e){//获取当前新标题
      this.title=e.detail.value
  },
  setNavigationBarTitle(){//设置标题
wx.setNavigationBarTitle({//设置标题api函数
  title:this.title
})
  },
  setNavigationBarColor(){//设置颜色
    wx.setNavigationBarColor({//设置颜色api函数
      backgroundColor: '#ff0000',
      frontColor: '#ffffff',
      animation:{
        duration:3000,
        timingFunc:"linear"
      }
    })
  },
  setNavigationBarLoading(){
   wx.showNavigationBarLoading()
  },
  setNavigationBarLoding(){
    wx.hideNavigationBarLoading()
  }
})