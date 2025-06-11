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

<body class="overflow-auto">
<div class="d-flex justify-content-center align-items-start py-5">
    <div class="container">
        <div class="form-container mx-auto">
            <h1>Death Certificate</h1>
            <form action="marriageCertificate" method="POST">
                <div class="mb-3">
                    <label class="form-label">Groom Name</label>
                    <input type="text" class="form-control" name="groomName" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Bride Name</label>
                    <input type="text" class="form-control" name="brideName" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Location</label>
                    <input type="text" class="form-control" name="location" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Address</label>
                    <input type="text" class="form-control" name="address" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Religion</label>
                    <select name="religion" class="form-select" required>
                        <option value="">Select</option>
                        <option>Hindu</option>
                        <option>Muslim</option>
                        <option>Christian</option>
                        <option>Buddhism</option>
                    </select>
                </div>


                <div class="mb-3">
                    <label class="form-label">Date</label>
                    <input type="date" class="form-control" name="date" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Witness1</label>
                    <input type="text" class="form-control" name="witness1" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Witness2</label>
                    <input type="text" class="form-control" name="witness2" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Officer Present</label>
                    <input type="text" class="form-control" name="officer" required>
                </div>


                <div class="d-grid">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
