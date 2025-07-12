<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>
<body >
<div class="d-flex justify-content-center align-items-center vh-100">
<div class="form-container mx-auto">
<h1 > Book Registration</h1>
<form  action="book" method="post">
    <div class="mb-3">
        <label for="name" class="form-label">Book Name</label>
        <input type="text"  class="form-control" id="name" name="name">
    </div>
    <div class="mb-3">
        <label for="authorName" class="form-label">Book Author</label>
        <input type="text" class="form-control" id="authorName" name="author">
    </div>
    <div class="mb-3">
        <label for="prize" class="form-label">Book Prize</label>
        <input type="number" class="form-control" id="prize" name="prize">
    </div>
    <div class="mb-3">
        <label for="volume" class="form-label">Book Volume</label>
        <input type="text" class="form-control" id="volume" name="volume">
    </div>
    <div class="mb-3">
        <button type="submit" class="btn btn-primary mb-3">Submit</button>
    </div>
</form>
</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>
</body>
</html>