<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<h1 class="text-center">Create a New User</h1>
<hr>
<div class="container">
	<div class="panel panel-default">
		<div class="panel-heading">
			<h3 class="panel-title">Enter user details here..</h3>
		</div>
		<div class="panel-body">

			<form:form action="new.html" method="post" modelAttribute="user">
				<div class="form-group">
						<label for="txtName">Full Name</label> 
						<form:input path="name" 
							class="form-control" id="txtName" placeholder="Full Name"/>
					</div>
					<div class="form-group">
						<label for="txtPassword">Password</label> 
						<form:input path="password" type="password"
							class="form-control" id="txtPassword" placeholder="Password"/>
					</div>
					
					<button type="submit" class="btn btn-success">Save</button>
			</form:form>
		</div>
	</div>

</div>