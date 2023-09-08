<template>
	<view>
		<!-- 顶部 -->
		<view class="items">
			<view class="item">
				<view class="item-xs">推荐</view>
				<view class="item-x">千里眼</view>
				<view class="item-x">搞笑</view>
				<view class="item-x">娱乐</view>
				<view class="item-x">社会</view>
				<view class="item-x">音乐</view>
				<view class="item-x">科技</view>
			</view>
		</view>
		<view class="item-ss"></view>
		
		<!-- 视频 -->
		<view class="sp">
			<navigator url="videoxq">
				<view class="x">
					乌克兰全境进入停电状态，首都基辅暂停供水，目前情况如何？会对俄乌局势产生哪些影响？
				</view>
			</navigator>
			<video src="../../../static/云海.mp4" class="y" style="width: 100%; height: 400rpx;"></video>
			<view class="dibu">
				<view class="wenzi">
					<view class="wenzizf">
						<image src="../../../static/logo.png" style="width: 45rpx; height: 45rpx;"></image>
						<view class="wenzizf1" style="font-size: 32rpx;">开心哈哈大笑...</view>
						<view class="wenzizf1" style="color: #999; margin-top: 0rpx;">|</view>
						<view class="wenzizf1" style="font-size: 32rpx; color: #dd524d; font-weight: bold;" @click="guanzhu">{{gaunzhu}}</view>
					</view>
					<view class="tupian">
						<view class="tupiandx">
							<image src="../../../static/评论.jpeg" style="width: 35rpx; height: 35rpx;" @click="input"></image>
						</view>
						<view class="tupiandx">
							<image src="../../../static/点赞.jpeg" style="width: 35rpx; height: 35rpx;" @click="add1">{{number1}}</image>
						</view>
						<view class="tupiandx" style="margin-top: -10rpx; padding-right: 20rpx;">...</view>
					</view>
				</view>
			</view>
		</view>
		
		<!-- 视频 -->
		<view class="sp">
			<view class="x">
				乌克兰全境进入停电状态，首都基辅暂停供水，目前情况如何？会对俄乌局势产生哪些影响？
			</view>
			<video src="../../../static/云海.mp4" class="y" style="width: 100%; height: 400rpx;"></video>
			<view class="dibu">
				<view class="wenzi">
					<view class="wenzizf">
						<image src="../../../static/logo.png" style="width: 45rpx; height: 45rpx;"></image>
						<view class="wenzizf1" style="font-size: 32rpx;">开心哈哈大笑...</view>
						<view class="wenzizf1" style="color: #999; margin-top: 0rpx;">|</view>
						<view class="wenzizf1" style="font-size: 32rpx; color: #dd524d; font-weight: bold;" @click="guanzhu">{{gaunzhu}}</view>
					</view>
					<view class="tupian">
						<view class="tupiandx">
							<image src="../../../static/评论.jpeg" style="width: 35rpx; height: 35rpx;" @click="input"></image>
						</view>
						<view class="tupiandx">
							<image src="../../../static/点赞.jpeg" style="width: 35rpx; height: 35rpx;" @click="add2">{{number2}}</image>
						</view>
						<view class="tupiandx" style="margin-top: -10rpx; padding-right: 20rpx;">...</view>
					</view>
				</view>
			</view>
		</view>
		
		<!-- 视频 -->
				<view class="sp">
					<view class="x">
						乌克兰全境进入停电状态，首都基辅暂停供水，目前情况如何？会对俄乌局势产生哪些影响？
					</view>
					<video src="../../../static/云海.mp4" class="y" style="width: 100%; height: 400rpx;"></video>
					<view class="dibu">
						<view class="wenzi">
							<view class="wenzizf">
								<image src="../../../static/logo.png" style="width: 45rpx; height: 45rpx;"></image>
								<view class="wenzizf1" style="font-size: 32rpx;">开心哈哈大笑...</view>
								<view class="wenzizf1" style="color: #999; margin-top: 0rpx;">|</view>
								<view class="wenzizf1" style="font-size: 32rpx; color: #dd524d; font-weight: bold;" @click="guanzhu">{{gaunzhu}}</view>
							</view>
							<view class="tupian">
								
								<view class="tupiandx">
									<image src="../../../static/评论.jpeg" style="width: 35rpx; height: 35rpx;" @click="input"></image>
								</view>
								<view class="tupiandx">
									<image src="../../../static/点赞.jpeg" style="width: 35rpx; height: 35rpx;" @click="add3">{{number3}}</image>
								</view>
								<view class="tupiandx" style="margin-top: -10rpx; padding-right: 20rpx;">...</view>
							</view>
						</view>
					</view>
					
				</view>
		<view class="pinglun">
			评论：<text>{{zuizhong}}</text>
		</view>
		<view v-if="xianshi">
			<view><input placeholder="请输入评论" v-model="shuru"/></view>
			<view><button @click="tijiao">提交</button></view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				number1:0,
				number2:0,
				number3:0,
				gaunzhu:"关注",
				yiguanzhu:"已关注",
				xianshi:true,
				shuru:"",
				zuizhong:"",
				
			}
		},
		methods: {
			add1(){
				if (this.number1<10) {
					this.number1++;
					return
				}
				uni.showToast({
					title:'点赞达到上限!!!',
					icon:'none',
					duration:2000
				})
			},
			add2(){
				if (this.number2<10) {
					this.number2++;
					return
				}
				uni.showToast({
					title:'点赞达到上限!!!',
					icon:'none',
					duration:2000
				})
			},
			add3(){
				if (this.number3<10) {
					this.number3++;
					return
				}
				uni.showToast({
					title:'点赞达到上限!!!',
					icon:'none',
					duration:2000
				})
			},
			input(){
				this.xianshi=!this.xianshi;
			},
			tijiao(){
				this.zuizhong=this.shuru;
				this.xianshi=false;
				this.shuru="";
			},
			guanzhu(){
				if (this.gaunzhu=="关注") {
					uni.showToast({
						title:'成功关注',
						icon:'none',
						duration:2000
					})
					this.gaunzhu=this.yiguanzhu;
				} else{
					this.gaunzhu="关注",
					uni.showToast({
						title:'取消关注成功',
						icon:'none',
						duration:2000
					})
				}
			}
		}
	}
</script>

<style>
.items{
	background-color: #FFF;
	position: fixed;
	z-index: 1;
	width: 100%;
	top: 90rpx;
}
.item{
	background-color: #FFF;
	display: flex;
	flex-direction: row;
	justify-content: space-between;
	margin: 5rpx 10rpx 20rpx 10rpx;
	font-size: 40rpx;
	color: #333;
	margin-bottom: 20rpx;
	border-bottom: 1rpx solid #C8C7CC;
}
.item-ss{
	width: 100%;
	height: 60rpx;
}
.item-xs{
	color: #DD524D;
	font-weight: bold;
}
.sp{
	border-bottom: 1rpx solid #e5eaf3;
	margin: 10rpx 10rpx 20rpx 20rpx;
}
.x{
	margin-top: 30rpx;
	margin-bottom: 30rpx;
}
.dibu{
	display: flex;
	flex-direction: row;
	justify-content: space-between;
	margin-top: 30rpx;
	margin-bottom: 20rpx;
}
.wenzi{
	display: flex;
	flex-direction: row;
}
.wenzizf{
	display: flex;
	flex-direction: row;
	margin-right: 20rpx;
}
.tupian{
	display: flex;
	flex-direction: row;
}
.tupiandx{
	margin-left: 60rpx;
}
</style>
