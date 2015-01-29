import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            StringTokenizer st=new StringTokenizer(sc.nextLine());
            int n=Integer.parseInt(st.nextToken());
            if(n==0)
                break;
            String str=st.nextToken();
            int l=str.length()/n;
            String f="";
            for(int i=1; i<=n; i++) {
                int poop=i*l;
                for(int j=l; j>0; j--) {
                    poop=poop-1;
                    f=f+str.charAt(poop);
                }
            } //11192
            System.out.println(f);
        }
    }
}