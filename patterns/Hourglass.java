package patterns;

import java.util.Scanner;

public class Hourglass {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("=== Hourglass ===");
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int set=num+(num-1)+2;
        int space=0;
        for(int i=1;i<num*2;i++)
        {
            space=(i<=num)?space+1:space-1;
            for(int k=0;k<space;k++)
            {
                System.out.print(" ");
            }
           
            set=(i<=num)?set-2:set+2;
            for(int j=1;j<=set;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        sc.close();
    }
}