<template>
	<view>
		<form @submit="formSubmit" @reset="formReset">
			<br>
			<view>
				<text>是否匿名</text><br>
				<switch name="switch" :disabled="disa" checked="checked" @change="switchChange" :color="color" />
			</view>
			<br>
			<view>
				<input type="number" maxlength="11" placeholder="请输入您的手机号" ><br>
			</view>
			<view>
				<text>请输入你的评分：</text>
				<slider name="slider" @change="sliderChange" :disabled="disa" :min="min" :max="max" :step="step" show-value :value="value"
					:activeColor="activeColor" :backgroundColor="backgroundColor" :block-color="blockColor"
					:block-size="blockSize" />
			</view>
			<br>
			<view>
				<text>原因：</text><br><br>
					<checkbox></checkbox>不感兴趣
					<checkbox></checkbox>使用不佳
					<checkbox></checkbox>广告过多
			</view><br>
			<view>
				<text>评价：</text><br>
				<textarea name="textarea" class="text-area" placeholder-style="color:#f76260" placeholder="请输入您的改进意见..."/>
			</view><br>
			<view>
				<button form-type="submit" type="primary">提交</button><br>
				<button form-type="reset" type="warn">重置</button>
			</view>
			<br>
			<button @click="goto()">首页</button>
		</form>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				disa: false,
				min: 0,
				max: 10,
				step: 1,
				value: 5,
				activeColor: "#ff807c",
				backgroundColor: "#9dfff9",
				blockColor: "#9494ff",
				blockSize: 12,
				color: '#ff7300'
			}
		},
		onLoad() {

		},
		methods: {
			sliderChange(e) {
				console.log("变化的值为" + e.detail.value)
			},
			switchChange(e) {
				console.log("switch的checked值为", e.detail.value)
			},
			formSubmit(e){
				console.log("form的submit事件"+JSON.stringify(e.detail.value))
				var formdata=e.detail.value
				uni.showModal({
					content:'表单数据内容'+JSON.stringify(formdata),
					showCancel:false
				})
			},
			formReset(e){
				console.log("清空数据")
			},
			goto(){
				uni.navigateTo({
					url:"../../component/component"
				})
			}
		}
	}
</script>

<style>
	.text-area{
		margin: 0 auto;
		border: 1px solid #86b7d8;
		width: 80%;
		line-height: 60rpx;
		border-radius: 10px;
		height: 120px;
	}
	text{
		margin-left: 10%;
		font-size: 12px;
	}
	button{
		width: 80%;
		margin: 0 auto;
	}
	input{
		caret-color: #0098FE;
				margin: 0 auto;
				border-bottom: 1px solid rgba(212, 212, 212, 0.4);
				width: 80%;
				padding-bottom: 18px;
				font-size: 18px;
				line-height: 18px;
	}
	checkbox{
		padding-left: 20px;
	}
	switch{
		padding-left: 10%;
	}
</style>
