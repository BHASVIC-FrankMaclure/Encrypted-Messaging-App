import java.util.Random;

public class sBox_jumble {
    //My beautiful Sboxes
    int[] sBox1 = {4,16,5,3,13,6,11,15,2,10,1,14,12,7,9,8};
    int[] sBox2 = {8,9,7,12,14,1,10,2,15,11,6,13,3,5,16,4};
    int[] sBox3 = {6,5,11,15,2,16,9,8,4,12,13,1,10,3,7,12};
    int[] sBox4 = {12,7,3,10,1,13,12,4,8,9,16,2,15,11,5,6};
    int[] sBox5 = {5,12,1,9,16,3,14,8,6,2,11,13,7,15,4,10};
    int[] sbox6 = {10,4,15,7,13,11,2,6,8,14,3,16,9,1,12,5};

    public sBox_jumble(int[] bytes2) {
    }

    //Constructor method
    public int[] sBox_jumble(int[] Array){
        int newArray[] = new int[0];
        Random rand = new Random();
        int n = rand.nextInt(6);
        n++;
        for(int i = 0; i<Array.length; i++){
            newArray[sBox1[i]] = Array[i];
        }
        return newArray;
    }
}
