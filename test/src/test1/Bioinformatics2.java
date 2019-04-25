package test1;
import java.sql.*;
public class Bioinformatics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection myConn = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/Bioinformatics?useSSL=false", "root",    
							"");
			Statement myStmt = myConn.createStatement();
			Statement probStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("SELECT 'Sample_ID','ACR_Class','ANXA5','AP1M1','C1GALT1C1','CLK1',"
					+ "'EFTUD2','MAP1A','SENP6','SENP7','TSC22D1','SPCS3','ZMAT1','ETAA1','ZNF493','CCDC82','NFYB','F13A1','TUBB1','Set_Type','probability' UNION ALL "
					+ "(Select * from genes WHERE Sample_ID = 'R.1537.15' or Set_Type = '0' ORDER BY probability "
					+ "LIMIT 9999) INTO OUTFILE '/Users/Steven/database8.csv' FIELDS TERMINATED BY ','");
			
					
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

}
