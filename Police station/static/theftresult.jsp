<!DOCTYPE html>
<html>
<head>
    <title>Theft Complaint Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="alert alert-success shadow">
        <h4 class="alert-heading"> Theft Complaint Submitted!</h4>
        <hr>
        <p><strong>Name:</strong> ${name}</p>
        <p><strong>Mobile:</strong> ${mobile}</p>
        <p><strong>Age:</strong> ${age}</p>
        <p><strong>Address:</strong> ${address}</p>
        <p><strong>Location of Theft:</strong> ${location}</p>
        <p><strong>Item Lost:</strong> ${item}</p>
        <p><strong>Date of Theft:</strong> ${lostOn}</p>
        <hr>
        <p class="mb-0 text-end"><a href="index.jsp" class="btn btn-outline-success">Go Back to Home</a></p>
    </div>
</div>
</body>
</html>
