import java.util.*;
public class Arrays{
    public static int linearSearch(int num[],int key){
        for(int i=0;i<num.length;i++){
            if (num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int largest_no_Array(int num[]){
        int largestno=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){ 
            if(num[i]>largestno){
                largestno=num[i];

            }
        }
        return largestno;
    }
    public static int Smallest_no_Array(int num[]){
        int smallestno=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]<smallestno){
                smallestno=num[i];
            }
        }
        return smallestno;
    }
    public static int Binarysearch(int num[], int key){
        int start=0 , end=num.length;
        while(start<key){
            int midvalue=(start+key)/2;
            if(num[midvalue]==key){
                return midvalue;
            } 
            else if (num[midvalue]<key){
                start=midvalue+1;
            }
            else{
                end=midvalue-1;
            }
        }
        return-1;
    }
    public static void reverse_Array(int num[]){
        int start=0, end=num.length-1;
        while(start<end){
            int temp=num[end];
            num[end]=num[start];
            num[start]=temp;
            start++;
            end--;
            
        }
    }
    public static void Pairs_Of_Array(int num[],int n){
        for(int i=0;i<n;i++){
            int curr=num[i];
            for(int j=i+1;j<n;j++){
                System.out.print("("+curr+ num[j] +")");

            }System.out.println();
           
        } 

    }
    public static void Print_SubArray(int num[]){
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(num[k]+" ");
                }System.out.println(); 
            }System.out.println();
        }
    }
    public static void maxsubarraySum(int num[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++){ //prefixArray
            prefix[i]=prefix[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++){
            int start=i;
            for (int j=i;j<num.length;j++){
                int end=j;
                currsum= start==0? prefix[end] : prefix[end]-prefix[start-1];
                
                }
                if ( maxsum<currsum){
                    maxsum=currsum;
                }
                

            }System.out.println("maximum sum subarray= " +maxsum);
        }
        public static void kadanes (int num[]){
            int maxsum=Integer.MIN_VALUE;
            int cs=0;
            for(int i=0;i<num.length;i++){
                cs=cs+num[i];
                if(cs<0){
                    cs=0;
                }

                maxsum=Math.max(cs,maxsum);

            }System.out.println("maximum sum is: " + maxsum);

        }
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num[] ={-2,-3,4,-1,-2,1,5,-3};
        int n=num.length;
        int key=3;
        
        /*for(int i=0;i<=num.length;i++){
        System.out.print(num[i]+ " ");
        }*/
       kadanes(num) ;
 
    }
}


