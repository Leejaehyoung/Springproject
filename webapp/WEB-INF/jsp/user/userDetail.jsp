<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/include/header.jspf"%>
</head>

<body class="hold-transition skin-blue sidebar-mini">

	<!-- Content Wrapper. Contains page content -->
	<div class="content-wrapper">
		<!-- Content Header (Page header) -->
		<section class="content-header">
			<h1>
				스터디 정보 <small>Study Information</small>
			</h1>
			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
				<li><a href="#">스터디 정보</a></li>
				<li class="active">사용자 상세</li>
			</ol>
		</section>

		<!-- Main content -->
		<section class="content">
			<div class="row">
				<!-- left column -->
				<div class="col-md-6">
					<!-- general form elements -->
					<div class="box box-primary">
						<div class="box-header with-border">
							<h3 class="box-title">사용자 상세</h3>
						</div>
						<!-- /.box-header -->
						<!-- form start -->
						<form role="form" id="frm">
							<input type="hidden" id="regId" name="regId" value="admin"></input>
							<input type="hidden" id="modId" name="modId" value="admin"></input>
							<input type="hidden" id="mbrNo" name="mbrNo" value="${ map.mbrNo }"></input>
							<div class="box-body">
								<div class="form-group">
									<label for="exampleInputId1">사용자 아이디</label> <input
										type="mbrid" class="form-control" id="mbrId" name="mbrId"
										placeholder="Enter id" value="${ map.mbrId }">
								</div>
								<div class="form-group">
									<label for="exampleInputName1">사용자명</label> <input
										type="mbrnm" class="form-control" id="mbrNm" name="mbrNm" 
										placeholder="Enter name" value="${ map.mbrNm }">
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">이메일 주소</label> <input
										type="email" class="form-control" id="email" name="email" 
										placeholder="Enter email" value="${ map.email }">
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">비밀번호</label> <input
										type="password" class="form-control"
										id="passwd" name="passwd" placeholder="Password" value="${ map.passwd }">
								</div>
							</div>
							<!-- /.box-body -->

							<div class="box-footer">
								<!-- <button type="submit" class="btn btn-primary">사용자 수정</button> -->
								<a href="#this" class="btn btn-primary" id="update">사용자 수정</a>
								<a href="#this" class="btn btn-primary" id="delete">사용자 삭제</a>
								<a href="#this" class="btn btn-primary" id="list">사용자 목록</a>
							</div>
						</form>
					</div>
					<!-- /.box -->

				</div>
				<!-- /.col -->
			</div>
			<!-- /.row -->
		</section>

	</div>
	<!-- /.col -->
	</div>
	<!-- /.row -->
	</section>
	<!-- /.content -->
	</div>
	<!-- /.content-wrapper -->

	<form id="commonForm" name="commonForm"></form>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#update").on("click", function(e) {	// 사용자 수정 버튼
				e.preventDefault();
				fn_saveUserUpdate();
			});

			$("#delete").on("click", function(e) {	// 사용자 삭제 버튼
				e.preventDefault();
				fn_saveUserDelete();
			});

			$("#list").on("click", function(e) {	// 사용자 목록 버튼
				e.preventDefault();
				fn_openUserList();
			});
		});

		function fn_saveUserUpdate() {
			var comSubmit = new ComSubmit("frm");
			comSubmit.setUrl("<c:url value='/updateuser.sps' />");
			comSubmit.submit();
		}
		
		function fn_saveUserDelete() {
			var mbrno = "${ map.mbrNo }";
			var comSubmit = new ComSubmit("");
			comSubmit.setUrl("<c:url value='/deleteuser.sps' />");
			comSubmit.addParam("mbrNo", mbrno);
			comSubmit.submit();
		}
		
		function fn_openUserList() {
			var comSubmit = new ComSubmit();
			comSubmit.setUrl("<c:url value='/users.sps' />");
			comSubmit.submit();
		}
	</script>

	<%@ include file="/WEB-INF/include/footer.jspf"%>

</body>
</html>