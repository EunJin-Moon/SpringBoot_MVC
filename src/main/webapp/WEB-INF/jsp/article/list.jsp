<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Ŀ�´�Ƽ ����Ʈ - �Խù� ����Ʈ</title>
</head>
<body>
	<h2>�Խù� ����Ʈ ���</h2>
<!-- el�� ������ request.getAttribute("article")) �� �ʿ䰡 ����. -->
	<c:forEach items="${list}" var="article">
		<section>
			��ȣ : ${article.id},
			���� : ${article.title}
		</section>
	<hr>
	</c:forEach>


</body>
</html>