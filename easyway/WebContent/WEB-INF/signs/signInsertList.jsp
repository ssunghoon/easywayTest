<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
	
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.84.0">
<title>편하게 오피스 작업을! EasyWay!</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.0/examples/sidebars/">


<!-- Bootstrap core CSS -->
<link href="${path }/css/reset.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<!-- css -->
<link href="${path}/css/sign.css" rel="stylesheet">
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


<!-- Custom styles for this template -->
<link href="${path }/css/sidebars.css" rel="stylesheet">
</head>
<body>
<jsp:include page="../public/sidebar.jsp" />

	<div id="wrap">
		<div class="btn-group btn-group-lg col-lg-11" style="margin:50px">
		  <button type="button" class="btn btn-primary" onclick="location.href='signInsertListAction.do?sign_id=${sign.sign_id}'">기안작성</button>
		  <button type="button" class="btn btn-primary" onclick="location.href='draftListAction.do'">기안함</button>
		  <button type="button" class="btn btn-primary">결재함</button>
		</div>
		<div id="middleBox">
			<button class="btn btnGray" onclick="location.href='insertBasicForm.do?sf_id=1'" >기본기안서</button>
			<button class="btn btnGray" onclick="location.href='insertSpendForm.do?sf_id=2'" >지출결의서</button>
			<button class="btn btnGray" onclick="location.href='insertVacationForm.do?sf_id=3'" >휴가신청서</button>
		</div>
	</div>
</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="${path}/js/menu.js"></script>
<script src="./js/sidebars.js"></script>
</html>