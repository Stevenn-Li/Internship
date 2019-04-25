package test1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection myConn = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/test?useSSL=false", "root",                        												  "");
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("SELECT * FROM attendanceSheet order by first_name");
			while (myRs.next()){
				

				System.out.println("First Name: " + myRs.getString("first_name") + 
						", Last Name: " + myRs.getString("last_name") +
						", Age: " + myRs.getString("age") +
						", Gender: " + myRs.getString("gender"));
						
			} 
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

}