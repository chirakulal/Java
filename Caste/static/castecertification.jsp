<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Caste Certificate Form</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f8f9fa;
        }
        .form-container {
            max-width: 700px;
            margin: 50px auto;
        }
    </style>
</head>
<body>

<div class="container form-container">
    <div class="card shadow p-4">
        <h2 class="mb-4 text-center text-primary">Caste Certificate Application</h2>

        <form action="submitCaste" method="post">

            <!-- Full Name (String) -->
            <div class="mb-3">
                <label for="fullName" class="form-label">Full Name</label>
                <input type="text" class="form-control" id="fullName" name="fullName" placeholder="Enter your full name" required>
            </div>

            <!-- Address (String) -->
            <div class="mb-3">
                <label for="address" class="form-label">Address</label>
                <textarea class="form-control" id="address" name="address" rows="3" placeholder="Enter your address" required></textarea>
            </div>

            <!-- Caste (String) -->
            <div class="mb-3">
                <label for="caste" class="form-label">Caste</label>
                <input type="text" class="form-control" id="caste" name="caste" placeholder="Enter your caste" required>
            </div>

            <!-- Gender (String) -->
            <div class="mb-3">
                <label for="gender" class="form-label">Gender</label>
                <select class="form-select" id="gender" name="gender" required>
                    <option selected disabled value="">Choose...</option>
                    <option>Male</option>
                    <option>Female</option>
                    <option>Other</option>
                </select>
            </div>

            <!-- Occupation (String) -->
            <div class="mb-3">
                <label for="occupation" class="form-label">Occupation</label>
                <input type="text" class="form-control" id="occupation" name="occupation" placeholder="Enter your occupation" required>
            </div>

            <!-- Age (Number) -->
            <div class="mb-3">
                <label for="age" class="form-label">Age</label>
                <input type="number" class="form-control" id="age" name="age" min="0" placeholder="Enter your age" required>
            </div>

            <!-- Annual Income (Number) -->
            <div class="mb-3">
                <label for="income" class="form-label">Annual Income (₹)</label>
                <input type="number" class="form-control" id="income" name="income" min="0" placeholder="Enter annual income" required>
            </div>

            <!-- Is Below Poverty Line? (Boolean) -->
            <div class="form-check mb-4">
                <input class="form-check-input" type="checkbox" id="bpl" name="bpl" value="true" >
                <label class="form-check-label" for="bpl">
                    Belongs to Below Poverty Line (BPL)
                </label>
            </div>

            <!-- Submit Button -->
            <div class="d-grid">
                <button type="submit" class="btn btn-success btn-lg">Submit Application</button>
            </div>

        </form>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>