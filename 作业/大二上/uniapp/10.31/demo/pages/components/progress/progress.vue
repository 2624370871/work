<template>
	<view>
		<view class="smart-page-head">
			<view class="smart-page-head-title">
				progress,进度
			</view>
			<view class="smart-padding-wrap">
				<view class="progress-box">
					<progress :percent="percent" show-info stroke-width="3" color="red"/>
				</view>
				<view class="progress-control">
					<button type="primary" @click="add" :disabled="!canadd">增加进度</button>
					<button type="warn" @click="del" :disabled="!candel">减少进度</button>
				</view>
				<view class="progress-box">
									<progress :percent="pgLists[0]" show-info stroke-width="3" active="true"/>
								</view>
								<view class="progress-box">
									<progress :percent="pgLists[1]" show-info stroke-width="3" activeColor="#10AEFF"/>
								</view>
								<view class="progress-control">
									<button type="primary" @click="setProgress" :disabled="!canadd1">设置进度</button>
									<button type="warn" @click="clearProgress" :disabled="!candel1">清除进度</button>
								</view>
			</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				percent:0,
				canadd:true,
				candel:false,
				canadd1:true,
				candel1:false,
				pgLists:[0,0]
			}
		},
		methods: {
			add(){
				this.percent+=10;
				this.canadd=this.percent<100;
				this.candel=this.percent>0;
			},
			del(){
				this.percent-=10
				this.canadd=this.percent<100;
				this.candel=this.percent>0;
			},
			setProgress(){
							this.pgLists=[100,100];
							this.canadd1=this.pgLists<[100,100];
							this.candel1=this.pgLists>[0,0];
						},
						clearProgress(){
							this.pgLists=[0,0];
							this.canadd1=this.pgLists<[100,100];
							this.candel1=this.pgLists>[0,0];
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
