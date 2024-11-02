<%-- 
    Document   : std
    Created on : 19 Oct, 2024, 8:46:02 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <font color="red">STUDENT DETAIL </font>
        <%
        String na=request.getParameter("t1");
        String m=request.getParameter("t2");
        int a=Integer.parseInt(request.getParameter("m1"));
        int b=Integer.parseInt(request.getParameter("m2"));
        float tot=a+b;
        float avg=tot/2;
        out.println("<br>Name: "+na);
        out.println("<br>Roll No : "+m);
        out.println("<br>Mark1: "+a);
        out.println("<br>Mark2: "+b);
        out.println("<br>Total: "+tot);
        out.println("<br>Average: "+avg);
        if((a>=50)&&(b>=50))
            out.println("<br><br>Result: PASS");
        else
            out.println("<br><br>Result: FAIL");
        %>
    </body>
</html>
