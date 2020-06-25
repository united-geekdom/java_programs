public class loops3 {
  public static void main(String[] args) {
    int i = 1;
    do {
       System.out.println(i);
      i++;
      if (i == 10) {
        continue;
      } else if (i == 25) {
        break;
      }
    }
    while (i > 0);
}}
