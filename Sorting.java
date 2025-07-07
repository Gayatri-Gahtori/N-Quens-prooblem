public class Sorting{

    public static void bubblesort(int arr[]){
       
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   
                }
    
                
            }
        }
    
    }
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minimum=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minimum]>arr[j]){
                    minimum=j;

                }

            }
            int temp=arr[i];
            arr[i]=arr[minimum];
            arr[minimum]=temp;
        }
    }
    //DIVIDE AND CONCURE
    public static void mergesort(int arr[],int si,int ei){                      //MERGESORT
        //base case
        if(si>=ei){
            return;
        }

        int mid=si+(ei-si)/2;
        mergesort(arr,si,mid);//sorting of left part
        mergesort(arr,mid+1,ei);//sorting of right part

        merge(arr,si,ei,mid);

    }
    public static void merge(int arr[],int si,int ei,int mid ){
        int temp[]=new int[ei-si+1];
        int i=si, j=mid+1, k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }//STILL AFTER SORTING THIS MUCH SOME ELEMENTS LEFT BEHIND FOR THIS:
        //LEFTOVER ELEMENTS OF FIRST PART
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //LEFTOVER ELEMENTS OF SSECOND PART
        while(j<=ei){
            temp[k++]=arr[j++];

        }
        //cpoing the values of temp to arr
        for( k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void Quicksort(int arr[],int si,int ei){
        int pivot=partition(arr,si,ei);
        Quicksort(arr,si,pivot-1);//leftsort
        Quicksort(arr,pivot+1,ei);//right sort



    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];//last index as pivot point
        int j=si-1; 
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=pivot){
                j++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
        }j++;
        int temp=pivot;
        arr[ei]=arr[j];
        arr[j]=temp;
        return j;
    }


    

    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
   
    public static void main(String[] args) {
    int arr[]={6,3,9,5,2,8};
    //bubblesort(arr);
    //selectionsort(arr);
    mergesort(arr,0,arr.length-1);
    printarray(arr);

    }
}

