public class Assignment1{
    public static boolean checkarray(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
             if(nums[i]==nums[j]);
             return true;

            }
       
        } return false;

    }
    public static void printarray(int arr[][]){
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        

    }

    public static void transposearray(int arr[][]){
        int trans[][]=new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                trans[j][i]=arr[i][j];
              
            }

        }printarray(trans);
        
    }


    public static void main(String[] args) {
        int nums[]={1,2,3};
        //System.out.println(checkarray(nums));
        int arr[][]={{1,2,3},{4,5,6}};
        transposearray(arr);
        
    }
}
