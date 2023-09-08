// pages/list/camera/camera.js
Page({

  /**
   * 页面的初始数据
   */
  data: {

  },
  chooseimage(){
    var that=this;
wx.chooseImage({
  count: 1,
  sizeType: ['original','compressed'],//选择图片的来源类型是压缩还是原图
  sourceType: ['album','camera'],//选择图片的来源是相册还是现场拍照
  success(res){
    // 返回所选照片的路径渲染到视图层
that.setData({//在回调函数中不能使用this，提前将this赋值给that
  imgPath:res.tempFilePaths
})
  }
})
  },
  chooseVideo(){
    var that=this;
    wx.chooseVideo({
      sourceType:['album','camera'],
      compressed:true,
      maxDuration:60,
      camera:'back',
      success(res){
        // 返回所选视频的路径渲染到视图层
    that.setData({//在回调函数中不能使用this，提前将this赋值给that
      videoPath:res.tempFilePaths
    })
      }
    })
  }
})