import java.util.Scanner;

class input {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter radius (cm)");

    // String input
    double pi = 3.1416;
    double radius = myObj.nextDouble();

    // Output input by user
    System.out.println("Circumference: " + (radius * 2 * pi) + " cm");
    System.out.println("Area: " + Math.pow((radius * pi), 2) + " cm squared");
  }
}
