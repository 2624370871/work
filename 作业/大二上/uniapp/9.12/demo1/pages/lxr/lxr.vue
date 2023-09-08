<template>
		<view  class="z">
			<view @click="goto('xpy')" class="h"><text>新朋友</text><img src="/static/jt.png" ></view>
			<view @click="goto('qtz')" class="h"><text>群通知</text><img src="/static/jt.png" ></view>
			<view><hr style="margin-top: 30px; border:1px solid #e8e8e8"></view>
			
		</view>
	
</template>
<script>
	export default {
		data() {
			return {
				
			}
		},

		methods: {
			goto(e){
				if (typeof e==='string') {
					uni.navigateTo({
						url:'/pages/components/'+e
					});
				} else{
					uni.navigateTo({
						url:e.url
					})
				}
			}
		}
	}
</script>

<style>

</style>
