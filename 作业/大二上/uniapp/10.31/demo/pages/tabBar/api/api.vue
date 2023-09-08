<template>
	<view><br>
		<view>
			<input type="text" placeholder="搜索宝贝">
		</view>
		<view id="nav">
			<view>
				<navigator :url="urla" open-type="navigate">
					生活用品
				</navigator>
			</view>
			<view>
				<navigator :url="urlb" open-type="navigate">
					手机数码
				</navigator>
			</view>
			<view>
				<navigator :url="urlc" open-type="navigate">
					家用电器
				</navigator>
			</view>
		</view>
		<view class="img">
			<swiper :indicator-dots="indicatordots" :autoplay="autoplay" :interval="interval"
				:duration="duration" :circular="circular" >
				<swiper-item><view class="item"><image src="../../../static/img1.jpg" mode=""></image></view></swiper-item>
				<swiper-item><view class="item"><image src="../../../static/img2.jpg" mode=""></image></view></swiper-item>
				<swiper-item><view class="item"><image src="../../../static/img3.png" mode=""></image></view></swiper-item>
			</swiper>
		</view>
		<view>
			<video src="../../../static/taobao.mp4"></video>
		</view>
		<view>
			<audio :src="current.src" :name="current.name" :poster="current.poster" :action="audioAction" controls>
			</audio>
		</view>
	</view>
	
</template>

<script>
	export default {
		data() {
			return {
				urla:"../../components/user/user",
				urlb:"../../components/progress/progress",
				urlc:"../../components/cities/cities",
				indicatordots:true,
				autoplay:true,
				interval:4000,
				duration:2000,
				circular:true,
				current:{
					poster:'https://img2.woyaogexing.com/2022/08/23/37498b88abd2e00b.jpg',
					name:'大甩卖',
					author:'暂无',
					src:'../../../static/audio.flac'
				}
			}
		},
		methods: {
			audioAction:{
				
			}
		}
	}
</script>

<style>
	*{
		margin: 0;
		padding: 0;
	}
	input{
		text-align: center;
		margin: 0 auto;
		border: 1px solid #e7860e;
		border-radius: 10px;
		width: 300px;
	}
#nav{
	margin:5% 0;
	display: flex;
	justify-content: space-around;
	
}
.item{
		height: 100%;
		line-height: 100%;
		text-align: center;
	}
	image{
		width: 95%;
		height: 95%;
		border-radius: 5px;
	}
	video,audio{
		margin: 2.5% 0;
		width: 100%;
	}
	audio{
		text-align: center;
	}
</style>
