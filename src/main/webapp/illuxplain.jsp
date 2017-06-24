<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="req" value="${pageContext.request}" />
<c:set var="url">${req.requestURL}</c:set>
<c:set var="base"
	value="${fn:substring(url, 0, fn:length(url) - fn:length(req.requestURI))}${req.contextPath}/" />

<!DOCTYPE html>


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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="<c:url value= "/resources/js/comment-submitter.js" />" />
</script>



<link href="<c:url value ="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<!-- Custom CSS -->
<link href="<c:url value ="/resources/css/blog-post.css" />"
	rel="stylesheet">

</head>

<body>
	<div class="container">
		<div class="navbar-header">
			<div class="col-lg-8">
				<h1>Illuxplain Android Application</h1>
				<p>This application is for illustration when the users are
					sitting remote areas. This is light weighted and instant
					messaging/drawing application.</p>
				<p>This application allow to share drawing,
					objects(pre-installed images), and share pdf pages and images</p>


				<p>This video is the quick overview of the application</p>

				<div id="video">
					<video width="650" height="600" controls>
						<source src="<c:url value="/resources/videos/final.mp4" />"
							type="video/mp4">
						<%-- <source src="<c:url value="/resources/videos/final.ogg" />" type="video/ogg">  --%>

						Your browser does not support HTML5 video.
					</video>
					<div>



						<h2>Technologies used</h2>
						<p>This application has the following technologies to achieve
							the functionality.</p>
						<ul>
							<li>XMPP Protocol</li>
							<li>Java For Android</li>
							<li>Openfire Server(XMPP Server)</li>
							<li>HTTP Server (JBoss As 7)</li>
							<li>Java WebServices</li>
							<li>JSON(For Transfering Data)</li>
							<li>MYSQL database</li>
							<li>qoppapdf for PDF support on Canvas</li>
						</ul>

						<h2>Description: Why application use these technologies</h2>
						<p>The XMPP protocol is used because we wanted the instant
							messaging functionality. What is done in this application is that
							when user is interact with the canvas. The canvas track the user
							interaction and wrap into json object and send to the connected
							users. JSON is used because application needed to handle
							different type of messages</p>
						<p>As to access database, application also had webservices
							that provide the application with extra functionality, such as
							user can create profile, set profile pictures.</p>

						<!-- Comments Form -->
						<div class="well">
							<h4>Leave a Comment:</h4>
							<form id="myForm" method="POST">
								<input class="form-control" name="nameOfCommentor"
									placeholder="name" required="required" />
								<textarea class="form-control" rows="3" name="commentText"
									required="required"></textarea>
								<input type="submit" class="btn btn-primary" value="submit" />
								<input type="hidden" value="illux-1" name="pageID" />
							</form>
						</div>
						<div class="media-body">
							<c:forEach items="${commentList}" var="comment">
								<div class="media">
									<h4 class="media-heading">
										<small>${comment.comment_name}</small>
									</h4>
									<b>Comment</b> :
									<p>${comment.comment_text}</p>
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
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
							</ul>
						</div>
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
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

</body>

</html>