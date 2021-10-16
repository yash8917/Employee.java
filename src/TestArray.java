public class TestArray {
    int arr[];
    public static void main(String[] args) {
//       int arr[];
       int arr[]=new int[3];
        
       arr[0]=23;
       arr[1]=34;
       arr[2]=878;
       for(int i=0;i< arr.length;i++){
           System.out.print(i+"\t");
       }
    }
}
