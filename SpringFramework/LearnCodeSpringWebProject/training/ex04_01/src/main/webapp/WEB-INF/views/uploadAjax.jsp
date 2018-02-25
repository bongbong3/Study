<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script
  src="https://code.jquery.com/jquery-2.2.4.min.js"
  integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
  crossorigin="anonymous"></script>
<style>
.fileDrop {
	width: 100%;
	height: 200px;
	border: 1px dotted blue;
}

small {
	margin-left: 3px;
	font-weight: bold;
	color: gray;
}
</style>

<script>
/*
var result = "${savedName}";
parent.addFilePath(result);
*/
</script>
</head>
<body>

<h3>Ajax File Upload</h3>
<div class="fileDrop"></div>
<div class="uploadList"></div>

<script>
	$(".fileDrop").on("dragenter dragover", function(event) {
		event.preventDefault();
	});
	
	$(".fileDrop").on("drop", function(event) {
		event.preventDefault();
		
		var files = event.originalEvent.dataTransfer.files;
		
		var file = files[0];
		
		console.log(file);
		
		var formData = new FormData();
		
		formData.append("file", file);
		
		$.ajax({
			url : "uploadAjax",
			data : formData,
			dataType : "text",
			processData : false,
			contentType : false,
			type : "POST",
			success : function(data) {
				var str = "";
				alert(data);
				/*
				if (checkImageType(data)) {
					str = "<div><a href='displayFile?fileName=" + getImageLink(data) + "'>"
							+ "<img src='displayFile?fileName=" + data + "'/>"
							+ "</a><small data-src=" + data + ">X</small></div>";
				} else {
					str = "<div><a href='displayFile?fileName=" + data + "'>"
							+ getOriginalName(data) + "</a>"
							+ "<small data-src=" + data + ">X</small></div>";
				}
				
				$(".uploadedList").append(str);
				*/
			}
		});
		
	});
	
	$(".uploadedList").on("click", "small", function(event){ 
		
		var that = $(this);
		
		$.ajax({
			url : "deleteFile",
			type : "POST",
			data : {fileName:$(this).attr("data-src")},
			dataType : "text",
			success : function(result) {
				if (result == "deleted") {
					that.parent("div").remove();
				}	
			}
		});
		
	});
</script>

</body>
</html>