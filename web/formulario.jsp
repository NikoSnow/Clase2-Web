<%-- 
    Document   : formulario
    Created on : 26/08/2016, 10:05:34 AM
    Author     : Nicolas G.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <title> Formulario </title>
        <meta charset="UTF-8">
        <meta  name = "viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="Process" method="POST">
            First name: <input type="text" name="first_name"/>
            <br>
            Last name: <input type="text" name="last_name"/>
            <br>
            Password: <input type="password" name=""password/>
            <br>
            <textarea rows="5" cols="50" name="description"> </textarea>

            <br>
            Preferences
            <input type="checkbox" name="math" value="on"> Maths
            <input type="checkbox" name="physics" value="on"> Physics
            <br>
            
            Gender
            <input type="radio" name="subject" value="M"> M
            <input type="radio" name="subject" value="F"> F
            <br>
            
            Sport
            <select name="dropdown">
                <option value="M" selected>Soccer</option>
                <option value="F">Swimming</option>
            </select>
            <br>
            
            Car
            <select name="car" multiple>
                <option value="volvo">Volvo</option>
                <option value="saab">Saab</option>
                <option value="opel">Opel</option>
                <option value="audi">Audi</option>
            </select>
            <br>
            <input type="hidden" name="pagename" value="10" />
            <input type="submit" name="submit" value="Submit" />
            <input type="reset" name="reset" value="Reset" />
        </form>
        <h1>...</h1>
    </body>
</html>
