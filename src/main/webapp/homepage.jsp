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
            margin-top: 100px;

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
            padding: 20px;
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

        /*!* Style the image *!*/
        .img {
            width: 400px;
            height: 200px;
            border-radius: 10px;
            align-self: self-end;
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
<%--<div class="card">--%>

<%--    <div class="card-body ">--%>
<%--        <div class="card-body">--%>
<%--            <img src="https://i.ebayimg.com/images/g/K3QAAOSwexNiVcJD/s-l1600.jpg" alt="School Image" class="img-fluid mb-3">--%>

<%--            <h2>Join our vibrant learning community!</h2>--%>

<%--            <p>We are excited to invite you to apply to our institution and embark on a transformative educational journey. At [School Name], we offer a diverse range of programs, dedicated faculty, and a supportive environment to help you achieve your academic goals.</p>--%>

<%--            <ul>--%>
<%--                <li>Accredited programs with industry-relevant skills</li>--%>
<%--                <li>Small class sizes for personalized attention</li>--%>
<%--                <li>State-of-the-art facilities and resources</li>--%>
<%--                <li>Vibrant campus life and diverse community</li>--%>
<%--                <li>Financial aid and scholarship opportunities</li>--%>
<%--            </ul>--%>

<%--            <a href="application-link" class="btn btn-primary btn-lg">Apply Now!</a>--%>

<%--            <p class="mt-3">--%>
<%--                <small>Have questions? Contact our admissions team at <a href="mailto:admissions@school.com">admissions@school.com</a> or call us at +1 (555) 555-5555.</small>--%>
<%--            </p>--%>
<%--        </div>--%>
<%--    </div>--%>

<%--</div>--%>

<div class="card" style="width: 50rem;">
    <img src="https://i.ebayimg.com/images/g/K3QAAOSwexNiVcJD/s-l1600.jpg" alt="School Image" class="img">
    <div class="card-body">
        <h2 class="card-title">Join our vibrant learning community!</h2>
        <p class="card-text">We are excited to invite you to apply to our institution and embark on a transformative educational journey. At Example University, we offer a diverse range of programs,
            dedicated faculty, and a supportive environment to help you achieve your academic goals.</p>
        <ul>
                <li>Accredited programs with industry-relevant skills</li>
                    <li>Small class sizes for personalized attention</li>
         <li>State-of-the-art facilities and resources</li>
   <li>Vibrant campus life and diverse community</li>
      <li>Financial aid and scholarship opportunities</li>
  </ul>
        <a href="register.jsp" class="btn btn-primary">Apply Now!</a>

        <p class="mt-3">
            <small>Have questions? Contact our admissions team at <a href="brenda:admissions@school.com">brenda@school.com</a> or call us at +250 777 777 777.</small>
                      </p>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>