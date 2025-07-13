<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Edit Book</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="d-flex justify-content-center align-items-center vh-100 bg-light">
    <div class="form-container p-4 shadow bg-white rounded" style="width: 400px;">
        <h2 class="text-center mb-4">Edit Book</h2>
        <form action="updateBook" method="post">
            <input type="hidden" name="id" value="${book.id}" />

            <div class="mb-3">
                <label for="name" class="form-label">Book Name</label>
                <input type="text" class="form-control" id="name" name="name" value="${book.name}" required>
            </div>
            <div class="mb-3">
                <label for="authorName" class="form-label">Book Author</label>
                <input type="text" class="form-control" id="authorName" name="author" value="${book.author}" required>
            </div>
            <div class="mb-3">
                <label for="prize" class="form-label">Book Prize</label>
                <input type="number" class="form-control" id="prize" name="prize" value="${book.prize}" required>
            </div>
            <div class="mb-3">
                <label for="volume" class="form-label">Book Volume</label>
                <input type="number" class="form-control" id="volume" name="volume" value="${book.volume}" required>
            </div>
            <div class="text-center">
                <button type="submit" class="btn btn-dark w-100">Update Book</button>
            </div>
        </form>

    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
