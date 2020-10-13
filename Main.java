import java.util.Scanner;
/**
 * Methonds example
 * @author Jaden Ramcharan
 */
public class Main {
  //calculates area of rectangle given length and width
  public static double areaOfRect(double length, double width){
    //calculates area of rectangle
    double area = length * width;
    //returns area of the rectangle
    return area;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double l = input.nextDouble();
    double w = input.nextDouble();
    double area = areaOfRect(l, w);
    System.out.println(area);
    
  }
}
