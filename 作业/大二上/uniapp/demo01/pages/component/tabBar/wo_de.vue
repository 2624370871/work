<template>
	<view>
		<view class="dd">
			<!-- 未登录页面顶部 -->
			<view class="item1">
				<image src="../../../static/嫦娥.jpg" class="tx" style="width: 130px; height: 130px;"></image>
				<view class="item2">
					<view class="item3">HI~欢迎回来</view>
					<view class="item4"><text class="itemz">登录</text></view>
				</view>
			</view>
			
			<!-- 第二部分 -->
			<view class="er1">
				<view class="er2" @click="add">{{weiguanzhu}}{{renshu}}</view>
				<view class="er3">|</view>
				<view class="er4" @click="showtopic">话题{{huati}}</view>
			</view>
		</view>
		
		<!-- 第三部分 -->
		<view class="item-dj">
			<!-- 第三部分1 -->
			<view  class="item-left">
				<view>
					<image src="../../../static/收藏.png"></image>
				</view>
				<view class="item-left">收藏</view>
			</view>
			<!-- 第三部分2 -->
			<view  class="item-left">
				<view>
					<image src="../../../static/历史.png"></image>
				</view>
				<view class="item-left">历史</view>
			</view>
			<!-- 第三部分3 -->
			<view class="item-left">
				<view>
					<image src="../../../static/设置.png"></image>
				</view>
				<view class="item-left">设置</view>
			</view>
		</view>
		<image src="../../../static/bg.png" style="width: 100%; height: 90rpx;"></image>
		
		<!-- 第四部分3 -->
		<view class="button">
			<image class="buttons" src="../../../static/bg2.png" style="width: 100%; height: 300px;"></image>
			<view class="button2">
				<view class="button"><text class="hh">已有</text>{{shuliang}}<text class="hh">人</text></view>
				<view class="button"><text class="hh">在这里发布身边的新鲜事</text></view>
				<view class="reg-right" @click="fabu">我也要发布</view>
			</view>
		</view>
		
		<!-- 第五部分 -->
		<view class="button">
			<view class="buttonx">先去逛逛 <image src="../../../static/右角标.png" style="width: 10px; height: 15px;"></image></view>
		</view>
		
		<!-- 第六部分 -->
		<view class="zh"></view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				renshu:0,
				weiguanzhu:"未关注",
				panduan:true,
				huati:0,
				shuliang:555
			}
		},
		methods: {
			add(){
				if (this.panduan) {
					uni.showToast({
						title:'成功关注',
						icon:'none',
						duration:2000
					});
					this.renshu++;
					this.weiguanzhu="已关注",
					this.panduan=false
				} else{
					uni.showToast({
						title:'取消关注成功',
						icon:'none',
						duration:2000
					});
					this.renshu--;
					this.weiguanzhu="关注",
					this.panduan=true
				}
			},
			fabu(){
				uni.showToast({
					title:'发布成功',
					icon:'none',
					duration:2000
				});
				this.shuliang++
			},
			showtopic(){
				
			}
		}
	}
</script>

<style>
.dd{
	padding-bottom: 0rpx;
	background-image: url(../../../static/bg.png);
	background-position: center;
	margin-top: -30rpx;
	height: 280rpx;
}
.item1{
	display: flex;
	margin-top: 30rpx;
	margin-left: 20rpx;
}
.tx{
	margin-top: 10rpx;
}
.item2{
	margin-top: 15rpx;
}
.item3{
	margin-left: 20rpx;
	color: #fff;
	font-weight: bold;
	margin-top: 10rpx;
}
.item4{
	border-radius: 20rpx;
	color: #fff;
	width: 150rpx;
	height: 100rpx;
	background-color: #dd524d;
	margin-left: 20rpx;
	margin-top: 10rpx;
}
.itemz{
	display: block;
	color: #fff;
	margin-left: 45rpx;
	padding-top: 16px;
}
.er1{
	display: flex;
	margin-top: -36px;
	opacity: 0.5;
}
.er2{
	margin-left: 150px;
	color: #fff;
}
.er3{
	margin: 0 10px;
	color: #fff;
}
.er4{
	color: #fff;
}
.item-dj{
	display: flex;
	flex-direction: row;
	justify-content: space-around;
	margin: 20px 0;
}
.item-left{

}
.item-left image{
	width: 50px;
	height: 50px;
	text-align: center;
}
.button{
	text-align: center;
}
.reg-right{
	border: 1px solid #dd524d;
	width: 250rpx;
	height: 65rpx;
	text-align: center;
	color: #dd524d;
	border-radius: 40rpx;
	margin-bottom: 20rpx;
	line-height: 70rpx;
	margin-top: 40rpx;
	margin-left: 240rpx;
}
.buttons{
	padding-top: 10px;
}
.buttonx{
	color: #999;
}
.hh{
	color: #999;
}
</style>
