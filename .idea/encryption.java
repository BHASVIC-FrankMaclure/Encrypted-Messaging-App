//Libraries
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

//Encryption class
public class encryption {
    String message;
    public encryption(String message) {
        this.message = message;
    }
    public int[][] encryption(String message){
        byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
        int newLength = (16 -(bytes.length % 16)) % 16;
        System.out.println(Arrays.toString(bytes));
        int[] bytes2 = new int[(newLength + bytes.length)];
        for(int i = 0 ; i < bytes.length ; i++){
            bytes2[i] = bytes[i];
        }
        int[][] Array = new int[4][4];
        return Array;
    }
}