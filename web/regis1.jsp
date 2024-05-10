<%@page import="java.sql.*" %>
<%
		String s1=request.getParameter("ui");		
		String s2=request.getParameter("un");	
                String s3=request.getParameter("up");	
                String s4=request.getParameter("uc");	
                String s5=request.getParameter("ug");	
                  String s6=request.getParameter("ud");	
		
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rido","root","123456789");
			Statement st=con.createStatement();
			
			String q="insert into student_details(ui,un,up,uc,ug,ud)values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"')";
			
			st.executeUpdate(q);
			
			out.println("<h1>Data Stored..</h1>");
                        response.sendRedirect("showall.jsp");
			
			con.close();			
		}
		
		catch(Exception e1)
		{
			out.println(e1);
		}
		
		
		%>
