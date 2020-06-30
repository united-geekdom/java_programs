import java.util.Scanner;

class input {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter radius (cm)");

    // String input
    double pi = 3.14d;
    int radius = input.nextInt();

    // Output input by user
    System.out.println("Circumference: " + (radius * 2 * pi) + " cm");
    System.out.println("Area: " + Math.pow((radius * pi), 2) + " cm squared");
  }
}
