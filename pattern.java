public class pattern {
  
    public static void hollow_rectangle(int rows,int colum){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=colum;j++){
                if(i==1|| i==rows ||j==colum||j==1){
                    System.out.print("*");
                }else{
                System.out.print(" ");
                }
            }
            System.out.println();
         }
    }
    public static void invtsidepyramid(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int k=1;k<=i;k++){
                 System.out.print("*");
            }
        System.out.println();
        } 
    }
    public static void floyds_triangle(int n){
        int k=1;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k +" ");
                k++;
            }
            System.out.println();
        }
       
    }
    public static void pyramid_of_No(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }  

    }
    public static void pyramid_0_1(int n){
        for (int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);

                }else{
                    System.out.print(0);
                }
                
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramid_0_1(3);
        
    }
}



