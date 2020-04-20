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
				<s:message code='menuOrderPage' />
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
					<s:url value="/menuOrder/send" var="sendActionUrl" />
					<sf:form class="form-horizontal" method="post"
						modelAttribute="menuOrderForm" action="${sendActionUrl}">
						<div class="form-group">
							<label class="col-sm-2 control-label"><s:message
									code='tableNum' /></label>
							<div class="col-sm-10">
								<select name="${menuOrderForm.tableNum}">
									<c:forEach items="${menuOrderForm.numList}" var="num">
										<option value="${num}">${num}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-listMemuOrderDto">
							<thead>
								<tr>
									<th><s:message code='menuItem' /></th>
									<th><s:message code='price' /></th>
									<th><s:message code='menuNum' /></th>
									<th><s:message code='menuRemark' /></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="menuOrderDto"
									items="${menuOrderForm.listMenuOrderDto}">
									<tr>
										<!-- 菜名 -->
										<td>${menuOrderDto.menuItemName}</td>
										<!-- 單價 -->
										<td>${menuOrderDto.price}</td>
										<!-- 數量 -->
										<td>
											<div class="col-sm-10">
												<select name="${menuOrderDto.orderNum}">
													<c:forEach items="${menuOrderForm.numList}" var="num">
														<option value="${num}">${num}</option>
													</c:forEach>
												</select>
											</div>
										</td>
										<!-- 備註 -->
										<td><input type="text" value="${menuOrderDto.remark}" /></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<!-- 送出按鈕 -->

						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn-lg btn-primary pull-right">
								<s:message code='send' />
							</button>
						</div>

					</sf:form>
				</div>
			</div>
			<!-- /.panel-body -->
		</div>
		<!-- /.panel -->
	</div>
	<!-- /.col-lg-12 -->
</div>
</div>
