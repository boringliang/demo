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
        $(".charts").prepend('<div class="row1" id="row'+ id + '">\n' +
            '                    <div class="col-xl-12 col-sm-12">\n' +
            '                        <div class="card card-mini mb-4">\n' +
            '                            <div class="card-header justify-content-left">\n' +
            '\n' +
            '                            </div>\n' +
            '                            <div class="card-body">\n' +
            '                                <h2 class="mb-1">' + y_name + '数量统计' + '</h2>\n' +
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
        $(".charts").prepend('<div class="row1" id="row'+ id + '">\n' +
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

function scatter_line(x_name, y_name, x_value, y_value, type, id) {
    if (type == "scatter") {
        var myChart = echarts.init(document.getElementById(id));
        var option = {
            xAxis: {
                name: x_name,
                type: 'category',
                data: x_value,
            },
            yAxis: {
                name: y_name,
                type: 'value',
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
                data: x_value,
            },
            yAxis: {
                name: y_name,
                type: 'value',
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

function pie_bar(x_name, y_name, x_value, y_value, type, id) {
    if (type == "bar") {
        var myChart = echarts.init(document.getElementById(id));
        var option = {
            xAxis: {
                name: x_name,
                type: 'category',
                data: x_value,
                axisLabel : {
                    interval: 0
                }
            },
            yAxis: {
                name: y_name,
                type: 'value',
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

function bar3d(x_name, y_name, z_name, x_value, y_value, z_value, id) {

    var data_map = new Array();
    for (var i = 0; i < x_value.length; i++) {
        var l = [x_value[i], y_value[i], z_value[i]];
        data_map[i] = l;
    }
    var xs = Array.from(new Set(x_value));
    var ys = Array.from(new Set(y_value));
    var datas = new Array();
    for (var i = 0; i < data_map.length; i++) {
        datas[i] = [xs.indexOf(data_map[i][0]), ys.indexOf(data_map[i][1]), data_map[i][2]];
    }

    var amax = 0;
    for (var i = 0; i < z_value.length; i++) {
        amax = Math.max(amax, z_value[i]);
    }



    var myChart = echarts.init(document.getElementById(id));
    var option = {
        tooltip: {},
        visualMap: {
            max: amax,
            inRange: {
                color: ['#313695', '#4575b4', '#74add1', '#abd9e9', '#e0f3f8', '#ffffbf', '#fee090', '#fdae61', '#f46d43', '#d73027', '#a50026']
            }
        },
        xAxis3D: {
            type: 'category',
            data: xs,
            name: x_name,
            axisLabel : {
                interval: 0
            }
        },
        yAxis3D: {
            type: 'category',
            data: ys,
            name: y_name,
            axisLabel : {
                interval: 0
            }
        },
        zAxis3D: {
            type: 'value',
            name: z_name,
        },
        grid3D: {
            boxWidth: 200,
            boxDepth: 80,
            viewControl: {
                // projection: 'orthographic'
            },
            light: {
                main: {
                    intensity: 1.2,
                    shadow: true
                },
                ambient: {
                    intensity: 0.3
                }
            }
        },
        series: [{
            type: 'bar3D',
            data: datas.map(function (item) {
                return {
                    value: [item[0], item[1], item[2]],
                }
            }),
            shading: 'lambert',

            label: {
                textStyle: {
                    fontSize: 16,
                    borderWidth: 1
                }
            },

            emphasis: {
                label: {
                    textStyle: {
                        fontSize: 20,
                        color: '#900'
                    }
                },
                itemStyle: {
                    color: '#900'
                }
            }
        }]
    }
    myChart.setOption(option);
}

function data2enum(data, table) {
    var o = new Array();
    for (var i = 0; i < data.length; i++) {
        o[i] = table[data[i]];
    }
    return o;
}
