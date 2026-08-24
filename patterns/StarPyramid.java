package patterns;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number :");
        int num = s.nextInt();
        for (int level = 1; level <= num; level++) {
            for (int space = 1; space <= num - level; space++) {
                System.out.print(" ");
            }

            for (int StarTimes = 1; StarTimes <= level; StarTimes++) {

                System.out.print("* ");

            }
            System.out.println();
        }
        s.close();
    }
}
