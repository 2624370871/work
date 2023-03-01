<template>
	<view>
		<!-- 顶部视频页面 -->
		<view class="smart-page-head"></view>
		<view>
			<video src="../../../static/云海.mp4" class="checkbox-item" style="width: 100%;height: 400rpx;"></video>
		</view>
		<view class="spsy"></view>
		<!-- 第二部分-标题 -->
		<view class="sp">
			<view class="b">渝中区流光溢彩的夜色美景受到央视新闻频道关注,细细品味一番山城独有的人间烟火。</view>
			<view class="z">
				<view class="z-z">1.0万次播放</view>
				<view class="z-z">
					<image src="../../../static/点赞.jpeg" mode="" style="width: 30rpx;height: 30rpx;"></image>129
				</view>
			</view>
			<!-- 第三部分-用户 -->
			<view class="z">
				<view>
					<image src="/static//tx.png" mode="" style="width: 80rpx;height: 80rpx;"></image>
				</view>
				<view class="z-h">
					<view>丛雨凌</view>
					<view class="z-z">12-12</view>
				</view>
				<view class="reg-right">关注</view>
			</view>
		</view>
		<!-- 第四部分-推荐 -->
		<view class="item">
			<view>为你推荐</view>
			<!-- 第四部分1 -->
			<view class="e-item">
				<view class="e">
					<image src="../../../static/tx.png" style="width: 200rpx;height: 200rpx;" mode=""></image>
				</view>
				<view>
					<view class="e-right">第十四届中国航展闭幕 航展期间签约总额超398亿美元...</view>
					<view class="z">
						<view class="z-z1">人类迷惑行为</view>
						<view class="z-z1">5.3万次播放</view>
					</view>
				</view>
			</view>
			<!-- 第四部分-2 -->
			<view class="e-item">
				<view class="e">
					<image src="../../../static/tx.png" style="width: 200rpx;height: 200rpx;" mode=""></image>
				</view>
				<view>
					<view class="e-right">南水北调东线一期工程启动第十个跨年度全线调水...</view>
					<view class="z">
						<view class="z-z1">中国网</view>
						<view class="z-z1">12.5万次播放</view>
					</view>
				</view>
			</view>
			<view class="e-item">
				<view class="e">
					<image src="../../../static/tx.png" style="width: 200rpx;height: 200rpx;" mode=""></image>
				</view>
				<view>
					<view class="e-right">农村义务教育学校食堂应自主经营，不得对外承包...</view>
					<view class="z">
						<view class="z-z1">新浪网</view>
						<view class="z-z1">2.7万次播放</view>
					</view>
				</view>
			</view>
			<view class="e-item">
				<view class="e">
					<image src="../../../static/tx.png" style="width: 200rpx;height: 200rpx;" mode=""></image>
				</view>
				<view>
					<view class="e-right">塔里木盆地首个万亿方气区——克拉-克深气区累计生产天然气突破2000亿立方米大关...</view>
					<view class="z">
						<view class="z-z1">腾讯网</view>
						<view class="z-z1">6.9万次播放</view>
					</view>
				</view>
			</view>
		</view>
		<!-- 第五部分-热门推荐 -->
		<view style="color: #c5c5c5;margin-bottom: 30rpx;margin-left: 20rpx0;">
			热门评论
		</view>
		<!-- 第五部分-热门推荐1 -->
		<view class="pl">
			<view>
				<image src="" mode=""></image>
			</view>
		</view>
		<view class="zdb">
			<view>
				<image src="../../../static/向左箭头.png" mode="" style="width: 40rpx;height: 40rpx;"></image>
			</view>
			<view class="left">
				<input type="text" style="width: 220rpx;margin-right: 20rpx;font-size: 25rpx;" placeholder="有何观点" class="search_input">
			</view>
			<view class="jl">
				<image src="../../../static/消息.png" mode="" style="width: 30rpx;height: 30rpx;" @click="changeinput"></image>
			</view>
			<view class="jl">
				<image src="../../../static/收藏.png" v-if="showImg" @click="changeImg" mode="" style="width: 40rpx;height: 40rpx;margin-top:-5rpx;"></image>
				<image src="../../../static/已收藏.png" v-if="!showImg" @click="changeImg" mode="" style="width: 40rpx;height: 40rpx;margin-top:-5rpx;"></image>
			</view>
			<view class="jl">
				<image src="../../../static/分享.png" mode="" style="width: 40rpx;height: 40rpx;"></image>
			</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				Attention:'关注',
				showImg:true,
				showinput:false,
				textvalue:'',
				value:''
			}
		},
		methods: {

		}
	}
</script>

<style>
	.item {
		margin: 20rpx;
	}
	.spsy{
		width: 100%;
		height: 400rpx;
	}
	.checkbox-item{
		position: fixed;
		top: 85rpx;
		z-index: 1;
	}
	.sp{
		margin: 20rpx;
		border-bottom: 1rpx solid #999;
	}
	.b{
		margin-top: 30rpx;
		margin-bottom: 30rpx;
		font-size: 45rpx;
	}
	.reg-right{
		background-color: ##dd524d;
		height: 50rpx;
		border-radius: 50rpx;
		color: #fff;
		width: 140rpx;
		text-align: center;
	}
	.c{
		display: flex;
		flex-direction: row;
	}
	.d{
		display: flex;
		flex-direction: row;
		border-bottom:1rpx solid #d0d0d0;
	}
	.z{
		display: flex;
		flex-direction: row;
		justify-content: space-between;
		margin-bottom: 30rpx;
	}
	.z-h{
		margin-right:300rpx;
	}
	.z-z1{
		font-size: 30rpx;
		color: #c8c7cc;
		margin: 20rpx;
	}
	.z-z2{
		font-size: 30rpx;
		color: #c8c7cc;
		margin: 20rpx;
	}
	.z-z{
		font-size: 30rpx;
		color: #c8c7cc;
	}
	.e-item{
		display: flex;
		flex-direction: row;
	}
	.e-right{
		margin: 20rpx;
		margin-top: 40rpx;
	}
	.e{
		margin-top: 30rpx;
	}
	.pl{
		display: flex;
		flex-direction: row;
		margin-right: -280rpx;
		margin-bottom: 40rpx;
	}
	.lp{
		margin-left: -30rpx;
	}
	.pll{
		display: flex;
		flex-direction: row;
		justify-content: space-between;
		margin-left: 60rpx;
	}
	.plll{
		margin-right: 50rpx;
	}
	.xhx{
		border-bottom: 1rpx solid #c0c0c0;
		margin: 0rpx 20rpx 20rpx 100rpx;
	}
	.xhxx{
		border-bottom: 1rpx solid #d5d5d5;
		margin: 0rpx 20rpx 20rpx 10rpx;
		margin-bottom: 40rpx;
	}
	.jz{
		color: #c0c0c0;
		margin-left: 120rpx;
		margin-bottom: 80rpx;
	}
	.zdb{
		display: flex;
		flex-direction: row;
		background-color: #fff;
		width: 100%;
		height: 60rpx;
		position: fixed;
		bottom: 0rpx;
	}
	.left{
		height: 10rpx;
		margin-left: 20rpx;
	}
	.search_input {
		background-color: #f8f8f8;
		border-radius: 40rpx;
		padding: 5rpx 30rpx 6rpx 30rpx;
		margin-right: 1rpx;
	}
	
	.jl {
		margin-left: 80rpx;
	}
	
	.zt1 {
		font-size: 30rpx;
		color: #007aef;
		margin-top: 10rpx;
	}
	.zdb{
		display: flex;
		flex-direction: row;
	}
</style>

 