public class delaytest {
public static void main(String[] args) {
System.out.println("The next text will be delayed");
try {
    Thread.sleep(2000);
} catch (InterruptedException ie)
{
    System.out.println("Scanning...");
}
System.out.println("From United Geekdom");
}}
