<template>
	<view>
		<view>横向布局row</view>
		<view class="row">
			<view class="item box1">
				色块1
			</view>
			<view class="item box2">
				色块2
			</view>
			<view class="item box3">
				色块3
			</view>
		</view>
		<view>横向布局row-reverse</view>
		<view class="row-reverse">
			<view class="item box1">
				色块1
			</view>
			<view class="item box2">
				色块2
			</view>
			<view class="item box3">
				色块3
			</view>
		</view>
		<view>纵向布局colum</view>
		<view class="colum">
			<view class="item box4">
				色块4
			</view>
			<view class="item box5">
				色块5
			</view>
			<view class="item box6">
				色块6
			</view>
		</view>
		<view>纵向布局colum-reverse</view>
		<view class="colum-reverse">
			<view class="item box4">
				色块4
			</view>
			<view class="item box5">
				色块5
			</view>
			<view class="item box6">
				色块6
			</view>
		</view>
		<view>其他布局</view>
		<view>横向居中</view>
		<view class="other1">
			<view >
				<image src="../../static/1.jpg" mode=""></image>
			</view>
			<view >
				<image src="../../static/2.jpg" mode=""></image>
			</view>
			<view >
				<image src="../../static/3.jpg" mode=""></image>
			</view>
		</view>
		<view>右对齐</view>
		<view class="other2">
			<view class="box1">
				色块1
			</view>
			<view class="box2">
				色块2
			</view>
			<view class="box3">
				色块3
			</view>
		</view>
		<view>左对齐</view>
		<view class="other3">
			<view class="box1">
				色块1
			</view>
			<view class="box2">
				色块2
			</view>
			<view class="box3">
				色块3
			</view>
		</view>
		<view>两端对齐</view>
		<view class="other4">
			<view class="box1">
				色块1
			</view>
			<view class="box2">
				色块2
			</view>
			<view class="box3">
				色块3
			</view>
		</view>
	</view>
</template>

<script>
</script>

<style>
	/* 横向布局 */
	.row {
		display: flex;
		flex-direction: row;
	}

	.row-reverse {
		display: flex;
		flex-direction: row-reverse;
	}

	.item {
		width: 22.2%;
		height: 300rpx;
		line-height: 300rpx;
		text-align: center;
	}

	.box1 {
		background-color: burlywood;
	}

	.box2 {
		background-color: lightcoral;
	}

	.box3 {
		background-color: cornflowerblue;
	}

	/* 纵向布局 */
	.colum {
		display: flex;
		flex-direction: column;
	}

	.colum-reverse {
		display: flex;
		flex-direction: column-reverse;
	}

	.box4 {
		background-color: aquamarine;
	}

	.box5 {
		background-color: mediumpurple;
	}

	.box6 {
		background-color: orange;
	}
	
	.other1{
		display: flex;
		justify-content: center;
		justify-content: space-around;
	}
	.other2{
		display: flex;
		justify-content: flex-end;
		-webkit-justify-content:flex-end;
	}
	.other3{
		display: flex;
		justify-content: flex-start;
		-webkit-justify-content:flex-start;
	}
	.other4{
		display: flex;
		justify-content: space-between;
		-webkit-justify-content:space-between;
	}
</style>
