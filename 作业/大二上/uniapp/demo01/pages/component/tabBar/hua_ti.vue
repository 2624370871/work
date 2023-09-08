<template>
	<view>
		<!-- 顶部-话题榜 -->
		<view class="items">
			<view class="item">
				<navigator url="../pursue/pursue">
					<view class="item-x">追踪</view>
				</navigator>
				<navigator url="../topic1/topic1">
					<view class="item-x item-xx">话题榜</view>
				</navigator>
				<navigator url="../oppinions/oppinions">
					<view class="item-x">观点榜</view>
				</navigator>
				<image @click="input" class="item-y" style="width: 35rpx;height: 35rpx" src="../../../static/搜索.png" mode=""></image>
			</view>
		</view>
		<view class="bt"></view>
		<!-- 话题1 -->
		<view class="ht">
			<view>
				<image class="a" src="/static/书签.png" mode="">1</image>
			</view>
			<view class="hts">
				<view class="b">
					<text class="item-xx">2022 年卡塔尔世界杯小组赛西班牙 1:1 战平德国，如何评价本场比赛？</text>
				</view>
				<view class="c">
					{{cont}}
				</view>
				<view class="d">
					<view class="hotimage">
						<image class="img1" src="../../../static/朋友圈.png" mode=""></image>
						<image class="img2" src="../../../static/微信.png" mode=""></image>
						<image class="img3" src="../../../static/QQ.png" mode=""></image>
						<image class="img4" src="../../../static/微博.png" mode=""></image>
					</view>
					<!-- 新闻1 -->
					<view class="hotimage-x" @click="show">
						421观点
					</view>
				</view>
			</view>
			<!-- 观点 -->
			<view class="guandian" v-if="xianshi">
				<textarea placeholder="请输入评论" name="" id="" cols="30" rows="10" v-model="shuru"></textarea>
				<view><button @click="tijiao">提交</button></view>
			</view>
		</view>

		<!-- 话题2 -->
		<view class="ht">
			<view>
				<image class="a" src="/static/书签.png" mode="">2</image>
			</view>
			<view class="hts">
				<view class="b">
					<text class="item-xx">卡塔尔世界杯小组赛战平西班牙后，德国队小组出线前景如何？</text>
				</view>
				<view class="c">
					世界杯小组赛E组第2轮，西班牙对阵德国队，莫拉塔接阿尔巴传中，抢射破门。德国队替补登场的中锋菲尔克鲁格禁区内怒射破门。
					最终凭借双方替补登场球员的进球，西班牙1-1德国。
				</view>
				<view class="d">
					<view class="hotimage">
						<image class="img1" src="../../../static/朋友圈.png" mode=""></image>
						<image class="img2" src="../../../static/微信.png" mode=""></image>
						<image class="img3" src="../../../static/QQ.png" mode=""></image>
						<image class="img4" src="../../../static/微博.png" mode=""></image>
					</view>
					<!-- 新闻1 -->
					<view class="hotimage-x">
						119观点
					</view>
				</view>
			</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				xianshi:false,
				shuru:"",
				cont:"北京时间11月28日03:00，卡塔尔世界杯小组赛E组西班牙迎战德国的焦点大战，上半场奥尔莫开场不久远射中楣，格纳布里失良机，吕迪格头球破门被吹越位在先，半场结束，西班牙0-0德国。下半场莫拉塔替补建功，菲尔克鲁格爆射破门救主，最终，西班牙1-1德国。"
			}
		},
		methods: {
			show(){
				this.xianshi=!this.xianshi;
			},
			tijiao(){
				this.xianshi=false;
				this.cont=this.shuru;
				this.shuru=""
			}
		}
	}
</script>

<style>
	.guandian{
		
	}
	.hotimage {
		padding-right: 20rpx;
		margin-right: 120rpx;
	}

	.hotimage-x {
		margin-right: 15rpx;
		font-size: 25rpx;
	}

	.hotimage image {
		width: 30rpx;
		height: 30rpx;
		position: absolute;
	}

	.hotimage .img1 {
		left: 20rpx;
	}

	.hotimage .img2 {
		left: 55rpx;
	}

	.hotimage .img3 {
		left: 90rpx;
	}

	.hotimage .img4 {
		left: 125rpx;
	}

	.hotimage .imgs {
		margin-left: 1000rpx;
	}

	.hotimage .img6 {
		margin-right: 700rpx;
	}

	.items {
		position: fixed;
		z-index: 1;
		background-color: #fff;
		width: 100%;
	}

	.bt {
		width: 100rpx;
		height: 70rpx;
	}

	.item {
		display: flex;
		flex-direction: row;
		margin: 5rpx 10rpx 20rpx 10rpx;
		font-size: 40rpx;
		color: #333;
		background-color: #fff;
	}

	.item-x {
		margin-right: 45rpx;
	}

	.item-y {
		margin-top: 10rpx;
		margin-left: 180rpx;
	}

	.hotimage-y {
		border: 1rpx solid #dd524d;
		width: 30rpx;
		text-align: center;
		color: #dd524d;
		border-radius: 10rpx;
		font-size: 17rpx;
		height: 32rpx;
	}

	.item-xx {
		font-weight: bold;
	}

	.ht {
		border-bottom: 1rpx solid #ccd0d9;
		margin-bottom: -12rpx;
	}

	.checkbox-item {
		color: #dd524d;
		width: 20rpx;
		height: 20rpx;
	}

	.hts {
		margin-left: 20rpx;
	}

	.c {
		margin-top: 13rpx;
	}

	.a {
		width: 30rpx;
		height: 30rpx;
		margin-top: 13rpx;
	}

	.d {
		margin-bottom: 20rpx;
		display: flex;
		flex-direction: row;
		white-space: nowrap;
		margin-top: 13rpx;
	}
</style>
