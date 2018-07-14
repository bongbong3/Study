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
	$("#btnWriteBoard").click(function() {
		window.document.location.href = "${pageContext.request.contextPath}/board/freeboardWrite.html";
	});
});


</script>


</head>
<body>

<div class="container-full">
	<!-- <div class="container"> -->
	<div class="mail-box">
		<aside class="sm-side">
			<div class="user-head">
				<a class="inbox-avatar" href="javascript:;">
					<img  width="64" height="60" src="../resources/image/profile/jth.png">
				</a>
				<div class="user-name">
					<h5><a href="#">AACII</a></h5>					
				</div>
            </div>
			<div class="inbox-body">
				<a href="#myModal" data-toggle="modal"  title="Compose"    class="btn btn-compose">
					Logout
				</a>
				<!-- Modal -->
				<div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="myModal" class="modal fade" style="display: none;">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button aria-hidden="true" data-dismiss="modal" class="close" type="button">×</button>
								<h4 class="modal-title">Compose</h4>
							</div>
							<div class="modal-body">
								<form role="form" class="form-horizontal">
									<div class="form-group">
										<label class="col-lg-2 control-label">To</label>
										<div class="col-lg-10">
											<input type="text" placeholder="" id="inputEmail1" class="form-control">
										</div>
                                     </div>
                                     <div class="form-group">
										<label class="col-lg-2 control-label">Cc / Bcc</label>
										<div class="col-lg-10">
											<input type="text" placeholder="" id="cc" class="form-control">
										</div>
                                     </div>
                                     <div class="form-group">
										<label class="col-lg-2 control-label">Subject</label>
										<div class="col-lg-10">
											<input type="text" placeholder="" id="inputPassword1" class="form-control">
										</div>
                                     </div>
                                     <div class="form-group">
										<label class="col-lg-2 control-label">Message</label>
										<div class="col-lg-10">
											<textarea rows="10" cols="30" class="form-control" id="" name=""></textarea>
										</div>
                                     </div>

                                     <div class="form-group">
										<div class="col-lg-offset-2 col-lg-10">
											<span class="btn green fileinput-button">
												<i class="fa fa-plus fa fa-white"></i>
												<span>Attachment</span>
												<input type="file" name="files[]" multiple="">
											</span>
											<button class="btn btn-send" type="submit">Send</button>
										</div>
									</div>
								</form>
							</div>
						</div><!-- /.modal-content -->
					</div><!-- /.modal-dialog -->
				</div><!-- /.modal -->
			</div>
				<ul class="nav nav-pills nav-stacked labels-info inbox-divider middle-navigation" style="height:500px;">
					<li> <h4>메뉴</h4> </li>
					<li> <a href="#"> <i class=" fa fa-sign-blank text-danger"></i> 자유게시판 </a> </li>
					<!-- <li> <a href="#"> <i class=" fa fa-sign-blank text-success"></i> Work Supporter </a> </li>
					<li> <a href="#"> <i class=" fa fa-sign-blank text-success"></i> Blog </a> </li>
					<li> <a href="#"> <i class=" fa fa-sign-blank text-info "></i> Coding </a> </li>
					<li> <a href="#"> <i class=" fa fa-sign-blank text-warning "></i> Computer Experience </a> </li>
					<li> <a href="#"> <i class=" fa fa-sign-blank text-primary "></i> Mathmetics </a></li>
					<li> <a href="#"> <i class=" fa fa-sign-blank text-primary "></i> Accounting </a></li> -->
				</ul>
				<!-- <ul class="nav nav-pills nav-stacked labels-info ">
					<li> <h4>Buddy online</h4> </li>
					<li> <a href="#"> <i class=" fa fa-circle text-success"></i>Alireza Zare <p>I do not think</p></a>  </li>
					<li> <a href="#"> <i class=" fa fa-circle text-danger"></i>Dark Coders<p>Busy with coding</p></a> </li>
					<li> <a href="#"> <i class=" fa fa-circle text-muted "></i>Mentaalist <p>I out of control</p></a></li>
					<li> <a href="#"> <i class=" fa fa-circle text-muted "></i>H3s4m<p>I am not here</p></a></li>
					<li> <a href="#"> <i class=" fa fa-circle text-muted "></i>Dead man<p>I do not think</p></a></li>
				</ul> -->
             <div class="inbox-body text-center">
                 <div class="btn-group">
                     <a class="btn mini btn-primary" href="javascript:;">
                         <i class="fa fa-plus"></i>
                     </a>
                 </div>
                 <div class="btn-group">
                     <a class="btn mini btn-success" href="javascript:;">
                         <i class="fa fa-phone"></i>
                     </a>
                 </div>
                 <div class="btn-group">
                     <a class="btn mini btn-info" href="javascript:;">
                         <i class="fa fa-cog"></i>
                     </a>
                 </div>
             </div>
		</aside>
		<aside class="lg-side">
			<div class="inbox-head">
				<h3>개인 프로젝트</h3>
			</div>
			<div class="inbox-body">
				<div class="mail-option">
					<button id="btnWriteBoard" name="btnWriteBoard" class="btn btn-info btn-bg pull-right">글쓰기</button>
				</div>
                  
			<div class="table-container">
				<table class="table-filter">
					<tbody>
						<tr data-status="pagado">
							<td>
								<a href="javascript:;" class="star">
									<i class="glyphicon glyphicon-star"></i>
								</a>
							</td>
							<td>
								<div class="media">									
									<div class="media-body">
										<span class="media-meta pull-right">Febrero 13, 2016</span>
										<h4 class="title">
											Lorem Impsum
											<span class="pull-right pagado">(Pagado)</span>
										</h4>
										<!-- <p class="summary">Ut enim ad minim veniam, quis nostrud exercitation...</p> -->
									</div>
								</div>
							</td>
						</tr>
						<tr data-status="pendiente">
							<td>
								<a href="javascript:;" class="star">
									<i class="glyphicon glyphicon-star"></i>
								</a>
							</td>
							<td>
								<div class="media">									
									<div class="media-body">
										<span class="media-meta pull-right">Febrero 13, 2016</span>
										<h4 class="title">
											Lorem Impsum
											<span class="pull-right pendiente">(Pendiente)</span>
										</h4>
										<!-- <p class="summary">Ut enim ad minim veniam, quis nostrud exercitation...</p> -->
									</div>
								</div>
							</td>
						</tr>
						<tr data-status="cancelado">
							<td>
								<a href="javascript:;" class="star">
									<i class="glyphicon glyphicon-star"></i>
								</a>
							</td>
							<td>
								<div class="media">
									<div class="media-body">
										<span class="media-meta pull-right">Febrero 13, 2016</span>
										<h4 class="title">
											Lorem Impsum
											<span class="pull-right cancelado">(Cancelado)</span>
										</h4>
										<!-- <p class="summary">Ut enim ad minim veniam, quis nostrud exercitation...</p> -->
									</div>
								</div>
							</td>
						</tr>
						<tr data-status="pagado" class="selected">
							<td>
								<a href="javascript:;" class="star star-checked">
									<i class="glyphicon glyphicon-star"></i>
								</a>
							</td>
							<td>
								<div class="media">
									<div class="media-body">
										<span class="media-meta pull-right">Febrero 13, 2016</span>
										<h4 class="title">
											Lorem Impsum
											<span class="pull-right pagado">(Pagado)</span>
										</h4>
										<!-- <p class="summary">Ut enim ad minim veniam, quis nostrud exercitation...</p> -->
									</div>
								</div>
							</td>
						</tr>
						<tr data-status="pendiente">
							<td>
								<a href="javascript:;" class="star">
									<i class="glyphicon glyphicon-star"></i>
								</a>
							</td>
							<td>
								<div class="media">
									<div class="media-body">
										<span class="media-meta pull-right">Febrero 13, 2016</span>
										<h4 class="title">
											Lorem Impsum
											<span class="pull-right pendiente">(Pendiente)</span>
										</h4>
										<!-- <p class="summary">Ut enim ad minim veniam, quis nostrud exercitation...</p> -->
									</div>
								</div>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
                   
                   
        </div>
    </aside>
</div>
	<!-- </div>	 -->
</div>

</body>	
</html>