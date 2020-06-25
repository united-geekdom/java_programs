public class switch1 {
  public static void main(String[] args) {
    int day = 4;
    switch (day) {
      default:
      System.out.println("It's a weekday");
      break;
    case 1: case 7:
      System.out.println("It's the weekend!");
      break;
    }
  }
}
