// pages/list/factorial/factorial.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
  },

  changeNum(e){
    this.num=e.detail.value;
  },
  onShow: function () {
    var that = this;
    wx.onAccelerometerChange(function(res){
        if(res.x > 0.5 || res.y > 0.5 || res.z > 0.5){
            wx.showToast({
              title: '手机摇晃成功',
              icon: 'success',
            });
            var result=1;
            for(var i=1;i<=that.num;i++){
            result*=i;
            }
            that.setData({
              result:result
            })
        }
    })
},
})