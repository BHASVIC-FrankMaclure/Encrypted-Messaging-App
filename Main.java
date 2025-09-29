// Libraries
import java.util.Scanner;

// Main class
public class Main{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your message: ");
    String message = scanner.nextLine();
    encryption encryption = new encryption(message);
    }
}