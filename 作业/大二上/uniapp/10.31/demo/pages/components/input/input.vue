<template>
	<view class="content">
		<view><input type="password" placeholder="请输入用户名:" @input="inputValue"></view>
		<view><text>{{inp}}</text></view>
		<view><input type="text" placeholder="带清除按钮的输入框" @input="clearin" :value="clearinp"></view>
		<view><button @click="clears" v-if="show">清除</button></view>
		<view>
			<picker :value="index" :range="cities" @change="city" range-key="name">
				<view>{{cities[index].name}}</view>
			</picker>
		</view>
		
		
		<view>
			<picker mode="date" :start="startDate" :end="endDate" @change="datechange">
				<view>{{date}}</view>
			</picker>
		</view>
		
		<view>
			<picker mode="time"  @change="timechange" :value="time" start="00:00" end="23:59">
				<view >{{time}}</view>
			</picker>
		</view>
	</view>
</template>

<script>
	function getDate(type){
		var date=new Date();
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
				inp: '',
				clearinp: '',
				show: false,
				cities: [{name: '十堰'}, {name: '宜昌'}, {name: '恩施'}, {name: '黄石'}, {name: '武汉'}, {name: '柳州'}],
				index: 0,
				startDate:getDate('start'),
				endDate:getDate('end'),
				date:getDate({format:true}),
				time:'12:01'
			}
		},
		methods: {
			inputValue() {
				this.inp = event.detail.value;
			},
			clears() {
				this.clearinp = "";
				this.show = false;
			},
			clearin(event) {
				this.clearinp = event.detail.value;
				if (event.detail.value.length > 0) {
					this.show = true;
				} else {
					this.show = false;
				}
			},
			city(e) {
				this.index = e.detail.value;
			},
			datechange(event){
				this.date=event.detail.value
			},
			timechange(e){
				this.time=e.detail.value;
			}
		}
	}
</script>

<style>
	.content {
		text-align: center;
	}
</style>
