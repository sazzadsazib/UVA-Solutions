import java.util.*;
class Main{
    
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input =sc.nextInt();
        for(int i=0; i<input; i++) {
            int a[]=new int[sc.nextInt()];
            int sum=0;
            for(int p=0; p<a.length; p++) {
                a[p]=sc.nextInt();
                sum=sum+a[p];
            } 
            int avg=sum/a.length;
            double count=0;
            for(int s:a) {
                if(s>avg) {
            count++;
                }
            }
                double output= (count/a.length)*100;
                System.out.printf("%.3f",output);
                System.out.print("%");
                System.out.println(); //10370
        }
    }
}