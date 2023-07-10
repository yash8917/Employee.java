public class Transpose {
    public static void main(String[] args) {
        int[][] ar ={{1,2,3},
                {4,5,6},{7,8,9}};
        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j < i; j++) {

                    int temp = ar[i][j];
                    ar[i][j] = ar[j][i];
                    ar[j][i] = temp;


            }
        }
        for(int[] i : ar){
            for(int j: i){
                System.out.print(j+" ");
            }
        }
    }
}
