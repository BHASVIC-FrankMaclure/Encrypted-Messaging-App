import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class encryption {
    int[] sBox = {4,16,5,3,13,6,11,15,2,10,1,14,12,7,9,8};

    String message;
    public encryption(String message){
        this.message = message;
        byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
        byte[] result = new byte[16];
        String[] byte2 = null;
        System.out.println(Arrays.toString(bytes));
    }
}