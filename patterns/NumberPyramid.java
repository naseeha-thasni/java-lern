package patterns;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("==== Number Pyramid ====");
        System.out.println("Enter Number");
        int num=sc.nextInt();
        int numprin=1;
        for(int i=1;i<=num;i++) {
            for(int k=num-i;k>=1;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
        {
            System.out.print(numprin+" ");
            numprin=(j<=(num/2)+1)?numprin+1:numprin-2;

        }System.out.println();
       

        }sc.close();
        
    }
    
}
