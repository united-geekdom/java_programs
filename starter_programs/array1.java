public class array1 {
  public static void main(String[] args) {
    String[] array = {"Hello ", "World.", " By ", "United ", "Geekdom."};
    System.out.println("The length of the array is " + array.length);
    System.out.println("The array forms the sentence: " + array[0] + array[1] + array [2] + array [3] + array[4]);
    array[2] = " From ";
    System.out.println("I have changed a portion of the array.");
    System.out.println("The array now forms the sentence: " + array[0] + array[1] + array [2] + array [3] + array[4]);
  }
}
