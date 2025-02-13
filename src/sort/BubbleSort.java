package sort;

import java.util.Arrays;

public class BubbleSort {
    /*
    * O(N^2)
    * Logic: Each step will
    *
    *
    * */
    public static void bubleSort(int []a,int n){
        for(int i = 0; i < n - 1 ; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(a[j]> a[j+1]){
//             Because we compare j+1 so we can push the limit n-i-1
                   int temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0]= 2;
        a[1]= 4;
        a[2]= 3;
        a[3]= 5;
        a[4]= 1;
        bubleSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
