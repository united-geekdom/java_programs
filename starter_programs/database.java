import java.util.Scanner;

public class database {
static String firstName;
static String lastName;
static String lang;
static String exp;
  public database(String name1, String name2, String myLang, String myExp) {
    firstName = "First name: " + name1;
    lastName = "Last name: " + name2;
    lang = "Languages known: " + myLang;
    exp = "Years of experience: " + myExp;
    int loop = Math.max(Math.max(firstName.length(), lastName.length()), Math.max(lang.length(), exp.length()));
    int i = 0;
    do {
      System.out.print("_");
      i++;
    } while (i < loop);
    System.out.println(" ");
    System.out.println(firstName);
    System.out.println(lastName);
    System.out.println(lang);
    System.out.println(exp);
    i = 0;
    do {
      System.out.print("_");
      i++;
    } while (i < loop);
    System.out.println(" ");
  }

  public static void main(String[] args) {
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter your first name");
    String userFirstName = input1.nextLine();
    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter your last name");
    String userLastName = input2.nextLine();
    Scanner input3 = new Scanner(System.in);
    System.out.println("Enter all languages you know");
    String userLang = input3.nextLine();
    Scanner input4 = new Scanner(System.in);
    System.out.println("Enter your years of experience.");
    String userExp = input4.nextLine();
    System.out.println("Your database");
    database myDatabase = new database(userFirstName, userLastName, userLang, userExp);
  }
}
