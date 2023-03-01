<template>
	<view>
		<view class="smart-page-head">
			<view class="smart-page-head-title">
				slider,滑块
			</view>
		</view>
		
		<view class="smart-padding-wrap">
			<view class="uni-title">
				显示当前value
			</view>
			<view>
				<slider value="50" @change="sliderChange" show-value/>
			</view>
			<view class="uni-title">
				设置步进step跳动
			</view>
			<view >
				<slider @change="sliderChange" step="5" value="60"/>
			</view>
			<view class="uni-title">
				设置最小/最大值
			</view>
			<view>
				<slider @change="sliderChange" value="100" min="50" max="100" show-value/>
			</view>
			<view class="uni-title">
				不同颜色和大小的滑块
			</view>
			<view>
				<slider @change="sliderChange" activeColor="#FFCC33" backgroundColor="#000000" block-color="#8A6DE9" block-size="20" value="50"/>
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
			sliderChange(e){
				console.log('value发生变化：'+e.detail.value)
			}
		}
	}
</script>

<style>

</style>
