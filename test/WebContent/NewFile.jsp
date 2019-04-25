 <%@ page import ="java.sql.*, java.util.*"%>
 <%@ page  import="java.awt.*" %>
<%@ page  import="java.awt.*" %>
<%@ page  import="java.io.*" %>
<%@ page  import="org.jfree.chart.*" %>
<%@ page  import="org.jfree.chart.axis.*" %>
<%@ page  import="org.jfree.chart.entity.*" %>
<%@ page  import="org.jfree.chart.labels.*" %>
<%@ page  import="org.jfree.chart.plot.*" %>
<%@ page  import="org.jfree.chart.renderer.category.*" %>
<%@ page  import="org.jfree.chart.urls.*" %>
<%@ page  import="org.jfree.data.category.*" %>
<%@ page  import="org.jfree.data.general.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP List</title>
</head>

<style>
	body {
			background: linear-gradient(to right,#7FDBFF,#86fde8);
		}
	th {font-style: italic};
</style>

<body>

    <div align="center">	
		 <sql:setDataSource
        var="ListOfUsers"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/test?useSSL=false"
        user="root" 																															                                              password=""
    />
   
	<sql:query var="listUsers" dataSource="${ListOfUsers}">
        SELECT * FROM attendanceSheet;
    </sql:query>
 
        <table border="1" cellpadding="5">
            <caption>
            	<h2>List</h2>
            </caption>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Age</th>
                <th>Gender</th>
            </tr>
            <c:forEach var="attendanceSheet" items="${listUsers.rows}">
                <tr>
                    <td><c:out value="${attendanceSheet.first_name}" /></td>
                    <td><c:out value="${attendanceSheet.last_name}" /></td>
                    <td><c:out value="${attendanceSheet.age}" /></td>
                    <td><c:out value="${attendanceSheet.gender}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <form method="post" action="NewFile.jsp">
				<span style ="font-weight:bold">First name:</span><br>
				<input type="text" name="first_name" id = "first">
				<br>
				<span style ="font-weight:bold">Last name:</span><br>
				<input type="text" name="last_name">
				<br>
				<span style ="font-weight:bold">Age:</span><br>
				<input type="text" name="age">
				<br>
				<span style ="font-weight:bold">Gender:</span><br>
				<input type="text" name="gender">
				<br><br>
				<input type="submit" value="Submit">
		</form>
		<%
		
		
		String first_name=request.getParameter("first_name");
		String last_name=request.getParameter("last_name");
		String age=request.getParameter("age");
		String gender=request.getParameter("gender");
		
		try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root",                                                                                                                                                       "");
				Statement st=conn.createStatement();
				
				int i=st.executeUpdate("insert into attendanceSheet(first_name,last_name,age,gender)values('"+first_name+"','"+last_name+"','"+age+"','"+gender+"')");
				int j = st.executeUpdate("delete from attendanceSheet where first_name = 'null'");
				int k = st.executeUpdate("delete from attendanceSheet where first_name = ''");
				int l = st.executeUpdate("delete from attendanceSheet where last_name = ''");
				int m = st.executeUpdate("delete from attendanceSheet where age = ''");
				int n = st.executeUpdate("delete from attendanceSheet where gender = ''");
			}
			
		catch(Exception e)
			{
				System.out.print(e);
				e.printStackTrace();
			}
		
		
		
		%> 
		
		<br>
		<button type="button" onClick="Refresh()">Refresh Page to check if you have successfully submitted</button>
<script>
    function Refresh() {
        window.parent.location = window.parent.location.href;
    }
    
</script>
 <img src="file:///Users/Steven/Documents/workspace/Database/test1/BarChart.png" 	
 alt="Barchart of the Ages" width="350" height="350">
</body>
</html>