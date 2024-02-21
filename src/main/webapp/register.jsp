<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admission app</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <style>
        /* Add some basic styling to the body */
        body {

        }

        /* Style the card */
        .card {
            width: 700px;
            border-radius: 10px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            margin-left: 400px;
            margin-top: 50px;

        }

        /* Style the card header */
        .card-header {
            text-align: center;
            padding: 15px;
            font-size: 1.5rem;
            background-color: #343a40;
            color: #fff;
            border-top-left-radius: 10px;
            border-top-right-radius: 10px;
        }

        /* Style the card body */
        .card-body {
            padding: 60px;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        /* Style the table */
        table {
            width: 100%;
            border-collapse: collapse;
        }

        /* Style the table cells */
        td {
            padding: 10px;
            vertical-align: top;
        }

        /* Style the form */
        form {
            width: 100%;
        }

        /* Style the form inputs */
        input[type="text"], input[type="email"], input[type="password"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-bottom: 10px;
        }

        /* Style the submit button */
        button[type="submit"] {
            background-color: #343a40;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
        }

        /* Style the image */
        img {
            width: 100%;
            border-radius: 10px;
        }
    </style>
</head>
<header>
    <nav class="navbar bg-body-tertiary">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">
                <strong >Admission App</strong>
            </a>
        </div>
    </nav>
</header>
<body>
<div class="card">
    <div class="card-header">
        <h2>Student Admission form</h2>
    </div>
    <div class="card-body">
        <form method="post" action="RegisterServlet"
<%--              enctype="multipart/form-data"--%>
        >
            <table style="height: 100px;">
                <tr>
                    <td>
                        <div class="mb-3">
                            <label for="firstName" class="form-label">First name</label>
                            <input type="text" class="form-control" id="firstName" name="fName">
                        </div>
                        <div class="mb-3">
                            <label for="lastName" class="form-label">Last name</label>
                            <input type="text" class="form-control" id="lastName" name="lName">
                        </div>
                        <div class="mb-3">
                            <label for="emailAddress" class="form-label">Email</label>
                            <input type="text" class="form-control" id="emailAddress" name="email">
                        </div>
                        <div class="mb-3">
                            <label for="phoneNumber" class="form-label">Phone number</label>
                            <input type="text" class="form-control" id="phoneNumber" name="phoneNumber">
                        </div>
                        <div class="mb-3">
                            <label for="dateOfBirth" class="form-label">Date of birth</label>
                            <input type="date" class="form-control" id="dateOfBirth" name="dateOfBirth">
                        </div>
                    </td>
                    <td>
                        <div class="mb-3">
                            <label for="facultyOfInterest" class="form-label">Faculty of interest</label>
                            <input type="text" class="form-control" id="facultyOfInterest" name="faculty">
                        </div>
                        <div class="mb-3">
                            <label for="department" class="form-label">Department of interest</label>
                            <input type="text" class="form-control" id="department" name="department">
                        </div>
                        <div class="mb-3">
                            <label for="address1" class="form-label">Address</label>
                            <input type="text" class="form-control" id="address1" name="address">
                        </div>
                        <div class="mb-3">
                            <label for="nationality" class="form-label">Nationality</label>
                            <input type="text" class="form-control" id="nationality" name="nationality">
                        </div>
                        <div class="mb-3">
                            <label for="documentUpload" class="form-label">Upload Documents</label>
                            <input type="file" class="form-control" id="documentUpload" name="documentUpload" accept=".pdf, .doc, .docx">
                        </div>
                    </td>
                </tr>
            </table>
            <button type="submit" class="btn btn-primary">Apply</button>
        </form>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>