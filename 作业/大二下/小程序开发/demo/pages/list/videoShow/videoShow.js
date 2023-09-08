// pages/list/videoShow/videoShow.js
// 生成min到max之间的随机整数
// function getRandom(min,max) {
//   return Math.floor(Math.random()*(max-min+1)+min)
// }
// function getRandomColor() {
//   var colors=['red','green','blue','orange','pink','purple'];
// var pos=getRandom(0,colors.length-1);
// var randColor=colors[pos];
// return randColor;
// }

function getRandomColor(){
  var r=Math.floor(Math.random()*256);
  var g=Math.floor(Math.random()*256);
  var b=Math.floor(Math.random()*256);
  return "rgb("+r+","+g+","+b+")";
}
Page({
  /**
   * 页面的初始数据
   */
  data: {
    src:"https://upos-sz-mirrorcos.bilivideo.com/upgcxcode/77/16/1057281677/1057281677_nb3-1-16.mp4?e=ig8euxZM2rNcNbRVhwdVhwdlhWdVhwdVhoNvNC8BqJIzNbfq9rVEuxTEnE8L5F6VnEsSTx0vkX8fqJeYTj_lta53NCM=&uipk=5&nbs=1&deadline=1682859796&gen=playurlv2&os=bcache&oi=2030333537&trid=00003d0afaa78ed54f1d868bce312ad4f469h&mid=0&platform=html5&upsig=fde9a03e750fbc58d1db761ba85ff208&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,mid,platform&cdnid=3840&bvc=vod&nettype=0&bw=23100&logo=80000000",
    danmuList:[
      {
        text:"第1s出现的弹幕",
        color:"red",
        time:1
      },
      {
        text:"第5s出现的弹幕",
        color:"green",
        time:5
      },
      {
        text:"第10s出现的弹幕",
        color:"blue",
        time:10
      }
    ]
  },
  onLoad() {
    this.videoContext = wx.createVideoContext('video')//创建视频上下文对象
  },
  getInput(e){
this.inputValue=e.detail.value;//获取输入框的内容
  },
  sendDanmu(){
    //通过创建的上下文视频对象调用sendDanmu方法
    this.videoContext.sendDanmu({
      text:this.inputValue,
      color:getRandomColor()
    })
  }

})