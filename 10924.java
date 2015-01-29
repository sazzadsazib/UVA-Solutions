import java.util.*;
class Main{
    
    static boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList a=new ArrayList();
        a.add('0');
        a.add('a');
        a.add('b');
        a.add('c');
        a.add('d');
        a.add('e');
        a.add('f');
        a.add('g');
        a.add('h');
        a.add('i');
        a.add('j');
        a.add('k');
        a.add('l');
        a.add('m');
        a.add('n');
        a.add('o');
        a.add('p');
        a.add('q');
        a.add('r');
        a.add('s');
        a.add('t');
        a.add('u');
        a.add('v');
        a.add('w');
        a.add('x');
        a.add('y');
        a.add('z');
        a.add('A');
        a.add('B');
        a.add('C');
        a.add('D');
        a.add('E');
        a.add('F');
        a.add('G');
        a.add('H');
        a.add('I');
        a.add('J');
        a.add('K');
        a.add('L');
        a.add('M');
        a.add('N');
        a.add('O');
        a.add('P');
        a.add('Q');
        a.add('R');
        a.add('S');
        a.add('T');
        a.add('U');
        a.add('V');
        a.add('W');
        a.add('X');
        a.add('Y');
        a.add('Z');
        
        while(sc.hasNext()) {
            String str=sc.nextLine();
            int sum=0;
            for(int i=0; i<str.length(); i++) {
                if(a.contains(str.charAt(i))) {
                    sum=sum+a.indexOf(str.charAt(i));
                }
            }
            if(isPrime(sum)) {
                System.out.println("It is a prime word.");
            }else{
                 System.out.println("It is not a prime word.");
            }
            
        }  //10924
        
    }
}