import java.util.*;
public class arraylist {
    public static void maxelement(ArrayList<Integer> list1){
       int max=Integer.MIN_VALUE;
        for(int i=0;i<list1.size();i++){
            if (list1.get(i)>max){
                max=list1.get(i);
            }
            
        }System.out.println(max);
    }
    public static int maxwater(ArrayList<Integer> height ){
        int maxwater=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int h=Math.min( height.get(i),height.get(j));
                int w=j-i;
                int currwater=h*w;
                maxwater=Math.max(maxwater,currwater);
            }
        }
        return maxwater;
    }
    public static int mostwater2poimter(ArrayList<Integer> height){
        int maxwater =0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int w=rp-lp;
            int currtwater=ht*w;
            maxwater=Math.max(maxwater,currtwater);
             if(height.get(lp)<height.get(rp)){
                lp++;
             }   
             else{
                rp--;
             }  
        }
        return maxwater;

    }

public static boolean pairsum1(ArrayList<Integer> list1,int target ){
    for(int i=0; i<list1.size();i++){
        for(int j=i+1;j<list1.size();j++){
            if(list1.get(i)+list1.get(j)==target){
                return true;
            }
        }
    }
    return false;

}
public static boolean pairsum1_2pointers(ArrayList<Integer> list1,int target){
    int lp=0;
    int rp=list1.size()-1;
    while(lp<rp){
    if(list1.get(lp)+list1.get(rp)==target){
        return true;
    }
    if((list1.get(lp)<list1.get(rp))){
        lp++;
    }
    else{
        rp--;
    }
    }
    return false;
}
   
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       ArrayList <Integer> list1 =new ArrayList<>();
       list1.add(1);
       list1.add(2);
       list1.add(3);
       list1.add(4);
       list1.add(5);
       //maxelement(list1);
       ArrayList <Integer> height =new ArrayList<>();
       height.add(1);
       height.add(8);
       height.add(6);
       height.add(2);
       height.add(5);
       height.add(4);
       height.add(8);
       height.add(3);
       height.add(7);
       System.out.println("Enter TARGET = ");
       int target=sc.nextInt();
      // System.out.println(height);
      //System.out.println(maxwater( height ));
       //System.out.println(mostwater2poimter(height));
       //System.out.println(pairsum1( list1,target ));
       System.out.println(pairsum1_2pointers( list1,target ));
       
    }
}