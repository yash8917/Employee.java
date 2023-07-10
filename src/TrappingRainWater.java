import java.util.Scanner;

public class TrappingRainWater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A ={1, 8, 6,2,5,4,7,9,8};

        int st_dex = 0;
        int ed_dex =A.length-1;
        int maxArea = 0;
        while( st_dex < ed_dex){
            int lh = A[st_dex];

            int rh =A[ed_dex];
            int min_h = Math.min(lh , rh);
            maxArea = Math.max(maxArea , min_h*(ed_dex-st_dex));
            if(lh<rh) st_dex++;
            else ed_dex--;
        }
        System.out.println(maxArea);

    }
}
