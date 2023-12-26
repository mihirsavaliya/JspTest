<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Hospital</title>
</head>
<body>
	<form action="/addhospital" method="post">
		<table border="3">
			<tr>
				<td>Hospital_id</td>
				<td>
				<input type="number" name="hId"/>
				</td>
			</tr>
			<tr>
				<td>Hospital_Name</td>
				<td>
				<input type="text" name="name">
				</td>
			</tr>
			<tr>
				<td>Hospital_City</td>
				<td>
				<input type="text" name="city">
				</td>
			</tr>
			<tr>
				<td>Number_Of_Doctor</td>
				<td>
				<input type="number" name="numDoctor">
				</td>
			</tr>
			<tr>
				<td>Hospital_Speciality</td>
				<td>
				<input type="text" name="speciality">
				</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align:center">
					<input type="submit" value="Submit">
				</td>	
			</tr>
		</table>
	</form>
</body>
</html> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:400,700">
<title>Bootstrap Simple Registration Form</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<style>
body {
	color: #fff;
	background: #63738a;
	font-family: 'Roboto', sans-serif;
}
.form-control {
	height: 40px;
	box-shadow: none;
	color: #969fa4;
}
.form-control:focus {
	border-color: #5cb85c;
}
.form-control, .btn {        
	border-radius: 3px;
}
.signup-form {
	width: 450px;
	margin: 0 auto;
	padding: 30px 0;
  	font-size: 15px;
}
.signup-form h2 {
	color: #636363;
	margin: 0 0 15px;
	position: relative;
	text-align: center;
}
.signup-form h2:before, .signup-form h2:after {
	content: "";
	height: 2px;
	width: 30%;
	background: #d4d4d4;
	position: absolute;
	top: 50%;
	z-index: 2;
}	
.signup-form h2:before {
	left: 0;
}
.signup-form h2:after {
	right: 0;
}
.signup-form .hint-text {
	color: #999;
	margin-bottom: 30px;
	text-align: center;
}
.signup-form form {
	color: #999;
	border-radius: 3px;
	margin-bottom: 15px;
	background: #f2f3f7;
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	padding: 30px;
}
.signup-form .form-group {
	margin-bottom: 20px;
}
.signup-form input[type="checkbox"] {
	margin-top: 3px;
}
.signup-form .btn {        
	font-size: 16px;
	font-weight: bold;		
	min-width: 140px;
	outline: none !important;
}
.signup-form .row div:first-child {
	padding-right: 10px;
}
.signup-form .row div:last-child {
	padding-left: 10px;
}    	
.signup-form a {
	color: #fff;
	text-decoration: underline;
}
.signup-form a:hover {
	text-decoration: none;
}
.signup-form form a {
	color: #5cb85c;
	text-decoration: none;
}	
.signup-form form a:hover {
	text-decoration: underline;
}  
</style>
</head>
<body>
<div class="signup-form">
    <form action="/addhospital" method="post">
		<h1><center>Add New Hospital</center></h1>
		
        <div class="form-group">
        	<input type="number" class="form-control" name="hId" placeholder="Hospital_Id" required="required">
        </div>
		<div class="form-group">
            <input type="text" class="form-control" name="name" placeholder="Hospital Name" required="required">
        </div>
		<div class="form-group">
            <input type="text" class="form-control" name="city" placeholder="City" required="required">
        </div> 
        <div class="form-group">
            <input type="number" class="form-control" name="numDoctor" placeholder="Number of Doctor" required="required">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="speciality" placeholder="Speciality" required="required">
        </div>       
        
		<div class="form-group">
            <button type="submit" class="btn btn-success btn-lg btn-block">Add</button>
        </div>
    </form>
</div>
</body>
</html>