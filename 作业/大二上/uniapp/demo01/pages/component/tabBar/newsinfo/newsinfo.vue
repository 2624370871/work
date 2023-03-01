<template>
	<view class="item">
		<view class="sh">
			<view>
				<image src="../../../../static/sohu.png" class="tp" mode="">
					<text class="wb">学习进行时丨言必信行必果！从点滴细节看习近平总书记严抓八项规定</text>
				</image>
			</view>
		</view>
		<view class="dhw">
			<view>
				<image src="../../../../static/tx.png" mode="" class="tps" style="width: 110rpx;height: 110rpx;"></image>
			</view>
			<view>
				<view class="zt">新华网</view>
				<view class="rq">12/12 10:00 </view>
			</view>
			<view class="reg-right" @click="guanzhu()">{{gaunzhu}}</view>
		</view>

		<view class="items">
			<view>
				<text>
					【学习进行时】中央八项规定迎来出台十周年。十年之功，八项规定重塑了党在人民心中的形象，在全社会润物无声树立了新风。新华社《学习进行时》原创品牌栏目“讲习所”今天推出文章，为您梳理习近平总书记严抓八项规定的点滴细节。
					
					今天，八项规定举国皆知。
					
					2012年12月4日，中共中央政治局召开会议，审议通过了中央政治局关于改进工作作风、密切联系群众的八项规定。
					
					十年之功，八项规定重塑了党在人民心中的形象，在全社会润物无声树立了新风。
					
					回望十年，认真学习体会习近平总书记严抓八项规定的点滴细节，才能读懂文简意深的八项规定蕴涵的磅礴力量。
					
					“新一届中央领导集体要定规矩”
					
					八项规定出台之际，习近平总书记表示，新一届中央领导集体要定规矩，这是很重要的规矩。没有规矩，不成方圆。从我们在座各位做起来，新人新办法。制定这方面的规矩，指导思想就是从严要求，体现党要管党、从严治党。
					
					十年前，新一届中央领导集体面对的形势是，改革开放和社会主义现代化建设取得巨大成就，党的建设新的伟大工程取得显著成效，同时一系列长期积累及新出现的突出矛盾和问题亟待解决。特别是一些形式主义、官僚主义的东西，铺张浪费、豪华奢侈的东西，上上下下都有表现。对此，新一届中央领导集体的态度是，不能安之若素、司空见惯、见怪不怪，不要“温水煮青蛙”。
					
					党的十九大、二十大后的首次中央政治局会议都把审议八项规定实施细则作为重要议题，绝不向不良作风让步的态度，让全党全社会都看到了一以贯之的决心和勇气。

				</text>
			</view>
			<view class="jd">校对  王子晖</view>
		</view>
		<view class="pinglun">
			评论：<text>{{zuizhong}}</text>
		</view>
		<view v-if="xianshi">
			<view><input placeholder="请输入评论" v-model="shuru"/></view>
			<view><button @click="tijiao">提交</button></view>
		</view>
		<view class="pt">
			<view>
				<image src="" mode=""></image>
			</view>
			<view class="ptjj">平台声明</view>
		</view>
		<view class="jc">
			<view class="jcs">
				精彩推荐
			</view>
			<view class="xw">
				<view>
					<view>
						经纪人：亚米克在意甲被低估了，他和摩洛哥的目标是赢世界杯冠军
					</view>
					<view class="xwnr">
						<view class="xwnrs">新浪网</view>
						<view class="xwnrs">3737评</view>
					</view>
				</view>
			</view>
		</view>
		
		<!-- 底部 -->
		<view class="zdb">
			<view>
				<image src="../../../../static/向左箭头.png" mode="" style="width: 40rpx;height: 40rpx;"></image>
			</view>
			<view class="left">
				<input type="text" style="width: 220rpx;margin-right: 20rpx;font-size: 25rpx;" placeholder="有何观点" class="search_input">
			</view>
			<view class="jl" @click="input()">
				<image src="../../../../static/消息.png" mode="" style="width: 30rpx;height: 30rpx;"></image>
			</view>
			<view class="jl" @click="sc()" >
				<image  :src="sc1" mode="" style="width: 40rpx;height: 40rpx;margin-top:-5rpx;"></image>
			</view>
			<view class="jl">
				<image src="../../../../static/分享.png" mode="" style="width: 40rpx;height: 40rpx;"></image>
			</view>
			
		</view>
	</view>
	
</template>

<script>
	export default {
		data() {
			return {
				numberOne:3737,
				sc1:"../../../../static/收藏.png",
				sc2:"../../../../static/已收藏.png",
				gaunzhu:"+关注",
				yiguanzhu:"已关注",
				xianshi:false,
				shuru:"",
				zuizhong:""
			}
		},
		methods: {
		sc(){
			if(this.sc1==this.sc1){
				this.sc1=this.sc2
				uni.showToast({
					title:'收藏成功',
					duration:2000
				})
			}else{
				this.sc2=this.sc1
				uni.showToast({
					title:'取消收藏',
					duration:2000
				})
			}
		},
		guanzhu(){
			if (this.gaunzhu=="关注") {
				uni.showToast({
					title:'成功关注',
					icon:'none',
					duration:2000
				})
				this.gaunzhu=this.yiguanzhu;
			} else{
				this.gaunzhu="关注",
				uni.showToast({
					title:'取消关注成功',
					icon:'none',
					duration:2000
				})
			}
		},
		input(){
			this.xianshi=!this.xianshi;
		},
		tijiao(){
			if(this.shuru!=""){
				this.zuizhong=this.shuru;
				this.xianshi=false;
				this.shuru="";
			}else{
				alert("请输入内容")
				return
			}
			
		}
		}
	}
</script>

<style>
	.item {
		margin-left: 15rpx;
	}

	.items {
		margin: 20rpx;
	}

	.zt {
		font-size: 35rpx;
		margin-top: 10rpx;
		margin-left: 15rpx;
	}

	.rq {
		font-size: 30rpx;
		color: #b9b9b9;
		margin-top: 5rpx;
		margin-left: 15rpx;
	}

	.sh {
		margin-right: 30rpx;
	}

	.tp {
		width: 50rpx;
		height: 50rpx;
		margin: 0rpx 20rpx -10rpx 0rpx;
	}

	.sj {
		color: #c8c7cc;
		font-size: 30rpx;
		display: flex;
		flex-direction: row;
	}

	.sjs {
		margin-right: 30rpx;
		font-size: 20rpx;
		margin-top: 5rpx;
	}

	.wb {
		font-size: 40rpx;
	}

	.dhw {
		display: flex;
		flex-direction: row;
		margin-top: 30rpx;
		margin-bottom: 30rpx;
	}

	.tps {
		width: 80rpx;
		height: 80rpx;
	}

	.a {
		margin-top: 30rpx;
		margin-right: 30rpx;
	}

	.dhb {
		margin-top: 30rpx;
		margin-bottom: 30rpx;
	}

	.b {
		margin-top: 40rpx;
		margin-bottom: 40rpx;
		font-weight: bold;
	}

	.reg-right {
		background-color: #dd524d;
		height: 45rpx;
		border-radius: 60rpx;
		color: #fff;
		width: 120rpx;
		text-align: center;
		margin-top: 30rpx;
		margin-left: 280rpx;
		font-size: 30rpx;
	}

	.jd {
		margin-top: 40rpx;
	}

	.pt {
		margin: 30rpx 20rpx 40rpx 530rpx;
		color: #d9d9d9;
		font-size: 25rpx;
		display: flex;
		flex-direction: row;
	}

	.ptjj {
		margin-left: 10rpx;
	}

	.jc {
		background-color: #f05954;
		width: 160rpx;
		color: #fff;
		font-size: 30rpx;
		height: 37rpx;
		margin-left: -15rpx;
		margin-bottom: 40rpx;
	}

	.jcs {
		text-align: center;
		font-size: 25rpx;
	}

	.xw {
		display: flex;
		flex-direction: row;
		margin: 20rpx;
	}

	.xws {
		border-bottom: 1rpx solid #d0d0d0;
		margin-top: 20rpx;
		margin-bottom: 30rpx;
	}

	.xwnr {
		display: flex;
		flex-direction: row;
		color: #b9b9b9;
		font-size: 30rpx;
		margin-top: 10rpx;
	}

	.xwnrs {
		margin-right: 30rpx;
		font-size: 25rpx;
	}

	.p1 {
		display: flex;
		flex-direction: row;
		margin-right: -300rpx;
		margin-bottom: 40rpx;
	}

	.lp {
		margin-left: -30rpx;
	}

	.pll {
		display: flex;
		flex-direction: row;
		justify-content: space-between;
		margin-left: 60rpx;
	}

	.plll {
		margin-right: 65rpx;
		color: #999;
	}

	.xhx {
		border-bottom: 1rpx solid #c0c0c0;
		margin-bottom: 20rpx;
		margin-top: 50rpx;
		margin-right: 20rpx;
		margin-left: 110rpx;
	}

	.jz {
		color: #c0c0c0;
		margin-left: 110rpx;
		margin-bottom: 80rpx;
	}

	.zdb {
		display: flex;
		flex-direction: row;
		position: fixed;
		bottom: 0rpx;
		background-color: #fff;
		width: 100%;
		height: 60rpx;
	}

	.left {
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
		margin-left: 70rpx;
	}

	.zt1 {
		font-size: 30rpx;
		color: #007aef;
		margin-top: 10rpx;
	}
</style>
