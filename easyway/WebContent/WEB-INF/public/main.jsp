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

<!-- CSS와 아이콘 -->
<script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
<link rel="stylesheet" href="${path}/css/widget.css"/>

<!-- jQuery -->
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.13.0/themes/base/jquery-ui.css"/>
    <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
    <script src="${path}/js/jquery-ui-1.10.3.custom.min.js"></script>

<!-- Bootstrap core CSS -->
<link href="${path}/css/reset.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"/>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

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

<script>
    $(document).ready(function () {
       $('.draggable').draggable({
           snap: ".snaptarget",
           stack: ".draggable"
       });
       $('#widgetBtn').click(function(){
            $('#widgetBar').animate({
                right : 0
            }, 700);
            $('html').css({
                overflow : 'hidden'
            });
        });
        $('#closeBtn').click(function() {
            $('#widgetBar').animate({
                right: '-50%'
            }, 700);
            $('html').css({
                overflow : 'visible'
            });
        });

   });
</script>


<!-- Custom styles for this template -->
<link href="${path}/css/sidebars.css" rel="stylesheet">
</head>
<body>
	<jsp:include page="./sidebar.jsp" />
	
	<div class="wrapper">
        <div class="row">
            <div class="colSize">
                <div class="col-sm-3 snaptarget">위젯 영역 그리드</div>
            </div>
            <div class="colSize">
                <div class="col-sm-3 snaptarget">위젯 영역 그리드</div>
            </div>
            <div class="colSize">
                <div class="col-sm-3 snaptarget">위젯 영역 그리드</div>
            </div>
            <div class="colSize">
                <div class="col-sm-3 snaptarget">위젯 영역 그리드</div>
            </div>
        </div>
        <div class="row">
            <div class="colSize">
                <div class="col-sm-3 snaptarget">위젯 영역 그리드</div>
            </div>
            <div class="colSize">
                <div class="col-sm-3 snaptarget">위젯 영역 그리드</div>
            </div>
            <div class="colSize">
                <div class="col-sm-3 snaptarget">위젯 영역 그리드</div>
            </div>
            <div class="colSize">
                <div class="col-sm-3 snaptarget">위젯 영역 그리드</div>
            </div>
        </div>
        <div class="row">
            <div class="colSize">
                <div class="col-sm-3 snaptarget">위젯 영역 그리드</div>
            </div>
            <div class="colSize">
                <div class="col-sm-3 snaptarget">위젯 영역 그리드</div>
            </div>
            <div class="colSize">
                <div class="col-sm-3 snaptarget">위젯 영역 그리드</div>
            </div>
            <div class="colSize">
                <div class="col-sm-3 snaptarget">위젯 영역 그리드</div>
            </div>
        </div>
    </div>
    <div id="widgetWrapper">
        <div class="widget3Wrapper">
            <div class="widget draggable">
                <div class="widgetCon">위젯 내용물</div>
            </div>
            <div class="widget draggable">
                <div class="widgetCon">위젯 내용물</div>
            </div>
            <div class="widget draggable">
                <div class="widgetCon">위젯 내용물</div>
            </div>
        </div>
        <div class="widget3Wrapper">
            <div class="widget draggable">
                <div class="widgetCon">위젯 내용물</div>
            </div>
            <div class="widget draggable">
                <div class="widgetCon">위젯 내용물</div>
            </div>
            <div class="widget draggable">
                <div class="widgetCon">위젯 내용물</div>
            </div>
        </div>
    </div>

</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="${path}/js/sidebars.js"></script>
</html>