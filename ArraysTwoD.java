import java.util.*;
public class ArraysTwoD {
    public static void print2DArray(int arr[][],int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();
        }

    }
    public static boolean searchkey(int arr[][],int k,int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              if(arr[i][j]==k){
                return true;
              }

            }
           
        } return false;

    }
    public static void SpiralArray(int Array[][] ){
        int toprow=0 , bottomrow=3, rightclm=3,leftclm=0;
        while(toprow<=bottomrow && leftclm<=rightclm){ 
        for(int i=leftclm;i<=rightclm;i++){
            System.out.print(Array[toprow][i]+ " "); //toprow
        }
         for(int i=toprow+1;i<=bottomrow;i++){
            System.out.print(Array[i][rightclm]+ " "); //rightcolum
        }
        for(int i=rightclm-1;i>=leftclm;i--){
            System.out.print(Array[bottomrow][i]+ " "); //bottomrow
        }
        for(int i=bottomrow-1;i>=toprow+1;i--){
            System.out.print(Array[i][leftclm]+ " "); //leftcolum
        }


        bottomrow--;
        toprow++;
        leftclm++;
        rightclm--;

    }
    System.out.println();

    }
    public static int digonalSum(int Array[][]){
        int sum=0;
        for(int i=0;i<Array.length;i++){
        /*    for(int j=0;j<Array[0].length;j++){
                 if(Array[i]==Array[j]){
                    sum+=Array[i][j];

                }                                           BRUTEFORCE APPROACH O(n^2)
                else if(i+j==Array.length-1){
                    sum+=Array[i][j];

                }
            }

        */
        sum+=Array[i][i]; //primary array
        if(i!=Array.length-1-i)                                    //OPTIMISED O(n)
        sum+=Array[i][Array.length-1-i]; //secondary array

        }
        
        return sum;
    }
    public static boolean searchingInsortedMatrix(int Matrix[][],int key){
        int row=0,clm=Matrix[0].length-1;
        while(row<Matrix.length && clm>=0){
                if(Matrix[row][clm]==key){
                    System.out.println("key found at (" + row +"," + clm +  ")" );
                    return true;
                }
                else if(key<Matrix[row][clm]){
                clm--;
                }
                else{
                row++;
                }
        
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Array[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int Matrix[][]={{10,20,30,40,},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=100;
    /*   System.out.println("Enter the number of rows: ");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the key: ");
        int k=sc.nextInt();
    */
   // print2DArray(arr , n ,m);
    //System.out.println(searchkey(arr,k,n,m ));
    // SpiralArray( Array );
    //System.out.println(digonalSum(Array));
    System.out.println(searchingInsortedMatrix( Matrix, key));
    }
    
}

    

