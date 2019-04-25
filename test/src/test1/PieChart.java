package test1;

import java.io.*; 
import java.sql.*; 

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
//import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class PieChart {
   
   public static void main( String[ ] args )throws Exception {
      
      
      /* Create MySQL Database Connection */
      Class.forName( "com.mysql.jdbc.Driver" );
      Connection connect = DriverManager.getConnection( 
         "jdbc:mysql://localhost:3306/test" ,     
         "root",     
    		  																																																												"");
 
      Statement statement = connect.createStatement( );
      ResultSet resultSet = statement.executeQuery("select * from attendanceSheet" );
      DefaultPieDataset dataset = new DefaultPieDataset( );
      //DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      
      while( resultSet.next( ) ) {
         dataset.setValue( 
         resultSet.getString( "first_name" ) ,
         Double.parseDouble( resultSet.getString( "age" )));
      }
      final PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator("{0} = {1}");
      // {0} = {1} -> Raw Data , {0} -> {2} = Percentage
      JFreeChart chart = ChartFactory.createPieChart3D(
         "Pie Chart of the Ages",   // chart title           
         dataset,          // data           
         true,             // include legend          
         true,           
         false ); 
      final PiePlot plot1 = (PiePlot) chart.getPlot();
      plot1.setLabelGenerator(labelGenerator); 
      /*JFreeChart chart = ChartFactory.createBarChart3D
    		  ("Bar Chart of the Ages", "Name", "Age", dataset); */

      int width = 560;    /* Width of the image */
      int height = 370;   /* Height of the image */ 
      File pieChart = new File( "Pie_Chart.jpeg" );
      ChartUtilities.saveChartAsJPEG( pieChart , chart , width , height );
   }
}