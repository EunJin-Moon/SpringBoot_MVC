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
	<h1 class="con">�Խù� ����Ʈ</h1>
	<h2 class="con">��ü �Խù� ���� : ${totalCount}</h2>

	<div class="con">
		<c:forEach items="${list}" var="article">
			<section>
				<a href="./detail?id=${article.id}">��ȣ : ${article.id}</a>
				 ���� : ${article.title}
			</section>
			<hr>
		</c:forEach>
	</div>

	<div class="btns con">
		<a href="./add">�Խù� �߰� </a>
	</div>


</body>
</html>