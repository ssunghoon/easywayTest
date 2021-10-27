<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!doctype html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

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
<div name="wrap"></div>
<link href="./css/reset.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<header
			class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
			<a href="/"
				class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
				<svg class="bi me-2" width="40" height="32">
					<use xlink:href="#bootstrap"></use></svg> <span class="fs-4">Simple
					header</span>
			</a>
			<ul class="nav nav-pills">
				<li class="nav-item"><a href="#" class="nav-link active"
					aria-current="page">Home</a></li>
				<li class="nav-item"><a href="#" class="nav-link">Features</a></li>

			</ul>
		</header>
	</div>
<body>
	<jsp:include page="../public/sidebar.jsp" />


	<div class="container">
		<div class="row">
			<a href="noticeInsertForm.do" class="btn btn-primary pull-right">글쓰기버튼</a>
		
			<table class="table_table-striped"
				style="text-align: center; border: 1px solid #dddddd">

				<tr>
					<th style="background-color: #eeeeee; text-align: center;">글번호
			
							<th style="background-color: #eeeeee; text-align: center;">사원번호
						</th>
					<th style="background-color: #eeeeee; text-align: center;">글제목
						</th>
					<th style="background-color: #eeeeee; text-align: center;">글내용
						</th>
					<th style="background-color: #eeeeee; text-align: center;">파일첨부
						</th>
					<th style="background-color: #eeeeee; text-align: center;">게시판종류
				 </th>
			

				 
				 
				</tr>
				
			
				 <c:forEach var="of_board" items="${list }">
						<tr>
							<td>${of_board.ob_id }</td>
							<td>${of_board.employee_id }</td>
						<td>${of_board.ob_title  }</td>
							<td>${ of_board.ob_content}</td>
							<td>${of_board.ob_file_path }</td>
							<td>${of_board.ob_type }</td>

						</tr>
				</c:forEach> 
		
			</table>
		
	<form action="listAction.do" method="post">
		<input type="checkbox" name="area" value="ob_title">제목 <input
						type="checkbox" name="area" value="employee_id">작성자 <input
						type="text" name="searchKey" size="10"> <input
						type="submit" value="검색">
	</form>
		
		</div>
	</div>
</body>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<script src="./js/sidebars.js"></script>
</html>