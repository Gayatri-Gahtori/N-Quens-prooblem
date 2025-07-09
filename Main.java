import java.util.*;
public class Main {
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    for(int i=0; ;i++){
        System.out.println("enter your no : ");
    int k= sc.nextInt();
    if (k%10==0){
        continue;
     }else{
        System.out.println(k);
    }
    }
}
}

