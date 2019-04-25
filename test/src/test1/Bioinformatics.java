package test1;
import java.sql.*;
public class Bioinformatics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection myConn = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/Bioinformatics?useSSL=false", "root",    
							"");
			Statement myStmt = myConn.createStatement();
			Statement probStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("SELECT * FROM genes");
			while (myRs.next()){
				double intercept = 22.8028357575475;
				double ANXA5andcoeff = myRs.getDouble("ANXA5") * -0.463545847489481;
				double AP1M1andcoeff = myRs.getDouble("AP1M1") * -2.74319132120166;
				double C1GALT1C1andcoeff = myRs.getDouble("C1GALT1C1") * 0.192063241081644;
				double CLK1andcoeff = myRs.getDouble("CLK1") * -1.61522052525919;
				double EFTUD2andcoeff = myRs.getDouble("EFTUD2") * 1.25735771755908;
				double MAP1Aandcoeff = myRs.getDouble("MAP1A") * 0.00764738461181006;
				double SENP6andcoeff = myRs.getDouble("SENP6") * 0.671207814149698;
				double SENP7andcoeff = myRs.getDouble("SENP7") * 1.4510080742737;
				double TSC22D1andcoeff = myRs.getDouble("TSC22D1") * -0.850331671229241;
				double SPCS3andcoeff = myRs.getDouble("SPCS3") * -0.233999035217179;
				double ZMAT1andcoeff = myRs.getDouble("ZMAT1") * -0.107651464175192;
				double ETAA1andcoeff = myRs.getDouble("ETAA1") * -0.597683215822883;
				double ZNF493andcoeff = myRs.getDouble("ZNF493") * 1.35994075078105;
				double CCDC82andcoeff = myRs.getDouble("CCDC82") * 0.573010826436727;
				double NFYBandcoeff = myRs.getDouble("NFYB") * -0.70902476763784;
				double F13A1andcoeff = myRs.getDouble("F13A1") * -0.156169029549242;
				double TUBB1andcoeff = myRs.getDouble("TUBB1") * 0.225511191999717;
				double total = intercept + ANXA5andcoeff + AP1M1andcoeff + C1GALT1C1andcoeff
						+ CLK1andcoeff + EFTUD2andcoeff + MAP1Aandcoeff + SENP6andcoeff
						+ SENP7andcoeff + TSC22D1andcoeff + SPCS3andcoeff + ZMAT1andcoeff
						+ ETAA1andcoeff + ZNF493andcoeff + CCDC82andcoeff + NFYBandcoeff +
						F13A1andcoeff + TUBB1andcoeff;
				double probability = java.lang.Math.exp(total);	
				double finalProbability = probability / (1 + probability);
				probStmt.executeUpdate("UPDATE genes SET probability = ' " + finalProbability + " ' " + "where Sample_ID = '  " + myRs.getString("Sample_ID") + " '");
				
				
				
				
				
				
		

				
			} 
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

}
