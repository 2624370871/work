<template>
	<view>
		<view class="smart-page-head">
			<view class="smart-page-head-title">map,地图</view>
		</view>
		<view class="smart-padding-wrap">
				<map class="map" 
				:latitude="32.22536" 
				:longitude="110.23071" 
				:markers="covers"
				@click="location"></map>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				covers:[
					{
						latitude: 32.22536,
						longitude: 110.23071,
						iconPath:'../../../static/icon.png',
						title:"竹山县"
					}
				]
			}
		},
		methods: {
			location(){
				uni.openLocation({
					latitude:this.latitude,
					longitude:this.longitude,
					iconPath:this.iconPath,
					title:this.title
				})
				
			}
		}
	}
</script>

<style>
.map{
	width: 100%;
	height: 600rpx;
}
</style>
