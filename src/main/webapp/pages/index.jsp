<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Inicio</title>
        <%@include file="includes/general_resources.jsp" %>
    </head>

    <body>
        <%@include file="includes/header.jsp" %>
        <!-- Main jumbotron for a primary marketing message or call to action -->
        <div class="jumbotron">
            <div class="container">  <h1> ${user.lastname}</h1>               
                </div>
        </div>

        <div class="container">
            
             <c:forEach var="anuncio" items="${anuncios}">
                    <div class="row well" style="margin-bottom: 10px;">
                        <div class="col-md-2">
                            <a class="thumbnail">
                                <img src="http://placehold.it/140x190" />
                            </a>
                        </div>
                        <div class="col-md-8">
                            <h3><c:out value="${anuncio.titulo}"/></h3>
                            <p>12/01/2014 12:00pm</p> 
                            <p><a>Comercio 1</a></p>
                            <p>Los cortijos</p>                            
                        </div>
                    </div>
                   
                </c:forEach>
            <!-- Example row of columns -->
                <div class="col-md-2">
                    <h2>Productos</h2>
                    <p><a>Producto 1 </a></p>
                    <p><a>Producto2 </a></p>
                    
                </div>
                <div class="col-md-10">
                    <div class="row">
                        <h2>Anuncios:</h2>
                    </div>
                    
                    <div class="row well" style="margin-bottom: 10px;">
                        <div class="col-md-2">
                            <a class="thumbnail">
                                <img src="http://placehold.it/140x190" />
                            </a>
                        </div>
                        <div class="col-md-8">
                            <h3>Azucar</h3>
                            <p>12/01/2014 12:00pm</p>
                            <p><a>Comercio 1</a></p>
                            <p>Los cortijos</p>                            
                        </div>
                    </div>

                    <div class="row well" style="margin-bottom: 10px;">
                        <div class="col-md-2">
                            <a class="thumbnail">
                                <img src="http://placehold.it/140x190" />
                            </a>
                        </div>
                        <div class="col-md-8">
                            <h3>Carne</h3>
                            <p>12/01/2014 12:00pm</p>
                            <p><a>Comercio 2</a></p>
                            <p> LA california</p>                            
                        </div>
                    </div>

                    <div class="row well" style="margin-bottom: 10px;">
                        <div class="col-md-2">
                            <a class="thumbnail">
                                <img src="http://placehold.it/140x190" />
                            </a>
                        </div>
                        <div class="col-md-8">
                            <h3>pollo</h3>
                            <p>12/01/2014 12:00pm</p>
                            <p><a>Comercio 3</a></p>
                            <p>Los cortijos</p>                            
                        </div>
                    </div>                    
                    
                    
                    
                    
                    
                    
                    
                    
                    

                    
                    
                    
                    
                </div>
               
            </div>

            <hr>

            <%@include file="includes/footer.jsp" %>
        </div> <!-- /container -->
    </body>
</html>
