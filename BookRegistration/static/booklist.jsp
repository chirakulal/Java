<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Book List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <h2 class="mb-4 text-center">Book List</h2>
    <table class="table table-bordered table-striped">
        <thead class="table-dark text-center">
        <tr>
            <th>ID</th>
            <th>Book Name</th>
            <th>Author</th>
            <th>Price (₹)</th>
            <th>Volume</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="book" items="${dto}">
            <tr>
                <td>${book.id}</td>
                <td>${book.name}</td>
                <td>${book.author}</td>
                <td>${book.prize}</td>
                <td>${book.volume}</td>
                <td class="text-center">
                    <a href="editBook?id=${book.id}" class="btn btn-sm btn-warning">Edit</a>
                </td>
                <td class="text-center">
                    <a href="deleteBook?id=${book.id}" class="btn btn-sm btn-danger"
                       onclick="return confirm('Are you sure you want to delete this book?');">
                        Delete
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
