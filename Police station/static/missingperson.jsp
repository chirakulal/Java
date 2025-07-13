<!DOCTYPE html>
<html>
<head>
    <title>Missing Person Report</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-secondary bg-opacity-10">
<div class="container mt-5">
    <div class="card shadow-lg">
        <div class="card-header bg-warning text-dark text-center">
            <h3>Missing Person Report Form</h3>
        </div>
        <div class="card-body">
            <form action="missing" method="post">
                <div class="form-floating mb-3">
                    <input type="text" name="missingName" class="form-control" id="missingName" required>
                    <label for="missingName">Missing Person Name</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" name="complainteeMobile" class="form-control" id="complainteeMobile" required>
                    <label for="complainteeMobile">Complaintee Mobile</label>
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
                    <label for="location">Last Seen Location</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" name="marks" class="form-control" id="marks">
                    <label for="marks">Identifiable Marks</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" name="gender" class="form-control" id="gender" required>
                    <label for="gender">Gender</label>
                </div>
                <div class="form-floating mb-4">
                    <input type="text" name="lang" class="form-control" id="lang">
                    <label for="lang">Known Languages</label>
                </div>
                <button type="submit" class="btn btn-warning w-100">Report Missing Person</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
