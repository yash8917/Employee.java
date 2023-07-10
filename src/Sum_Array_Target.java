public class Sum_Array_Target {
    public static void main(String[] args) {
        int[] ar ={1,2,3,4};
        int maxSubSum =0;
        for(int i = 0 ; i < ar.length ; i++){
                int sum =0;
            for (int j = i; j < ar.length; j++) {


                    sum += ar[j];
//                    System.out.print(ar[j]+" ");
                    maxSubSum=Math.max(maxSubSum , sum);

            System.out.println("=> "+sum);
                if(sum >maxSubSum){
                    maxSubSum =sum;
                }
            }
        }
        System.out.println(maxSubSum);
    }
}
