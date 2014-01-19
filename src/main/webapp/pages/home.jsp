<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Inicio</title>
        <%@include file="includes/general_resources.jsp" %>
    </head>

    <body>
        <%@include file="includes/header.jsp" %>
        <div class="container">
            <h1>${message} ${user.firstname}</h1>
            <%@include file="includes/footer.jsp" %>
        </div> <!-- /container -->
    </body>
</html>