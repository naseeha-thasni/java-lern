package patterns;

import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("==== Alphabet Triangle ====");
        System.out.println("enter a number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1,Alphabet=65;j<=i;j++,Alphabet++)
            {
                System.out.print((char)Alphabet+" ");

            }System.out.println();
        }
        sc.close();
        
    }
    
}
