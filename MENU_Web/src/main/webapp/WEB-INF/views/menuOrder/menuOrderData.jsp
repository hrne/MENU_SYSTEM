<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
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
		<c:forEach var="menuOrderDto" items="${listMenuOrderDto}">
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