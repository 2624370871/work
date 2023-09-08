// pages/list/audioShow/audioShow.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    poster: './resource/烟-distance.jpg',
    name: '烟distance',
    author: '丁真',
    src: './resource/烟-distance.mp3',
  },
  onLoad() {
    this.audioContext = wx.createAudioContext('audio')
  },
  audioPlay: function () {
    this.audioContext.play()
  },
  audioPause: function () {
    this.audioContext.pause()
  },
  audio14: function () {
    this.audioContext.seek(14)
  },
  audioStart: function () {
    this.audioContext.seek(0)
  }

})