import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=1; i<=size; i++) {
            double old_c=sc.nextDouble();
            double old_f=sc.nextDouble();
            double newf= ((9*old_c)/5)+32;
            newf=newf+old_f;
            double newc=(((newf-32)*5)/9);
            System.out.print("Case "+i+": "); 
            System.out.printf ("%.2f", newc);
            System.out.println();
                    } //11984
    }
}