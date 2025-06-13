<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Job Application</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: #f8f9fa;
            font-family: 'Segoe UI', sans-serif;
        }
        .form-container {
            max-width: 600px;
            margin: 50px auto;
            padding: 30px;
            background: #fff;
            border-radius: 15px;
            box-shadow: 0 5px 15px rgba(0,0,0,0.1);
        }
        h1 {
            text-align: center;
            margin-bottom: 25px;
        }
    </style>
</head>
<body>

<div class="form-container">
    <h1>Job Application</h1>
    <form action="jobAplication" method="post">
        <div class="mb-3">
            <label for="exampleInputName" class="form-label">Name</label>
            <input type="text" class="form-control" id="exampleInputName" name="name" placeholder="Enter your name">
        </div>

        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input type="email" class="form-control" id="exampleInputEmail1" name="email" placeholder="Enter your email">
        </div>

        <div class="mb-3">
            <label for="exampleInputEducation" class="form-label">Education</label>
            <select class="form-select" id="exampleInputEducation" name="education">
                <option selected>Select</option>
                <option>B.E</option>
                <option>B.Tech</option>
                <option>BCA</option>
                <option>MCA</option>
                <option>B.Com</option>
                <option>M.Com</option>
            </select>
        </div>

        <div class="mb-3">
            <label for="exampleInputSkills" class="form-label">Skills</label>
            <input type="text" class="form-control" id="exampleInputSkills" name="skills" placeholder="Enter your skills">
        </div>

        <div class="mb-3">
            <label for="exampleInputSalary" class="form-label">Expected Salary</label>
            <input type="text" class="form-control" id="exampleInputSalary" name="expectedSalary" placeholder="Expected salary in INR">
        </div>

        <div class="mb-3">
            <label for="exampleInputexperience" class="form-label">Experience</label>
            <select class="form-select" id="exampleInputexperience" name="experience">
                <option selected>0</option>
                <option>1</option>
                <option>2</option>
                <option>3</option>
            </select>
        </div>

        <div class="d-grid">
            <button type="submit" class="btn btn-primary">Submit Application</button>
        </div>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
