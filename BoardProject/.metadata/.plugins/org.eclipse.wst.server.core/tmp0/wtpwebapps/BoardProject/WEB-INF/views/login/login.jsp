<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>로그인</title>
<!-- Bootstrap Core CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="resources/css/mainboard.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- Custom CSS -->
<link href="resources/css/postodo.css" rel="stylesheet">

<script type="text/javascript">
$(document).ready(function() {
	$('#loginButton').click(function() {
		login();
	}); 
	
	function login() {
		var formData = $('#formLogin').serialize();
		$.ajax({
			url : "doLogin.do"
			, type : 'POST'
			, contentType : 'application/x-www-form-urlencoded; charset=UTF-8'
			, context : this
			, data : formData
			, dataType : 'json'
			, beforeSend : function() {
				$('.wrap-loading').removeClass('display-none');
			}
			, success : function(data) {
				var result = data.loginResult;
				console.dir(data);
				console.log(result);
				if (result == 1) {
					alert("로그인 성공");	
					window.location.href = "board/callFreeboard.html";
				} else {
					alert("로그인 실패");
				}
				
			}
			, complete : function() {
				$('.wrap-loading').addClass('display-none');
			}
			, error : function() {
				$('.wrap-loading').addClass('display-none');
				alert('오류가 발생했습니다.');
			}
		});
	}
});
</script>

</head>
<body class="loginBody">

<!-- middle page//S -->
<div class="container-full middlePageLogin">
	<div class="wrap-loading display-none"><div><img src="resources/image/ajax_loading.gif" /></div></div>
	<!-- page header//S -->
	<div class="page-header">
		<h1 class="logoLogin">Postodo <small>환영합니다!</small>&nbsp;&nbsp;<!-- <a href="../homepage/homepage.html" style="font-size: 12px; color: white;">홈페이지 구경하실래요?</a> --></h1>
	</div>
	<!-- page header//E -->
	
	<!-- panel//S -->
	<div class="panel panel-info">
		<div class="panel-heading">
			<h3 class="panel-title">로그인하세요.</h3>
		</div>
		
		<!-- panel body//S -->
		<div class="panel-body">
			<div class="row">
				<!-- col//S -->
				<!-- <div class="col-md-5">
					<a href="#"><img src="http://techulus.com/buttons/fb.png" /></a><br/>
					<a href="#"><img src="http://techulus.com/buttons/tw.png"/></a><br/>
					<a href="#"><img src="http://techulus.com/buttons/gplus.png"/></a>
				</div> -->
				<!-- col//E -->
				
				<!-- col-md-7//S -->
				<div class="col-md-10" style="border-left:1px solid #ccc; height:160px;">
					<form id="formLogin" class="form-horizontal" method="post">
						<fieldset>
							<input id="textinput" name="userId" type="text" placeholder="사용자 ID를 입력하세요." class="form-control input-md" value="superadmin">
							<div class="spacingLogin"><input type="checkbox" name="checkboxes" id="checkboxes-0" value="1"><small>ID 기억하기</small></div>
							<input id="textinput" name="userPassword" type="password" placeholder="사용자 비밀번호를 입력하세요." class="form-control input-md" value="1234">
							<div class="spacingLogin"><a href="#"><small>비밀번호를 잊어버리셨나요?</small></a><br/><a href="#"><small>처음이신가요?</small></a></div>							
						</fieldset>
					</form>
				</div>
				<!-- col-md-7//E -->
				
				<!-- col//S -->
				<div class="col-md-2">
					<button id="loginButton" name="loginButton" class="btn btn-info btn-bg">로그인</button>
				</div>
				<!-- col//E -->
				
			</div>
		</div>
		<!-- panel body//E -->
		
	</div>
	<!-- panel//E -->
	<p class="pLogin"><a href="#">About</a> AACII</p>
</div>
<!-- middle page//E -->

</body>
</html>   