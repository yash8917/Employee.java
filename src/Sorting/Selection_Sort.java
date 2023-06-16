package Sorting;

import java.util.Scanner;

public class Selection_Sort {

    public static void selectionSort(int[] ar){
        for (int i = 0; i < ar.length -1; i++) {
            int smallest = i;
            for (int j = i+1; j < ar.length ; j++) {
                if (ar[smallest] > ar[j]){
                    smallest =j;
                }
            }
            int temp =ar[smallest];
            ar[smallest]=ar[i];
            ar[i]=temp;

        }
        for (int e: ar) {
            System.out.print(e+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]=sc.nextInt();
        }
        selectionSort(ar);
    }
}
