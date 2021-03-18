<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Ŀ�´�Ƽ ����Ʈ - �Խù� ��������</title>
<style>
.con {
	width: 1000px;
	margin: 0 auto;
}

.common-form>div>* {
	float: left;
}

.common-form>div::after {
	content: "";
	display: block;
	clear: both;
}

.common-form>div>span {
	width: 50px;
}

.common-form>div>div {
	width: calc(100% - 50px);
}

.common-form>div>div>input[type="text"], .common-form>div>div>textarea {
	width: 90%;
}
</style>
</head>
<body>
	<h1>�Խù� ��������</h1>
	<section class="con">
		��ȣ : ${article.id}<br> ���� : ${article.title}<br> ���� :
		${article.body}
	</section>

	<div class="btns con">

		<a href="./list">�Խù� ����Ʈ </a> 
		<a href="./add">�Խù� �߰� </a>
		<a href="./modify?id=${article.id}">�Խù� ���� </a>
		<a href="./doDelete?id=${article.id}">�Խù� ���� </a>

	</div>


</body>
</html>