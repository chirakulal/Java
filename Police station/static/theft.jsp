<!DOCTYPE html>
<html>
<head>
    <title>Theft Complaint</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-secondary bg-opacity-10">
<div class="container mt-5">
    <div class="card shadow-lg">
        <div class="card-header bg-danger text-white text-center">
            <h3>Theft Complaint Form</h3>
        </div>
        <div class="card-body">
            <form action="theft" method="post">
                <div class="form-floating mb-3">
                    <input type="text" name="name" class="form-control" id="name" required>
                    <label for="name">Name</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" name="mobile" class="form-control" id="mobile" required>
                    <label for="mobile">Mobile</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="number" name="age" class="form-control" id="age" required>
                    <label for="age">Age</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" name="address" class="form-control" id="address" required>
                    <label for="address">Address</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" name="location" class="form-control" id="location" required>
                    <label for="location">Location of Theft</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" name="item" class="form-control" id="item" required>
                    <label for="item">Item Lost</label>
                </div>
                <div class="form-floating mb-4">
                    <input type="date" name="lostOn" class="form-control" id="lostOn" required>
                    <label for="lostOn">Date of Theft</label>
                </div>
                <button type="submit" class="btn btn-danger w-100">Submit Complaint</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
