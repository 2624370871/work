// pages/list/scan/scan.js
Page({

    /**
     * 页面的初始数据
     */
    data: {

    },
scanCode(){
  var that=this;
  wx.scanCode({
    onlyFromCamera:false,
    scanType:[],
    success:function(res){
      that.setData({
        resCode:res
      })
    }
  })
},
inputName(e){
this.name=e.detail.value;
},
inputPhone(e){
this.phone=e.detail.value;
},
makeCall(){
  wx.makePhoneCall({
    phoneNumber:this.phone
  })
},
addPerson(){
  var name=this.name;
  var phone=this.phone;
  if(name==""||phone==""){
    wx.showToast({
      title: '姓名和电话不能为空',
      icon:"none",
      duration:5000
    })
  }else{
    wx.addPhoneContact({
      firstName: name,
      mobilePhoneNumber:phone
    })
  }
}
})