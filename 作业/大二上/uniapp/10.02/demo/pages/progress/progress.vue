<template>
	<view>
		<view class="smart-page-head">
			<view class="smart-page-head-title">
				progress,进度
			</view>
			<view class="smart-padding-wrap">
				<view class="progress-box">
					<progress :percent="pgList[0]" show-info stroke-width="3" active="true"/>
				</view>
				<view class="progress-box">
					<progress :percent="pgList[1]" show-info stroke-width="3" activeColor="#10AEFF"/>
				</view>
				<view class="progress-control">
					<button tape="primary" @click="setProgress">设置进度</button>
					<button tape="warn" @click="clearProgress">清除进度</button>
				</view>
			</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				pgList:[0,0]
			}
		},
		methods: {
			setProgress(){
				this.pgList=[100,100];
			},
			clearProgress(){
				this.pgList=[0,0];
			}
		}
	}
</script>

<style>
.progress-box{
	height: 50rpx;
	margin-bottom: 60rpx;
}
.progress-control button{
	margin-top: 20rpx;
}
</style>
