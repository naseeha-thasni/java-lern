package patterns;

public class PascalsTriangle {
    static void patternSpace(int num){
        for(int i=1;i<=num;i++){
            System.out.print(" ");
        }
    }
    static void printNum(int len,String value){
        for(int i=0;i<len;i++)
        {
            System.out.print(value.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            patternSpace(n-(i+1));
            String print=String.valueOf(Math.pow(11, i));
            int length=print.length()-2;
            printNum(length, print);


        }
    }
    
}
