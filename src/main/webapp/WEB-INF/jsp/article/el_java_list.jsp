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
<title>커뮤니티 사이트 - 게시물 리스트</title>
</head>
<body>
	<h2>게시물 리스트 출력</h2>
	
	<h1>v1</h1>
	<%
	for (int i = 0; i < list.size(); i++) {
	%>
	<%
	Article article = list.get(i);
	%>
	<section>
		번호 :
		<%=article.getId()%>
		제목 :
		<%=article.getTitle()%>
		내용 :
		<%=article.getBody()%>

	</section>
	<hr>
	<%
	}
	%>
	<h1>v2</h1>
	
	<c:forEach items="${list}" var="article">
		<section>
			번호 : ${article.id},
			제목 : ${article.title}
		</section>
	<hr>
	</c:forEach>


</body>
</html>