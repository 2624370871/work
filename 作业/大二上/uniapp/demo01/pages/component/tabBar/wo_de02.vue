<template>
	<view>
		<view class="dd">
			<view class="item1">
				<image class="tx" style="width: 130rpx;height: 130rpx;" :src="img1"></image>
				<view class="item2">
					<view class="itme3">Hi~欢迎回来</view>
					<view class="item4"><text>登录</text></view>
				</view>
			</view>
			<view class="er1">
				<view class="er2">
					<text @click="guanzhu">关注</text>
					<text>{{countguan}}</text>
				</view>
				<view class="er3">|</view>
				<view class="er4">
					<text @click="huati">话题</text>
					<text>{{counthua}}</text>
				</view>
			</view>
		</view>
		<view class="item-dj">
			<view>
				<navigator :url="url1">
					<view class="item-left">
						<image class="tubiao1" :src="src2"></image>
					</view>
					<view class="item-left">收藏</view>
				</navigator>
				<navigator :url="url2">
					<view class="item-left">
						<image class="tubiao2" :src="src3"></image>
					</view>
					<view class="item-left">历史</view>
				</navigator>
				<navigator :url="url3">
					<view class="item-left">
						<image class="tubiao3" :src="src4"></image>
					</view>
					<view class="item-left">设置</view>
				</navigator>
			</view>
		</view>
		
		<view>
			<image src="../../../static/bg2.png" class="ggimg"></image>
		</view>
	</view>
</template>



<script>
	export default {
		data() {
			return {
				img1: "../../static/logo.png",
				countguan: 0,
				counthua: 0,
				url1: "",
				url2: "",
				url3: "",
				src2: "../../../static/收藏.png",
				src3: "../../../static/历史.png",
				src4: "../../../static/设置.png"
			}
		},
		onLoad() {

		},

		methods: {
			guanzhu: function() {
				uni.showToast({
					title: "关注成功",
					duration: 2000
				});
				this.countguan++;
			},

			huati() {
				uni.showToast({
					title: "发布成功！",
					duration: 1000
				});

				this.counthua++;
			}
		}
	}
</script>

<style>
	.tubiao1 {
		width: 50rpx;
		height: 50rpx;
		text-align: center;
		margin-top: 67rpx;
	}

	.tubiao2 {
		width: 50rpx;
		height: 50rpx;
		text-align: center;
		margin-top: 67rpx;
	}

	.tubiao3 {
		width: 50rpx;
		height: 50rpx;
		text-align: center;
		margin-top: 67rpx;
	}

	.item-left text{
	}
	.item-left{
	   /* line-height: 75rpx; */
	   /* width: 50%; */
	   /* text-align: center; */
	   margin: 100rpx;
	   font-size: 22rpx;
	   /* padding-bottom: 2rpx; */
	   margin-top: 22rpx;
	}

	.item1 {
		display: flex;
		margin-top: 25rpx;
		margin-left: 20rpx;
	}

	.item2 {
		margin-top: 17rpx;
		margin-left: 17rpx;
	}

	.dd {
		padding-bottom: 0rpx;
		background-color: skyblue;
		height: 210rpx;
		background-position: center;
	}

	.er1 {
		display: flex;
		margin-top: 30rpx;
		margin-left: 60rpx;
		opacity: 0.5;
	}

	.er2 {
		margin-left: 30rpx;
	}

	.er3 {
		margin-left: 100rpx;
	}

	.er4 {
		margin-left: 120rpx;
	}
	 .item-dj view{
	      display: flex;
	      /* flex-direction: row;
	      -webkit-flex:1;
	      flex: 1; */
	      margin-bottom: 7rpx;
	   }
	.ggimg{
		margin-top: 10px;
		height: 100px;
		width: 100%;
	}

</style>
