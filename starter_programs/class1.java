public class class1 {
static String firstName = "United";
static String lastName = "Geekdom";
static String lang = "Java";
static int exp = 1;
  static void field(String firstName, String lastName, String lang, int exp) {
    System.out.println("__________________________________");
    System.out.println("|First Name: " + firstName + "              |");
    System.out.println("|Last Name: " + lastName + "              |");
    System.out.println("|Language of database: " + lang + "      |");
    System.out.println("|Years of experience in GitHub: " + exp + "|");
    System.out.println("|________________________________|");
  }

  public static void main(String[] args) {
    class1 database = new class1();
    database.field(database.firstName, database.lastName, database.lang, database.exp);
  }
}
