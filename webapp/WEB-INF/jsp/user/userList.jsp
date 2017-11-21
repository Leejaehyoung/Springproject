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
				<li class="active">사용자 목록</li>
			</ol>
		</section>

		<!-- Main content -->
		<section class="content">
			<div class="row">
				<div class="col-xs-12">
					<div class="box">
						<div class="box-header">
							<h3 class="box-title">사용자 목록</h3>
						</div>
						<!-- /.box-header -->
						<div class="box-body">
							<table id="example2" class="table table-bordered table-hover">
								<thead>
									<tr>
										<th>회원아이디</th>
										<th>회원명</th>
										<th>메일주소</th>
										<th>등록일시</th>
									</tr>
								</thead>
								<tbody>
									<c:choose>
										<c:when test="${fn:length(list) > 0}">
											<c:forEach items="${list }" var="row">
												<tr>
													<td>${row.mbrId }</td>
													<td>
														<a href="#this" name="mbrname">${row.mbrNm }</a>
														<input type="hidden" id="mbrNo" value="${row.mbrNo }">
													</td>	
													<td>${row.email }</td>
													<td>${row.regDtime }</td>
												</tr>
											</c:forEach>
										</c:when>
										<c:otherwise>
											<tr>
												<td colspan="4">조회된 결과가 없습니다.</td>
											</tr>
										</c:otherwise>
									</c:choose>
								</tfoot>
							</table>
						</div>
						<!-- /.box-body -->
						
						<div class="box-footer">
							<a href="#this" class="btn btn-primary" id="insert">사용자 등록</a>
						</div>
						
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
			$("#insert").on("click", function(e) {	// 사용자 등록 버튼
				e.preventDefault();
				fn_openUserInsert();
			});
			
			$("a[name='mbrname']").on("click", function(e){ // 회원명 클릭 
				e.preventDefault();
				fn_openUserDetail($(this));
			});
		});

		function fn_openUserInsert() {
			var comSubmit = new ComSubmit();
			comSubmit.setUrl("<c:url value='/userinsert.sps' />");
			comSubmit.submit();
		}
		
		function fn_openUserDetail(obj){
			var comSubmit = new ComSubmit();
			comSubmit.setUrl("<c:url value='/user.sps' />");
			comSubmit.addParam("mbrNo", obj.parent().find("#mbrNo").val());
			comSubmit.submit();
		}
	</script>

<%@ include file="/WEB-INF/include/footer.jspf"%>

</body>
</html>