package Sorting;

import java.util.Scanner;

public class Bubble_Sort {
    public static void bubbleSort(int[] ar){
        for (int i = 0; i < ar.length-1; i++) {
            for(int j =0 ;j<ar.length-i-1 ; j++){
                if(ar[j] > ar[j+1]){
                    int temp= ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        // print the array element
        for (int e: ar) {
            System.out.print(e+" ");

        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
    }
}
