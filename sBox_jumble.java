import java.util.Arrays;
import java.util.Random;

public class sBox_jumble {
    //My beautiful sBoxes
    static int[] sBox1 = {4,16,5,3,13,6,11,15,2,10,1,14,12,7,9,8};
    static int[] sBox2 = {8,9,7,12,14,1,10,2,15,11,6,13,3,5,16,4};
    int[][] sBox3 = {{6,5,11,15},{2,16,9,8},{4,12,13,1},{10,3,7,12}};
    int[][] sBox4 = {{12,7,3,10},{1,13,12,4},{8,9,16,2},{15,11,5,6}};
    int[][] sBox5 = {{5,12,1,9},{16,3,14,8},{6,2,11,13},{7,15,4,10}};
    int[][] sBox6 = {{10,4,15,7},{13,11,2,6},{8,14,3,16},{9,1,12,5}};
    int[][] sBox7 = {{6,7,10,9},{5,2,4,8},{3,1,13,16,},{11,14,15,12}};
    int[][] sBox8 = {{12,15,14,11},{16,13,1,3},{8,4,2,5},{9,10,7,6}};
    int[][] sBox9 = {{7,6,2,16},{5,11,9,5},{14,4,15,13},{3,12,1,10}};
    int[][] sBox10 = {{10,1,12,3},{13,15,4,14},{5,9,11,5},{16,2,6,7}};

    //Constructor method
    public static void sBox__jumble(int[] Array){
        int[][] newArray = new int[4][4];
        Random rand = new Random();
        for(int i=0;i<16;i++){
            int a = sBox1[i] % 16;
            int row = a / 4;
            int col = a % 4;
            newArray[row][col] = Array[i];
        }
        System.out.println(Arrays.toString(newArray[0]));
        System.out.println(Arrays.toString(newArray[1]));
        System.out.println(Arrays.toString(newArray[2]));
        System.out.println(Arrays.toString(newArray[3]));
    }
}
