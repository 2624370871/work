<template>
	<view >
		<view class="smart-panel-title">基础内容</view>
		<view class="smart-panel-h" @click="goDetailPage('progress')"><text>progress进度条</text></view><!-- 绑定点击事件progress -->
		<view class="smart-panel-title">表单组件</view>
		<view class="smart-panel-h" @click="goDetailPage('button')"><text>button按钮</text></view>
		<view class="smart-panel-h" @click="goDetailPage('radio')"><text>radio单选框</text></view>
		<view class="smart-panel-h" @click="goDetailPage('checkbox')"><text>checkbox多选框</text></view>
		<view class="smart-panel-h" @click="goDetailPage('input')"><text>input输入控件</text></view>
		<view class="smart-panel-h" @click="goDetailPage('picker')"><text>picker选择列表</text></view>
		<view class="smart-panel-h" @click="goDetailPage('slider')"><text>slider滑块</text></view>
		<view class="smart-panel-h" @click="goDetailPage('switch')"><text>switch开关</text></view>
		<view class="smart-panel-h" @click="goDetailPage('textarea')"><text>textarea多行文本输入框</text></view>
		<view class="smart-panel-h" @click="goDetailPage('form')"><text>form表单</text></view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				
			}
		},
		methods: {
			// goDetailPage(e){创建godetailpage函数,传递e参数
			goDetailPage(e){
				if (typeof e==='string') {
					uni.navigateTo({
						url:'/pages/components/'+e+'/'+e     //url跳转目录
					});
				}else{
					uni.navigateTo({
						url:e.url
					});
				}
			}
		}
	}
</script>

<style>

</style>
