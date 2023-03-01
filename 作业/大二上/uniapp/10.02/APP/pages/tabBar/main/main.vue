<template>
	<view>
		<view>
			<swiper :indicator-dots="indicatordots" :autoplay="autoplay" :interval="interval"
			 :duration="duration" :circular="circular" >
				<swiper-item><view class="item"><image src="../../../static/seasons/spring.png" mode=""></image></view></swiper-item>
				<swiper-item><view class="item"><image src="../../../static/seasons/summer.png" mode=""></image></view></swiper-item>
				<swiper-item><view class="item"><image src="../../../static/seasons/autumn.png" mode=""></image></view></swiper-item>
				<swiper-item><view class="item"><image src="../../../static/seasons/winter.png" mode=""></image></view></swiper-item>
			</swiper>
		</view>
		<view>
			<view class="view"><h1 style="color: #99CC33;">春</h1><img src="../../../static/seasons/春.png" alt="" srcset=""></view>
			<ul >
				<li><img src="../../../static/24/1.png" alt=""><p><span>立春</span><br>表示严冬已逝，春季到来，气温回升，万物复苏。</p></li>
				<li><img src="../../../static/24/2.png" alt=""><p><span>雨水</span><br>由于气温转暖，冰消雪化，雨水增多，故取名为雨水。</p></li>
				<li><img src="../../../static/24/3.png" alt=""><p><span>惊蛰</span><br>蛰的本意为藏，动物冬眠称“入蛰”。古人认为冬眠的昆虫被春雷惊醒，故称惊蛰。</p></li>
				<li><img src="../../../static/24/4.png" alt=""><p><span>春分</span><br>这一天正当春季九十日之半，故曰“春分”。昼夜长度各半，冷热均衡，一些越冬作物开始进入春季生长阶段。</p></li>
				<li><img src="../../../static/24/5.png" alt=""><p><span>清明</span><br>含有天气晴朗、草木萌发之意。此时气温渐暖，草木发芽，大地返青，也是春耕春种的好时节。</p></li>
				<li><img src="../../../static/24/6.png" alt=""><p><span>谷雨</span><br>由于雨水增多，滋润田野，有利于农作物的生长，故有“雨生百谷”之说。</p></li>
			</ul>
		</view>
		<view>
			<view class="view"><h1 style="color:#99CCFF ;">夏</h1><img src="../../../static/seasons/夏.png" alt="" srcset=""></view>
			<ul >
				<li><img src="../../../static/24/7.png" alt=""><p><span>立夏</span><br>标志着夏季的开始，视为气温升高的开端。此时万物生长旺盛，欣欣向荣。</p></li>
				<li><img src="../../../static/24/8.png" alt=""><p><span>小满</span><br>其含义是夏熟作物籽料已经开始灌浆饱满，但尚未成熟，故称“小满”。</p></li>
				<li><img src="../../../static/24/9.png" alt=""><p><span>芒种</span><br>芒,指某些禾本植物籽实的外壳上长的针状物。芒种指小麦等有芒作物即将成熟，可以采收留种了，也预示着农民开始了忙碌的田间生活。</p></li>
				<li><img src="../../../static/24/10.png" alt=""><p><span>夏至</span><br>是全年中白昼最长、黑夜最短的一天，也说明即将进入炎热的夏季。</p></li>
				<li><img src="../../../static/24/11.png" alt=""><p><span>小暑</span><br>属于“三伏”中的初伏，天气炎热、蒸闷。气温虽高，但还不是最热的时候，故称小暑。</p></li>
				<li><img src="../../../static/24/12.png" alt=""><p><span>大暑</span><br>正值“中伏”前后，也是我国大部分地区一年中最热的时期，气温最高。</p></li>
			</ul>
		</view>
		<view>
			<view class="view"><h1 style="color: #FF9933;">秋</h1><img src="../../../static/seasons/秋.png" alt="" srcset=""></view>
			<ul >
				<li><img src="../../../static/24/13.png" alt=""><p><span>立秋</span><br>预示着秋季即将开始，天气逐渐转凉。不过暑气并未尽散，还有气温较热的“秋老虎”之说。</p></li>
				<li><img src="../../../static/24/14.png" alt=""><p><span>处暑</span><br>代表暑天即将结束，天气由炎热向凉爽过渡。</p></li>
				<li><img src="../../../static/24/15.png" alt=""><p><span>白露</span><br>由于昼夜温差加大，水汽在草木上凝结成白色露珠，故称白露。</p></li>
				<li><img src="../../../static/24/16.png" alt=""><p><span>秋分</span><br>与春分相同，昼夜几乎等长，处于整个秋天的中间。</p></li>
				<li><img src="../../../static/24/17.png" alt=""><p><span>寒露</span><br>冷空气渐强，雨季结束，气温由凉转冷，开始出现露水，早晨和夜间会有地冷露凝的现象。</p></li>
				<li><img src="../../../static/24/18.png" alt=""><p><span>霜降</span><br>由秋季过渡到冬季的节气，开始有霜冻的现象出现。</p></li>
			</ul>
		</view>
		<view>
			<view class="view"><h1 style="color: #999999;">冬</h1><img src="../../../static/seasons/冬.png" alt="" srcset=""></view>
			<ul >
				<li><img src="../../../static/24/19.png" alt=""><p><span>立冬</span><br>标志着冬季的开始。田间的操作也随之结束，作物在收割后进行贮藏。</p></li>
				<li><img src="../../../static/24/20.png" alt=""><p><span>小雪</span><br>大地呈现初冬的景象，但还没到大雪纷飞的时节。</p></li>
				<li><img src="../../../static/24/21.png" alt=""><p><span>大雪</span><br>此时天气较冷，不仅降雪量增大，降雪范围也更广。</p></li>
				<li><img src="../../../static/24/22.png" alt=""><p><span>冬至</span><br>与夏至相反，白昼最短，黑夜最长，开始“数九”，过了冬至,白昼就一天天地增长了。</p></li>
				<li><img src="../../../static/24/23.png" alt=""><p><span>小寒</span><br>此时正值“三九”前后，大部分地区开始天寒地冻，但还没有到达寒冷的极点。</p></li>
				<li><img src="../../../static/24/24.png" alt=""><p><span>大寒</span><br>一年当中最冷的一段时间，相对于小寒来说，标志着严寒的加剧。</p></li>
			</ul>
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
				duration:2000,
				circular:true
			}
			
		},
		methods: {
			
		}
	}
</script>

<style>
	*{
		margin: 0;
		padding: 0;
	}
	.item{
		height: 400rpx;
		line-height: 400rpx;
		text-align: center;
	}
	image{
		width: 100%;
		height: 100%;
	}
	ul{
		list-style: none;
		
	}
	img{
		width: 60px;
		height: 60px;
		float: left;
		margin-right: 10px;
	}
	.view{
	margin-bottom: 20px;
		border-bottom: 1px dashed #474747;
	}
	@font-face {
		font-family: font;
		src: url(../../../static/seasons/1.TTF);
	}
	h1{
		line-height: 60px;
		margin-bottom: 10px;
		display:inline-block;
		font-family: font;
	}
	li{
		
		margin: 0 auto;
		width: 90%;
		height: 70px;
		margin-bottom: 20px;
		display: flex;
		flex-wrap: nowrap;
		overflow: hidden;
		text-overflow: ellipsis;
		border-bottom:1px dashed #acacac;
		
	}
	span{
		font-weight: bold;
		font-size: 20px;
	}
@font-face {
		font-family: font1;
		src: url(../../../static/seasons/STKAITI.TTF);
	}
	p{
		font-family: font1;
	}
</style>