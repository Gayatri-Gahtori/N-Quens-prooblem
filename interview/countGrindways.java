public class countGrindways {
    public static int gridways(int i,int j,int n,int m){
        //basecase
        if(i==n-1&& j==m-1 ){           //at last cell +target itself
            return 1;
        }
        else if (i==n || j==n){          //out of the grid(corner case)
            return 0;
        }

        int rightmove=gridways(i,j+1,n,m);
        int downmove=gridways(i+1,j,n,m);
        return (rightmove+downmove);
    }
    public static void main(String[] args) {
        int n=3 ,m=3;
        System.out.println(gridways(0,0,n,m));
    }
}
