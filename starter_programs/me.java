abstract class me {
  public String fname = "United";
  public String lname = "Geekdom";
  public String email = "united-geekdom@github.com";
  public int age = 1001;
  public abstract void study();
}

class Coder extends me {
  public int githubStart = 2019;
  public void study() {
    System.out.println("Coding all day long");
  }
}
