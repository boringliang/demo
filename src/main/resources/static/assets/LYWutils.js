function getAtt(JSONArray, att) {
    var l = new Array();
    for (var i = 0; i < JSONArray.length; i++) {
        l[i] = JSONArray[i][att];
    }
    return l;
}

function getMap(l) {
    var result = {};
    for (var i = 0; i < l.length; i++) {
        if (l[i] == '' || l[i] == null) {
            l[i] = "null";
        }
        if (Object.keys(result).indexOf(l[i].toString()) != -1) {
            result[l[i].toString()] += 1;
        }
        else {
            result[l[i].toString()] = 1;
        }
    }
    return result;
}

function create_chart(x_name, y_name, x_value, y_value, type, id) {

    if ((type == "bar") || (type == "pie")) {
        $("#row" + id).remove();
        $(".content").append('<div class="row1" id="row'+ id + '">\n' +
            '                    <div class="col-xl-12 col-sm-12">\n' +
            '                        <div class="card card-mini mb-4">\n' +
            '                            <div class="card-header justify-content-left">\n' +
            '\n' +
            '                            </div>\n' +
            '                            <div class="card-body">\n' +
            '                                <h2 class="mb-1">' + y_name + '变化情况' + '</h2>\n' +
            '                                <div class="chartjs-wrapper" style="height: 300px;">\n' +
            '                                    <div id="' + id + '" style="height: 100%"></div>\n' +
            '                                </div>\n' +
            '                            </div>\n' +
            '                        </div>\n' +
            '                    </div>\n' +
            '                </div>');
        if (type == "bar") {
            var myChart = echarts.init(document.getElementById(id));
            var option = {
                xAxis: {
                    name: x_name,
                    type: 'category',
                    data: x_value
                },
                yAxis: {
                    name: y_name,
                    type: 'value'
                },
                tooltip: {
                    trigger: 'item',
                    formatter: '{a} <br/>{b} : {c} ({d}%)'
                },
                series: [{
                    data: y_value,
                    type: 'bar',
                    showBackground: true,
                    backgroundStyle: {
                        color: 'rgba(220, 220, 220, 0.8)'
                    }
                }]
            };
            myChart.setOption(option);
        }
        if (type == "pie") {
            var myChart = echarts.init(document.getElementById(id));
            var keys = x_value;
            var values = y_value;
            var datauser = [];
            for (var i = 0; i < keys.length; i++) {
                var m = {};
                m.name = keys[i];
                m.value = values[i];
                datauser[i] = m;
            }
            var option = {
                // title: {
                //     text: 'downroadid',
                //     left: 'center'
                // },
                tooltip: {
                    trigger: 'item',
                    formatter: '{a} <br/>{b} : {c} ({d}%)'
                },
                series: [
                    {
                        name: y_name,
                        type: type,
                        radius: '55%',
                        center: ['40%', '50%'],
                        data: datauser,
                        emphasis: {
                            itemStyle: {
                                shadowBlur: 10,
                                shadowOffsetX: 0,
                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                            }
                        }
                    }
                ]
            };
            myChart.setOption(option);
        }
    }
    if ((type == "scatter") || (type == "line")) {
        $("#row" + id).remove();
        $(".content").append('<div class="row1" id="row'+ id + '">\n' +
            '                    <div class="col-xl-12 col-sm-12">\n' +
            '                        <div class="card card-mini mb-4">\n' +
            '                            <div class="card-header justify-content-left">\n' +
            '\n' +
            '                            </div>\n' +
            '                            <div class="card-body">\n' +
            '                                <h2 class="mb-1">' + y_name + '变化情况' + '</h2>\n' +
            '                                <div class="chartjs-wrapper" style="height: 300px;">\n' +
            '                                    <div id="' + id + '" style="height: 100%"></div>\n' +
            '                                </div>\n' +
            '                            </div>\n' +
            '                        </div>\n' +
            '                    </div>\n' +
            '                </div>')
        if (type == "scatter") {
            var myChart = echarts.init(document.getElementById(id));
            var option = {
                xAxis: {
                    name: x_name,
                    type: 'category',
                    data: x_value
                },
                yAxis: {
                    name: y_name,
                    type: 'value'
                },
                tooltip: {
                    trigger: 'item',
                    formatter: '{a} <br/>{b} : {c} ({d}%)'
                },
                series: [{
                    data: y_value,
                    type: 'scatter'
                }]
            };
            myChart.setOption(option);
        }
        if (type == "line") {
            var myChart = echarts.init(document.getElementById(id));
            var option = {
                xAxis: {
                    name: x_name,
                    type: 'category',
                    data: x_value
                },
                yAxis: {
                    name: y_name,
                    type: 'value'
                },
                tooltip: {
                    trigger: 'item',
                    formatter: '{a} <br/>{b} : {c} ({d}%)'
                },
                series: [{
                    data: y_value,
                    type: 'line'
                }]
            };
            myChart.setOption(option);
        }
    }
}