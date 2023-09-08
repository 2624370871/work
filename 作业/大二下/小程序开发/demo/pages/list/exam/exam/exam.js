// pages/exam/exam.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
        getEmail:'',
        getPwd:'',
        getPwdConfirm:''
    },
    formSubmit(e) {
        if (e.detail.value.email.length == 0 || e.detail.value.password.length == 0) { //判断邮箱和密码输入框内容是否为空。
          this.setData({
            msg1: '邮箱或密码不得为空！',
          })
        } else if (e.detail.value.password != e.detail.value.confirm) { //判断密码和确认密码是否一致
          this.setData({
            msg2: '两次输入密码不一致！'
          })
        }else {
          wx.navigateTo({ //页面跳转
            url: '../examTime/examTime',
          })
        }
      },
      inputemail(e) {
        var email = e.detail.value
        var checkedNum = this.checkEmail(email)
      },
      checkEmail(email) { 
        let str = /^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*\.[a-zA-Z0-9]{2,6}$/
        if (str.test(email)) { //检查正则表达式是否符合邮箱地址要求
          return true
        } else {
          wx.showToast({ //显示消息提示框
            title: '邮箱格式错误',
            icon: 'error'
          })
          return false
        }
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