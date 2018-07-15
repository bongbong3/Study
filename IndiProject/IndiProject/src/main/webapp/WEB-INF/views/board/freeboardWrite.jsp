<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Free Board</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="../resources/css/mainboard.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	
	// 뒤로 가기 버튼 클릭
	$('#btnBack').click(function() {
		document.location.href = "${pageContext.request.contextPath}/board/callFreeboard.html";
	});
	
	// 글 저장 버튼 클릭
	$('#btnWriteBoard').click(function() {
		
		var formData = $('#fromFreebooardWrite').serialize();
		$.ajax({
			url : "${pageContext.request.contextPath}/board/freeboardWriteAction.do"
			, type : "POST"
			, contentType : "application/x-www-form-urlencoded; charset=UTF-8"
			, context : this
			, data : formData
			, dataType : "json"
			, beforeSend : function() {
				$('.wrap-loading').removeClass('display-none');
			}
			, success : function(data) {
				console.dir(data);
				alert('저장되었습니다.');
			}
			, complete : function() {
				$('.wrap-loading').addClass('display-none');
			}
			, error : function() {
				$('.wrap-loading').addClass('display-none');
				alert('오류가 발생했습니다.');
			}
		});
	});
});
</script>
</head>
<body>

<div class="container-full">	
	<div class="mail-box">
	
		<jsp:include page="../left.jsp"></jsp:include>
		
		<aside class="lg-side">
			<div class="inbox-head">
				<h3>Postodo</h3>
			</div>
			<div class="inbox-body" style="padding-top: 90px;">
           
				<form id="fromFreebooardWrite" class="form-horizontal" role="form" method="post">
					<input type="hidden" id="userId" name="createId" value="${userId}"/>
					<div class="form-group">
						<label for="name" class="col-sm-2 control-label">제목</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="freeboardTitle" name="freeboardTitle" placeholder="제목을 입력하세요." maxlength="100">
						</div>
					</div>
					<div class="form-group">
						<label for="message" class="col-sm-2 control-label">내용</label>
						<div class="col-sm-10">
							<textarea class="form-control" rows="4" id="freeboardContent" name="freeboardContent" maxlength="100" placeholder="내용을 입력하세요."></textarea>
						</div>
					</div>
				</form>
				
				<div class="mail-option">
					<button id="btnBack" name="btnBack" class="btn btn-info btn-bg pull-right" style="margin-left: 10px;">뒤로</button>
					<button id="btnWriteBoard" name="btnWriteBoard" class="btn btn-info btn-bg pull-right">글쓰기</button>					
				</div>
                   
	        </div>
	    </aside>
	</div>
	<!-- </div>	 -->
</div>

</body>
</html>
