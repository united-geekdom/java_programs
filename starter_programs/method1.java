public class method1 {
          static int i = 1;
  static void addnum() {
    System.out.println(i);
    ++i;
  }

  public static void main(String[] args) {
    do {
      addnum();
    }
    while (i < 15);
    }
  }
