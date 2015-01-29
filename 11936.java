import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size; i++) {
           int a=sc.nextInt();
           int b=sc.nextInt();
           int c=sc.nextInt();
           if(a+b>c && b+c>a && c+a>b) {
               System.out.println("OK");
           }else {
               System.out.println("Wrong!!");
           } //11936
        }
    }
}