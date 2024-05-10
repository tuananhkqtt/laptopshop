<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Delete User</title>
                <!-- Latest compiled and minified CSS -->
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
                <!-- Latest compiled JavaScript -->
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

                <!-- <link rel="stylesheet" href="css/demo.css"> -->
            </head>

            <body>
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-md-6 col-12 mx-auto" style="width: 100%;">
                            <h3>Delete User with id: ${id}</h3>
                            <hr />
                            <div class="alert alert-danger" role="alert">
                                Are you sure delete this user!
                            </div>

                            <form:form action="/admin/user/delete" method="post" modelAttribute="user">
                                <div class="mb-3" style="display: none;">
                                    <label class="form-label">Id:</label>
                                    <form:input path="id" type="number" class="form-control" value="${id}" />
                                </div>
                                <button class="btn btn-danger mt-3">Confirm</button>
                            </form:form>

                            <a href="/admin/user" class="btn btn-success mt-3">Back</a>
                        </div>

                    </div>

                </div>

            </body>

            </html>
