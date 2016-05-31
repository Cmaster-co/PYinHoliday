<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>
        柚子皮 | 互联网的运营笔记！</title>
    <meta charset="utf-8" />
    <meta http-equiv="Cache-Control" content="no-transform " />
    <meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=no" />
    <meta name="description" content="柚子皮，互联网的运营笔记！" />
    <meta name="keywords" content="柚子皮，互联网运营，网站运营，网络营销" />
    <link rel="shortcut icon" href="http://www.yzipi.com/wp-content/themes/yzipi/images/favicon.ico" />
    <link rel='stylesheet' id='sytle-css'  href='http://www.yzipi.com/wp-content/themes/yzipi/style.css?ver=4.3.4' type='text/css' media='all' />
    <link rel='stylesheet' id='home-css'  href='http://www.yzipi.com/wp-content/themes/yzipi/home.css?ver=4.3.4' type='text/css' media='all' />
    <link rel='stylesheet' id='yzipi-pc-css'  href='http://www.yzipi.com/wp-content/themes/yzipi/yzipi-pc.css?ver=4.3.4' type='text/css' media='all' />
    <link rel='stylesheet' id='yzipi-ipad-css'  href='http://www.yzipi.com/wp-content/themes/yzipi/yzipi-ipad.css?ver=4.3.4' type='text/css' media='all' />
    <link rel='stylesheet' id='yzipi-phone2-css'  href='http://www.yzipi.com/wp-content/themes/yzipi/yzipi-phone2.css?ver=4.3.4' type='text/css' media='all' />
    <link rel='stylesheet' id='yzipi-phone-css'  href='http://www.yzipi.com/wp-content/themes/yzipi/yzipi-phone.css?ver=4.3.4' type='text/css' media='all' />
    <script type='text/javascript' src='http://www.yzipi.com/wp-content/themes/yzipi/js/html5shiv.js?ver=4.3.4'></script>
    <script type='text/javascript' src='http://www.yzipi.com/wp-content/themes/yzipi/js/css3-mediaqueries.js?ver=4.3.4'></script>
    <script type='text/javascript' src='http://www.yzipi.com/wp-content/themes/yzipi/js/selectivizr-min.js?ver=4.3.4'></script>
    <script type='text/javascript' src='http://www.yzipi.com/wp-content/themes/yzipi/js/jquery.1.11.1.js?ver=4.3.4'></script>
    <script type='text/javascript' src='http://www.yzipi.com/wp-content/themes/yzipi/js/zan.js?ver=4.3.4'></script>
</head>
<body>
<header id="header-web">
    <div class="header-main">
        <hgroup class="logo">
            <h1><a href="http://www.yzipi.com/" title="柚子皮" rel="home"><img src="http://www.yzipi.com/wp-content/themes/yzipi/images/logo.png" alt="柚子皮"></a></h1>
        </hgroup>
        <!--logo-->
        <nav class="header-nav">
            <ul id="menu-nav" class="menu"><li id="menu-item-4" class="menu-item menu-item-type-custom menu-item-object-custom current-menu-item current_page_item menu-item-home menu-item-4"><a href="http://www.yzipi.com/">首页</a></li>
                <li id="menu-item-31" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-has-children menu-item-31"><a title="运营经验" href="http://www.yzipi.com/category/experience">小组</a>
                    <ul class="sub-menu">
                        <li id="menu-item-3218" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-3218"><a href="/createProject">创建小组</a></li>
                        <li id="menu-item-3220" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-3220"><a href="/joinProject/">加入小组</a></li>
                        <li id="menu-item-3222" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-3222"><a href="http://www.yzipi.com/category/experience/marketing">营销推广</a></li>
                        <li id="menu-item-3186" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-3186"><a href="http://www.yzipi.com/category/experience/view">名家看点</a></li>
                        <li id="menu-item-3219" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-3219"><a href="http://www.yzipi.com/category/experience/entrepreneurship-manage">创业/管理</a></li>
                        <li id="menu-item-3221" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-3221"><a href="http://www.yzipi.com/category/experience/development">职场成长</a></li>
                    </ul>
                </li>
                <li id="menu-item-1958" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-1958"><a title="随机热文" href="http://www.yzipi.com/hotrandom">热文</a></li>
                <li id="menu-item-3243" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-3243"><a href="http://www.yzipi.com/category/youshuo">柚说</a></li>
                <li id="menu-item-3145" class="menu-item menu-item-type-custom menu-item-object-custom menu-item-3145"><a href="http://www.yzipi.com/searchform">搜索</a></li>
            </ul>    </nav>
        <!--header-nav-->

        <!--header-main-->
    </div>
</header>
<!--header-web-->
<div id="main">
    <div id="soutab">
        <form method="get" class="search" action="http://www.yzipi.com/" >
            <input class="text" type="text" name="s" placeholder=" 请输入关键词" value="">
            <input class="butto" value="" type="submit">
        </form>
    </div>
    <div id="container">
        <c:if test="${!empty projectList}">
            <c:forEach items="${projectList}" var="project">
                <section class="list">
                    <a href="http://www.yzipi.com/3699.htm#comments" class="up" >3</a>      <div class="mecc">
                    <h2 class="mecctitle"> <a href="/project/${project.id}" >
                        ${project.proname}          </a> </h2>
                    <address class="meccaddress">
                        <time>
                            ${project.time}        </time>
                        -
                        <a href="http://www.yzipi.com/category/experience/development" rel="category tag">${project.location}</a>        -
                        <a href="/joinProject/${project.id}" rel="category tag">加入小组</a></address>
                </div>
                <span class="titleimg"><a href="http://www.yzipi.com/3699.htm" target="_blank">
                    <img width="270" height="165" src="http://www.yzipi.com/wp-content/uploads/2016/04/grgrgr-270x165.png" class="attachment-thumbnail wp-post-image" alt="grgrgr" />            </a> </span>

                    <p>${project.more}</p>
                    <div class="clear"></div>
                </section>
                <div class="clear"></div>
                <div class="clear"></div>
            </c:forEach>
        </c:if>
        <!--list-->
        <div class="pagenavi">
            <span class="page-numbers">1 / 36 </span> <span class='page-numbers current'>1</span> <a class='page-numbers' href='http://www.yzipi.com/page/2' title='第 2 页'>2</a> <a class='page-numbers' href='http://www.yzipi.com/page/3' title='第 3 页'>3</a> <span class="page-numbers">...</span><a class='page-numbers' href='http://www.yzipi.com/page/36' title='最末页'>36</a> <a class='page-numbers' href='http://www.yzipi.com/page/2' title='下一页'>下一页</a>     </div>
        <!--Page End-->
        <nav class="navigation">
            <div class="nav-previous"><a href="http://www.yzipi.com/page/2" >下一页</a></div>

        </nav><!-- .navigation -->
        <!--phonepage-->
    </div>
    <!--Container-->
    <aside id="sitebar">
        <!--erweima-->
        <c:if test="${empty sessionScope.user}">
        <div class="sitebar_list">

            <div class="wptag">
                <span class="tagtitle">请先登陆</span>
                <div class="tagg">

                    <form name='f' action="/login"
                          method='POST'>

                        <table>
                            <tr>
                                <td>User:</td>
                                <td><input type='text' name='username' value=''>
                                </td>
                            </tr>
                            <tr>
                                <td>Password:</td>
                                <td><input type='password' name='passwd' />
                                </td>
                            </tr>
                            <tr>
                                <td colspan='2'><input name="submit" type="submit"
                                                       value="submit" />
                                </td>
                            </tr>

                        </table>

                    </form>

                </div>
            </div>

        </div>
        </c:if>
        <c:if test="${!empty sessionScope.user}">
        <div class="sitebar_list">
            <h4 class="sitebar_title">我的小组</h4>
            <ul class="sitebar_list_ul">
                <c:forEach items="${myprojectList}" var="myproject">
                    <li><a href="/project/${myproject.id}" title="${myproject.proname}">
                        ${myproject.proname}</a></li>
                </c:forEach>
            </ul>
        </div>
        </c:if>
        <a href="http://www.yzipi.com/yunyin" class="yund" target="_blank"><img src="http://www.yzipi.com/wp-content/themes/yzipi/images/yund.png" ></a>
    </aside>
    <div class="clear"></div>
</div>
<!--main-->
<footer id="dibu">
    <div class="about">
        <div class="right">
            <ul id="menu-bottom-nav" class="menu"><li id="menu-item-69" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-69"><a href="http://www.yzipi.com/about">关于我们</a></li>
                <li id="menu-item-3013" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3013"><a href="http://www.yzipi.com/contaxt">联系我们</a></li>
                <li id="menu-item-1953" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-1953"><a href="http://www.yzipi.com/link">友情连接</a></li>
                <li id="menu-item-1758" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-1758"><a href="http://www.yzipi.com/juanz">打赏柚皮</a></li>
            </ul>      <p class="banquan">
            柚子皮        ，
            互联网的运营笔记！      </p>
        </div>
        <div class="left">
            <div class="bottomlist">
                <div class="xinlan"> <a href="http://weibo.com/234836886  " target="_blank" ><img src="http://www.yzipi.com/wp-content/themes/yzipi/images/xinlan.png" alt="柚子皮新浪微博"  title="柚子皮新浪微博" ></a> </div>
                <div class="weixin2"><div class="weixin"> <img src="http://www.yzipi.com/wp-content/themes/yzipi/images/weixin.png" alt="柚子皮微信公众号" title="柚子皮微信公众号"  > <img src="http://www.yzipi.com/wp-content/themes/yzipi/images/yzipi6.png" class="xixii" alt="柚子皮微信公众号" ></div>
                </div>
            </div>
        </div>
    </div>
    <!--about-->
    <div class="bottom">
        <a href="http://www.yzipi.com">柚子皮</a> / <a href="http://www.yzipi.com/yzipi4" target="_blank">Yzipi5.63</a> / <a href="http://www.yzipi.com/tagcloud" target="_blank">标签</a> / <a href="http://www.yzipi.com/guidan" target="_blank">归档</a>
        / <a href="http://www.miitbeian.gov.cn/" rel="external nofollow" target="_blank"> 粤ICP备13063893号-6 </a>
        <div class="tongji"><script type="text/javascript">var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");document.write(unescape("%3Cspan id='cnzz_stat_icon_1253468941'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s6.cnzz.com/stat.php%3Fid%3D1253468941' type='text/javascript'%3E%3C/script%3E"));</script></div>
    </div>
    <!--bottom-->
    <div class="scroll" id="scroll" style="display:none;"> ︿ </div>
    <script type="text/javascript">
        $(function(){
            showScroll();
            function showScroll(){
                $(window).scroll( function() {
                    var scrollValue=$(window).scrollTop();
                    scrollValue > 500 ? $('div[class=scroll]').fadeIn():$('div[class=scroll]').fadeOut();
                } );
                $('#scroll').click(function(){
                    $("html,body").animate({scrollTop:0},200);
                });
            }
        })
    </script>
</footer>
<!--dibu-->
</body></html>