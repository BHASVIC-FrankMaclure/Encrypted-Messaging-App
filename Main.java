// Libraries
import java.util.Arrays;
import java.util.Scanner;

// Main class
public class Main{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your message: ");
    String message = scanner.nextLine();
    encryption newEncryption = new encryption(message);
    int[] stringOutput = newEncryption.encryption(message);
    System.out.println(Arrays.toString(stringOutput));
    }
}