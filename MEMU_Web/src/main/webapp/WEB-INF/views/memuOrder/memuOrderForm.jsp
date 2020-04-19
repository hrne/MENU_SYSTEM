<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!-- 點餐頁面 -->
<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">
				<s:message code='memuOrderPage' />
			</h1>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">

				<c:if test="${not empty msg}">
					<div class="alert alert-${css} alert-dismissible" role="alert">
						<button type="button" class="close" data-dismiss="alert"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<strong>${msg}</strong>
					</div>
				</c:if>

				<!-- /.panel-heading -->
				<div class="panel-body">
					<div class="col-sm-10">
						<select name="${tableNum}">
							<c:forEach items="${numList}" var="num">
								<option value="${num}">${num}</option>
							</c:forEach>
						</select>
					</div>
					<table width="100%"
						class="table table-striped table-bordered table-hover"
						id="dataTables-listMemuOrderDto">
						<thead>
							<tr>
								<th><s:message code='memuItem' /></th>
								<th><s:message code='memuNum' /></th>
								<th><s:message code='memuRemark' /></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="memuOrderDto" items="${listMemuOrderDto}">
								<tr>
									<!-- 菜名 -->
									<td>${memuOrderDto.memuItemName}</td>
									<!-- 數量 -->
									<td>
										<div class="col-sm-10">
											<select name="${memuOrderDto.orderNum}">
												<c:forEach items="${numList}" var="num">
													<option value="${num}">${num}</option>
												</c:forEach>
											</select>
										</div>
									</td>
									<!-- 備註 -->
									<td><input type="text" value="${memuOrderDto.remark}" /></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>

					<!-- 儲存按鈕 -->
					<div class="form-group">
						<td><s:url value="/memuOrder/send"
								var="updateUrl" />
							<button onclick="location.href='${updateUrl}'"
								class="btn btn-primary">
								<s:message code='update' />
							</button></td>
					</div>
				</div>
			</div>
			<!-- /.panel-body -->
		</div>
		<!-- /.panel -->
	</div>
	<!-- /.col-lg-12 -->
</div>
</div>
