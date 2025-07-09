public class arraypractice {
      public static void trapwater(int Array[]){                                //TRAPPING OF WATER 
        int n=Array.length;
        //array of left max
        int maxleft[]=new int[n];
        maxleft[0]=Array[0];
        for(int i=1;i<n;i++){
            maxleft[i]=Math.max(Array[i],maxleft[i-1]);
        }
        //array of right max
        int maxright[]=new int[n];
        maxright[n-1]=Array[n-1];
        for(int i= n-2;i>=0;i--){
            maxright[i]=Math.max(Array[i],maxright[i+1]);
        }
        int trappedwater=0; //trapped water=(water leve- height)*width
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(maxleft[i],maxright[i]);
            trappedwater+=waterlevel-Array[i];
        }
        System.out.println("trappedwater = "+ trappedwater);

    }


    public static int BuyAndSellstock(int price[]){                                //STOCKS
        int maxprofit=0;
        int buyingprice=Integer.MAX_VALUE;
        for(int i=0;i<price.length;i++){
            if(buyingprice<price[i]){
                int profit=price[i]-buyingprice;
                maxprofit=Math.max(maxprofit ,profit);
            }
            else{
                buyingprice=price[i];
            }
        } return maxprofit;


    }
    public static void main(String[] args) {
        int[] Array={4,2,0,6,3,2,5};
        int[] price={7,1,5,3,6,4};
        System.out.println(BuyAndSellstock(price));

        
    }
}
    

