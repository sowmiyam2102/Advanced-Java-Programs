<%-- 
    Document   : newjsp22
    Created on : 27 Oct, 2024, 6:47:42 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP2Page</title>
    </head>
    <body>
        <%String u,p;
        u=request.getParameter("name");
        p=request.getParameter("pass1");%>
        Welcome  <%=u%>
    </body>
</html>
