public class loops1 {
  public static void main(String[] args) {
    int i = 1;
    int a = 0;
    int b = 1;
    int f;
    System.out.println("1");
    do {
       f = a + b;
       System.out.println(f);
       a = b;
       b = f;
      i++;
    }
    while (i < 25);
}}
