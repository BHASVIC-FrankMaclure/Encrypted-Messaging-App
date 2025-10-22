import java.util.Arrays;

public class Column_Row_Shift {
    int array[] = new int[4];
    public Column_Row_Shift(int[] array) {
        array = this.array;
    }
    public int[][] ColumnShift(int[] Array) {
        this.array = Array;
        int[][] newArray = new int[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                newArray[i][j] = array[i + j];
            }
        }
        int[] tempArray1 = new int[4];
        int[] tempArray2 = new int[4];
        int[] tempArray3 = new int[4];
        int[] tempArray4 = new int[4];
        int[][] cShiftedArray = new int[4][4];
        for(int i = 0; i < 4; i++){
            tempArray1[i] = newArray[i][0];
            tempArray2[i] = newArray[i][1];
            tempArray3[i] = newArray[i][2];
            tempArray4[i] = newArray[i][3];
        }
        System.out.println(Arrays.toString(tempArray1));
        System.out.println(Arrays.toString(tempArray2));
        System.out.println(Arrays.toString(tempArray3));
        System.out.println(Arrays.toString(tempArray4));
        System.out.println("\\");
        for(int i = 0; i < 4; i++){
            cShiftedArray[3][i] = tempArray1[i];
            cShiftedArray[0][i] = tempArray2[i];
            cShiftedArray[2][i] = tempArray3[i];
            cShiftedArray[1][i] = tempArray4[i];
        }
        return cShiftedArray;
    }
    public int[][] RowShift(int[] Array) {
        this.array = Array;
        int[][] newArray = new int[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                newArray[i][j] = array[i + j];
            }
        }
        int[] tempArray1 = new int[4];
        int[] tempArray2 = new int[4];
        int[] tempArray3 = new int[4];
        int[] tempArray4 = new int[4];
        int[][] rShiftedArray = new int[4][4];
        for(int i = 0; i < 4; i++){
            tempArray1[i] = newArray[i][0];
            tempArray2[i] = newArray[i][1];
            tempArray3[i] = newArray[i][2];
            tempArray4[i] = newArray[i][3];
        }
        System.out.println(Arrays.toString(tempArray1));
        System.out.println(Arrays.toString(tempArray2));
        System.out.println(Arrays.toString(tempArray3));
        System.out.println(Arrays.toString(tempArray4));
        System.out.println("\\");
        for(int i = 0; i < 4; i++){
            rShiftedArray[3][i] = tempArray1[i];
            rShiftedArray[0][i] = tempArray2[i];
            rShiftedArray[2][i] = tempArray3[i];
            rShiftedArray[1][i] = tempArray4[i];
        }
        return rShiftedArray;
    }
}
