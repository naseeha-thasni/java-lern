package patterns;

import java.util.Scanner;

public class PalindromeNumberTriangle {
    static void printSpace(int num){
        for(int i=1;i<=num;i++){
            System.out.print("  ");
        }

    }
    static void printNum(int num){
        for(int i=1;i<=num;i++)
        {
           System.out.print(i+" "); 
        }
        for(int j=num-1;j>0;j--)
        {
            System.out.print(j+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            printSpace(n-i);
            printNum(i);
        }sc.close();
        
    }

    
}
