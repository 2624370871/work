<template>
	<view>
		<view class="smart-page-head">
			<view class="smart-page-head-title">switch,开关</view>
			</view>
			<view class="smart-padding-wrap">
				<view class="uni-title">
					默认样式
				</view>
				<view>
					<switch checked="true" @change="switch1Change" />
					<switch @change="switch2Change" />
				</view>
				<view class="uni-title">
					不同颜色和尺寸的switch
				</view>
				<view>
					<switch checked="true" color="#FFCC33" style="transform: scale(0.7);" />
					<switch  color="#FFCC33" style="transform: scale(0.7);" />
				</view>
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
			switch1Change(e){
				console.log("switch1 发生 change 事件，携带值为",e.detail.value)
			},
			switch2Change(e){
				console.log("switch2 发生 change 事件，携带值为",e.detail.value)
			}
		}
	}
</script>

<style>

</style>
