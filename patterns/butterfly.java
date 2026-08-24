package patterns;
import java.util.Scanner;
public class butterfly {

    static void printPattern(int num,String pattern)
    {
        for (int i=1;i<=num;i++)
        {
            System.out.print(pattern);   
        }
    }
    static void patternExecusion(int num,int space){
        printPattern(num, "*");
            printPattern(space, " ");
            printPattern(num, "*");
            System.out.println();

    }
    public static void main(String[] args) {
        
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        int space=n*2;
        for(int i=1;i<=n;i++)
        {
               space-=2;
            patternExecusion(i, space);
        }
        for(int i=n-1;i>0;i--)
        {
            space+=2;
            patternExecusion(i, space);
        }sc.close();
    }
}