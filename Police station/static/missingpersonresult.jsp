<!DOCTYPE html>
<html>
<head>
    <title>Missing Person Report Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="alert alert-warning shadow">
        <h4 class="alert-heading"> Missing Person Report Received</h4>
        <hr>
        <p><strong>Missing Person Name:</strong> ${missingName}</p>
        <p><strong>Complaintee Mobile:</strong> ${complainteeMobile}</p>
        <p><strong>Age:</strong> ${age}</p>
        <p><strong>Address:</strong> ${address}</p>
        <p><strong>Last Seen Location:</strong> ${location}</p>
        <p><strong>Identifiable Marks:</strong> ${marks}</p>
        <p><strong>Gender:</strong> ${gender}</p>
        <p><strong>Languages Known:</strong> ${lang}</p>
        <hr>
        <p class="mb-0 text-end"><a href="index.jsp" class="btn btn-outline-warning">Go Back to Home</a></p>
    </div>
</div>
</body>
</html>
