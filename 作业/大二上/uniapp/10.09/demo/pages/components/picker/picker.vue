<template>
	<view>
		<view class="smart-page-head">
			<view class="smart-page-head-title">picker，选择列表</view>
			</view>
			<view class="smart-padding-wrap">
				<view class="uni-title">普通选择器</view>
				<view class="uni-list">
					<view class="uni-list-cell">
						<view class="uni-list-cell-left">
							当前选择
						</view>
						<view class="uni-list-cell-db">
							<picker :value="index" :range="array" @change="bindPickerChange" range-key="name">
								<view class="uni-input">{{array[index].name}}</view>
							</picker>
						</view>
					</view>
				</view>
				
				
				<view class="uni-title uni-common-pl">日期选择器</view>
				<view class="uni-list">
					<view class="uni-list-cell">
						<view class="uni-list-cell-left">
							当前选择
						</view>
						<view class="uni-list-cell-db">
							<picker mode="date"  @change="bindDateChange" :value="date" :start="startDate" :end="endDate">
								<view class="uni-input">{{date}}</view>
							</picker>
						</view>
					</view>
				</view>
				
				
				<view class="uni-title uni-common-pl">
					时间选择器
				</view>
				<view class="uni-list">
					<view class="uni-list-cell">
						<view class="uni-list-cell-left">
							当前选择
						</view>
						<view class="uni-list-cell-db">
							<picker mode="time"  @change="bindTimeChange" :value="time" start="09:01" end="21:01">
								<view class="uni-input">{{time}}</view>
							</picker>
						</view>
					</view>
				</view>
			</view>
		</view>
		</template>

<script>
	function getDate(type){
		const date=new Date();
		
		let year=date.getFullYear();
		let month=date.getMonth()+1;
		let day=date.getDate();
		
		if(type==='start'){
			year=year-60;
		}else if(type==='end'){
			year=year+2;
		}
		month=month>9?month:'0'+month;
		day=day>9?day:'0'+day;
		
		return `${year}-${month}-${day}`;
	}
	export default {
		data() {
			return {
				array:[{name:'中国'},{name:'美国'},{name:'日本'},{name:'巴西'}],
				index:0,
				date:getDate({
					format:true
				}),
				startDate:getDate('start'),
				endDate:getDate('end'),
				time:'12:01'
			};
		},
		methods: {
			bindPickerChange:function(e){
				this.index=e.detail.value;
			},
			bindDateChange:function(e){
				this.date=e.detail.value;
			},
			bindTimeChange:function(e){
				this.time=e.detail.value;
			}
		}
	};
</script>

<style>
.uni-title{
	font-size: 39rpx;
	font-weight: 500;
	padding: 20rpx 0;
	line-height: 1.5;
}
.uni-list{
	background-color: #ffffff;
	position: relative;
	width: 100%;
	display: flex;
	flex-direction: column;
}
.uni-list-cell{
	position: relative;
	display: flex;
	flex-direction: row;
	justify-content: space-between;
	align-items: center;
	border-top: 1px solid #bebebe;
}
.uni-list-cell-db,
.uni-list-cell-right{
	flex: 1;
}
.uni-list-cell-left{
	white-space: nowrap;
	font-size: 28rpx;
	padding: 0 30rpx;
}
.uni-input{
	height: 50rpx;
	padding: 15rpx 25rpx;
	line-height: 50rpx;
	font-size: 28rpx;
	background: #fff;
	flex: 1;
}
</style>
