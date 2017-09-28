<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="req" value="${pageContext.request}" />
<c:set var="url">${req.requestURL}</c:set>
<c:set var="base" value="${fn:substring(url, 0, fn:length(url) - fn:length(req.requestURI))}${req.contextPath}/" />
<!DOCTYPE html>
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
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Illuxplain</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="#">About</a>
                    </li>
                    <li>
                        <a href="#">Services</a>
                    </li>
                    <li>
                        <a href="/contact">Contact</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">

        <div class="navbar-header">

            <!-- Blog Post Content Column -->
            <div class="col-lg-8">

                <!-- Blog Post -->

                <!-- Title -->
                <h1>What is Monad? Why we need Monad? How it help us?</h1>
                <h2>Monad Overview</h2>
                <!-- Author -->
                <p class="lead">
                    by <a href="#">Mubeen Ahmed</a>
                </p>

                <hr>

                <!-- Date/Time -->
                <p><span class="glyphicon glyphicon-time"></span> Posted on December 30, 2015 at 10:10 PM</p>

                <hr>

                <!-- Preview Image -->
                <img class="img-responsive" src="startup.png" alt="">

                <hr>

                <!-- Post Content -->

                <p>In interviews, I am always asked the questions about OO principles, their design, and architecture and so on. I argue that OO principles (Encapsulation, Inheritance, Polymorphism, and Abstraction) are not the principles of OO. These are the techniques and concepts to program whether you write your code in Clojure, Java, JavaScript and C etc.</p>
<p>Therefore when it comes to SOLID principles, it is still not only for OO. Let&rsquo;s talk about dependencies injection from the SOLID principles&rsquo; D. <strong>What is DI?</strong></p>
<p><strong>From Wikipedia</strong></p>
<p>&ldquo;Dependency injection&nbsp;is a technique whereby <strong>one object supplies the dependencies of another object</strong>. A dependency <strong>is an object that can be used (a service).</strong> An <strong>injection is the passing of a dependency to a dependent object (a client) that would use it</strong>.&rdquo;</p>
<p>There some points from the definition:</p>
<ul>
<li>Object supplies the dependencies of another object</li>
<li>An object that can be used as a service</li>
<li>Passing of a dependencies to a dependent object.</li>
</ul>
<p>This can inferred that there should be no other class/function calling inside methods/functions scope rather the object/function should be passed to the dependent as a service to utilize.</p>
<p>What are the advantage of using DI? How to achieve it in functional programming like Clojure?</p>
<p>From my experience, DI helped me to write unit tests, for the methods/functions. What I can do here, is to mock the dependent object/service and test my logic. Moreover, I experienced deletion of features for the code much easier. I found my code very loosely coupled.</p>
<table>
<tbody>
<tr>
<td width="623">
<p>;; External services let's say getting payment detail from PayPal</p>
<p>(defn get-payment-detail [pay-key]</p>
<p>{:tax 1 :amount 199 :currency "USD" :transaction-id 12345})</p>
<p>;; Business Logic</p>
<p>(defn is-tax-payer [paypal-services pay-key]</p>
<p>(let [data (paypal-services pay-key)]</p>
<p>(get data :tax)))</p>
<p>;; Point of Integration</p>
<p>(is-tax-payer get-payment-detail 123)</p>
</td>
</tr>
</tbody>
</table>
<p>In above example, the get-payment-detail function is the services which is injected into is-tax-payer function. If there is no payment services, you can mock by giving your own function. You can remove the dependencies, and now your code is more unit testible</p>

                <hr>

                <!-- Blog Comments -->

                <div class="well">
                	<p class="comment-submitted" style="display:none">Comment Submitted Successfully!</p>
					<h4>Leave a Comment:</h4>
					<form id="myForm" method="POST">
						<input class="form-control" name="nameOfCommentor" placeholder="name" required="required"/>
						<textarea class="form-control" rows="3" name="commentText" required="required"></textarea>
						<input type="submit" class="btn btn-primary" value="submit" />
						<input type="hidden" value="cat-1" name="pageID" />
					</form>
				</div>
				<div class="media-body">
						<c:forEach items="${commentList}" var="comment">
						<div class="media">
							<h4 class="media-heading">
								<small>${comment.comment_name}</small>
							</h4>
							<b>Comment</b> :<p>${comment.comment_text}</p>
						</div>	
						</c:forEach>
				</div>

                <hr>
            </div>

            <!-- Blog Sidebar Widgets Column -->
            <div class="col-md-4">

                <!-- Blog Search Well -->
                <div class="well">
                    <h4>Blog Search</h4>
                    <div class="input-group">
                        <input type="text" class="form-control">
                        <span class="input-group-btn">
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
                                <li><a href="/machine-learning"> Machine Learning</a> 
                                </li>
                                <li><a href="/illuxplain">Illuxplain Application</a>
                            </ul>
                        </div>
                    </div>
                    <!-- /.row -->
                </div>

                <!-- Side Widget Well -->
                <div class="well">
                    <h4>Quotes Wall</h4>
                    <p><i>Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment.</i> 
                        <i><b>Budha</b></i></p>
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
