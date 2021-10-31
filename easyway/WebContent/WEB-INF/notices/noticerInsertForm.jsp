<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
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
<link href="./css/reset.css" rel="stylesheet">
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
<link href="${path }/css/reset.css" rel="stylesheet">
<link href="${path }/css/sidebars.css" rel="stylesheet">
</head>
<body>
	<div class="container">

	</div>
	<jsp:include page="../public/sidebar.jsp" />

	<div class="container">
		<div class="row">
			<form method="post" action="noticeInsertAction.do">
				<table class="table_table-striped"
					style="text-align: center; border: 1px solid #dddddd">
					<thead>
						<tr>
							<th
								style="background-color: #eeeeee; text-align: center; width: 100%;">글쓰기
							</th>
						</tr>
					</thead>
					<tbody>
					
						<tr>
							<td><input type="text" class="form-control"
								placeholder="사원번호" name="employee_id"></td>
						</tr>
						<tr>
							<td><input type="text" class="form-control"
								placeholder="글제목" name="ob_title"></td>
						</tr>
						<tr>
							<td><textarea class="form-control" placeholder="글내용"
									name="ob_content"></textarea></td>
						</tr>
						<tr>
							<td><input type="text" class="form-control"
								placeholder="파일첨부" name="ob_file_path"></td>
						</tr>
						<tr>
							<td><input type="text" class="form-control"
								placeholder="날짜" name="ob_date"></td>
						</tr>
							<tr>
							<td><input type="text" class="form-control"
								placeholder="부서번호" name="department_id"></td>
						</tr>


					</tbody>
				</table>
				<input type="submit" class="btn btn-primary pull-right"
					value="글쓰기버튼"></a>
			</form>
		</div>
	</div>
</body>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="${path}/js/menu.js"></script>
<script src="./js/sidebars.js"></script>
</html>