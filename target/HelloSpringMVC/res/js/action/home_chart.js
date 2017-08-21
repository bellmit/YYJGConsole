// 基于准备好的dom，初始化echarts实例
var myChart1 = echarts.init(document.getElementById('server_static'));
var myChart2 = echarts.init(document.getElementById('interrupted_static'));

// 指定图表的配置项和数据
var option1 = {
    title : {
        text: '服务状态',
        subtext: '生产环境'
    },
    grid: {
        left: '3%',
        right: '10%',
        bottom: '3%',
        containLabel: true
    },
    tooltip : {
        trigger: 'axis'
    },
    legend: {
        data:['CPU占用','内存占用']
    },
    toolbox: {
        show : true,
        feature : {
            dataView : {show: true, readOnly: false},
            magicType : {show: true, type: ['line', 'bar']},
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    calculable : true,
    xAxis : [
        {
            type : 'category',
            data : ['13','14','15','16','17','18','20','21','121','144']
        }
    ],
    yAxis : [
        {
            type : 'value'
        }
    ],
    series : [
        {
            name:'CPU占用',
            type:'bar',
            data:[8.3, 82.1, 60.1, 23.2, 11.6, 14.7, 22.6, 9.2,10,6.2],
            markPoint : {
                data : [
                    {type : 'max', name: '最大值'}
                ]
            },
            markLine : {
                data : [
                    {type : 'average', name: '平均值'}
                ]
            }
        },
        {
            name:'内存占用',
            type:'bar',
            data:[2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 10.6, 3.2,30.1,10.8],
            markPoint : {
                data : [
                    {type : 'max', name: '最大值'}
                ]
            },
            markLine : {
                data : [
                    {type : 'average', name : '平均值'}
                ]
            }
        }
    ]
};


var option2 = {
    title: {
        text: '中断状态'
    },
    tooltip: {
        trigger: 'axis'
    },
    legend: {
        data:['水电新能源','火电','环保']
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    toolbox: {
        show : true,
        feature : {
            dataView : {show: true, readOnly: false},
            magicType : {show: true, type: ['line', 'bar']},
            restore : {show: true},
            saveAsImage : {show: true}
        }
        /*feature: {
            saveAsImage: {}
        }*/
    },
    xAxis: {
        type: 'category',
        boundaryGap: false,
        data: ['01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20','21','22','23']
    },
    yAxis: {
        type: 'value'
    },
    series: [
        {
            name:'水电新能源',
            type:'line',

            data:[120, 132, 101, 134, 90, 230, 210, 210, 210, 210, 150]
        },
        {
            name:'火电',
            type:'line',
            data:[20, 15, 15, 15, 13, 22, 22,20, 15, 15, 15]
        },
        {
            name:'环保',
            type:'line',
            data:[1, 0, 0, 5, 5, 6, 0,1, 0, 0,1]
        }
    ]
};

myChart1.setOption(option1);
myChart2.setOption(option2)
window.onresize = function () { myChart1.resize();myChart2.resize();}

