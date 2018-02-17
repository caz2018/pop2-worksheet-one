import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.*;

public class AverageRainfall {
  //private int numOfYrs;
  //private List<Double> rainFallAvrgs = new ArrayList<Double>();


  public int readNumOfYrs() {
    Scanner scnr = new Scanner(System.in);
    System.out.print("Enter the number of years: ");
    int numOfYrs = scnr.nextInt();
    return numOfYrs;
  }

  public List<Double> readRainFall(int nYears) {

    List<Double> rainFallAvgs = new ArrayList<Double>();
    Scanner scnr = new Scanner(System.in);

    for(int i=1; i<nYears+1;i++) {
      for (int j = 1; j<13; j++){
        System.out.print("Enter the avg rain fall for year" +i +"month"+ j+": ");
        Double avgRainFallValue = scnr.nextDouble();
        rainFallAvgs.add(avgRainFallValue);
      }

    }
    return rainFallAvgs;
  }
    public double avgRainFall(List<Double> rainAvgs){
      int n = rainAvgs.size();
      Double nd = 1.0 * n;
      Double total = 0.0;
      for(int i=0; i<n; i++){
        total += rainAvgs.get(i);
      }
      //int totalInt = total.intValue(); if needed
      double avgRaintotal = total/nd;
      return avgRaintotal;
    }

    /*public static void main(String[] args) {
      AverageRainfall rf = new AverageRainfall();
      NumberFormat df = DecimalFormat.getInstance();		    // Decimal formating
		  df.setMaximumFractionDigits(2);
      int numOfYears = rf.readNumOfYrs();
      List<Double> rainFallAverages = rf.readRainFall(numOfYears);
      //System.out.println(rf.avgRainFall());
      double totalRainavg = rf.avgRainFall(rainFallAverages);
      System.out.println("The average rainfall in inches for the whole peiord is" + df.format(totalRainavg));
    }*/

}
