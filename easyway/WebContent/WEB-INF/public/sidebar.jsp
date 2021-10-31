<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<c:set var="path" value="${pageContext.request.contextPath}" />

<div style="float: left">
	<main>
	<div class="d-flex flex-column flex-shrink-0 p-3 bg-light"
		style="width: 280px;">
		<a href="/easyway/main/mainAction.do"
			class="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-dark text-decoration-none">
			<!-- 이미지자리 --> <span class="fs-4"><img src="../image/EASYWAY_LOGO.png"></span>
		</a>
		<hr>
		<ul class="nav nav-pills flex-column mb-auto">
			<li><a href="/easyway/notice/noticeListAction.do" class="nav-link link-dark"> <!-- 이미지자리 --> 공지사항
			</a></li>
			<li><a href="/easyway/attendance/attendanceTodayAction.do" class="nav-link link-dark"> <!-- 이미지자리 -->
					근태관리
			</a></li>
			<li><a href="/easyway/sign/insertSignForm.do" class="nav-link link-dark"> <!-- 이미지자리 -->
					전자결재
			</a></li>
			<li><a href="/easyway/project/projectListAction.do" class="nav-link link-dark"> <!-- 이미지자리 -->
					프로젝트
			</a></li>
			<li><a href="/easyway/schedule/scheduleListAction.do" class="nav-link link-dark"> <!-- 이미지자리 -->
					캘린더
			</a></li>
		</ul>
		<hr>
		
	</div>
	<div class="b-example-divider"></div>
	</main>

</div>


