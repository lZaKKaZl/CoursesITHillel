package Day5;

/**
 * Created by ITHILLEL5 on 30.06.2015.
 */
public class massiveDvyxmer {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[2]= 10;
        System.out.println(array[2]);
        int [][] tdArray = new int[8][];
        tdArray[0] = new int[10];
        tdArray[1] = new int [11];
        tdArray[1][10]= 2;
        System.out.println(tdArray[0].length);
    }
}
