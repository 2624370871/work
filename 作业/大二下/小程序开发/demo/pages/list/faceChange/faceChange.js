// pages/changeFace/changeFace.js
function getRandom() {
    return Math.floor(Math.random()*10)
}
Page({

    /**
     * 页面的初始数据
     */
    data: {
        index:0,
        imgArray:[
            './image/01.jpg',
            './image/02.jpg',
            './image/03.jpg',
            './image/04.jpg',
            './image/05.jpg',
            './image/06.jpg',
            './image/07.jpg',
            './image/08.jpg',
            './image/09.jpg',
            './image/10.jpg',
        ]
    },
    changeFace(){
        var position = getRandom();
        this.setData({
            index:position
        })
    },
    onShow: function () {
        var that = this;
        wx.onAccelerometerChange(function(res){
            if(res.x > 0.5 || res.y > 0.5 || res.z > 0.5){
                wx.showToast({
                  title: '手机摇晃成功',
                  icon: 'success',
                })
                that.changeFace()
            }
        })
    },
})