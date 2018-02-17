import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.*;

public class SampleMain {
  final static int NUM_MONTHS = 12;

  public static void main(String[] args) {
    AverageRainfall rf = new AverageRainfall();
    NumberFormat df = DecimalFormat.getInstance();		    // Decimal formating
    df.setMaximumFractionDigits(2);
    int numOfYears = rf.readNumOfYrs();
    List<Double> rainFallAverages = rf.readRainFall(numOfYears);
    //System.out.println(rf.avgRainFall());
    double totalRainavg = rf.avgRainFall(rainFallAverages);
    System.out.println("The average rainfall in inches for the whole peiord is" + df.format(totalRainavg));
  }

}
