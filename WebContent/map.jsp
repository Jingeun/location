<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Pholar</title>
</head>
<body>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
<%	String user_id = request.getAttribute("user_id").toString(); %>
<script type="text/javascript" src="Js/getData.js?user_id=<%=user_id%>"></script>
</body>
</html>