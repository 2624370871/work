<template>
	<view>
		<view>
			<swiper :indicator-dots="indicatordots" :autoplay="autoplay" :interval="interval"
			 :duration="duration" :circular="circular" :vertical="vertical" >
				<!-- <swiper-item><view class="item box1"></view></swiper-item>
				<swiper-item><view class="item box2"></view></swiper-item>
				<swiper-item><view class="item box3"></view></swiper-item>
				 -->
				<swiper-item><view class="item"><image src="../../static/1.jpg" mode=""></image></view></swiper-item>
				<swiper-item><view class="item"><image src="../../static/2.jpg" mode=""></image></view></swiper-item>
				<swiper-item><view class="item"><image src="../../static/3.jpg" mode=""></image></view></swiper-item>
			</swiper>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				indicatordots:true,
				autoplay:true,
				interval:2000,
				duration:1000,
				circular:true,
				vertical:true,
			}
		},
		methods: {
			
		}
	}
</script>

<style>
.item{
	height: 400rpx;
	line-height: 400rpx;
	text-align: center;
}
.box1 {
		background-color: burlywood;
	}

	.box2 {
		background-color: lightcoral;
	}

	.box3 {
		background-color: cornflowerblue;
	}

</style>
