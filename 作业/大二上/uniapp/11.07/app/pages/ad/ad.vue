<template>
	<view>
		<view>
				<text>跳过</text>
			<swiper class="a" :indicator-dots="indicatordots" :autoplay="autoplay" :interval="interval"
				:duration="duration" :circular="circular"  @change="setTime()">
				<swiper-item><view class="swiper-item"><image src="../../static/a1.png" mode="widthFix" bindload='imgH'></image></view></swiper-item>
				<swiper-item><view class="swiper-item"><image src="../../static/a2.png" mode="widthFix" bindload='imgH'></image></view></swiper-item>
				<swiper-item><view class="swiper-item"><image src="../../static/a3.png" mode="widthFix" bindload='imgH'></image></view></swiper-item>
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
				interval:3000,
				duration:1000,
				circular:true,
				Hei:""     
			}
		},
		methods: {
			setTime(){
					setTimeout(function(){
					uni.switchTab({
						url:'../tabBar/shouye/shouye',
					})	
					},5000)
			},
			imgH:function(e){
			    var winWid = wx.getSystemInfoSync().windowWidth;         //获取当前屏幕的宽度
			    var imgh=e.detail.height;　　　　　　　　　　　　　　　　//图片高度
			    var imgw=e.detail.width;
			    var swiperH=winWid*imgh/imgw + "px"　　　　　　　　　　//等比设置swiper的高度。  即 屏幕宽度 / swiper高度 = 图片宽度 / 图片高度    ==》swiper高度 = 屏幕宽度 * 图片高度 / 图片宽度
			    this.setData({
			        Hei:swiperH　　　　　　　　//设置高度
			    })
			}
		}
	}
</script>

<style>
	*{
		margin: 0;
		padding: 0;
	}
	.swiper-item{
	text-align: center;	
	}
	image{
		height: 200%;
		width: 100%;
	}
	text{
		position: fixed;
		z-index: 1;
		margin-top: 5%;
		margin-left: 90%;
	}
</style>
