<template>
	<view>
		<view class="tab">
			<view class="tab-title">
				<scroll-view scroll-x="true" class="scroll">
					<view>
						<image :src="src1" :style="styles"></image>
					</view>
					<view style="color: #DD524D;">推荐</view>
					<view @click="go()">推荐</view>
					<view>推荐</view>
					<view>推荐</view>
					<view>推荐</view>
					<view>推荐</view>
					<view>推荐</view>
				</scroll-view>
			</view>
		</view>

		<view class="twos">
			<view class="twoss">
				<view>{{tian_qi}}</view>
			</view>
			<view class="left">
				<input class="search_input" type="text" placeholder="搜索关键词">
			</view>
		</view>

		<view class="d-three">
			<view class="xw-three">
				{{text1}}
			</view>
			<view class="threes">
				<view class="j"><text class="zd">{{zhi_ding}}</text></view>
				<view class="j">{{xwlb}}</view>
				<view class="j">{{pinglun}}</view>
			</view>
			<view class="xm-three">
				<view class="xw-three">
					{{text2}}
				</view>
				<view class="threes">
					<view class="j"><text class="zd">{{zhi_ding}}</text></view>
					<view class="j">{{zh}}</view>
					<view class="j">{{pinglun}}</view>
				</view>
			</view>
		</view>

		<!-- 新闻1 -->
		<navigator url="../map/map.vue">
			<view class="d-three redian">
				<view class="d-threes mokai1">
					<!-- 新闻图片 -->
					<view>
						<image :src="img1"></image>
					</view>
					<view class="d-threess">“二十条”送来及时雨 郑州商界拒绝躺平</view>
				</view>
				<view>
					<view class="threess">大河网{{pinglun}}</view>
				</view>
			</view>
		</navigator>
		<!-- 新闻2 -->
		<view class="d-three redian">
			<view class="d-threes mokai1">
				<view>
					<image :src="img2"></image>
				</view>
				<view class="d-threess">积极参与应对气候变化全球治理——中国的绿色实践“行动胜于雄辩”</view>
			</view>
			<view>
				<view class="threess">极目新闻{{pinglun}}</view>
			</view>
		</view>

	</view>
</template>

<script>
	export default {
		data() {
			return {
				src1: "../../../static/sohu.png",
				styles: [{
					width: "40rpx",
					height: "40rpx"
				}],
				tian_qi: "4°C 小雨 桂林 PM2.59",
				text1: "2022,我们温暖的记忆",
				text2: "2022 卡塔尔世界杯揭幕战东道主卡塔尔 0:2 不敌厄瓜多尔，如何评价本场比赛？",
				zhi_ding: "置顶",
				xwlb: "新闻联播",
				zh: "知乎",
				pinglun: "45评",
				img1: "https://p0.ssl.img.360kuai.com/dmfd/388_246_/t01dd2b27a317950251.webp",
				img2: "https://p0.ssl.img.360kuai.com/dmfd/388_246_/t0124b8c1d11bfe5a4e.webp"

			}
		},
		methods: {
			go() {
				uni.navigateTo({
					url: 'newsinfo/newsinfo'
				})
			}
		}
	}
</script>

<style>
	.tab {
		background-color: #DD524D;
		height: 100rpx;
		line-height: 100rpx;
		color: #FFF;
	}

	.scroll {
		width: 100%;
		height: 80rpx;
		white-space: nowrap;
	}

	.tab-title view {
		display: inline-block;
		width: 100rpx;
		height: 60rpx;
		line-height: 60rpx;
		text-align: center;
	}

	.twos {
		color: #fff;
		display: flex;
		background-color: #DD524D;
		margin-top: -10rpx;
		width: 100%;
		justify-content: space-between;
		height: 70rpx;
	}

	.twoss {
		margin-left: 20rpx;
	}

	.search_input {
		background-color: #F8F8F8;
		border-radius: 40rpx;
		padding: 5rpx 30rpx 6rpx 30rpx;
		margin-right: 1rpx;
		color: #DD524D;
	}

	.d-three {
		border-bottom: 1rpx solid #CCD0d9;
		margin: 20rpx;
	}

	.d-threes {
		display: flex;
		flex-direction: row;
	}

	/* 图片大小 */
	.redian .mokai1 image {
		width: 200rpx;
		height: 160rpx;
	}

	.threes {
		display: flex;
		flex-direction: row;
		margin: 5rpx 10rpx 10rpx 10rpx;
		font-size: 25rpx;
		color: #808080;
		font-weight: 600;
	}

	.zd {
		color: #DD524D;
	}

	.j {
		margin-right: 25rpx;
	}

	.d-threess {
		margin-left: 30rpx;
	}

	.threess {
		margin-bottom: 20rpx;
		font-size: 25rpx;
		color: #808080;
	}
</style>
