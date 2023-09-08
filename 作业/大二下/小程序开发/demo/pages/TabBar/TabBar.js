// pages/TabBar/TabBar.js
Page({

  /**
   * 页面的初始数据
   */
  data: {

  },
  showTab(){
    wx.showTabBar({
      animation:true
    })
  },
  hideTab(){
    wx.hideTabBar({
      animation:true
    })
  },
  setTab(){
    wx.setTabBarBadge({
      index: 0,
      text: '10'
    })
  },
  delTab(){
    wx.removeTabBarBadge({
      index: 0
    })
  },
  showTabDot(){
    wx.showTabBarRedDot({
      index: 2
    })
  },
  hideTabDot(){
    wx.hideTabBarRedDot({
      index: 2
    })
  },
  setTabStyle(){
    wx.setTabBarStyle({
      color: '#ff0000',
      selectedColor: '#0000ff',
      backgroundColor: '#ffff00',
      borderStyle: ''
    })
  },
  setTabItem(){
    wx.setTabBarItem({
      index: 1,
      text: 'TabBar',
      iconPath: "/pages/image/sy.png",
      selectedIconPath: "/pages/image/sy1.png",
    })
  },
  reset(){
    wx.setTabBarStyle({
      color: '#000000',
      selectedColor: '#1AAD19',
      backgroundColor: '#fff',
      borderStyle: ''
    })
    wx.setTabBarItem({
      index: 1,
      text: '标签栏',
      iconPath: '/pages/image/set1.png',
      selectedIconPath: '/pages/image/set2.png'
    })
  }
})