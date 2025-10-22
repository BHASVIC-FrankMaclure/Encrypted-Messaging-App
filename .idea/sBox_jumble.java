import java.util.Arrays;
import java.util.Random;

public class sBox_jumble {
    //My beautiful sBox
    static int[][] sBox = {
            {10,9,8,3,1,15,12,11,5,2,7,13,0,14,4,6},
            {3,8,1,2,13,6,7,5,4,14,0,12,11,9,10,15},
            {5,4,15,13,2,9,7,6,10,11,14,12,3,8,1,0},
            {5,10,2,13,9,7,3,14,12,8,1,6,11,0,4,15},
            {5,11,14,1,7,3,6,12,9,15,13,2,10,8,0,4},
            {12,9,5,3,15,6,2,14,13,10,11,7,0,4,1,8},
            {14,2,12,3,9,8,0,4,1,15,11,5,10,6,7,13},
            {14,15,7,5,8,12,0,13,2,10,1,11,9,4,3,6},
            {10,2,12,11,3,14,4,1,5,9,0,8,7,6,13,15},
            {6,5,8,0,15,10,13,1,7,11,12,9,4,2,14,3}
    };

    int[] Array;

    //Constructor method
    public sBox_jumble(int[] Array) {
        this.Array = Array;
    }
    public static int[] sBox__jumble(int[] Array){
        int[] newArray = new int[16];
        Random rand = new Random();
        int randomNum = rand.nextInt(10);
        for(int i=0;i<16;i++){
            newArray[sBox[randomNum][i]] = Array[i];
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}