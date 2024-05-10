<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <link rel="Stylesheet" href="mycss.css">
    <title>Document</title>
</head>
<body>
    <%@include file="menu.jsp" %>
    <div id="data">
          <form name="rform" form action="regis1.jsp" method="post" onsubmit="show1()">
              
        <center>
            <table cellpadding="10px">
                <th><h1> Registration Page </h1></th>
                
                <tr>
                    <td> enter ID <font id="unId"></font></td>
                    <td> <input type="number" placeholder="Enter ID"name="ui" ></td>
                </tr>
                
                <tr>
                <td> Enter Name <font id="unMsg"></font></td>
                <td> <input type="text" placeholder="Enter Name"name="un" onkeyup="show2(this)"> </td>
                </tr>
                
                <tr>
                <td> Enter mob no. <font id="upm"></font></td>
                <td> <input type="number"placeholder="Enter mob no"name="up" onkeyup="show2(this)" > </td>
                </tr>
                
                <tr>
                <td> City<font id="uci"></font></td>
                <td> <input type="text"placeholder="city"name="uc" onkeyup="show2(this)" > </td>
                </tr>
                
                
                <tr>
                <td> Gender <font id="ugMsg"></font></td>
                <td> Male<input type="radio" name="ug" value="Male" onchange="show2(this)"> </td>&nbsp;&nbsp;&nbsp;&nbsp;<td> feMale<input type="radio" name="ug" value="FeMale" onchange="show2(this)"> </td>
                </tr>
                <tr>
                    <tr>
                       <td> DOB <font id="udo"></font></td>
                            <td><input type="date" name="ud"></td>
                    </tr>
                <th colspan="3"> <input type="submit" value="Register" class="B"> </th>
                </tr>
                
                
                </table>
                  </form>
                </center>
                    
                </div>
</body>
</html>