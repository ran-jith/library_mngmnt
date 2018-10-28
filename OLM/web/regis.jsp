<%@ page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<title>MyLib</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="styles/style.css" rel="stylesheet" type="text/css"/>


<style>
.mainscreen{
margin: auto;
width: 1000px;
height: 500px;
position: relative;
border: 3px solid blue;
background-image: url('img/book.jpg');
}
</style>
</head>
<body>
  <div class="mainscreen">

      <div style="padding-left:20px">
        <h1></h1></div>
      <%
                int count = 0;
                String color = "#F9EBB3";
                if (request.getAttribute("bklist") != null) {
                    ArrayList al = (ArrayList) request.getAttribute("bklist");
                    Iterator itr = al.iterator();
                    while (itr.hasNext()) {
                        count ++;
                        ArrayList books = (ArrayList) itr.next();
            %>
            <div class="container">
            <h2>Issued Book</h2>
             <form class="form-horizontal" action="Issued" method="post">
                 <div class="form-group">
                <label class="control-label col-sm-2" for="authorname">Book Number:</label>
                <div class="col-sm-5">
                    <input type="text" class="form-control" id="bid" value="<%=books.get(0)%>" name="bname" readonly>
                </div>
              </div>
                <div class="form-group">
                <label class="control-label col-sm-2" for="bookname">Available Copies:</label>
                <div class="col-sm-5">
                    <input type="text" class="form-control" value="<%=books.get(1)%>" id="email" name="acopy" readonly>
                </div>
                </div>
              <div class="form-group">
                <label class="control-label col-sm-2" for="bookname">Student Id:</label>
                <div class="col-sm-5">
                    <input type="text" class="form-control" id="email" name="sname">
                </div>
                </div>
                <div class="form-group">
                <label class="control-label col-sm-2" for="authorname">Issue Date:</label>
                <div class="col-sm-5">
                    <input type="text" class="form-control" id="pwd"  name="idate">
                </div>
              </div>
                <div class="form-group">
                <label class="control-label col-sm-2" for="authorname">Return Date:</label>
                <div class="col-sm-5">
                    <input type="text" class="form-control" id="pwd"  name="rdate">
                </div>
              </div>
                <input type="submit"  class="btn btn-danger btn-lg" value="Issue" onclick="form.action='Issued';"></div>
             </form>
            <%
                    }
                }
                if (count == 0) {
            %>
                    <b>Something went wrong..</b>

            <%            }
            %>
  </div>
</body>
</html>`
