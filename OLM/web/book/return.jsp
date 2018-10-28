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
    <div class="header">
      </div>
      <div style="padding-left:20px">
        <h1></h1></div>
            <div class="container">
            <h2>Return Book</h2>
             <form class="form-horizontal" action="Returns" method="post">
                 <div class="form-group">
                <label class="control-label col-sm-2" for="authorname">Book Number:</label>
                <div class="col-sm-5">
                    <input type="text" class="form-control" id="bid"  name="bno">
                </div>
              </div>
                <div class="form-group">
                <label class="control-label col-sm-2" for="bookname">Student Id:</label>
                <div class="col-sm-5">
                    <input type="text" class="form-control"  id="email" name="sid">
                </div>
                </div>
              </div><br><br>
                <input type="submit" align="center" class="btn btn-danger btn-lg" value="Return" onclick="form.action='/OLM/Returns';">
             </form>
  </div>
</body>
</html>`
