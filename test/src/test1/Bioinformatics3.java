package test1;
import java.sql.*;
public class Bioinformatics3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection myConn = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/Bioinformatics?useSSL=false", "root",                        												  "");
			Statement myStmt = myConn.createStatement();
			Statement probStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("SELECT 'Sample_ID','ANXA5','AP1M1','C1GALT1C1','CLK1',"
					+ "'EFTUD2','MAP1A','SENP6','SENP7','TSC22D1','SPCS3','ZMAT1','ETAA1','ZNF493','CCDC82','NFYB','F13A1','TUBB1','probability',"
					+ "'ANXA5Median','AP1M1Median', 'C1GALT1C1Median', 'CLK1Median', 'EFTUD2Median',"
					+ "'MAP1AMedian', 'SENP6Median', 'SENP7Median', 'TSC22D1Median', 'SPCS3Median', 'ZMAT1Median',"
					+ "'ETAA1Median', 'ZNF493Median', 'CCDC82Median', 'NFYBMedian', 'F13A1Median', 'TUBB1Median' UNION ALL "
					+ "(Select * from genesHeatmap) INTO OUTFILE '/Users/Steven/database3.csv' FIELDS TERMINATED BY ','");
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

}
