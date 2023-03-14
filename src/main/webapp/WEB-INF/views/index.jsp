<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>To Do App</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
            crossorigin="anonymous"></script>
    </head>

    <body>
        <div class="container mt-3">
            <h1 class="text-center">Welcome to TO-DO manager</h1>
            <div class="row mt-4">
                <div class="col-md-2">
                    <h3 class="text-center">Options</h3>
                    <div class="list-group">
                        <button type="button" class="list-group-item list-group-item-action active" aria-current="true">Menu</button>
                        <button type="button" class="list-group-item list-group-item-action">Add To-do</button>
                        <button type="button" class="list-group-item list-group-item-action">View To-do</button>
                    </div>
                </div>
                <div class="col-md-10">
                    <h3 class="text-center">Content</h3>
                </div>
            </div>
        </div>
    </body>

    </html>