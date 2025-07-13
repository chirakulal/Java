<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
</head>
<body>
<form action="register" method="post">
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">FullName</label>
        <input type="text" class="form-control" id="name" aria-describedby="name " name="fullName">

    </div>
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Email address</label>
        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email">

    </div>
    <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">Password</label>
        <input type="password" class="form-control" id="exampleInputPassword11" name="password">
    </div>
    <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">ConfirmPassword</label>
        <input type="password" class="form-control" id="exampleInputPassword2" name="confirmPassword">
    </div>
    <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">MobileNumber</label>
        <input type="number" class="form-control" id="exampleInputPassword1" name="mobile">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>