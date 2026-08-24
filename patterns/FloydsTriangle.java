package patterns;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("=== Floyd's Triangle ===");
        System.out.println("enter a number");
        int num=sc.nextInt();
        int print=1;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(print+" ");
                print++;
            }System.out.println();
        }
        sc.close();;
    }
    
}
