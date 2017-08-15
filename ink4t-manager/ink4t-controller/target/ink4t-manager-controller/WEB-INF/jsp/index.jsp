<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/my.css">
	<title>index</title>
	<script type="text/javascript" src="js/scrollspy.js"></script>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/jquery.goup.min.js"></script>
	<script type="text/javascript" src="js/my.js"></script>
	
	<!-- <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
	<script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script> -->
	<!-- <script type="text/javascript">
		$(document).ready(function () {  
			$.goup({  
				trigger: 100,  
                bottomOffset: 40,       //距底部偏移量   
                locationOffset: 30,     //距右部偏移量  
                title: '',  
                titleAsText: true       //是否显示title  
            });  
		});
	</script> -->
</head>
<body data-spy="scroll" data-target=".navbar-example" data-offset="0">
	<nav id="header" class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#example-navbar-collapse">
					<span class="sr-only">切换导航</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a href="/"  class="navbar-left" id="logo">
					<img src="images/logo1.png" style="width: 50px"><span id="logoFont">ink4t</span>
				</a>
			</div>
			<div id="example-navbar-collapse" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class=""><a href="/blog">博客</a></li>
					<li class=""><a href="/textset">文本文章</a></li>
					<li class=""><a href="/message">留言板</a></li>
				</ul>
				

				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href="#home"><span class="glyphicon glyphicon-home" aria-hidden="true"></span></a></li>
					<li class="dropdown">
						<a href="#" id="navbarDrop1" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>
							<b class="caret"></b>
						</a>
						<ul class="dropdown-menu" role="menu" aria-labelledby="navbarDrop1">
							<li><a href="#info_1" tabindex="-1">个人简介</a></li>
							<li><a href="#info_2" tabindex="-1">近况阐述</a></li>
							<li class="divider">
								<li><a href="#info_3" tabindex="-1">更多信息</a></li>
							</ul>
						</li>
						<li class=""><a href="#contact"><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span></a></li>
					</ul>
				</div>

			</div>
		</nav>
		<section class="page section-1" id="home">
			<div class="container">
				<div class="seciton-empty"></div>
				<div class="row">
					<div class="col-lg-offset-1 col-xs-offset-1">
						<h1 class="section-1-fonts title">I'm ink4t!</h1>
						<p class="section-1-fonts title--description">一名自由编程员，无码不欢。</p>
						<p><a class="btn btn-info btn-lg section-1-btn" href="/blog" role="button">F<small>ound more</small></a></p>
					</div>
				</div>	
			</div>	
		</section>

		<section class="page section-2" id="info_1">
			<div class="container">
				<div class="section-2-box row">
					
					<div class="section-2-left col-lg-6 hidden-xs hidden-sm">
						<div class="thumbnail">
							<img src="images/34.jpg" alt="...">
							<div class="caption">
								<h3>ink4t</h3>
								<p>Java工程师，热爱编程，没事就爱敲点小代码，喜欢学习新技术，暂时只了解了c、c++、php、tp、javaEE、ssh、ssm、android、linux、nginx、solr、mysql、redis、sqlServer、h5、bootstrap、css、js、jquery...</p>
							</div>
						</div>
					</div>

					<div class="section-2-right  col-lg-5 col-lg-offset-1 col-xs-offset-1 col-sm-12 col-xs-12 col-sm-12 col-xs-12">
						<p><h1 class="section-2-right-title">A Free Programmer</h1></p>
						<p><h4 class="section-2-right-desc">My CSDN URL : <br><a href="http://blog.csdn.net/ink4t">http://blog.csdn.net/ink4t</a></h2></p>
						<p><h1 class="section-2-right-title">No Code No Pleasure</h1></p>
						<p><h4 class="section-2-right-desc">My GitHub URL : <br><a href="https://github.com/lishiii">https://github.com/lishiii</a></h2></p>
					</div>

				</div>
			</div>	
		</section>

		<section class="page section-3" id="info_2">
			<div class="container">
				<div class="section-2-box row">
					<div class="section-2-left col-lg-5 col-lg-offset-1 hidden-xs hidden-sm">
						<p><h1 class="section-2-right-title">A Free Programmer</h1></p>
						<p><h4 class="section-2-right-desc">My CSDN URL : <br><a href="http://blog.csdn.net/ink4t">http://blog.csdn.net/ink4t</a></h2></p>
						<p><h1 class="section-2-right-title">No Code No Pleasure</h1></p>
						<p><h4 class="section-2-right-desc">My GitHub URL : <br><a href="https://github.com/lishiii">https://github.com/lishiii</a></h2></p>


					</div>
					<div class="section-2-right col-lg-6 col-sm-12 col-xs-12 col-sm-12 col-xs-12">
						<div class="thumbnail">
							<img src="images/36.jpg" alt="...">
							<div class="caption">
								<h3>ink4t</h3>
								<p>喜欢就点击，不喜欢也可以点击！点击无上限。</p>
								<div class="progress">
									<div class="progress-bar progress-bar-success progress-bar-striped" style="width: 65%" id="pro-like">
										65
										<!-- <span class="sr-only" id="sr-like">65% Complete (success)</span> -->
										
									</div>
									<div class="progress-bar progress-bar-warning progress-bar-striped" style="width: 35%" id="pro-unlike">
										35
										<!-- <span class="sr-only" id="sr-unlike">35% Complete (warning)</span> -->
										
									</div>
								</div>
								<div class="row">
									<div class="col-lg-4 col-xs-12 col-sm-12 col-xs-offset-2">
										<button class="btn btn-success btn-like" id="btn-like">喜欢</button>
									</div>
									<div class="col-lg-4 col-lg-offset-4 col-xs-12 col-sm-12 col-xs-offset-2 col-lg-offset-0" id="btn-unlike">
										<button class="btn btn-warning btn-unlike">不喜欢</button>
									</div>
								</div>
								
							</div>
						</div>
					</div>
				</div>
			</div>	
		</section>

		<section class="page section-4" id="info_3">
			<div class="container-fluid">
				<div class="row section-4-row">
					<div class="container">
						<div class="col-lg-4 col-md-6 col-sm-6 col-xs-12 section-4-col">
							<h3><span class="glyphicon glyphicon-heart" aria-hidden="true"></span> T<small>ASKS</small></h3>
							<h4 class="section-4-desc">Keep simple to do lists organized in notes and notebooks.</h4>
						</div>
						<div class="col-lg-4 col-md-6 col-sm-6 col-xs-12 section-4-col">
							<h3><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> K<small>EYBINDINGS</small></h3>
							<h4 class="section-4-desc">You can manage your notes without ever lifting your hands from your keyboard.</h4>	
						</div>
						<div class="col-lg-4 col-md-6 col-sm-6 col-xs-12 section-4-col">
							<h3><span class="glyphicon glyphicon-text-background" aria-hidden="true"></span> C<small>ODE</small></h3>
							<h4 class="section-4-desc">Keep snippets of code to have access to them anytime and anywhere.</h4>
						</div>
						<div class="col-lg-4 col-md-6 col-sm-6 col-xs-12 section-4-col">
							<h3><span class="glyphicon glyphicon-cutlery" aria-hidden="true"></span> N<small>O REGISTRATION</small></h3>
							<h4 class="section-4-desc">Do you prefer to stay anonymous? You do not need to go through registration process to start using Laverna.</h4>
						</div>
						<div class="col-lg-4 col-md-6 col-sm-6 col-xs-12 section-4-col">
							<!-- <h3><span class="glyphicon glyphicon-briefcase" aria-hidden="true"></span> I<small>MPORT</small></h3>
							<h4 class="section-4-desc">You can export your notes from Laverna and import them back anytime. You are not tied to using it forever.</h4> -->
						</div>
						<div class="col-lg-4 col-md-6 col-sm-6 col-xs-12 section-4-col">
							<!-- <h3><span class="glyphicon glyphicon-folder-open" aria-hidden="true"></span> O<small>PEN SOURCE</small></h3>
							<h4 class="section-4-desc">Every line of code can be reviewed on Github and is available under MPL-2.0 license.</h4> -->
						</div>
					</div>
				</div>
			</div>	
		</section>

		<jsp:include page="commons/footer.jsp" />
	</body>
	</html>