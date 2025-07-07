import java.util.*;
public class Bitmanipulation {
    public static void checkevenodd(int n){
        if ((n&1)==0){
            System.out.println("Number is even");
        
        }else{
            System.out.println("Number is odd");
        }

    }
    public static void getIthbit(int n,int i){
        int bitmask=1<<i;
        if((bitmask&n)==0){
            System.out.println("Ith index is 0");
        } else{
            System.out.println("Ith index is 1");
        }


        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int n=sc.nextInt();
        System.out.println("Enter the index");
        int i=sc.nextInt();
        checkevenodd(n);
        getIthbit(n,i);
    }
    
}
