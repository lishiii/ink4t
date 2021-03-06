<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Blog</title>
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/my.css">
<link rel="stylesheet" type="text/css" href="css/blog.css">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<script type="text/javascript" src="js/my.js"></script>
<script type="text/javascript" src="js/scrollspy.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/jquery.goup.min.js"></script>
</head>
<body>

	<jsp:include page="commons/nav.jsp" />
	<div class="container blog-container">
		<div id="myCarousel" class="carousel slide">
			<!-- 轮播（Carousel）指标 -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>
			<!-- 轮播（Carousel）项目 -->
			<div class="carousel-inner">

				<div class="item active">
					<a href="#"> <img src="./images/c2.jpg" alt="First slide"
						class="img-responsive carousel-pic">
						<div class="carousel-caption">
							<h2>标题 1</h2>
							<p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
						</div> </a>
				</div>

				<div class="item">
					<a href="#"> <img src="./images/c1.jpg" class="img-responsive"
						alt="Second slide">
						<div class="carousel-caption">
							<h2>标题 2</h2>
							<p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
						</div> </a>
				</div>
				<div class="item">
					<a href="#"> <img src="./images/c4.jpg" class="img-responsive"
						alt="Third slide">
						<div class="carousel-caption">
							<h2>标题 3</h2>
							<p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
						</div> </a>
				</div>
			</div>
			<!-- 轮播（Carousel）导航 -->
			<a class="carousel-control left" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span> </a> <a
				class="carousel-control right" href="#myCarousel" data-slide="next">
				<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span> </a>
		</div>
		<div id="assist"></div>



		<div id="main-context row">
			<div id="blog-left" class="pull-left col-lg-9 col-xs-12 col-sm-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<a href="#" class="text-success">Redis新手快速入门1</a>
					</div>
					<div class="panel-body">
						<a href="#" class="text-muted text-main">以下数据类型的操作从简介绍。 2.3
							List的操作/* 插入数据 */LPUSH key value [value ...]// 将一个或多个值 value
							插入到列表 key 的表头 // 如果有多个 value 值，那么各个 value 值按从左到右的顺序依次插入到表头：
							比如说，对空列表 mylist 执行命令 LPUSH mylist a b c ，列表的值将是 c b a ，这等同于原子...</a>
					</div>
					<div class="panel-body text-right">
						2017-08-08&nbsp;&nbsp;23:15&nbsp;&nbsp;&nbsp;阅读(19)&nbsp;&nbsp;&nbsp;评论(0)
					</div>
				</div>

				<div class="panel panel-default">
					<div class="panel-heading">
						<a href="#" class="text-success">Redis新手快速入门2</a>
					</div>
					<div class="panel-body">
						<a href="#" class="text-muted text-main">以下数据类型的操作从简介绍。 2.3
							List的操作/* 插入数据 */LPUSH key value [value ...]// 将一个或多个值 value
							插入到列表 key 的表头 // 如果有多个 value 值，那么各个 value 值按从左到右的顺序依次插入到表头：
							比如说，对空列表 mylist 执行命令 LPUSH mylist a b c ，列表的值将是 c b a ，这等同于原子...</a>
					</div>
					<div class="panel-body text-right">
						2017-08-08&nbsp;&nbsp;23:15&nbsp;&nbsp;&nbsp;阅读(19)&nbsp;&nbsp;&nbsp;评论(0)
					</div>
				</div>

				<div class="panel panel-default">
					<div class="panel-heading">
						<a href="#" class="text-success">Redis新手快速入门3</a>
					</div>
					<div class="panel-body">
						<a href="#" class="text-muted text-main">以下数据类型的操作从简介绍。 2.3
							List的操作/* 插入数据 */LPUSH key value [value ...]// 将一个或多个值 value
							插入到列表 key 的表头 // 如果有多个 value 值，那么各个 value 值按从左到右的顺序依次插入到表头：
							比如说，对空列表 mylist 执行命令 LPUSH mylist a b c ，列表的值将是 c b a ，这等同于原子...</a>
					</div>
					<div class="panel-body text-right">
						2017-08-08&nbsp;&nbsp;23:15&nbsp;&nbsp;&nbsp;阅读(19)&nbsp;&nbsp;&nbsp;评论(0)
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<a href="#" class="text-success">Redis新手快速入门4</a>
					</div>
					<div class="panel-body">
						<a href="#" class="text-muted text-main">以下数据类型的操作从简介绍。 2.3
							List的操作/* 插入数据 */LPUSH key value [value ...]// 将一个或多个值 value
							插入到列表 key 的表头 // 如果有多个 value 值，那么各个 value 值按从左到右的顺序依次插入到表头：
							比如说，对空列表 mylist 执行命令 LPUSH mylist a b c ，列表的值将是 c b a ，这等同于原子...</a>
					</div>
					<div class="panel-body text-right">
						2017-08-08&nbsp;&nbsp;23:15&nbsp;&nbsp;&nbsp;阅读(19)&nbsp;&nbsp;&nbsp;评论(0)
					</div>
				</div>


				<div class="panel panel-default">
					<div class="panel-heading">
						<a href="#" class="text-success">Redis新手快速入门5</a>
					</div>
					<div class="panel-body">
						<a href="#" class="text-muted text-main">以下数据类型的操作从简介绍。 2.3
							List的操作/* 插入数据 */LPUSH key value [value ...]// 将一个或多个值 value
							插入到列表 key 的表头 // 如果有多个 value 值，那么各个 value 值按从左到右的顺序依次插入到表头：
							比如说，对空列表 mylist 执行命令 LPUSH mylist a b c ，列表的值将是 c b a ，这等同于原子...</a>
					</div>
					<div class="panel-body text-right">
						2017-08-08&nbsp;&nbsp;23:15&nbsp;&nbsp;&nbsp;阅读(19)&nbsp;&nbsp;&nbsp;评论(0)
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<a href="#" class="text-success">Redis新手快速入门6</a>
					</div>
					<div class="panel-body">
						<a href="#" class="text-muted text-main">以下数据类型的操作从简介绍。 2.3
							List的操作/* 插入数据 */LPUSH key value [value ...]// 将一个或多个值 value
							插入到列表 key 的表头 // 如果有多个 value 值，那么各个 value 值按从左到右的顺序依次插入到表头：
							比如说，对空列表 mylist 执行命令 LPUSH mylist a b c ，列表的值将是 c b a ，这等同于原子...</a>
					</div>
					<div class="panel-body text-right">
						2017-08-08&nbsp;&nbsp;23:15&nbsp;&nbsp;&nbsp;阅读(19)&nbsp;&nbsp;&nbsp;评论(0)
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<a href="#" class="text-success">Redis新手快速入门7</a>
					</div>
					<div class="panel-body">
						<a href="#" class="text-muted text-main">以下数据类型的操作从简介绍。 2.3
							List的操作/* 插入数据 */LPUSH key value [value ...]// 将一个或多个值 value
							插入到列表 key 的表头 // 如果有多个 value 值，那么各个 value 值按从左到右的顺序依次插入到表头：
							比如说，对空列表 mylist 执行命令 LPUSH mylist a b c ，列表的值将是 c b a ，这等同于原子...</a>
					</div>
					<div class="panel-body text-right">
						2017-08-08&nbsp;&nbsp;23:15&nbsp;&nbsp;&nbsp;阅读(19)&nbsp;&nbsp;&nbsp;评论(0)
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<a href="#" class="text-success">Redis新手快速入门8</a>
					</div>
					<div class="panel-body">
						<a href="#" class="text-muted text-main">以下数据类型的操作从简介绍。 2.3
							List的操作/* 插入数据 */LPUSH key value [value ...]// 将一个或多个值 value
							插入到列表 key 的表头 // 如果有多个 value 值，那么各个 value 值按从左到右的顺序依次插入到表头：
							比如说，对空列表 mylist 执行命令 LPUSH mylist a b c ，列表的值将是 c b a ，这等同于原子...</a>
					</div>
					<div class="panel-body text-right">
						2017-08-08&nbsp;&nbsp;23:15&nbsp;&nbsp;&nbsp;阅读(19)&nbsp;&nbsp;&nbsp;评论(0)
					</div>
				</div>
				<a href="./textset.html" class="btn btn-default btn-block">查看更多...</a>
			</div>

			<div id="blog-right" class="pull-right hidden-xs hidden-sm col-lg-3">
				<jsp:include page="commons/right.jsp" />
			</div>
		</div>
	</div>


	<jsp:include page="commons/footer.jsp" />


</body>
</html>