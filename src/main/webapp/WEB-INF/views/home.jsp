<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world! 임송하 입니다.
</h1>
<p> <c:out value="${serverTime}"></c:out> </p>
<!-- c:out 태그를 사용하는 이유는 해킹 방지용으로 필요합니다.
c:out으로 감싸면 스크립트가 안먹힌다고함
 -->
<P>  현재 서버의 시간은 ${serverTime} 입니다.. </P>
</body>
</html>
