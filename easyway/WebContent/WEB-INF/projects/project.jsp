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
		<!-- Button trigger modal -->
		<button type="button" class="btn btn-primary" data-bs-toggle="modal"
			data-bs-target="#staticBackdrop">프로젝트 생성</button>

		<!-- Modal -->
		<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static"
			data-bs-keyboard="false" tabindex="-1"
			aria-labelledby="staticBackdropLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<form action="projectInsertAction.do" method="post">
						<div class="modal-header">
							<h5 class="modal-title" id="staticBackdropLabel">Modal title</h5>
							<button type="button" class="btn-close" data-bs-dismiss="modal"
								aria-label="Close"></button>
						</div>
						<div class="modal-body">
							<div>
								프로젝트 이름 : <input type="text" name="project_name"><br>
								시작일 : <input type="date" name="project_start"><br>
								종료일 : <input type="date" name="project_end"><br>
								프로젝트 설명 <br>
								<textarea rows="6" cols="70" name="project_content"></textarea>
								<br>
								<!-- 								<input type="submit" class="btn btn-primary mb-3" -->
								<!-- 									value="등록"> -->
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-bs-dismiss="modal">취소</button>
							<input type="submit" class="btn btn-primary" value="등록">
							<!-- 							<button type="button" class="btn btn-primary">생성</button> -->
						</div>
					</form>
				</div>
			</div>
		</div>


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