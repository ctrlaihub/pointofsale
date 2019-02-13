<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- Favicon -->
<link rel="icon" href="dashAssets/favicon.ico" type="image/x-icon">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet" type="text/css">

<!-- Bootstrap Core Css -->
<link href="dashAssets/plugins/bootstrap/css/bootstrap.css"
	rel="stylesheet">

<!-- Waves Effect Css -->
<link href="dashAssets/plugins/node-waves/waves.css" rel="stylesheet" />

<!-- Animation Css -->
<link href="dashAssets/plugins/animate-css/animate.css" rel="stylesheet" />

<!-- Custom Css -->
<link href="dashAssets/css/style.css" rel="stylesheet">
<!-- height: 400px; background-size: 100% 150% -->
<!-- class="login-page -->
<!-- style="background-image:url(dashAssets/images/Grocery7.jpg); background-repeat: no-repeat; background-size: 100% 125%" -->
</head>
<body
	style="background-image: url(dashAssets/images/Grocery7.jpg); background-repeat: no-repeat; background-size: cover;"
	class="login-page">
	<div class="login-box">
		<!-- <div class="logo" align="center">
				<h1>
					<b><font color="#FFFFFF"><br>LOGIN</font></b>
				</h1>
			</div> -->
		<div class="card1">
			<div class="body">
				<form id="sign_in" method="POST" action="resetPassword1">
				<input type = "hidden" name="email" value="${email}">
					<div class="msg">Reset Password</div>
					<div class="input-group">
						<div class="form-line">
							<input type="password" class="form-control" name="oldPass"
								placeholder="New Password" required autofocus>
						</div>
					</div>
					<div class="input-group">
						<div class="form-line">
							<input type="password" class="form-control" name="newPass"
								placeholder="Confirm New Password" required>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-12">
							<button class="btn btn-block bg-pink waves-effect" type="submit">
								Reset</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- Jquery Core Js -->
	<script src="dashAssets/plugins/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core Js -->
	<script src="dashAssets/plugins/bootstrap/js/bootstrap.js"></script>

	<!-- Waves Effect Plugin Js -->
	<script src="dashAssets/plugins/node-waves/waves.js"></script>

	<!-- Validation Plugin Js -->
	<script src="dashAssets/plugins/jquery-validation/jquery.validate.js"></script>

	<!-- Custom Js -->
	<script src="dashAssets/js/admin.js"></script>
	<script src="dashAssets/js/pages/examples/sign-in.js"></script>
	<!-- class = "pull-left" -->
</body>
<!-- margin-top: 70px; -->
</html>