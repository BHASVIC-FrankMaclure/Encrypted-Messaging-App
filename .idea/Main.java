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
    int[][] newArray = newEncryption.encryption(message);
    System.out.println(Arrays.toString(newArray[0]));
//    System.out.println(Arrays.toString(newArray[1]));
//    System.out.println(Arrays.toString(newArray[2]));
//    System.out.println(Arrays.toString(newArray[3]));
    }
}