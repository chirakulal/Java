<!DOCTYPE html>
<html>
<head>
    <title>Police Station</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: linear-gradient(to right, #e0eafc, #cfdef3);
        }
        .card-hover:hover {
            box-shadow: 0 10px 20px rgba(0,0,0,0.15);
            transform: translateY(-5px);
            transition: 0.3s ease;
        }
        .icon {
            font-size: 2.5rem;
        }
    </style>
    <script src="https://kit.fontawesome.com/a2d5d5dfc6.js" crossorigin="anonymous"></script>
</head>
<body>
<div class="container text-center mt-5">
    <h1 class="mb-5 fw-bold text-dark">Police Station Complaint Portal</h1>
    <div class="row justify-content-center g-4">
        <!-- Theft Complaint Card -->
        <div class="col-md-5">
            <div class="card card-hover h-100 border-0 bg-white rounded-4 shadow-sm">
                <div class="card-body">
                    <div class="icon text-danger mb-3"><i class="fas fa-user-secret"></i></div>
                    <h5 class="card-title fw-semibold">Theft Complaint</h5>
                    <span class="badge bg-danger mb-2">High Priority</span>
                    <p class="card-text text-muted">Report items that have been stolen.</p>
                    <a href="theft.jsp" class="btn btn-outline-danger w-100">File Complaint</a>
                </div>
            </div>
        </div>
        <!-- Missing Person Card -->
        <div class="col-md-5">
            <div class="card card-hover h-100 border-0 bg-white rounded-4 shadow-sm">
                <div class="card-body">
                    <div class="icon text-warning mb-3"><i class="fas fa-user-friends"></i></div>
                    <h5 class="card-title fw-semibold">Missing Person</h5>
                    <span class="badge bg-warning text-dark mb-2">Time Sensitive</span>
                    <p class="card-text text-muted">Report someone who is missing or untraceable.</p>
                    <a href="missingperson.jsp" class="btn btn-outline-warning text-dark w-100">Report Person</a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
