<%-- 
    Document   : index
    Created on : 20-may-2020, 18:07:05
    Author     : Pablo Jacobo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
        <title>JSP Page</title>
        <style>
            #max-space-card{
                width: 40%;
                margin: auto;
                margin-top: 10%;
            }
        </style>
    </head>
    <body>
        <div class="card" id="max-space-card">
            <div class="card-body" >
                <form method="post" action="OperationsController" >
                <div class="form-group"  >
                    <label for="exampleInputEmail1">Operaciones Validas</label>
                    <div class="form-check">
                        <input class="form-check-input"  type="radio"  name="action" id="exampleRadios1" value="suma" checked>
                        <label class="form-check-label" for="exampleRadios1">
                          Suma
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="action" id="exampleRadios1" value="resta" checked>
                        <label class="form-check-label" for="exampleRadios1">
                            Resta
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="action" id="exampleRadios1" value="multiplicacion" checked>
                        <label class="form-check-label" for="exampleRadios1">
                            Multiplicacion
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="action" id="exampleRadios1" value="division" checked>
                        <label class="form-check-label" for="exampleRadios1">
                            Division
                        </label>
                    </div>
                </div>
                <div class="form-group"  >
                  <label for="exampleInputEmail1">Numero 1</label>
                  <input 
                    type="text" 
                    class="form-control" 
                    id="exampleInputEmail1"
                    name="n1"
                    aria-describedby="emailHelp">
                </div>
                <div class="form-group"  > 
                  <label for="exampleInputPassword1">Numero 2</label>
                  <input 
                    type="text" 
                    class="form-control" 
                    name="n2"
                    id="exampleInputPassword1">
                </div>
                <input  name="accion" type="hidden" value="login">
                <button type="submit" class="btn btn-success btn-lg btn-block">Operar</button>
              </form>
            </div>
        </div>
    </body>
</html>
