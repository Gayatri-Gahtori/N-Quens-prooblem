public class recursion_2 {
    public static int tylingproblem(int n){ //floor size=2*n                     //TYLING PROBLEM
        //base case
        if(n==0 || n==1){
            return 1;
        }

        //for verticle tiles
        int verticletile=tylingproblem(n-1);
     
        //for verticle tiles
        int horizontaltile=tylingproblem(n-2);
        
        //total ways
        int totalways=verticletile+horizontaltile;

        return totalways;
    }
    public static void removeduplichar(String str, int idx,StringBuilder newstr,boolean map[]){
        //base case
        if(idx==str.length()){
            System.out.println(newstr);
            return ;
        }
        //kaam
        char curntchar=str.charAt(idx);
        if(map[curntchar-'a'] == true){
            removeduplichar(str, idx+1, newstr, map);
        } else {
            map[curntchar-'a'] = true;
            removeduplichar(str, idx+1, newstr.append(curntchar), map);
        }
    
    }
    public static int friendspairing(int n){
        //basecase
        if(n==1||n==2){
            return n;
        }
        //no of ways to arrange single people
        int single=friendspairing(n-1);
         //no of ways to arrange paired people +one single 
        int pairs=friendspairing(n-2);
        int pairways=(n-1) * pairs;
        int totalways=single+pairways;
        return totalways;

        }
    public static void main(String[] args) {
        //System.out.println(tylingproblem(4));
         String str="gayatrigahtori";
         int idx=0;
         //removeduplichar(str, idx, new StringBuilder(" "), new boolean[26]);
         System.out.println(friendspairing( 3));
    }
    
}
