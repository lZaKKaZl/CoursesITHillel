package HW2606;
import java.util.Scanner;
/**
 * Created by teres_000 on 30.06.2015.
 */
public class sumDigitsInLine {
    public static void main(String[] args) {
        System.out.print("Bведите натуральное число - ");
        Scanner scn = new Scanner(System.in);
            int n = 0;
            n = scn.nextInt();
            int x = n;
            int s = 0;
            while (x != 0) {
                s += x % 10;
                x /= 10;
            }
            System.out.println("Сумма цифр в числе " + n + " = " + s);
        }
    }
