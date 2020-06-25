public class ifElse {
  public static void main(String[] args) {
    int time = 22;
    if (time < 07) {
        System.out.println("Good morning.");
        System.out.println("The time is " + time);
    } else if (time < 18) {
        System.out.println("Good day.");
        System.out.println("The time is " + time);
    }  else {
        System.out.println("Good evening.");
    }
  }
}
