<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>


<head>
<title>Illuxplain Android Application</title>
</head>

<body>

	<h1>Illuxplain Android Application</h1>
	<p>This application is for illustration when the users are sitting
		remote areas. This is light weighted and instant messaging/drawing
		application.</p>
	<p>This application allow to share drawing, objects(pre-installed
		images), and share pdf pages and images</p>


	<p>This video is the quick overview of the application</p>

	<div id="video">
		<video width="650" height="600" controls>
			<source src="<c:url value="/resources/videos/final.mp4" />" type="video/mp4">
			<%-- <source src="<c:url value="/resources/videos/final.ogg" />" type="video/ogg">  --%>
			
			Your browser does not support HTML5 video.
		</video>
		<div>



			<h2>Technologies used</h2>
			<p>This application has the following technologies to achieve the
				functionality.</p>
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
				users. JSON is used because application needed to handle different
				type of messages</p>
			<p>As to access database, application also had webservices that
				provide the application with extra functionality, such as user can
				create profile, set profile pictures.</p>
</body>
</html>