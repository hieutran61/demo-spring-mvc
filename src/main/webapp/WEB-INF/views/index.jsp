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
                        <a href="<c:url value='/add'/>" type="button" class="list-group-item list-group-item-action">Add To-do</a>
                        <a href="<c:url value='/home'/>"type="button" class="list-group-item list-group-item-action">View To-do</a>
                    </div>
                </div>
                <div class="col-md-10">
                    <c:if test="${page == 'home'}" >
                        <h1 class="text-center">All TODOS</h1>
                    </c:if>
                    <c:if test="${page == 'add'}" >
                        <h1 class="text-center">ADD TODO</h1>
                        <form action="<c:url value='saveTodo'/>" method="post" modelAttribute="todo">
                            <div class="form-group">
                                <input type="text" name="todoTitle" class="form-control" placeholder="Enter to-do title">
                            </div>
                            <div class="form-group">
                                <textarea name="todoContent" class="form-control" rows="10" placeholder="Enter to-do content"></textarea>
                            </div>
                            <div class="text-center">
                                <button type="submit" class="btn btn-outline-success">Add To-do</button>
                            </div>
                        </form>
                    </c:if>

                </div>
            </div>
        </div>
    </body>

    </html>