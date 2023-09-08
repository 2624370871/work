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
				src="https://vd4.bdstatic.com/mda-jkk3p99qve2jjhwd/sc/mda-jkk3p99qve2jjhwd.mp4?playlist=%5B%22hd%22%2C%22sc%22%5D&v_from_s=hkapp-haokan-hbf&auth_key=1667109773-0-0-ebff1a0ed7951cfd7530a51a6761a503&bcevod_channel=searchbox_feed&pd=1&cd=0&pt=3&logid=1973407500&vid=14766399244610652992&abtest=104959_1-105227_2&klogid=1973407500"></video>
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
