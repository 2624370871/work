<template>
	<view>
		<view class="smart-page-head">
			<view class="smart-page-head-title">video,视频播放</view>
		</view>
		<view class="smart-padding-wrap">
				<video id="myvideo"
				:danmu-list="danmuList"
				enable-danmu="true"
				danmu-btn="true"
				src="../../../static/spring.mp4"
				></video>
		</view>
		
		<view>
			<input type="text" v-model="danmuValue" class="smart-input" placeholder="在此处输入弹幕内容">
		</view>
		<view class="btn-v">
			<button @click="sendDanmu" class="page-body-button">发送弹幕</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				danmuList:[
					{
						text:'第1s出现的弹幕',
						color:'#ff0000',
						time:1
					},
					{
						text:'第3s出现的弹幕',
						color:'#ff00ff',
						time:3
					}
				],
				danmuValue:''
			};
		},
		onReady:function(res){
			this.videoContext=uni.createVideoContext('myvideo');
			setTimeout(()=>{
				this.showVideo=true;
			},400);
			this.showVideo=true;
		},
		methods: {
			sendDanmu:function(e){
				this.videoContext.sendDanmu({
					text:this.danmuValue,
					color:'red'
				});
				this.danmuValue='';
			}
		}
	}
</script>

<style>
video{
	width: 100%;
}
.btn-v{
	margin: 15rpx;
}
</style>
