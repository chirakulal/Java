<!DOCTYPE html>
<html>
<head>
    <title>Weather Report Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="alert alert-info">
        <h4 class="alert-heading">Weather Report Generated!</h4>
        <hr>
        <p><strong>Name</strong> ${dto.location}</p>
        <p><strong>Captured By:</strong> ${dto.capturedBy}</p>
        <p><strong>Temperature:</strong> ${dto.temperature} °C</p>
        <p><strong>Recorded Date:</strong> ${dto.date}</p>
    </div>
</div>
</body>
</html>
