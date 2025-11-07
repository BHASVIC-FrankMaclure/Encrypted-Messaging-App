import java.util.Random;

public class Column_Row_Shift {

    static int[][] CRBox = {
            {4,12,8,0},
            {0,8,4,12},
            {4,0,12,8},
            {8,12,4,0}
    };
    public static int[] ColumnShift(int[] Array) {
        int[] tempArray1 = new int[4];
        int[] tempArray2 = new int[4];
        int[] tempArray3 = new int[4];
        int[] tempArray4 = new int[4];
        int[] cShiftedArray = new int[Array.length + 1];
        for(int i = 0; i < 4; i++){
            tempArray1[i] = Array[i];
            tempArray2[i] = Array[i + 4];
            tempArray3[i] = Array[i + 8];
            tempArray4[i] = Array[i + 12];
        }
        Random rand = new Random();
        int randomNum = rand.nextInt(4);
        for(int i = 0; i < 4; i++){
            cShiftedArray[i + CRBox[0][randomNum]] = tempArray1[i];
            cShiftedArray[i + CRBox[1][randomNum]] = tempArray2[i];
            cShiftedArray[i + CRBox[2][randomNum]] = tempArray3[i];
            cShiftedArray[i + CRBox[3][randomNum]] = tempArray4[i];
        }
        for(int i = 16; i == Array.length-1; i++){
            cShiftedArray[i] = Array[i];
        }
        cShiftedArray[cShiftedArray.length-1] = randomNum;
        return cShiftedArray;
    }
    public static int[] RowShift(int[] Array) {
        int[] tempArray1 = new int[4];
        int[] tempArray2 = new int[4];
        int[] tempArray3 = new int[4];
        int[] tempArray4 = new int[4];
        int[] rShiftedArray = new int[Array.length + 1];
        for(int i = 0; i < 4; i++){
            tempArray1[i] = Array[i];
            tempArray2[i] = Array[i + 4];
            tempArray3[i] = Array[i + 8];
            tempArray4[i] = Array[i + 12];
        }
        Random rand = new Random();
        int randomNum = rand.nextInt(4);
        for(int i = 0; i < 4; i++){
            rShiftedArray[i + CRBox[randomNum][0]] = tempArray1[i];
            rShiftedArray[i + CRBox[randomNum][1]] = tempArray2[i];
            rShiftedArray[i + CRBox[randomNum][2]] = tempArray3[i];
            rShiftedArray[i + CRBox[randomNum][3]] = tempArray4[i];
        }
        for(int i = 16; i > Array.length; i++){
            rShiftedArray[i] = Array[i+1];
        }
        rShiftedArray[rShiftedArray.length-1] = randomNum;
        return rShiftedArray;
    }
}