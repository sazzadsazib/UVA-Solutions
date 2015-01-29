import java.util.Scanner;
import java.math.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int n=sc.nextInt();
            System.out.println(n+"!"); 
            BigInteger sum=BigInteger.valueOf(1);
            for(int i=1; i<=n; i++) {
                sum=sum.multiply(BigInteger.valueOf(i)); 
            }    //623
           System.out.println(sum); 
        }
    }
}