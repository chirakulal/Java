<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Birth Certificate</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        body {
         background-color: #f8f9fa;
         margin: 0;
         padding: 0;
     }

     .form-container {
         background-color: white;
         border-radius: 20px;
         padding: 40px;
         box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
         width: 100%;
         max-width: 600px;
         margin-top: 60px; /* ensures it's not too close to the top */
     }

     h1 {
         font-weight: bold;
         text-align: center;
         margin-bottom: 30px;
         color: #0d6efd;
     }

    </style>
</head>
<body>

<div class="d-flex justify-content-center align-items-center vh-100">
    <div class="container">
        <div class="form-container mx-auto">
            <h1>Birth Certificate</h1>
            <form action="birthcertificate" method="POST">
            <div class="mb-3">
                <label class="form-label">Birth ID:</label>
                <input type="number" class="form-control" name="birth" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Hospital Name:</label>
                <select name="hospitalName" class="form-select" required>
                    <option value="">Select</option>
                    <option>Nitte</option>
                    <option>Yenopoya</option>
                    <option>Kanachur</option>
                    <option>Indiana</option>
                </select>
            </div>

            <div class="mb-3">
                <label class="form-label">Father's Name:</label>
                <input type="text" class="form-control" name="farther" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Mother's Name:</label>
                <input type="text" class="form-control" name="mother" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Date of Birth:</label>
                <input type="date" class="form-control" name="date" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Doctor's Name:</label>
                <input type="text" class="form-control" name="doctor" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Nurse's Name:</label>
                <input type="text" class="form-control" name="nurse" required>
            </div>

            <div class="mb-4">
                <label class="form-label">Hospital Type:</label>
                <select name="hospitalType" class="form-select" required>
                    <option value="">Select</option>
                    <option>0</option>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                </select>
            </div>

            <div class="d-grid">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form>
    </div>
</div>

</body>
</html>
