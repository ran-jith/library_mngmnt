<%-- 
    Document   : Profile
    Created on : 25 Oct, 2018, 12:08:00 PM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
String userName = null;
Cookie[] cookies = request.getCookies();
if(cookies !=null){
for(Cookie cookie : cookies){
	if(cookie.getName().equals("uname")) userName = cookie.getValue();
}
}
%>
<h3>Hi <%=userName %></h3>
    </body>
</html>
