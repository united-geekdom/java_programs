class abstract1 {
  public static void main(String[] args) {
    Coder ug = new Coder();
    System.out.println("Name: " + ug.fname + " " + ug.lname);
    System.out.println("Email: " + ug.email);
    System.out.println("Age: " + ug.age);
    System.out.println("Started on GitHub in: " + ug.githubStart);
    Coder.study();
  }
}
