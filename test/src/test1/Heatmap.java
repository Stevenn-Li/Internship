package test1;
import java.sql.*;
import java.util.ArrayList;
public class Heatmap {

	
	public static double calculateStDev(ArrayList<Double> arr, double mean){
		double StDev = 0.0;
		
		for (double num : arr){
			StDev += Math.pow(num - mean, 2);
		}		
		return Math.sqrt(StDev/arr.size());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//total of each gene and then the mean
		ArrayList<Double> ANXA5MeanArray = new ArrayList<Double>();
		ArrayList<Double> AP1M1MeanArray = new ArrayList<Double>();
		ArrayList<Double> C1GALT1C1MeanArray = new ArrayList<Double>();
		ArrayList<Double> CLK1MeanArray = new ArrayList<Double>();
		ArrayList<Double> EFTUD2MeanArray = new ArrayList<Double>();
		ArrayList<Double> MAP1AMeanArray = new ArrayList<Double>();
		ArrayList<Double> SENP6MeanArray = new ArrayList<Double>();
		ArrayList<Double> SENP7MeanArray = new ArrayList<Double>();
		ArrayList<Double> TSC22D1MeanArray = new ArrayList<Double>();
		ArrayList<Double> SPCS3MeanArray = new ArrayList<Double>();
		ArrayList<Double> ZMAT1MeanArray = new ArrayList<Double>();
		ArrayList<Double> ETAA1MeanArray = new ArrayList<Double>();
		ArrayList<Double> ZNF493MeanArray = new ArrayList<Double>();
		ArrayList<Double> CCDC82MeanArray = new ArrayList<Double>();
		ArrayList<Double> NFYBMeanArray = new ArrayList<Double>();
		ArrayList<Double> F13A1MeanArray = new ArrayList<Double>();
		ArrayList<Double> TUBB1MeanArray = new ArrayList<Double>();
		double ANXA5total = 0.0;
		double AP1M1total = 0.0;
		double C1GALT1C1total = 0.0;
		double CLK1total = 0.0;
		double EFTUD2total = 0.0;
		double MAP1Atotal = 0.0;
		double SENP6total = 0.0;
		double SENP7total = 0.0;
		double TSC22D1total = 0.0;
		double SPCS3total = 0.0;
		double ZMAT1total = 0.0;
		double ETAA1total = 0.0;
		double ZNF493total = 0.0;
		double CCDC82total = 0.0;
		double NFYBtotal = 0.0;
		double F13A1total = 0.0;
		double TUBB1total = 0.0;
		double ANXA5Mean = 0.0;
		double AP1M1Mean = 0.0;
		double C1GALT1C1Mean = 0.0;
		double CLK1Mean = 0.0;
		double EFTUD2Mean = 0.0;
		double MAP1AMean = 0.0;
		double SENP6Mean = 0.0;
		double SENP7Mean = 0.0;
		double TSC22D1Mean = 0.0;
		double SPCS3Mean = 0.0;
		double ZMAT1Mean = 0.0;
		double ETAA1Mean = 0.0;
		double ZNF493Mean = 0.0;
		double CCDC82Mean = 0.0;
		double NFYBMean = 0.0;
		double F13A1Mean = 0.0;
		double TUBB1Mean = 0.0;
		double ANXA5top = 0.0;
		double AP1M1top = 0.0;
		double C1GALT1C1top = 0.0;
		double CLK1top = 0.0;
		double EFTUD2top = 0.0;
		double MAP1Atop = 0.0;
		double SENP6top = 0.0;
		double SENP7top = 0.0;
		double TSC22D1top = 0.0;
		double SPCS3top = 0.0;
		double ZMAT1top = 0.0;
		double ETAA1top = 0.0;
		double ZNF493top = 0.0;
		double CCDC82top = 0.0;
		double NFYBtop = 0.0;
		double F13A1top = 0.0;
		double TUBB1top = 0.0;
		try {
			Connection myConn = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/Bioinformatics?allowPublicKeyRetrieval=true&useSSL=false", "root",                        												  "");
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("SELECT * FROM genesHeatmap");
			while (myRs.next()){
				
				ANXA5MeanArray.add(myRs.getDouble("ANXA5"));
				AP1M1MeanArray.add(myRs.getDouble("AP1M1"));
				C1GALT1C1MeanArray.add(myRs.getDouble("C1GALT1C1"));
				CLK1MeanArray.add(myRs.getDouble("CLK1"));
				EFTUD2MeanArray.add(myRs.getDouble("EFTUD2"));
				MAP1AMeanArray.add(myRs.getDouble("MAP1A"));
				SENP6MeanArray.add(myRs.getDouble("SENP6"));
				SENP7MeanArray.add(myRs.getDouble("SENP7"));
				TSC22D1MeanArray.add(myRs.getDouble("TSC22D1"));
				SPCS3MeanArray.add(myRs.getDouble("SPCS3"));
				ZMAT1MeanArray.add(myRs.getDouble("ZMAT1"));
				ETAA1MeanArray.add(myRs.getDouble("ETAA1"));
				ZNF493MeanArray.add(myRs.getDouble("ZNF493"));
				CCDC82MeanArray.add(myRs.getDouble("CCDC82"));
				NFYBMeanArray.add(myRs.getDouble("NFYB"));
				F13A1MeanArray.add(myRs.getDouble("F13A1"));
				TUBB1MeanArray.add(myRs.getDouble("TUBB1"));
				
			}
			
			for (int i = 0; i < ANXA5MeanArray.size(); i++){
				ANXA5total += ANXA5MeanArray.get(i);
				AP1M1total += AP1M1MeanArray.get(i);
				C1GALT1C1total += C1GALT1C1MeanArray.get(i);
				CLK1total +=  C1GALT1C1MeanArray.get(i);
				EFTUD2total += C1GALT1C1MeanArray.get(i);
				MAP1Atotal += MAP1AMeanArray.get(i);
				SENP6total += SENP6MeanArray.get(i);
				SENP7total += SENP7MeanArray.get(i);
				TSC22D1total += TSC22D1MeanArray.get(i);
				SPCS3total += SPCS3MeanArray.get(i);
				ZMAT1total += ZMAT1MeanArray.get(i);
				ETAA1total += ETAA1MeanArray.get(i);
				ZNF493total += ZNF493MeanArray.get(i);
				CCDC82total += CCDC82MeanArray.get(i);
				NFYBtotal += NFYBMeanArray.get(i);
				F13A1total += F13A1MeanArray.get(i);
				TUBB1total += TUBB1MeanArray.get(i);
			}
			
			ANXA5Mean = ANXA5total / ANXA5MeanArray.size();
			AP1M1Mean = AP1M1total / AP1M1MeanArray.size();
			C1GALT1C1Mean = C1GALT1C1total / C1GALT1C1MeanArray.size();
			CLK1Mean = CLK1total / CLK1MeanArray.size();
			EFTUD2Mean = EFTUD2total / EFTUD2MeanArray.size();
			MAP1AMean = MAP1Atotal / MAP1AMeanArray.size();
			SENP6Mean = SENP6total / SENP6MeanArray.size();
			SENP7Mean = SENP7total / SENP7MeanArray.size();
			TSC22D1Mean = TSC22D1total / TSC22D1MeanArray.size();
			SPCS3Mean = SPCS3total / SPCS3MeanArray.size();
			ZMAT1Mean = ZMAT1total / ZMAT1MeanArray.size();
			ETAA1Mean = ETAA1total / ETAA1MeanArray.size();
			ZNF493Mean = ZNF493total / ZNF493MeanArray.size();
			CCDC82Mean = CCDC82total / CCDC82MeanArray.size();
			NFYBMean = NFYBtotal / NFYBMeanArray.size();
			F13A1Mean = F13A1total / F13A1MeanArray.size();
			TUBB1Mean = TUBB1total / TUBB1MeanArray.size();
			
			Statement probStmt = myConn.createStatement();			
			ResultSet myRs2 = myStmt.executeQuery("SELECT * FROM genesHeatmap");
			
			while (myRs2.next()){
				double ANXA5Median = (myRs2.getDouble("ANXA5") - ANXA5Mean)/(calculateStDev(ANXA5MeanArray,ANXA5Mean));
				double AP1M1Median = (myRs2.getDouble("AP1M1") - AP1M1Mean)/(calculateStDev(AP1M1MeanArray, AP1M1Mean));
				double C1GALT1C1Median = (myRs2.getDouble("C1GALT1C1") - C1GALT1C1Mean)/(calculateStDev(C1GALT1C1MeanArray, C1GALT1C1Mean));
				double CLK1Median = (myRs2.getDouble("CLK1") - CLK1Mean)/(calculateStDev(CLK1MeanArray, CLK1Mean));
				double EFTUD2Median = (myRs2.getDouble("EFTUD2") - EFTUD2Mean)/(calculateStDev(EFTUD2MeanArray, EFTUD2Mean));
				double MAP1AMedian = (myRs2.getDouble("MAP1A") - MAP1AMean)/(calculateStDev(MAP1AMeanArray, MAP1AMean));
				double SENP6Median = (myRs2.getDouble("SENP6") - SENP6Mean)/(calculateStDev(SENP6MeanArray, SENP6Mean));
				double SENP7Median = (myRs2.getDouble("SENP7") - SENP7Mean)/(calculateStDev(SENP7MeanArray, SENP7Mean));
				double TSC22D1Median = (myRs2.getDouble("TSC22D1") - TSC22D1Mean)/(calculateStDev(TSC22D1MeanArray, TSC22D1Mean));
				double SPCS3Median = (myRs2.getDouble("SPCS3") - SPCS3Mean)/(calculateStDev(SPCS3MeanArray, SPCS3Mean));
				double ZMAT1Median = (myRs2.getDouble("ZMAT1") - ZMAT1Mean)/(calculateStDev(ZMAT1MeanArray, ZMAT1Mean));
				double ETAA1Median = (myRs2.getDouble("ETAA1") - ETAA1Mean)/(calculateStDev(ETAA1MeanArray, ETAA1Mean));
				double ZNF493Median = (myRs2.getDouble("ZNF493") - ZNF493Mean)/(calculateStDev(ZNF493MeanArray, ZNF493Mean));
				double CCDC82Median = (myRs2.getDouble("CCDC82") - CCDC82Mean)/(calculateStDev(CCDC82MeanArray, CCDC82Mean));
				double NFYBMedian = (myRs2.getDouble("NFYB") - NFYBMean)/(calculateStDev(NFYBMeanArray, NFYBMean));
				double F13A1Median = (myRs2.getDouble("F13A1") - F13A1Mean)/(calculateStDev(F13A1MeanArray, F13A1Mean));
				double TUBB1Median = (myRs2.getDouble("TUBB1") - TUBB1Mean)/(calculateStDev(TUBB1MeanArray, TUBB1Mean));
			
				
				
				
				probStmt.executeUpdate("UPDATE genesHeatmap SET ANXA5Median = ' " + ANXA5Median + " ' " + "where Sample_ID = '"+myRs2.getString("Sample_ID")+"'");	
			    probStmt.executeUpdate("UPDATE genesHeatmap SET AP1M1Median = ' " + AP1M1Median + " ' " + "where Sample_ID = '" + myRs2.getString("Sample_ID") + "'");
				probStmt.executeUpdate("UPDATE genesHeatmap SET C1GALT1C1Median = ' " + C1GALT1C1Median + " ' " + "where Sample_ID = '" + myRs2.getString("Sample_ID") + "'");
				probStmt.executeUpdate("UPDATE genesHeatmap SET CLK1Median = ' " + CLK1Median + " ' " + "where Sample_ID = '" + myRs2.getString("Sample_ID") + "'");
				probStmt.executeUpdate("UPDATE genesHeatmap SET EFTUD2Median = ' " + EFTUD2Median + " ' " + "where Sample_ID = '" + myRs2.getString("Sample_ID") + "'");
				probStmt.executeUpdate("UPDATE genesHeatmap SET MAP1AMedian = ' " + MAP1AMedian + " ' " + "where Sample_ID = '" + myRs2.getString("Sample_ID") + "'");
				probStmt.executeUpdate("UPDATE genesHeatmap SET SENP6Median = ' " + SENP6Median + " ' " + "where Sample_ID = '" + myRs2.getString("Sample_ID") + "'");
				probStmt.executeUpdate("UPDATE genesHeatmap SET SENP7Median = ' " + SENP7Median + " ' " + "where Sample_ID = '" + myRs2.getString("Sample_ID") + "'");
				probStmt.executeUpdate("UPDATE genesHeatmap SET TSC22D1Median = ' " + TSC22D1Median + " ' " + "where Sample_ID = '" + myRs2.getString("Sample_ID") + "'");
				probStmt.executeUpdate("UPDATE genesHeatmap SET SPCS3Median = ' " + SPCS3Median + " ' " + "where Sample_ID = '" + myRs2.getString("Sample_ID") + "'");
				probStmt.executeUpdate("UPDATE genesHeatmap SET ZMAT1Median = ' " + ZMAT1Median + " ' " + "where Sample_ID = '" + myRs2.getString("Sample_ID") + "'");
				probStmt.executeUpdate("UPDATE genesHeatmap SET ETAA1Median = ' " + ETAA1Median + " ' " + "where Sample_ID = '" + myRs2.getString("Sample_ID") + "'");
				probStmt.executeUpdate("UPDATE genesHeatmap SET ZNF493Median = ' " + ZNF493Median + " ' " + "where Sample_ID = '" + myRs2.getString("Sample_ID") + "'");
				probStmt.executeUpdate("UPDATE genesHeatmap SET CCDC82Median = ' " + CCDC82Median + " ' " + "where Sample_ID = '" + myRs2.getString("Sample_ID") + "'");
				probStmt.executeUpdate("UPDATE genesHeatmap SET NFYBMedian = ' " + NFYBMedian + " ' " + "where Sample_ID = '" + myRs2.getString("Sample_ID") + "'");
				probStmt.executeUpdate("UPDATE genesHeatmap SET F13A1Median = ' " + F13A1Median + " ' " + "where Sample_ID = '" + myRs2.getString("Sample_ID") + "'");
				probStmt.executeUpdate("UPDATE genesHeatmap SET TUBB1Median = ' " + TUBB1Median + " ' " + "where Sample_ID = '" + myRs2.getString("Sample_ID") + "'");
			} 
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		
	}

}
