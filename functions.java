import java.util.*;
public class functions {
    
    public static int factorial(int n){
        int fac=1;
        for(int i=n;i>0;i--){
            fac=fac*i;
        }
        return fac;
    }
    public static boolean chkprime(int n){
        boolean isprime= true;
        for(int i=2;i<=(n-1);i++){
            if (n%i==0){
                isprime=false;
            }   
        }
        return isprime;
       

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.println(chkprime(n));
    }
}
