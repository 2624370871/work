
Page({
    data: {
      index:0,
      array: [
        '第一场8:00',
        '第二场10:00',
        '第三场14:00'
      ]
    },
  
    formSubmit: function(e) {
      var name = e.detail.value.name;
      var id = e.detail.value.id;
      var time = e.detail.value.time;
      wx.showModal({
        title: '确认信息',
        content: name + "同学，你的学号是：" + id + "，你选择的场次是：" + this.data.array[time] + ",请确认信息！",
        success: function(res) {
          if (res.confirm) {
            wx.showModal({
              title: '信息确认',
              content: '你的考场信息已经确认！',
            })
            wx.redirectTo({
              url: '../../../index/index'
            })
          } else {
           wx.showToast({
             title: '用户已取消！',
             icon:"error"
           })
          }
        }
      })
    },
  
    chooseTime: function(e) {
      var index = e.detail.value
      this.setData({
        index: index
      })
    }
  })