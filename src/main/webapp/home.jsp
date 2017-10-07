
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="req" value="${pageContext.request}" />
<c:set var="url">${req.requestURL}</c:set>
<c:set var="base" value="${fn:substring(url, 0, fn:length(url) - fn:length(req.requestURI))}${req.contextPath}/" />

<html lang="en">

<head>
<base href="${base}">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Illuxplain - App</title>
<script src="<c:url value = "/resources/js/bootstrap.js" />"></script>
<script src="<c:url value = "/resources/js/bootstrap.min.js" />"></script>
<script src="<c:url value = "/resources/js/jquery.js" />"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="<c:url value= "/resources/js/comment-submitter.js" />" /> </script>



<link href="<c:url value ="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<!-- Custom CSS -->
<link href="<c:url value ="/resources/css/blog-post.css" />" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Illuxplain</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="#">About</a></li>
					<li><a href="#">Services</a></li>
					<li><a href="/contact">Contact</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>

	<!-- Page Content -->
	<div class="container">

		<div class="row">

			<!-- Blog Post Content Column -->
			<div class="col-lg-8">

				<!-- Blog Post -->

				<!-- Title -->
				<h1>Illuxplain Application</h1>

				<!-- Author -->
				<p class="lead">
					by <a href="#">Mubeen Ahmed</a>
				</p>

				<hr>

				<!-- Date/Time -->
				<p>
					<span class="glyphicon glyphicon-time"></span> Posted on December
					16, 2015 at 9:00 PM
				</p>

				<hr>

				<!-- Preview Image -->
				<img class="img-responsive" src=" <c:url value="/resources/images/startup.png" /> " alt="">

				<hr>

				<!-- Post Content -->
				<p class="lead">The purpose of this websites is to share
					interesting, learning experiences. This websites also share my
					little achievements. Otherwise this website has no special purpose</p>
				<p>Illuxplain application is the application that uses canvas
					drawing to share between multiple users. Illuxplain application has
					other features. Illuxplain applicaiton is not in the google play
					because of some reasons.</p>
				<p>You can find different types of articles and tutorials in
					this websites. You will also find other interesting topics that is
					off the topics in this web pages</p>
				<hr>

				<!-- Blog Comments -->

				<!-- Comments Form -->
				<div class="well">
					<p class="comment-submitted" style="display:none">Comment Submitted Successfully!</p>
					<h4>Leave a Comment:</h4>
					<form id="myForm" method="POST" action="#">
						<input class="form-control" name="nameOfCommentor" placeholder="name" required="required"/>
						<textarea class="form-control" rows="3" name="commentText" required="required"></textarea>
						<input type="submit" class="btn btn-primary" value="submit" />
						<input type="hidden" value="wel-1" name="pageID" />
					</form>
				</div>

				<hr>

				<!-- Posted Comments -->

				<!-- Comment -->
				<div class="media">
					<!-- <a class="pull-left" href="#">
                        <img class="media-object" src="http://placehold.it/64x64" alt="">
                    </a>
                    <div class="media-body">
                        <h4 class="media-heading">
                            <small</small>
                        </h4>
                       
                    </div> -->
					<div class="well">
						<c:forEach items="${commentList}" var="comment">
						<div class="media">
							<h4 class="media-heading">
								<small>${comment.comment_name}</small>
							</h4>
							<b>Comment</b> :<p>${comment.comment_text}</p>
							
							<b>Replies</b>
							<a  pointer="cursor" onclick="openTextBox(this)">Reply</a>
							<div style="display:none" class="replyDiv">
								<form class="replyForm" method="POST" action="#">
									<input id="comment_id" type="hidden" name="commentId" value="${comment.comment_id}" />
									Name: <input type="text" name="name" class="form-control" rows="3" /><br/>
									<textarea class="form-control" rows="3" name="reply" required="required"></textarea>
									<input type="submit"  />
								</form>
							</div>
						</div>	
						</c:forEach>
					</div>
				</div>

				<!-- Comment 
                <div class="media">
                    <a class="pull-left" href="#">
                        <img class="media-object" src="http://placehold.it/64x64" alt="">
                    </a>
                    <div class="media-body">
                        <h4 class="media-heading">
                            <small></small>
                        </h4>
                      
                        <!-- Nested Comment 
                        <div class="media">
                            <a class="pull-left" href="#">
                                <img class="media-object" src="http://placehold.it/64x64" alt="">
                            </a>
                            <div class="media-body">
                                <h4 class="media-heading">
                                    <small></small>
                                </h4>
                               
                            </div>
                        </div>
                        <!-- End Nested Comment 
                    </div>
                </div> -->

			</div>

			<!-- Blog Sidebar Widgets Column -->
			<div class="col-md-4">

				<!-- Blog Search Well -->
				<div class="well">
					<h4>Blog Search</h4>
					<div class="input-group">
						<input type="text" class="form-control"> <span
							class="input-group-btn">
							<button class="btn btn-default" type="button">
								<span class="glyphicon glyphicon-search"></span>
							</button>
						</span>
					</div>
					<!-- /.input-group -->
				</div>

				<!-- Blog Categories Well -->
				<div class="well">
					<h4>Blog Categories</h4>
					<div class="row">
						<div class="col-lg-6">
							<ul class="list-unstyled">
								<li><a href="/machine-learning"> Machine Learning</a></li>
								<li><a href="/illuxplain">Illuxplain Application</a>
								<li><a href="/monad">Monad</a>
							</ul>
						</div>
						<!--  <div class="col-lg-6">
                            <ul class="list-unstyled">
                                <li><a href="#">Category Name</a>
                                </li>
                                <li><a href="#">Category Name</a>
                                </li>
                                <li><a href="#">Category Name</a>
                                </li>
                                <li><a href="#">Category Name</a>
                                </li>
                            </ul>
                        </div> -->
					</div>
					<!-- /.row -->
				</div>

				<!-- Side Widget Well -->
				<div class="well">
					<h4>Quotes Wall</h4>
					<p>
						<i>Do not dwell in the past, do not dream of the future,
							concentrate the mind on the present moment.</i> <i><b>Budha</b></i>
					</p>
				</div>

			</div>

		</div>
		<!-- /.row -->

		<hr>

		<!-- Footer -->
		<footer>
			<div class="row">
				<div class="col-lg-12">
					<p>Copyright &copy; Illupxlain-2015</p>
				</div>
			</div>
			<!-- /.row -->
		</footer>

	</div>
	<!-- /.container -->

	<!-- jQuery -->
	<script src=" <c:url value="/resources/js/jquery.js"/>"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src=" <c:url value="/resources/js/bootstrap.min.js" />" ></script>

</body>

</html>
