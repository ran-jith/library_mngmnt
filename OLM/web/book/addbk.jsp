<html>
<head>
<title>MyLib</title>

<!--////////////////////////////////////////////////////////////////


<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<Include the above in your HEAD tag ---------->

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
  <!-- jQuery library -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <!-- Latest compiled JavaScript -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <!--END BOOTSTRAP-->

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


<div class="container">
  <h2>Add Book</h2>
  <form class="form-horizontal" action="/OLM/AddBook" method="post">
    <div class="form-group">
      <label class="control-label col-sm-2" for="bookname">Book Name:</label>
      <div class="col-sm-5">
        <input type="text" class="form-control" id="email" placeholder="Enter Book name" name="bname">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="authorname">Author Name:</label>
      <div class="col-sm-5">
        <input type="text" class="form-control" id="pwd" placeholder="Enter Author Name" name="bauthor">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="year">Category:</label>
      <div class="col-sm-5">
        <input type="text" class="form-control" id="pwd" placeholder="Enter category" name="cat">
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="year">No.Of copies:</label>
      <div class="col-sm-5">
        <input type="text" class="form-control" id="pwd" placeholder="Enter copies" name="cop" required>
      </div>
    </div>


    <div class="form-group">
      <label class="control-label col-sm-2" for="year">Book Number:</label>
      <div class="col-sm-5">
        <input type="text" class="form-control" id="pwd" placeholder="Enter bk number" name="bnum" required>
      </div>
    </div>

    <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-primary">Add Book</button>
      </div>
    </div>
  </form>

  </div>
</body>
</html>
