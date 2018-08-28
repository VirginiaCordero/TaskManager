<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="css/bootstrap.min.css" rel="stylesheet">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
	<a href="/">Go back to main site</a>
	<p>Create a new account</p>
	<div class="form-group">
		<form action="????" method="post">
			<label for="email">Email address:</label> <input type="email"
				class="form-control" id="email" name="email" required> 
				<label for="pwd">Password:</label> <input type="password"
				class="form-control" id="pwd" name="password"
				pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
				title="Must contain at least one number and one uppercase and lowercase letter,
				and at least 8 or more characters"
				required>
				<span class="validity"></span>
			<div class="checkbox">
				<label><input type="checkbox"> Remember me</label>
			</div>
			<input type="hidden" name="offersandpromos" value="false" /> I want
			to receive offers and promotions.
			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>