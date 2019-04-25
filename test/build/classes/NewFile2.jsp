 <%@ page import ="java.sql.*, java.util.*"%>
 <%@ page  import="java.awt.*" %>
<%@ page  import="java.awt.*" %>
<%@ page  import="java.io.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<%@ page import = "org.json.*" %>
<%@ page import = "com.google.gson.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bioinformatics?useSSL=false", "root",                                                                                                                                                       "");
				Statement st=conn.createStatement();
				ResultSet rs = st.executeQuery("Select * from genes");
				ArrayList<String> sampleidlist = new ArrayList<String>();
				while (rs.next()){
					sampleidlist.add(rs.getString("Sample_ID"));
				}
					
				Gson gson = new Gson();
				String list = gson.toJson(sampleidlist);
				
			}
			
		catch(Exception e)
			{
				System.out.print(e);
				e.printStackTrace();
			}
		
		
		
		%> 
    <script>
    	console.log(JSON.stringify(list));
    	
    </script>
</body>
</html>