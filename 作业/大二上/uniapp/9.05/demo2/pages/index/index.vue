<template>
	<view class="container">
		<view class="intro">uni-app</view>
		<image src="../../static/1.jpg" mode=""></image>
		<h3>我叫吴泽</h3>
		<image :src='img'></image>
		
	</view>
</template>

<script>
	export default {
		data() {
			return {
				img:'../../static/2.jpg'
			}
		},
		methods: {

		}
	}
</script>

<style>
	.container {
		padding: 20px;
		font-size: 14px;
		line-height: 24px;
		text-align: center;
	}
</style>
