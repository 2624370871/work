<template>
	<view>
		<view class="smart-padding-wrap">
			<button type="primary">页面操作 normal</button>
			<button type="primary" :loading="true">页面主操作 loading</button>
			<button type="primary" disabled="false">页面主操作 disabled</button>
			
			<button type="default">页面次操作 normal</button>
			<button type="default" disabled="false">页面次操作 disabled</button>
			<button type="warn">页面警告操作 warn</button>
			<button type="default" disabled="false">页面警告操作 warn</button>
			
			<button type="primary" plain="true">镂空按钮 plain</button>
			<button type="primary" plain="true" disabled="false">镂空按钮 plain disabled</button>
			<view class="btn">
				<button type="primary" size="mini" class="mini-btn">按钮</button>
			</view>
			<div>
				<button type="primary" size="mini" class="mini-btn">按钮</button>
				<button type="default" size="mini" class="mini-btn">按钮</button>
				<button type="warn" size="mini" class="mini-btn">按钮</button>
			</div>
			
		</view>
	</view>
</template>

<script>
</script>

<style>
	*{
		margin: 0;
		padding: 0;
	}
	button{
		margin-top: 30rpx;
		margin-bottom: 30rpx;
	}
	.mini-btn{
		margin-right: 30rpx;
	}
	.btn{
		display: flex;
		justify-content: center;
	}
	div{
		display: flex;
		justify-content: space-between;
	}
</style>