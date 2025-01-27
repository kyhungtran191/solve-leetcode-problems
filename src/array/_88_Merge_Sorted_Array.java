package array;

public class _88_Merge_Sorted_Array {

    /* https://leetcode.com/problems/merge-sorted-array/submissions/1521745190/
    Logic
    *  If found out K (mark K is found)
    *  loop from right side move item from left to right until if come to k (index)
    *  if moved successfully, mark value of k into the arr[index]
    *  Exception case: Loop through all items of arr but can not find down -> the last element
    * */

    public void insertNumber(int number, int[] arr, int m){
        boolean isFindK = false;
        for(int i = 0; i < m; i++){
            if(arr[i] > number){
                isFindK = true;
                for(int j = m -1 ; j >= i; j--){
                    arr[j+1] = arr[j];
                }
                arr[i] = number;
                break;
            }
        }
        if(isFindK == false){
            arr[m] = number;
        }
    }

    public void merge(int[] n1, int m, int[] n2, int n) {
        for(int number : n2){
            insertNumber(number,n1, m);
            m++;
        }
    }



}
