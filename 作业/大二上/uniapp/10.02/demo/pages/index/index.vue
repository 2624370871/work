<template>
	<view class="content">
			<view><rich-text :nodes="divs"></rich-text></view>
			<view><rich-text :nodes="strings"></rich-text></view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				divs:[
					{
						name:"div",
						attrs:{
							class:"div-class",
							style:"text-align:center;background-color:pink;"
						},
						children:[
							{
								type:'text',
								text:'秋分'
							}
						]
					}
				],
				strings:'<div style="text-align:center;margin-top:50px"><img src="../../static/logo.png"/></div>'
			}
		},
		onLoad() {

		},
		methods: {

		}
	}
</script>

<style>
	.content {
		display: flex;
		flex-direction: column;
		align-items: center;
		justify-content: center;
	}

	.logo {
		height: 200rpx;
		width: 200rpx;
		margin-top: 200rpx;
		margin-left: auto;
		margin-right: auto;
		margin-bottom: 50rpx;
	}

	.text-area {
		display: flex;
		justify-content: center;
	}

	.title {
		font-size: 36rpx;
		color: #8f8f94;
	}
</style>
