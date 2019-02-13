<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<title>Forgot Password ?</title>
<!-- Favicon-->
<link rel="icon" href="../../favicon.ico" type="image/x-icon">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet" type="text/css">

<!-- Bootstrap Core Css -->
<link href="../../plugins/bootstrap/css/bootstrap.css" rel="stylesheet">

<!-- Waves Effect Css -->
<link href="../../plugins/node-waves/waves.css" rel="stylesheet" />

<!-- Animation Css -->
<link href="../../plugins/animate-css/animate.css" rel="stylesheet" />

<!-- Custom Css -->
<link href="dashAssets/css/style.css" rel="stylesheet">
<!-- <link href="../../css/style.css" rel="stylesheet"> -->
</head>
<!-- class="fp-page" -->
<body
	style="background-image: url(dashAssets/images/Grocery7.jpg); background-repeat: no-repeat; background-size: cover;"
	class="login-page">
	<!-- <div class="fp-box"> -->
	<div class="login-box">
		<div class="card1">
			<div class="body">
				<form id="forgot_password" method="POST"
					action="resetPasswordEmail">
					<div class="msg">Forget Password?</div>
					<div class="msg1">Enter your email address that you used to
						register. We'll send you an email with your username and a link to
						reset your password.</div>

					<div class="input-group">
						<div>
							<span class="input-group-addon"> <i class="material-icons">email</i>
							</span>
						</div>
						<div>
							<input type="email" class="form-control" name="email"
								placeholder="Email" required autofocus>
						</div>
					</div>

					<!-- <div>
						<span class="input-group-addon">  <i class="material-icons">email</i>
						<input type="email" name="email"
								placeholder="Email" required autofocus>
						 </span> 	
					
					 </div>
 -->
					<div class="row">
						<div class="col-xs-12" align="center">
							<button class="btn btn-block bg-pink waves-effect" type="submit">RESET
								PASSWORD</button>
						</div>
					</div>
					<!-- <div class="row">
						<div class="row m-t-20 m-b--5 align-center">
							<a href="/ctrlaihub/">Sign In!</a>
						</div>
					</div> -->
				</form>
				
			</div>
		</div>
		<div style="margin: 30px;">${msg}</div>
	</div>

	<!-- Jquery Core Js -->
	<script src="../../plugins/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core Js -->
	<script src="../../plugins/bootstrap/js/bootstrap.js"></script>

	<!-- Waves Effect Plugin Js -->
	<script src="../../plugins/node-waves/waves.js"></script>

	<!-- Validation Plugin Js -->
	<script src="../../plugins/jquery-validation/jquery.validate.js"></script>

	<!-- Custom Js -->
	<script src="../../js/admin.js"></script>
	<script src="../../js/pages/examples/forgot-password.js"></script>
</body>
</html>