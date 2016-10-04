<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Illuxplain - About Machine Learning Algorithms</title>

    <script src="<c:url value = "/resources/js/bootstrap.js" />"></script>
	<script src="<c:url value = "/resources/js/bootstrap.min.js" />"></script>
	<script src="<c:url value = "/resources/js/jquery.js" />"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="<c:url value= "/resources/js/comment-submitter.js" />" /> </script>
	
<%-- 	<link href="<c:url value ="/resources/css/bootstrap.min.css" />" rel="stylesheet">
	<!-- Custom CSS -->
	<link href="<c:url value ="/resources/css/blog-post.css" />" rel="stylesheet"> --%>

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
                        <a href="#">Contact</a>
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
                <h1>Article is incomplete, These articles on machine learning algorithms will be comming soon</h1>
                <h2>About Some Machine Learning Algorithms Overview</h2>
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
                <p class="lead"> There are lot of Machine learning Algorithms, Donot rush out to learn all of these algorithms, you will get overwhelmed and there will be no output. </p> 
                <p> Start learning by identify the problem to be solved or you are interested in. Maintain the list of the algorithms, there types and the types of problems that solved </p>

                <h3>Type of Machine Learning</h3>
                <ul> 
                <li>   Supervised Learning</li>
                <li>    UnSupervised Learning</li>
                <li>    Reinforcement Learning</li>

                </ul>

                <p> <b>Regression Algorithms </b> is the supervised learning algorithms. It is based on statistic. Regression is used to model the relationship between the variables and iteratively refined using a measure of error in the predication made by the model. </p>
                <p> <b>Instance based algorithm </b>are kind of lazy learning algorithm. This algorithm made predication by building up the database of example data and compare new data to the database using the similar measure and finding the best match. k-nearest neighbor, kernel machines and RBF networks are the sub set of this algorithm. </p>
                <p> <b>Decision Tree Algorithms </b>is the tree based model or graph. It is used to specifically decision analysis, to help identify a strategy to reach the goal. Decision tree are fast and accurate. </p>
                <p> <b>Bayesian Algorithms </b>is the subset of the field of statistics.</p>
                <p> <b>Clustering algorithms </b>define collection of the group of data that worked together as a similar unit or system. Types of clustering algorithms are k-means, k-medians, EM and hierarchical clustering.</p>
                <p> <b>Association Rule Learning </b>Algorithms are that extracts the rule that best explains observed relationships between variables in data. </p>
                <p> <b>Artificial Neural Network </b>is the inspiration of the biological neural network's functional and behavior. There are a class of method that are concerning with the pattern matching. There are hundreds of algorithms based on this for solving different types of problems. Neural network is very deep.</p>
                <p> <b>Conclusion </b>
                There are a lot of algorithms for machine learning. The best way to learn machine learning is not start learning the algorithms. The best way to learn machine learning is to find the problem you are interested to solve or you want to solve. Select the problem and Google search to find out the solution by the algorithm of machine learning. Machine learning is very huge subject. The best way is to set the focus on what you want.</p>



<p><b>Watch Illuxplain Application <a href="/illuxplain" > Demo</a></p>
                <hr>

                <!-- Blog Comments -->

                <div class="well">
					<h4>Leave a Comment:</h4>
					<form id="myForm" method="POST">
						<input class="form-control" name="nameOfCommentor" placeholder="name" required="required"/>
						<textarea class="form-control" rows="3" name="commentText" required="required"></textarea>
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
							<b>Comment</b> :<p>${comment.comment_text}</p>
						</div>	
						</c:forEach>
				</div>

                <hr>

                <!-- Posted Comments -->

                <!-- Comment 
                <div class="media">
                    <a class="pull-left" href="#">
                        <img class="media-object" src="http://placehold.it/64x64" alt="">
                    </a>
                    <div class="media-body">
                        <h4 class="media-heading">
                            <small</small>
                        </h4>
                       
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
