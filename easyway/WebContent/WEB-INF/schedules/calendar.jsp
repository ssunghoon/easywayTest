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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<!--fullcalendar CDN  -->
 	 <link href="./css/calendarMain.css" rel="stylesheet">
	<script src="./js/calendarMain.js"></script>
	
	
	<script>

	  document.addEventListener('DOMContentLoaded', function() {
	    var calendarEl = document.getElementById('calendar');

	    var calendar = new FullCalendar.Calendar(calendarEl, {
	      headerToolbar: {
	        left: 'prevYear,prev,next,nextYear today',
	        center: 'title',
	        right: 'dayGridMonth,dayGridWeek,dayGridDay'
	      },
	      initialDate: '2020-09-12',
	      navLinks: true, // can click day/week names to navigate views
	      editable: true,
	      dayMaxEvents: true, // allow "more" link when too many events
	      events: [
	        {
	          title: 'All Day Event',
	          start: '2020-09-01'
	        },
	        {
	          title: 'Long Event',
	          start: '2020-09-07',
	          end: '2020-09-10'
	        },
	        {
	          groupId: 999,
	          title: 'Repeating Event',
	          start: '2020-09-09T16:00:00'
	        },
	        {
	          groupId: 999,
	          title: 'Repeating Event',
	          start: '2020-09-16T16:00:00'
	        },
	        {
	          title: 'Conference',
	          start: '2020-09-11',
	          end: '2020-09-13'
	        },
	        {
	          title: 'Meeting',
	          start: '2020-09-12T10:30:00',
	          end: '2020-09-12T12:30:00'
	        },
	        {
	          title: 'Lunch',
	          start: '2020-09-12T12:00:00'
	        },
	        {
	          title: 'Meeting',
	          start: '2020-09-12T14:30:00'
	        },
	        {
	          title: 'Happy Hour',
	          start: '2020-09-12T17:30:00'
	        },
	        {
	          title: 'Dinner',
	          start: '2020-09-12T20:00:00'
	        },
	        {
	          title: 'Birthday Party',
	          start: '2020-09-13T07:00:00'
	        },
	        {
	          title: 'Click for Google',
	          url: 'http://google.com/',
	          start: '2020-09-28'
	        }
	      ]
	    });

	    calendar.render();
	  });

	</script>
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

  body {
    margin: 40px 10px;
    padding: 0;
    font-family: Arial, Helvetica Neue, Helvetica, sans-serif;
    font-size: 14px;
  }

  #calendar {
    max-width: 1100px;
    margin: 0 auto;
  }
  #title {/*캘린더제목수정하기*/
  	font-size: 40px;
  	text-align: center;
  	color : #0D6EFD;
  }
    p{
        text-align: center;
        color: black;
    }
  
</style>

<!-- Custom styles for this template -->
<link href="./css/sidebars.css" rel="stylesheet">
</head>
<body>
	<jsp:include page="../public/sidebar.jsp" />
	
	<p id = 'title'>캘린더</p>
	<hr>
	<p>
	<a href="ScheduleInsertAction.do"> 
	일정추가</a>
	</p>
	<div id='calendar'></div>
	
</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="${path}/js/sidebars.js"></script>
</html>