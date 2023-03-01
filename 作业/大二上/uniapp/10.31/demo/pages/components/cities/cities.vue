<template>
    <view class="content">
        <view class="content-box">
            <view class="box">
				 <view class="box-item">
					 <picker mode="multiSelector" :range="lists" @change="citychange" @columnchange="columnchange" range-key="name" :value="index">
					 	<view>{{name}}</view>
					 </picker>
				 </view>
            </view>
        </view>
    </view>
</template>

<script>
    export default {
        data() {
            return {
                 citylists: [
                    { id: 1, name: '湖北省',child: [ {id: 1,name: '十堰'}, {id:2 ,name: '武汉'},{id: 3,name: '宜昌'},{id: 4,name: '黄石'}]},
                    { id: 2, name: '广东省',child: [{ id: 1,name: '东莞'},{id: 2,name: '广州' },{id: 3,name: '中山'},{id: 4,name: '深圳'}]},
                    { id: 3, name: '山东省',child: [{id: 1,name: '济南'},{id: 2,name: '青岛'},{id: 3,name: '临沂'},{id: 4,name: '济宁'}]},
                    { id: 4, name: '河南省',child: [{id: 1,name: '郑州'},{id: 2,name: '南阳'},{id: 3,name: '新乡'},{id: 4,name: '洛阳'}]},
                    { id: 5, name: '浙江省',child: [{ id: 1,name: '唐山'}, {id: 2,name: '保定'},{id: 3,name: '邯郸'},{id: 4,name: '河北'}]},
                 ],
                name: '请选择分类',
				lists:[[],[]],// picker - 数据源
				index:[0,0],// picker - 索引
                childArr:[], // 二级分类数据源
            }
        },
        onLoad: function(options) {
            // 获取数据源并分出一级二级分类
            this.getAllClassify()
        },
        methods: {
             // 获取数据源并分出一级二级
            getAllClassify() {
                var citylists = this.citylists.length;

                for (var i = 0; i < citylists; i++) {
                    // 将数据源中的二级分类 push 进 childArr，作为二级分类的数据源
                    this.childArr.push(this.citylists[i].child)
                };
                // 一级分类的数据源
                this.lists[0] = this.citylists;

                // 第一次打开时，默认给一级分类添加它的二级分类
                this.lists[1] = this.childArr[0];
            },

            // 选择商品分类
            citychange(e) {
                var value = e.target.value;
                this.index = value;

                if (this.lists[0].length != 0) {
                    this.name = this.lists[0][this.index[0]].name
                };

                if (this.lists[1].length != 0) {
                    this.name += ',' + this.lists[1][this.index[1]].name
                }
            },

            // 获取二级分类
            columnchange(e) {
                // 当滚动切换一级分类时，为当前的一级分类添加它的子类
                if (e.detail.column == 0) {
                    this.lists[1] =  this.childArr[e.detail.value];

                }
            }
        }
    }
</script>

<style lang="scss" scoped>
    .content {
        .content-box {
            padding: 23upx 20upx 0 20upx;
            .box {
                padding: 25upx;
                background:rgba(255,255,255,1);
                border-radius:25upx;
                box-shadow:0 5upx 16upx 0 rgba(20,104,255,0.07);
                .box-item {
                    margin-top: 25upx;
                    position: relative;
                    .item-picker {
                        width: 100%;
                        margin-top: 10upx;
                        height: 60upx !important;
                        border-bottom: 2upx solid #EDEDED;
                    }
                }
            }
        }
    }
</style>