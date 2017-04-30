<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Illuxplain - Monad</title>

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
                <p class="lead"> There are lot of Machine learning Algorithms, Donot rush out to learn all of these algorithms, you will get overwhelmed and there will be no output. </p> 
                <p> Start learning by identify the problem to be solved or you are interested in. Maintain the list of the algorithms, there types and the types of problems that solved </p>

                <p> Monoid and Monad are similar. They are the endo functor. In computer science Monoid and Monad are achieved by functional composition. In Monoid the function of any type take as an input and return sometype has an output (common functional pattern). Whereas Monad are the special case. It takes the any type of input and return the wrapper with the type of output(common functional pattern).  
					Monoid and Monad are the abstract interface that works on any type of data structure. 
					Monad in Scala are not built-in but if we use the libraries such as Scalaz, we will see there implementation of Category Theory (functors, monoid, applicative, and monad). For now we will only implement the monad.
					Monad in Cateogory Theory has two operation 'identity' and 'bind'. In Scala they call 'bind' as 'flatMap' and 'identity' as 'unit'. There are many different words for same concept. We donot have to get confused.
					First we will show the simple example of Monad implementation. </p>
					
				<pre><![CDATA[trait M[A] {
						  def flatMap[B] (f : A => M[B] ) : M[B]
						  def unit[A](x : A) : M[A]
						}]]>
				</pre>
				<p>As we can see here, We have the unit which takes an input and returns the wrapper of that type. 
				Whereas the flatMap takes an input function and return the wraper. 
				Note that the trait M is the type paramter which mean it has polymorphic behaviour. 
				It works on any type of data structure.</p>
				
				<p>Monad are very powerful concept. It is more power than Functors. 
				But whatever, why we need Monad? 
				One simple answer I found from somewhere is that it gives you the ability to chain certain operation
				without worrying about the building complexity of the system. Because as the system grows and more features
				are added the system become complex. Monad are the best way to reduce those complexities. 
				Second reason, I found the benefit of Monad is that it make the pure function language such as Haskell much 
				useful for to the operations in which we have side effects such IO operation. Therefore we now have the IO Monad. 
				There are lot of other type of Monads. 
				One more type of Monad is Option Monad, since we know that returning null and null checker are 
				billion dollar mistakes (seeTony Hoare on this topic).  </p>
				
				<p>Althoug I am not sure enough if this is a example of Monad. I am sharing one of my own implementation</p>
				
				<pre><![CDATA[class ShiftGear(s : Int) {
					  def shift(f : Int => ShiftGear) : ShiftGear = new ShiftGear(s + 1)
					  override def toString = "Changed Gear: " + s
					}]]>
				</pre>
				
				<pre><![CDATA[object Client{
						  def main(args: Array[String]): Unit = {
						    val currentState : Int = 0
						    val shiftGear = new ShiftGear(currentState)
						    val getState = (currentState : Int) => shiftGear
						    val result = shiftGear.shift(getState).shift(getState).shift(getState)
						    println(result)
						  }
						}
						//Outputs: Changed Gear: 3]]>
				</pre>

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
