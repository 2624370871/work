<template>
	<view>
		<view class="smart-page-head">
			<view class="smart-page-head-title">
				navigator,链接
			</view>
			</view>
			<view class="smart-padding-wrap">
				<navigator url="../user/user" hover-class="navigator-hover">
					<button type="default">跳转到用户反馈</button>
				</navigator>
				<navigator url="../user/user?title=redirect" open-type="redirect" hover-class="other-navigator-hover">
					<button type="default">在当前页打开</button>
				</navigator>
				<navigator url="../../tabBar/api/api" open-type="switchTab" hover-class="other-navigator-hover">
					<button type="default">跳转tab页面</button>
				</navigator>
			</view>
		</view>
</template>

<script>
	export default {
		data() {
			return {
				title:'navigator'
			}
		},
		methods: {
			
		}
	}
</script>

<style>

</style>
