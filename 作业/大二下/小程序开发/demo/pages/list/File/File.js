// pages/list/File/File.js
var tempFilePaths,tempFileath;//定义存放所有文件和单个文件路径的全局变量
Page({

  /**
   * 页面的初始数据
   */
  data: {
msg:"",
hidden:true
  },

  // 打开文件
openFile(){
  var that=this;
  wx.chooseImage({
    success(res){
      tempFilePaths=res.tempFilePaths;//获取所有打开图片文件的路径
      console.log("打开文件路径："+tempFilePaths);
      that.setData({
        imgPath:tempFilePaths[0],//显示打开的第一张图片
        hidden:false,//显示文件信息区域
        msg:"文件打开成功！"
      })
    }
  })
},
//  保存文件
saveFile(){
  var that=this;
  wx.saveFile({
    tempFilePath: tempFilePaths[0],//获取打开的第一个文件路径
    success(res){
      console.log("保存文件路径"+res.savedFilePath);//显示保存的文件路径
      that.setData({
        hidden:false,
        msg:"文件保存成功！"
      })
    }
  })
},
getSaveFileInfo(){//获取已经保存的文件信息
  var i,file;
  var that=this;
  wx.getSavedFileList({//获取所有已保存的文件
    success(res){
      if(res.fileList.length==0){//讲获取的所有文件赋值给res.fileList
        that.setData({//如果没有保存的文件
          hidden:false,//显示文件信息
          msg:'没有文件信息'//文件信息
        })
      }else{
        for(i=0;i<res.fileList.length;i++){
          file=res.fileList[i];
          console.log("第"+(i+1)+"个文件路径："+file.fileList)
          wx.getSavedFileInfo({//获取已保存的文件信息
            filePath: file.filePath,
            success(res){
              console.log("第"+i+"个文件大小为："+res.size)//将文件信息赋值给res
              that.setData({
                hidden:false,
                msg:"文件数量"+i+"\n最后一个文件的大小:"+res.size+"\n最后一个文件的创建时间："+res.createTime
              })
            }
          })
        }
      }
    }
  })
},
removedSaveFile: function() {
  var i, file;
  var that = this;
  wx.getSavedFileList({
    success: function(res) {
      for (i = 0; i < res.fileList.length; i++) {
        file = res.fileList[i];
        wx.removeSavedFile({
          filePath: file.filePath,
        })
        console.log('第' + (i + 1) + '个文件被删除！')
      }
      that.setData({
        hidden: false,
        msg: '文件被全部删除'
      })
    }
  })
}

})