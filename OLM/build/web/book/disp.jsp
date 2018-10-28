<%@ page import="java.util.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<html>
<head>
<title>MyLib</title>

<!--////////////////////////////////////////////////////////////////-->
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

 <!--Custom CSS-->
<link href="styles/style.css" rel="stylesheet" type="text/css"/>
<!--////////////////////////////////////////////////////////////////-->
<style>
.mainscreen{
  margin: auto;
  width: 1000px;
  height: 500px;
  position: relative;
  border: 3px solid blue;
  background-image: url('bg.jpg');
}
</style>

</head>

<body>
  <div class="mainscreen">


<div style="padding-left:20px">
  <h1></h1></div>
  <!----------------------------------------------------------------------------->

 <table width="700px" height="200px" align="center"
        style="border:1px solid #000000;" class="tablec table table-bordered">
            <tr>
                <td colspan=6 align="center"
                    style="background-color:springgreen">
                    <b>Available Books</b></td>
            </tr>
            <tr style="background-color:olive;">
                <td><b>Book Name</b></td>
                <td><b>Author</b></td>
                <td><b>Book number</b></td>
                <td><b>Category</b></td>
                <td><b>Copies</b></td>
                <td><b>Action</b></td>
            </tr>
            <%
                int count = 0;
                String color = "white";
                if (request.getAttribute("bklist") != null) {
                    ArrayList al = (ArrayList) request.getAttribute("bklist");
                    System.out.println(al);
                    Iterator itr = al.iterator();
                    while (itr.hasNext()) {
                        count ++;
                        ArrayList books = (ArrayList) itr.next();
            %>
            <tr style="background-color:<%=color%>;">
                <td><a><%=books.get(0)%></a></td>
                <td><%=books.get(1)%></td>
                <td><%=books.get(2)%></td>
                <td><%=books.get(3)%></td>
                <td><%=books.get(4)%></td>
                 <form method="post" action="Delete">
                <input type="hidden" value="<%=books.get(2)%>" name="hnum">
                <td><input type="submit" class="btn btn-primary" value="Delete"></td></form>
            </tr>
            <%
                    }
                }
                if (count == 0) {
            %>
            <tr>
                <td colspan=4 align="center"
                    style="background-color:#eeffee"><b>Sorry No books found..</b></td>
            </tr>
            <%            }
            %>
        </table>





</div>
</body>
</html>
