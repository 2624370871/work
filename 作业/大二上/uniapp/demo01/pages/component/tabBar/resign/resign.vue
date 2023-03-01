<template>
	<view>
		<view class="box">
			<input type="text" placeholder="请输入用户名"><br>
			<input type="text" placeholder="请输入密码" name="" id="">
			<button @click="btn()">登录</button>
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
			btn(){
				uni.switchTab({
					url:"/pages/component/tabBar/xin_weng"
				})
			}
		}
	}
</script>

<style>
.box{
	margin:50% auto;
}
</style>
