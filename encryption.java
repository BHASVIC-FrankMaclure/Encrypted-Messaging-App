//Libraries
import java.nio.charset.StandardCharsets;
import java.util.Random;

//Encryption class
public class encryption {
    String message;
    public encryption(String message) {
        this.message = message;
    }
    public String encryption(String message){
        byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
        int newLength = (16 -(bytes.length % 16)) % 16;
        int[] Array = new int[(newLength + bytes.length)];
        for(int i = 0 ; i < bytes.length ; i++){
            Array[i] = bytes[i];
        }
        for(int i = 0; i < 12; i++){
            Array = sBox_jumble.sBox__jumble(Array);
            Array = Column_Row_Shift.RowShift(Array);
            Array = Column_Row_Shift.RowShift(Array);
        }
        Random rand = new Random();
        for(int i = 0; i < 16; i++){
            int randomNum = rand.nextInt(10);
            if(Array[i] == 0){
                Array[i] = 101 + randomNum;
            }
            Array[i] = 100 + (Array[i] * Array[i]);
            if(randomNum < 2){
                Array[i] = Array[i] + (Array[i] * randomNum);
            }
            if(randomNum > 2 && randomNum < 5){
                Array[i] = Array[i] - (Array[2] * randomNum);
            }
            if(randomNum > 5 && randomNum < 8 && i > 1){
                Array[i] = Array[i-1] / randomNum;
                Array[i] = Array[i] / (randomNum % (Array[i-1] + 1));
            }
        }
        String stringOutput = "";
        for(int i = 0; i < 16; i++){
            stringOutput = stringOutput + (char)Array[i];
        }
        return stringOutput;
    }
}