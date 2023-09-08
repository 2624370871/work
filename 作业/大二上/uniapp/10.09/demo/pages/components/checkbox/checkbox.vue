<template>
	<view>
		<view>
			<text>运动会</text><br>
				<checkbox :disabled="!disabled">100m</checkbox><!-- 绑定是否禁用事件，并取反 -->
				<checkbox :color="color">200m</checkbox>
				<checkbox :color="color">400m</checkbox>
				<checkbox :color="color">800m</checkbox>
				<checkbox :color="color">1000m</checkbox><br>
				<checkbox :color="color">跳高</checkbox><br>
				<checkbox :color="color">跳远</checkbox>
		</view>
		<input type="passward" password="true" placeholder="请输入" focus="true" class="input">
	</view>
</template>

<script>
	export default {
		data() {
			return {
				disabled:false,
				color:"red"
			}
		},
		methods: {
			
		}
	}
</script>

<style>
.input{
	margin-left: 50px;
}
</style>
