<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Curso Scrum</a>
        </div>
        <div class="navbar-collapse collapse">
            <form class="navbar-form navbar-right" role="form" action="Home" method="post">
                <% if (session.getAttribute("user") == null) { %>
                    <div class="form-group">
                        <input id="username" name="username" type="text" placeholder="Usuario" class="form-control">
                    </div>
                    <div class="form-group">
                        <input id="password" name="password" type="password" placeholder="Contraseña" class="form-control">
                    </div>
                    <button type="submit" class="btn btn-success">Ingresar</button>
                <% } else { %>
                    <a role="button" href="logout" class="btn btn-primary">Salir</a>
                <% }%>
            </form>
        </div><!--/.navbar-collapse -->
    </div>
</div>

