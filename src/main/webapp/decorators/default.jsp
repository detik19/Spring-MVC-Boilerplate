<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
 <title><sitemesh:write property='Spring MVC Boilerplate'/></title>
<!--  <link href="/resources/css/bootstrap.min.css" rel="stylesheet"> -->
<%--   <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"> --%>
 	<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapcss" />
 	<link href="${bootstrapcss}" rel="stylesheet" />
 
 <!-- Custom CSS -->
<style>
body {
	padding-top: 70px;
	/* Required padding for .navbar-fixed-top. Remove if using .navbar-static-top. Change if height of navigation changes. */
}
</style>
 <sitemesh:write property='head'/>
 
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
				<a class="navbar-brand" href="#">Start Bootstrap</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="#">About</a></li>
					<li><a href="#">Services</a></li>
					<li><a href="#">Contact</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>

 <sitemesh:write property='body'/>
 	  <!-- /.container -->

    <!-- jQuery Version 1.11.1 -->
   <spring:url value="/resources/js/jquery.js" var="jqueryJs" />
    
    <script src="${jqueryJs}"></script>

    <!-- Bootstrap Core JavaScript -->
    <spring:url value="/resources/js/bootstrap.min.js" var="bootstrapjs" />
    <script src="${bootstrapjs}"></script>
 </body>
</html>