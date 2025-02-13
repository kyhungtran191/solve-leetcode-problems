package sort;

import java.util.Arrays;

public class SelectionSort {
    /* Selection Sort
     * Complexity: O(N2)
     * Logic: Try to push the element not sorted (min or max value of the array) yet into first pos of the arr
     */
    public static void selectionSort(int[] a, int n){
        for(int i = 0; i < n - 1; i++){
            int min_pos = i;
            for(int j = i+1; j<n ; j++ ){
                if(a[j] < a[min_pos]){
                    min_pos = j;
                }
            }
            int tmp = a[i];
            a[i] = a[min_pos];
            a[min_pos] = tmp;
        }

    }
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0]= 2;
        a[1]= 4;
        a[2]= 3;
        a[3]= 5;
        a[4]= 1;
        selectionSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
