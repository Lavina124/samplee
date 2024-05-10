<%@page import="java.sql.*" %>
<html>
    <head>
        <link rel="Stylesheet" href="mycss.css">
        </head>
        <body>
            <%@include file="show.jsp" %>
                 <h1><center>DATA STORAGE </center></h1>

            <div id="data">
                <%
                try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rido","root","123456789");
			Statement st = con.createStatement();
			
			String q = "select* from student_details";
			ResultSet re = st.executeQuery(q);
                        %>
			<form>  
<label> Select  </label>  
<select>  
<option value = "uc"> city   
</option>  
<option value = "ug"> Gender
</option>  
<option value = "ud"> DoB  
</option>  
 
</select>  
</form>  
			
			</center>
                        
                        <%
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
                        }
%>

</div>	
            

        </body>
</html>