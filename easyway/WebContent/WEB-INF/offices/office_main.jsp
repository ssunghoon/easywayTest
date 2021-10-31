<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${path}/css/reset.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="${path}/slick/slick.css" />
<link rel="stylesheet" type="text/css" href="${path}/slick/slick-theme.css" />

</head>
<body>
	<c:if test="${insertResult != null }">
		<c:choose>
			<c:when test="${insertResult > 0}">
				<script type="text/javascript">
					alert("오피스 등록 성공!");
				</script>
			</c:when>
			<c:otherwise>
				<script type="text/javascript">
					alert("오피스 등록 실패!");
				</script>
			</c:otherwise>
		</c:choose>
	</c:if>
	<div style="padding: 300px; h: 200px; background-color: #0D6EFD;">
		<h1 style="color: white;">나의 오피스 리스트</h1>
		<div class="responsive">
			<c:forEach var="officeCard" items="${listOffice}">
				<div class="card" style="width: 200px; margin: 10px">
					<div class="card-body">
						<h4 class="card-title">${officeCard.office_name}</h4>
						<p class="card-text">${officeCard.office_name}입니다.</p>
						<a href="/easyway/main/mainAction.do" class="btn btn-primary">입장하기</a>
					</div>
				</div>
			</c:forEach>
			
		</div>
		<button type="button" class="btn btn-primary" data-bs-toggle="modal"
			data-bs-target="#officeCreateModal">오피스 생성
			<i class="fas fa-plus-circle"></i>
		</button>
	</div>


	<div class="modal fade" id="officeCreateModal" tabindex="-1" aria-labelledby="exampleModalLabel"
		aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">새 오피스 생성</h5>
					<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
				</div>
				<div class="modal-body">
					<form action="officeInsertAction.do" method="post" accept-charset="utf-8">
						<div class="mb-3">
							<label for="recipient-name" class="col-form-label">새로 생성할 오피스 이름:</label> 
							<input type="text"
								class="form-control" name="officeName">
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary" data-bs-dismiss="modal">닫기</button>
							<input type="submit" class="btn btn-primary" value="오피스 생성"></button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="${path}/slick/slick.min.js"></script>
<script src="${path}/js/office/office_carousel.js"></script>
<script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
</html>