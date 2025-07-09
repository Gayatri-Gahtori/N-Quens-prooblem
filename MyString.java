import java.math.*;
public class MyString {
    public static boolean ChkPalindrome(String str){
        for(int i=0;i<=str.length()/2;i++){
            if(str.charAt(i)!= str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void  CompareStrings(String fruit[]){
        String largest =fruit[0];
        for(int i=1;i<fruit.length;i++){
            if (largest.compareToIgnoreCase(fruit[i]) < 0){
                largest=fruit[i];
            }
        }
       System.out.println(largest);

    }
    public static float  ShortestPath(String str){
        int x=0 , y=0 ;
        for (int i=0;i<str.length();i++){
            char dir = str.charAt(i);
            //north 
            if(dir=='N'){
               y++;
            }
            //south 
            if(dir=='S'){
                y--;

            }
            //east
            if(dir=='E'){
                x++;
            }
            //west
            if(dir=='W'){
                x--;
            }
            

            
        }
        int X=x*x;
        int Y=y*y;
        return ((float) Math.sqrt(X+y));


    }

    public static void main(String[] args) {
        String str = "NS";
     //   StringUtils.ChkPalindrome(str);
     // System.out.println( ShortestPath(str));
     String fruit[]={"apple","mango","grapes"};
     CompareStrings(fruit);
     


    }
}
