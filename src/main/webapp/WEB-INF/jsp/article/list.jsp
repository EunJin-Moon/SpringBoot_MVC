<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Ŀ�´�Ƽ ����Ʈ - �Խù� ����Ʈ</title>
<link rel="stylesheet" href="/resource/common.css">
</head>
<body>
	<h2>�Խù� ����Ʈ ���</h2>
<!-- el�� ������ request.getAttribute("article")) �� �ʿ䰡 ����. -->
	<h2>��ü �Խù� ���� : ${totalCount}</h2>
	<c:forEach items="${list}" var="article">
		<section>
			��ȣ : ${article.id},
			���� : ${article.title}
		</section>
	<hr>
	</c:forEach>
	
	<a href="./add">�Խù� �߰� </a>


</body>
</html>