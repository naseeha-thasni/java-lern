package patterns;

import java.util.Scanner;

public class InvertedStarTriangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(" Enter number");
        int num=s.nextInt();
        for(int i=num;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    s.close();
    }

}

