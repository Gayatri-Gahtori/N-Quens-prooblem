public class Backtracking {
    public static void subsetsofArray(String str,int i, String ans){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;

        }


        //recursive work
        //if yes
        subsetsofArray(str,i+1 ,ans+str.charAt(i));
        //if no
        subsetsofArray(str,i+1,ans);

    }

    public static void main(String[] args) {
        String str ="abc";
        
        subsetsofArray(str,0," ");

        
    }
    
}
