package test1;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;
import org.jfree.chart.ChartUtilities;

public class BarChart {
   
   public static void main(String[] args) throws Exception {
	   Class.forName( "com.mysql.jdbc.Driver" );
	      Connection connect = DriverManager.getConnection( 
	         "jdbc:mysql://localhost:3306/test" ,     
	         "root",     
	    		  																																																												"");
	      Statement statement = connect.createStatement( );
	      ResultSet resultSet = statement.executeQuery("select * from attendanceSheet" );
	
      final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
  
       while (resultSet.next() ){
    	   dataset.addValue(Double.parseDouble( resultSet.getString( "age" )),
    			   resultSet.getString( "first_name" ), " ");
       }       
       
      JFreeChart barChart = ChartFactory.createBarChart(
         "Bar Chart of the Ages", 
         "Name", "Age", 
         dataset,PlotOrientation.VERTICAL, 
         true, true, false);
      
     CategoryItemRenderer renderer = ((CategoryPlot)barChart.getPlot()).getRenderer();
      renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
      renderer.setBaseItemLabelsVisible(true);
      ItemLabelPosition position = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, 
              TextAnchor.TOP_CENTER);
      renderer.setBasePositiveItemLabelPosition(position); 
    
      
      int width = 640;    /* Width of the image */
      int height = 480;   /* Height of the image */ 
      File BarChart = new File( "BarChart.png" ); 
      ChartUtilities.saveChartAsJPEG( BarChart , barChart , width , height );
   }
   
}