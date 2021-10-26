<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.88.1">
<title>편하게 오피스 작업을! EasyWay!</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.1/examples/sign-in/">

<!-- Bootstrap core CSS -->
<link href="${path}/css/bootstrap.min.css" rel="stylesheet">

<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>

<link href="${path}/css/log_in.css" rel="stylesheet">
</head>
<body class="text-center">

	<main class="form-signin">
	
	<form>
		<h1 class="h3 mb-3 fw-normal">Easyway Log-in</h1>

		<div class="form-floating">
			<input type="email" class="form-control" id="floatingInput"
				name="member_email" placeholder="name@example.com">
			<label	for="floatingInput">Email address</label>
		</div>
		<div class="form-floating">
			<input type="password" class="form-control" id="floatingPassword"
				name="member_pw" placeholder="Password">
			<label	for="floatingPassword">Password</label>
		</div>
		<button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
	</form>

	<div id="register">
		<span>아직 회원이 아니신가요? </span>
		<a href="">회원가입</a>
	</div>
	
	</main>
	
</body>
</html>