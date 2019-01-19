<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<!-- Favicon-->
    <link rel="icon" href="dashAssets/favicon.ico" type="image/x-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" type="text/css">

    <!-- Bootstrap Core Css -->
    <link href="dashAssets/plugins/bootstrap/css/bootstrap.css" rel="stylesheet">

    <!-- Waves Effect Css -->
    <link href="dashAssets/plugins/node-waves/waves.css" rel="stylesheet" />

    <!-- Animation Css -->
    <link href="dashAssets/plugins/animate-css/animate.css" rel="stylesheet" />

    <!-- Custom Css -->
    <link href="dashAssets/css/style.css" rel="stylesheet">

</head>
<body style="background-image:url(dashAssets/images/Grocery-Image3.jpg); background-repeat: no-repeat; height: 400px; background-size: 100% 125%" class="login-page">
<!-- <body class="login-page">
 -->    <div class="login-box">
         <div class="logo" align="center">
            <h1><b><font color="#F81894"><br>LOGIN</font></b></h1>
        </div>  
        <div class="card">
            <div class="body">
                <form id="sign_in" method="POST" action = "login1">
                    <div class="msg">Sign in to continue</div>
                    <div class="input-group">
                        <span class="input-group-addon">
                            <i class="material-icons">person</i>
                        </span>
                        <div class="form-line">
                            <input type="text" class="form-control" name="username" placeholder="Username" required autofocus>
                        </div>
                    </div>
                    <div class="input-group">
                        <span class="input-group-addon">
                            <i class="material-icons">lock</i>
                        </span>
                        <div class="form-line">
                            <input type="password" class="form-control" name="password" placeholder="Password" required>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-xs-8 p-t-5">
                            <input type="checkbox" name="rememberme" id="rememberme" class="filled-in chk-col-pink">
                            <label for="rememberme">Remember Me</label>
                        </div>
                        <div class="col-xs-4">
                            <button class="btn btn-block bg-pink waves-effect" type="submit">SIGN IN</button>
                        </div>
                    </div>
                    <div class="row m-t-15 m-b--20">
                        <div class="col-xs-6 align-right">
                            <a href="forgot-password.html">Forgot Password?</a>
                        </div>
                    </div>
                </form>
            </div>
        </div>    
    </div>
	        	<div><h3><b><font color="red">${message}</font></b></h3></div>
     
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
    <div style="margin-top: 148px"><font color = "white">© 2019  <strong>Developed and maintained by</font> <a href="http://www.ctrlaihub.com" target="_blank"><img src="dashAssets/images/hema logo.png" alt="Smiley face" height="32" width="32"> <font color="000050
"
    >Ctrl</font><font color="#006400">AiHub</font></strong></a></div></body>     	</html>