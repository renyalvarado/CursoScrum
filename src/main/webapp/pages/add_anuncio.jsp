<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Agregar Anuncio</title>
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
            <!-- Example row of columns -->
                <div class="col-md-1 ">
                    <!--<p><a>Agregar anuncio </a></p> -->               
                </div>
                <div class="col-md-10">
                    <div class="row well" style="margin-bottom: 10px;">


                        <form role="form" action="/agregar" method="post" > 
                            <div class="form-group">
                            <label for="exampleInputEmail1">Titulo</label>
                            <input type="email" name="titulo" class="form-control" id="exampleInputEmail1" placeholder="Escriba el nombre del producto">
                          </div>
                            
                          <div class="form-group">
                            <label for="exampleInputEmail1">Producto</label>
                            <input type="email" name="productos" class="form-control" id="exampleInputEmail1" placeholder="Escriba el nombre del producto">
                          </div>
                            
                          <div class="form-group">
                            <label for="exampleInputPassword1">Comercio</label>
                            <input type="input" name="comercio" class="form-control" id="exampleInputPassword1" placeholder="Escriba el nombre del comercio">
                          </div>
                            
                          <div class="form-group">
                            <label for="exampleInputPassword1">Direccion</label>
                            <textarea class="form-control" name="direccion" rows="3" placeholder='Escriba la direccion del comercio'></textarea>
                          </div> 
                            
                          <div class="form-group">
                            <button type="submit" class="btn btn-success pull-right">Agregar anuncio</button>  
                          </div>       
                            
                        
                        
                    </div>            
                    
                    
                </div>
               
            </div>

            <hr>

            <%@include file="includes/footer.jsp" %>
        </div> <!-- /container -->
    </body>
</html>
