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
		<div class="sign">
			<h4>휴가 신청서</h4>
			<form action="insertVacationAction.do" method="post" accept-charset="utf-8">
				제목 : <input type="text" name="sv_title"><br>
				휴가종류 : <input type="radio" name="sv_type" id="first" value="연차"><label for="first">연차</label>
						<input type="radio" name="sv_type" id="second" value="반차"><label for="second">반차</label>
						<input type="radio" name="sv_type" id="third" value="포상"><label for="third">포상</label>
						<input type="radio" name="sv_type" id="fourth" value="경조사"><label for="fourth">경조사</label><br>
				휴가 시작일 : <input type="date" name="sv_start"><br>
				휴가 종료일 : <input type="date" name="sv_end"><br>
				사유 <br>
				<textarea rows="6" cols="70" name="sv_reason"></textarea>
				<br>
				<input type="submit" value="등록">
			</form>
		</div>
	</div>
</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="${path}/js/menu.js"></script>
<script src="./js/sidebars.js"></script>
</html>