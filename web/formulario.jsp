<%-- 
    Document   : formulario
    Created on : 26/08/2016, 10:05:34 AM
    Author     : Nicolas G.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <STYLE type="text/css">
            
            div.login-panel{margin-top: 50px;}
            div.lab1{display: inline-table;}
            div.lab1{margin-left: 170px;}
            div.botones{margin-left: 330px;
                        margin-top: 20px;  
                        margin-bottom: 20px;
            }
            
        </STYLE>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/menu.min.css" rel="stylesheet">
        <link href="css/sb-admin-2.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
        
        <title> Formulario </title>
        <meta charset="UTF-8">
        <meta  name = "viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-9 col-md-offset-2">
                    <div class="login-panel panel panel-default">
                        <div class="panel-heading">
                            <h5 class="panel-title">Formulario para prestamo de Equipos</h5>
                        </div> 
                        <div class="panel-body">
                                    <form action="Process" method="POST">
                                        <h4>Diligencie todos los datos</h4>
                                        <hr>
                                        <div class="form-group">
                                            <label>Nombre:</label> 
                                            <input type="text" name="nombre" class="form-control"/>
                                        </div>
                                        <div class="form-group">
                                            <label>Cedula:</label> 
                                            <input type="text" name="cedula" class="form-control"/>
                                        </div>
                                        <div class="form-group">
                                            <label>Programa:</label> 
                                            <input type="text" name="programa" class="form-control"/>
                                        </div>
                                        
                                        <br>
                                        <hr>
                                        <div class="form-group">
                                            <label>Categoria</label>
                                            <input type="radio" name="cat" value="Estudiante" class="form-group"> Estudiante
                                            <input type="radio" name="cat" value="Docente" class="form-group"> Docente
                                        </div>
                                        <br>
                                        <div class="form-group">   
                                            <label>Tipo de practica</label>
                                            <input type="radio" name="tp" value="Libre" class="form-group"> Libre
                                            <input type="radio" name="tp" value="Dirigida" class="form-group"> Dirigida
                                        </div>
                                        <br>
                                        <hr>
                                        <div class="lab1" class="form-control" >
                                            <label>Laboratorio</label>
                                                <select name="dropdown">
                                                <option value="B102">B102</option>
                                                <option value="B103">B103</option>
                                                <option value="B104">B104</option>
                                                <option value="B105">B105</option>
                                                <option value="B106">B106</option>
                                                <option value="B201">B201</option>
                                                <option value="B401">B401</option>
                                                <option value="F806">F806</option>
                                                <option value="Otro">Otro</option>
                                            </select>
                                            <div class="lab1" class="panel-check">
                                            <label>Equipo</label>
                                                <br>
                                                <input  type="checkbox" name="equipo" value="Fuente" class="form-group"> Fuente 
                                                <br>
                                                <input type="checkbox" name="equipo" value="Multimetro" class="form-group"> Multimetro
                                                <br>
                                                <input type="checkbox" name="equipo" value="Osciloscopio"class="form-group"> Osciloscopio
                                                <br>
                                                <input type="checkbox" name="equipo" value="CPLD" class="form-group"> CPLD
                                                <br>
                                                <input type="checkbox" name="otro" value="otro" class="form-group"> Otro
                                            </div>   
                                        </div>
                                        <br>
                                        <br>
                                        <hr>
                                        <div class="fechas" class="form-group">      
                                        <label>Fecha de prestamo (DD/MM/AAA)</label>
                                            <input type="date" name="fechaprestamo" max="2017-12-31" class="form-group">
                                        <label>Fecha de retorno (DD/MM/AAA)</label>
                                            <input type="date" name="fecharetorno" min="2010-01-02" class="form-group">
                                        </div>   
                                        <hr>
                                       <div class="botones"> 
                                        <button type="submit" class="btn btn-info btn-lg" name="submit" value="Submit">Eviar</button>
                                        <button type="reset" class="btn btn-danger btn-lg" name="reset" value="Reset">Limpiar</button>
                                       </div>

                                    </form>
                        </div>
                        <a href="index.html" class="btn btn-lg btn-primary btn-block"> Menu </a>
                    </div>
                </div>                       
            </div>                            
        </div>
    </body>
</html>
