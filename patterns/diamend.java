package patterns;

import java.util.Scanner;

public class diamend {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        byte starcount=-1;
        int space=n;
        for(int i=1;i<=n*2;i++)
        {
            space=(i<=n)?space-1:space+1;
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }

            starcount=(byte)(i<=n?starcount+2:starcount-2);
            for(int k=1;k<=starcount;k++)
            {
                System.out.print("*");
            }System.out.println();

        }

       sc.close();; 
    }

    
}
