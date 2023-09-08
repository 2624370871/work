<template>
	<view>
		<view class="smart-page-head">
			<view class="smart-page-head-title">image,图片</view>
		</view>
		<view class="smart-padding-wrap">
				<view>
					示例1
					<text>\n本地图片</text>
				</view>
				<view class="smart-center" style="background: #ffffff;font-size: 0;"><image class="image" mode="widthFix" src="../../../static/logo.png" alt=""/></view>
				<view class="uni-title uni-common-mt">
					示例2
					<text>\n网络图片</text>
				</view>
				<view class="smart-center" style="background: #ffffff;font-size: 0;"><image class="image" mode="widthFix" src="https://img2.woyaogexing.com/2022/08/23/37498b88abd2e00b.jpg" alt=""/></view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				
			}
		},
		methods: {
			
		}
	}
</script>

<style>
.smart-center{
	text-align: center;
}
.image{
	margin: 40rpx 0;
	width: 200rpx;
}
</style>
