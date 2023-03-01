<template>
	<view>
		<view>
			<map :latitude="latitude" :longitude="longitude" @click="location()"></map>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				latitude: 30.27217,
				longitude: 109.48817,
				covers: [{
					id: 0,
					latitude: 30.471933,
					longitude: 114.404214,
					title: "标记点",
					iconPath: "../../static/图标.png"
				}]
			}
		},
		methods: {
			location() {
				uni.openLocation({
					latitude: this.latitude,
					longitude: this.longitude
				})
			}
		}
	}
</script>

<style>

</style>
