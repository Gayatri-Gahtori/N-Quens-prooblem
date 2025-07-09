import java.util.*;
public class Recursion {
    public static void Decreasingnumbers(int n){   //DECREASING ORDER OF NUMBERS
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        Decreasingnumbers(n-1);
    }
    public static void increasingnumbers(int n){           //INCREASING ORDER OF NUMBERS
        if(n==1){
            System.out.print(n);
            return;

        }
        increasingnumbers(n-1);
        System.out.print(" "+n);
    
    }
    public static int  factorial(int n){                        //FACTORIAL
        if(n==0){
            return(1);
        }
        int f=factorial(n-1);
        int fn=n*f;
        return fn;

    }
    public static int naturalsum(int n){                     //NATURALSUM
        if (n==1){
            return(1);
        }
        int s=naturalsum(n-1);
        int sn=n+s;
        return(sn);

    }
    public static int fibbonacchi(int n){                //FIBBONACCHI SERIES
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int fnmo=fibbonacchi(n-1);
        int fnmt=fibbonacchi(n-2);
        int fn=fnmo+fnmt;
        return fn;

    }
    public static boolean issorted(int arr[],int i){                  //ARRAY IS SORTED OR NOT 
        if (i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return(issorted(arr,i+1));
    
    }
    public static int firstoccurance(int arr[],int i){               //FIRST OCCURANCE OF A NUMBER IN AN ARRAY
        int key=6;
        if (i==arr.length){
            return -1;

        }
        if(arr[i]==key){
            return i;
        }
        return(firstoccurance(arr,i+1));

    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x* power(x,n-1);
    }





    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int arr[]={1,2,3,4,5,3,4,2,4,6};
        System.out.println((power(2,10)));
    }
    
}
