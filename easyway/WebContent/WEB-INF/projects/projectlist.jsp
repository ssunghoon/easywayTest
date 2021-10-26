<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<link href="${path}/css/reset.css" rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link href="${path}/css/project.css" rel="stylesheet">

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
	<!-- 	<div style="height: 300px; width: 200px; background: yellow; margin-left: 500px; display:none;"> -->
	<!-- 	</div> -->
	<div class="wrapper">
		<a href="projectInsertForm.do">프로젝트 생성</a>
		<table border="1">
			<tr>
				<td>프로젝트 번호&nbsp;&nbsp;</td>
				<td>프로젝트 명&nbsp;&nbsp;</td>
				<td>시작일&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>종료일&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>프로젝트 내용</td>
			</tr>
			<c:forEach var="project" items="${list }">
				<tr>
					<td>${project.project_id }</td>
					<td><a href="detailAction.do?seq=${project.project_id }">${project.project_name}</a></td>
					<td><fmt:parseDate var="dt" value="${project.project_start}"
							pattern="yyyy-MM-dd HH:mm:ss" /> <fmt:formatDate value="${dt }"
							pattern="yyyy/MM/dd" /></td>
					<td><fmt:parseDate var="de" value="${project.project_end}"
							pattern="yyyy-MM-dd HH:mm:ss" /> <fmt:formatDate value="${de }"
							pattern="yyyy/MM/dd" /></td>
					<td>${project.project_content }</td>
				</tr>
			</c:forEach>
		</table>
		<br> <br>

	</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<script src="${path}/js/sidebars.js"></script>
<script src="${path}/js/project.js"></script>

<script type="text/javascript">
	
</script>
</html>