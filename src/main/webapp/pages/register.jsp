<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>REgistrar Usuario</title>
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


                        <form role="form"  > 
                          <div class="form-group">
                            <label for="exampleInputEmail1">Nombre</label>
                            <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Escriba el nombre del producto">
                          </div>
                            
                          <div class="form-group">
                            <label for="exampleInputPassword1">Apellido</label>
                            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Escriba la fecha de publicacion">
                          </div>

                          <div class="form-group">
                            <label for="exampleInputPassword1">User Name</label>
                            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Escriba el nombre del comercio">
                          </div>
                            
                          <div class="form-group">
                            <label for="exampleInputPassword1">Direccion</label>
                            <textarea class="form-control" rows="3" placeholder='Escriba la direccion del comercio'></textarea>
                          </div> 
                            
                          <div class="form-group">
                            <button type="submit" class="btn btn-success pull-right">Agregar Usuario</button>  
                          </div>       
                            
                        
                        
                    </div>            
                    
                    
                </div>
               
            </div>

            <hr>

            <%@include file="includes/footer.jsp" %>
        </div> <!-- /container -->
    </body>
</html>
