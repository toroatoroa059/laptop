<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<!-- <html lang="en" xmlns:th="http://www.thymeleaf.org"lang="en" xmlns:th="http://www.thymeleaf.org"> -->
<head>
<meta charset="ISO-8859-1">
<title>thống kê</title>
</head>
<body>
	<jsp:include page="template/header.jsp"></jsp:include>
	<jsp:include page="template/sidebar.jsp"></jsp:include>
	<table id="add-row" class="display table table-striped table-hover">
		<thead>
			<tr>
				<th>#</th>
				<th>Nhóm</th>
				<th>Tổng Số Lượng</th>
				<th>Tổng Doanh Thu</th>
				<th>Giá Trung Bình/1sp</th>
				<th>Giá Thấp Nhấp/1sp</th>
				<th>Giá Cao Nhất/1sp</th>
			</tr>
		</thead>
		<tfoot>
			<tr>
				<th>#</th>
				<th>Groups</th>
				<th>Quantity</th>
				<th>Sale</th>
				<th>Average price</th>
				<th>Lowest price</th>
				<th>Highest price</th>
			</tr>
			
		</tfoot>
	</table>
</body>
</html>