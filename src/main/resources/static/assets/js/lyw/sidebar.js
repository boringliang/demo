// $(document).ready(function () {
//     $('.wrapper').prepend('<aside class="left-sidebar bg-sidebar">\n' +
//         '    <div id="sidebar" class="sidebar sidebar-with-footer">\n' +
//         '    <!-- Aplication Brand -->\n' +
//         '<div class="app-brand">\n' +
//         '    <a href="/index.html">\n' +
//         '    <svg class="brand-icon" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid"\n' +
//         'width="30" height="33" viewBox="0 0 30 33">\n' +
//         '    <g fill="none" fill-rule="evenodd">\n' +
//         '    <path class="logo-fill-blue" fill="#7DBCFF" d="M0 4v25l8 4V0zM22 4v25l8 4V0z" />\n' +
//         '    <path class="logo-fill-white" fill="#FFF" d="M11 4v25l8 4V0z" />\n' +
//         '    </g>\n' +
//         '    </svg>\n' +
//         '    <span class="brand-name">交通事件多维关系挖掘</span>\n' +
//         '    </a>\n' +
//         '    </div>\n' +
//         '    <!-- begin sidebar scrollbar -->\n' +
//         '    <div class="sidebar-scrollbar">\n' +
//         '\n' +
//         '    <!-- sidebar menu -->\n' +
//         '<ul class="nav sidebar-inner" id="sidebar-menu">\n' +
//         '    <!--交通事件特征分析-->\n' +
//         '    <li class="has-sub expand">\n' +
//         '    <a class="sidenav-item-link" href="javascript:void(0)" data-toggle="collapse"\n' +
//         'data-target="#trafficeventfeature" aria-expanded="false" aria-controls="dashboard">\n' +
//         '    <i class="mdi mdi-view-dashboard-outline"></i>\n' +
//         '    <span class="nav-text">交通事件相似性分析</span> <b class="caret"></b>\n' +
//         '</a>\n' +
//         '<ul class="collapse show" id="trafficeventfeature" data-parent="#sidebar-menu">\n' +
//         '    <div class="sub-menu">\n' +
//         '    <li>\n' +
//         '    <a class="sidenav-item-link" href="/VIOLATIONEventgraph">\n' +
//         '    <span class="nav-text">交通违法</span>\n' +
//         '    </a>\n' +
//         '    </li>\n' +
//         '    <li>\n' +
//         '    </div>\n' +
//         '    </ul>\n' +
//         '    </li>\n' +
//         '\n' +
//         '    <!--情报数据展示-->\n' +
//         '    <li class="has-sub">\n' +
//         '    <a class="sidenav-item-link" href="javascript:void(0)" data-toggle="collapse" data-target="#qbsjzs"\n' +
//         'aria-expanded="false" aria-controls="icons">\n' +
//         '    <i class="mdi mdi-book-open-page-variant"></i>\n' +
//         '    <span class="nav-text">事件数据展示</span> <b class="caret"></b>\n' +
//         '</a>\n' +
//         '<ul class="collapse" id="qbsjzs">\n' +
//         '    <div class="sub-menu">\n' +
//         '    <li>\n' +
//         '    <a href="/VIOLATIONDatagrid">违法事件数据展示</a>\n' +
//         '    </li>\n' +
//         '    </div>\n' +
//         '    </ul>\n' +
//         '    </li>\n' +
//         '    <li>\n' +
//         '    <a href="/lrx/ee">事故事件数据展示</a>\n' +
//         '    </li>\n' +
//         '    </div>\n' +
//         '    </ul>\n' +
//         '    </li>\n' +
//
//         '    <!--事件图谱-->\n' +
//         '    <li class="has-sub">\n' +
//         '    <a class="sidenav-item-link" href="javascript:void(0)" data-toggle="collapse"\n' +
//         'data-target="#charts" aria-expanded="false" aria-controls="charts">\n' +
//         '    <i class="mdi mdi-folder-multiple-outline"></i>\n' +
//         '    <span class="nav-text">关联规则</span> <b class="caret"></b>\n' +
//         '</a>\n' +
//         '<ul class="collapse" id="charts" data-parent="#sidebar-menu">\n' +
//         '    <div class="sub-menu">\n' +
//         '    <li>\n' +
//         '    <a class="sidenav-item-link" href="/association">\n' +
//         '    <span class="nav-text">违法事件关联规则java</span>\n' +
//         '    </a>\n' +
//         '    </li>\n' +
//         '    <li>\n' +
//         '    <a class="sidenav-item-link" href="/association_acd">\n' +
//         '    <span class="nav-text">事故事件关联规则java</span>\n' +
//         '    </a>\n' +
//         '    </li>\n' +
//         '    <li>\n' +
//         '    <a class="sidenav-item-link" href="/viorules/index">\n' +
//         '    <span class="nav-text">违法事件关联规则python</span>\n' +
//         '    </a>\n' +
//         '    </li>\n' +
//         '    <li>\n' +
//         '    <a class="sidenav-item-link" href="/accidentrule/index">\n' +
//         '    <span class="nav-text">事故事件关联规则python</span>\n' +
//         '    </a>\n' +
//         '    </li>\n' +
//         '    <li>\n' +
//         '    <a class="sidenav-item-link" href="/rule/index">\n' +
//         '    <span class="nav-text">拥堵事件关联规则python</span>\n' +
//         '    </a>\n' +
//         '    </li>\n' +
//
//         '    </ul>\n' +
//         '    </div>\n' +
//         '\n' +
//         '    <hr class="separator" />\n' +
//         '\n' +
//         '    </div>\n' +
//         '    </aside>')
// });

$(document).ready(function () {
    $('.wrapper').prepend('<aside class="left-sidebar bg-sidebar">\n' +
        '        <div id="sidebar" class="sidebar sidebar-with-footer">\n' +
        '            <!-- Aplication Brand -->\n' +
        '            <div class="app-brand">\n' +
        '                <a href="/index.html">\n' +
        '                    <svg class="brand-icon" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid"\n' +
        '                         width="30" height="33" viewBox="0 0 30 33">\n' +
        '                        <g fill="none" fill-rule="evenodd">\n' +
        '                            <path class="logo-fill-blue" fill="#7DBCFF" d="M0 4v25l8 4V0zM22 4v25l8 4V0z" />\n' +
        '                            <path class="logo-fill-white" fill="#FFF" d="M11 4v25l8 4V0z" />\n' +
        '                        </g>\n' +
        '                    </svg>\n' +
        '                    <span class="brand-name">交通事件多维关系挖掘</span>\n' +
        '                </a>\n' +
        '            </div>\n' +
        '            <!-- begin sidebar scrollbar -->\n' +
        '            <div class="sidebar-scrollbar">\n' +
        '\n' +
        '                <!-- sidebar menu -->\n' +
        '                <ul class="nav sidebar-inner" id="sidebar-menu">\n' +
        '                    <!--交通事件特征分析-->\n' +
        '                    <li class="has-sub expand">\n' +
        '                        <a class="sidenav-item-link" href="javascript:void(0)" data-toggle="collapse"\n' +
        '                           data-target="#trafficeventfeature" aria-expanded="false" aria-controls="dashboard">\n' +
        '                            <i class="mdi mdi-view-dashboard-outline"></i>\n' +
        '                            <span class="nav-text">交通事件相似性分析</span> <b class="caret"></b>\n' +
        '                        </a>\n' +
        '                        <ul class="collapse show" id="trafficeventfeature" data-parent="#sidebar-menu">\n' +
        '                            <div class="sub-menu">\n' +
        '                                <li>\n' +
        '                                    <a class="sidenav-item-link" href="/VIOLATIONEventgraph">\n' +
        '                                        <span class="nav-text">违法事件</span>\n' +
        '                                    </a>\n' +
        '                                </li>\n' +
        // '                                <li>\n' +
        // '                                    <a class="sidenav-item-link" href="/weifa">\n' +
        // '                                        <span class="nav-text">交通违法</span>\n' +
        // '                                    </a>\n' +
        // '                                </li>\n' +
        // '                                <li>\n' +
        // '                                    <a class="sidenav-item-link" href="/guihua">\n' +
        // '                                        <span class="nav-text">交通规划</span>\n' +
        // '                                    </a>\n' +
        // '                                </li>\n' +
        // '                                <li>\n' +
        // '                                    <a class="sidenav-item-link" href="/traffic_jam_INDEX_ROAD_INDEX">\n' +
        // '                                        <span class="nav-text">交通拥堵</span>\n' +
        // '                                    </a>\n' +
        // '                                </li>\n' +
        // '                                <li>\n' +
        // '                                    <a class="sidenav-item-link" href="/yuan">\n' +
        // '                                        <span class="nav-text">交通预案</span>\n' +
        // '                                    </a>\n' +
        // '                                </li>\n' +
        '                            </div>\n' +
        '                        </ul>\n' +
        '                    </li>\n' +
        '\n' +
        '                    <!--情报数据展示-->\n' +
        '                    <li class="has-sub">\n' +
        '                        <a class="sidenav-item-link" href="javascript:void(0)" data-toggle="collapse" data-target="#qbsjzs"\n' +
        '                           aria-expanded="false" aria-controls="icons">\n' +
        '                            <i class="mdi mdi-book-open-page-variant"></i>\n' +
        '                            <span class="nav-text">事件数据展示</span> <b class="caret"></b>\n' +
        '                        </a>\n' +
        '                        <ul class="collapse" id="qbsjzs">\n' +
        '                            <div class="sub-menu">\n' +
        '                                <li>\n' +
        '                                    <a href="/VIOLATIONDatagrid">违法事件数据展示</a>\n' +
        '                                </li>\n' +
        '                                <li>\n' +
        '                                    <a href="/lrx/ee">事故事件数据展示</a>\n' +
        '                                </li>\n' +
        '                            </div>\n' +
        '                        </ul>\n' +
        '                    </li>\n' +
        '                    <!--事件研判分析-->\n' +
        '                    <li class="has-sub">\n' +
        '                        <a class="sidenav-item-link" href="javascript:void(0)" data-toggle="collapse"\n' +
        '                           data-target="#shijianyanpan" aria-expanded="false" aria-controls="icons">\n' +
        '                            <i class="mdi mdi-chart-pie"></i>\n' +
        '                            <span class="nav-text">关联规则</span> <b class="caret"></b>\n' +
        '                        </a>\n' +
        '                        <ul class="collapse" id="shijianyanpan">\n' +
        '                            <div class="sub-menu">\n' +
        '                                <li>\n' +
        '                                    <a href="/association">违法事件关联规则java</a>\n' +
        '                                </li>\n' +
        '                                <li>\n' +
        '                                    <a href="/association_acd">事故事件关联规则java</a>\n' +
        '                                </li>\n' +
        '                                <li>\n' +
        '                                    <a href="/accidentrule/index">事故事件关联规则python</a>\n' +
        '                                </li>\n' +
        '                                <li>\n' +
        '                                    <a href="/viorules/index">违法事件关联规则python</a>\n' +
        '                                </li>\n' +
        '                                <li>\n' +
        '                                    <a href="/rule/index">拥堵事件关联规则python</a>\n' +
        '                                </li>\n' +
        '                            </div>\n' +
        '                        </ul>\n' +
        '                    </li>\n' +
        // '                    <!--知识图谱-->\n' +
        // '                    <li class="has-sub">\n' +
        // '                        <a class="sidenav-item-link" href="javascript:void(0)" data-toggle="collapse"\n' +
        // '                           data-target="#ui-elements" aria-expanded="false" aria-controls="ui-elements">\n' +
        // '                            <i class="mdi mdi-image-filter-none"></i>\n' +
        // '                            <span class="nav-text">知识图谱</span> <b class="caret"></b>\n' +
        // '                        </a>\n' +
        // '                        <ul class="collapse" id="ui-elements" data-parent="#sidebar-menu">\n' +
        // '                            <div class="sub-menu">\n' +
        // '                                <li class="has-sub">\n' +
        // '                                    <a class="sidenav-item-link" href="javascript:void(0)" data-toggle="collapse"\n' +
        // '                                       data-target="#components" aria-expanded="false" aria-controls="components">\n' +
        // '                                        <span class="nav-text">知识图谱展示</span> <b class="caret"></b>\n' +
        // '                                    </a>\n' +
        // '                                </li>\n' +
        // '                                <li class="has-sub">\n' +
        // '                                    <a class="sidenav-item-link" href="javascript:void(0)" data-toggle="collapse"\n' +
        // '                                       data-target="#icons" aria-expanded="false" aria-controls="icons">\n' +
        // '                                        <span class="nav-text">知识图谱应用场景</span> <b class="caret"></b>\n' +
        // '                                    </a>\n' +
        // '                                    <ul class="collapse" id="icons">\n' +
        // '                                        <div class="sub-menu">\n' +
        // '                                            <li>\n' +
        // '                                                <a href="../material-icon.html">拥堵预测</a>\n' +
        // '                                            </li>\n' +
        // '                                            <li>\n' +
        // '                                                <a href="../flag-icon.html">拥堵蔓延分析</a>\n' +
        // '                                            </li>\n' +
        // '                                        </div>\n' +
        // '                                    </ul>\n' +
        // '                                </li>\n' +
        // '                            </div>\n' +
        // '                        </ul>\n' +
        // '                    </li>\n' +
        // '\n' +
        // '                    <!--事件图谱-->\n' +
        // '                    <li class="has-sub">\n' +
        // '                        <a class="sidenav-item-link" href="javascript:void(0)" data-toggle="collapse"\n' +
        // '                           data-target="#charts" aria-expanded="false" aria-controls="charts">\n' +
        // '                            <i class="mdi mdi-folder-multiple-outline"></i>\n' +
        // '                            <span class="nav-text">事件图谱</span> <b class="caret"></b>\n' +
        // '                        </a>\n' +
        // '                        <ul class="collapse" id="charts" data-parent="#sidebar-menu">\n' +
        // '                            <div class="sub-menu">\n' +
        // '                                <li>\n' +
        // '                                    <a class="sidenav-item-link" href="Police_case">\n' +
        // '                                        <span class="nav-text">事件图谱展示</span>\n' +
        // '                                    </a>\n' +
        // '                                </li>\n' +
        // '                                <li>\n' +
        // '                                    <a class="sidenav-item-link" href="eventgraph_appilication">\n' +
        // '                                        <span class="nav-text">事件图谱应用场景</span>\n' +
        // '                                    </a>\n' +
        // '                                </li>\n' +
        // '                            </div>\n' +
        // '                        </ul>\n' +
        // '                    </li>\n' +
        // '\n' +
        '                </ul>\n' +
        '            </div>\n' +
        '\n' +
        '            <hr class="separator" />\n' +
        '\n' +
        '        </div>\n' +
        '    </aside>')});