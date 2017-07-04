<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="req" value="${pageContext.request}" />
<c:set var="url">${req.requestURL}</c:set>
<c:set var="base" value="${fn:substring(url, 0, fn:length(url) - fn:length(req.requestURI))}${req.contextPath}/" />
<html>
	<head>
		<title>Illuxplain - Contact Us</title>
		<link href="<c:url value ="/resources/css/style.css" />" rel="stylesheet">
	</head>
	<body>
		<div class="container">  
		  <form id="contact" action='${base}submit_contact' method="post">
		    <p style="color:green;">${success}</p>
			<h3>Contact Me</h3>
			<fieldset>
			  <input placeholder="Your name" type="text" name="name" tabindex="1" required autofocus>
			</fieldset>
			<fieldset>
			  <input placeholder="Your Email Address" type="email" name="email" tabindex="2" required>
			</fieldset>
			<fieldset>
			  <textarea placeholder="Type your message here...." tabindex="5" name="message" required></textarea>
			</fieldset>
			<fieldset>
			  <button name="submit" type="submit" id="contact-submit" data-submit="...Sending">Submit</button>
			</fieldset>
		  </form>
		</div>
	</bodY>
</html>
