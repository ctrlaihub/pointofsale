<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Insert title here</title>

<!-- Added by Vasanthi for responsive Design -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- Added by Vasanthi for responsive Design -->

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

<script type="text/javascript">
	$(document).ready(function() {
		var remember_me_is_checked;
		$('#sign_in :checkbox').change(function() {
			// this will contain a reference to the checkbox   
			if (this.checked){
				alert("Iam here11");
				remember_me_is_checked = "true";
			    document.location.href ="../shared/login1.jsp?rememberme=" + remember_me_is_checked; 
			}
			else{
				alert("Iam here22");
				remember_me_is_checked = "false";
				document.location.href ="../shared/login1.jsp?rememberme=" + remember_me_is_checked;
			}
		});
	});
</script>
<%
String rem;
try{ 
	rem=(request.getParameter("rememberme")); 
	System.out.println("Rem ------>" + rem);
	/* out.print("start---------------------->"+rem);  */
} 
catch(Exception e) 
{ 
	e.printStackTrace(); 
}
%>
</head>
<body
	style="background-image: url(dashAssets/images/Grocery7.jpg); background-repeat: no-repeat; background-size: cover;"
	class="login-page">
	<!-- <div class="container"> -->
	<div class="login-box">
		<!-- <div class="logo" align="center">
				<h1>
					<b><font color="#FFFFFF"><br>LOGIN</font></b>
				</h1>
			</div> -->
		<div class="card1">
			<div class="body">
				<form id="sign_in" method="POST" action="login1">
					<div class="msg">LOGIN</div>
					<div class="input-group">
						<span class="input-group-addon"> <i class="material-icons">person</i>
						</span>
						<div class="form-line">
							<input type="text" class="form-control" name="username"
								placeholder="Username" required autofocus>
						</div>
					</div>
					<div class="input-group">
						<span class="input-group-addon"> <i class="material-icons">lock</i>
						</span>
						<div class="form-line">
							<input type="password" class="form-control" name="password"
								placeholder="Password" required>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-6 p-t-5">
							<input type="checkbox" id="rememberme" value = "true"
								class="filled-in chk-col-pink"> <label for="rememberme">Remember
								Me11</label>
						</div>
						<!-- class="filled-in chk-col-pink" -->
						<div class="col-xs-6 p-t-5">
							<a href="/ctrlaihub/forgot-password">Forgot Password?</a>
						</div>
					</div>
					<!-- m-t-15 m-b--20 -->
					<div class="row">
						<div class="col-xs-12">
							<button class="btn btn-block bg-pink waves-effect" type="submit">SIGN
								IN</button>
						</div>
					</div>
				</form>
			</div>
		</div>
		<div style="margin: 30px;">${message}</div>
	</div>

	<!-- <div style="margin-top: 148px">
		<font color="white">© 2019 <strong>Developed and
				maintained by</font> <a href="http://www.ctrlaihub.com" target="_blank"><img
			src="dashAssets/images/hema logo.png" alt="Smiley face" height="32"
			width="32"> <font color="000050">Ctrl</font><font
			color="#006400">AiHub</font></strong></a>
	</div> -->
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
	<div style="position: absolute; margin: 30px; width: 100%; bottom: 0">
		<font color="white">© 2019 <strong>Developed and
				maintained by</font> <a href="http://www.ctrlaihub.com" target="_blank"><img
			src="dashAssets/images/hema logo.png" alt="Smiley face" height="32"
			width="32"> <font color="000050">Ctrl</font><font
			color="#006400">AiHub</font></strong></a>
	</div>
</body>
<!-- margin-top: 70px; -->
</html>