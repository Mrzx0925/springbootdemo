$(function(){
    $(document).ready(function() {
		main();
	});
	
	$("#add").click(function(){
		var age = $("#age").val();
		if(isNaN(age)){
			alert("不是数字");
		}else if(age < 0 || age > 100){
			alert("输入错误");
		}else{
			$.ajax({
				url : 'http://localhost:8080/age/'+age,
				type : 'post',
				success : function(data) {
					main();
				},
			});
		}
	});
});
function columns(numo) {
	var dom = document.getElementById("container");
	var myChart = echarts.init(dom);
	myChart.showLoading();
	//var namey = []; // 类别数组（实际用来盛放X轴坐标值）
	var app = {};
	option = null;
	app.title = '测试';
	option = {
		title : {
			text : '年龄数量柱状图',
			subtext : 'by zx',
		// sublink: 'http://e.weibo.com/1341556070/AjwF2AgQm'
		},
		color : [ '#3398DB' ],
		tooltip : {
			trigger : 'axis',
			axisPointer : { // 坐标轴指示器，坐标轴触发有效
				type : 'shadow' // 默认为直线，可选为：'line' | 'shadow'
			}
		},
		grid : {
			left : '0%',
			right : '0%',
			bottom : '30%',
			containLabel : true
		},
		xAxis : [ {
			// name='年龄 ',
			type : 'category',
			data : ['0-20','20-40','40-60','60-80','80-100'],
			axisTick : {
				alignWithLabel : true
			}
		} ],
		yAxis : [ {
			// name : '数量',
			type : 'value'
		} ],
		series : [ {
			type : 'bar',
			barWidth : '60%',
			data : numo
		} ]
	};
	myChart.hideLoading(); // 隐藏加载动画
	if (option && typeof option === "object") {
		myChart.setOption(option, true);
	}

	// alert(namey);
}
function main(){
	$.ajax({
		url : 'http://localhost:8080/age',
		type : 'get',
		success : function(data) {
				var numo = [];
				numo.push(data.one);
				numo.push(data.two);
				numo.push(data.three);
				numo.push(data.four);
				numo.push(data.five);
				columns(numo);
		},
	});
}