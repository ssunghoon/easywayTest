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
<link href="${path}/css/reset.css" rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link href="${path}/css/sidebars2.css" rel="stylesheet">

<!-- 작업한 css 페이지 -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Oxanium:wght@500&display=swap"
	rel="stylesheet">

<!-- css와 아이콘 -->
<link href="${path}/css/attendance.css" rel="stylesheet">
<script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>

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
<link href="${path}/css/sidebars.css" rel="stylesheet">
</head>
<body>
	<jsp:include page="../public/sidebar.jsp" />
	<div class="wrapper">
		<div class="container-fluid">
			<div class="row">
				<div id="attendanceStatus" class="col-sm-12">
					<h4>근태 현황</h4>
					<div>
						<ul class="list-inline mx-auto">
							<li class="list-inline-item"><span>지각</span> <span>00
									회</span></li>
							<li class="list-inline-item"><span>조기퇴근</span> <span>00
									회</span></li>
							<li class="list-inline-item"><span>결근</span> <span>00
									회</span></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="row">
				<div id="workCheck" class="col-sm-6">
					<h4>근무 체크</h4>
					<div>
						<div id="clock"></div>
						<ul class="list-inline">
							<li class="list-inline-item">
								<a class="mx-auto" href="attendanceInsertAction.do">
								<i class="far fa-play-circle"></i>
								<!-- <i class="fas fa-play-circle"></i> 클릭 후-->
								</a>
								<span>출근하기</span>
							</li>
							<li class="list-inline-item">
								<a class="mx-auto" href="attendanceOutUpdateAction.do">
								<i class="far fa-pause-circle"></i>
								<!-- <i class="fas fa-pause-circle"></i> 클릭 후-->
								</a>
								<span>외근하기</span>
							</li>
							<li class="list-inline-item">
								<a class="mx-auto" href="attendanceEndUpdateAction.do">
								<i class="far fa-stop-circle"></i>
								<!-- <i class="fas fa-stop-circle"></i> 클릭 후-->
								</a>
								<span>퇴근하기</span>
							</li>
							
						</ul>
					</div>
				</div>
				<div id="workStatus" class="col-sm-6">
					<h4>근무 현황</h4>
					<div>
						<ul>
							<li id="workStart">
								<i class="far fa-clock"></i>
								<span class="time">${attendance.attendance_start}</span>
								<span>출근</span>
							</li>
							<li id="workOut">
								<i class="far fa-clock"></i>
								<span class="time">${attendance.attendance_out}</span>
								<span>외근</span>
							</li>
							<li id="workEnd">
								<i class="fas fa-clock"></i>
								<span class="time">${attendance.attendance_end}</span>
								<span>퇴근</span>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="row">
				<div id="vacationStatus" class="col-sm-12">
					<h4>휴가 현황</h4>
					<div>
						<ul class="list-inline">
							<li class="list-inline-item"><span>총 휴가</span> <span>00
									일</span></li>
							<li class="list-inline-item"><span>잔여휴가</span> <span>00
									일</span></li>
							<li class="list-inline-item align-middle">
								<button type="button" class="btn btn-md btn-primary">휴가신청</button>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="${path}/js/menu.js"></script>
<script src="${path}/js/sidebars.js"></script>
<script src="${path}/js/attendance.js"></script>
</html>