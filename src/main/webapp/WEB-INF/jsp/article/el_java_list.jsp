<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.*"%>
<%@ page import="com.moon.starter.dto.Article"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
List<Article> list = (List<Article>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Ŀ�´�Ƽ ����Ʈ - �Խù� ����Ʈ</title>
</head>
<body>
	<h2>�Խù� ����Ʈ ���</h2>
	
	<h1>v1</h1>
	<%
	for (int i = 0; i < list.size(); i++) {
	%>
	<%
	Article article = list.get(i);
	%>
	<section>
		��ȣ :
		<%=article.getId()%>
		���� :
		<%=article.getTitle()%>
		���� :
		<%=article.getBody()%>

	</section>
	<hr>
	<%
	}
	%>
	<h1>v2</h1>
	
	<c:forEach items="${list}" var="article">
		<section>
			��ȣ : ${article.id},
			���� : ${article.title}
		</section>
	<hr>
	</c:forEach>


</body>
</html>