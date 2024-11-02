<%-- 
    Document   : newjsp11
    Created on : 27 Oct, 2024, 6:43:19 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP1Page</title>
    </head>
    <body>
        <%!String uname,pass1;%>
        <%
            uname=request.getParameter("name");
            pass1=request.getParameter("pass");
            if(uname.equals("Reshma")&& pass1.equals("1234")){%>
            <jsp:forward page="newjsp22.jsp"/>
            <%}else{%>
            Username and Password Incorrect
            <jsp:include page="action.html"/>
            <%}
            %>
    </body>
</html>
