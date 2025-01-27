package array;

import java.util.Arrays;

public class _27_Remove_Element_ {
    public static int removeElement(int[] nums, int val) {
        int n =  nums.length;
        for(int i = 0; i < n;){
            if(nums[i] == val){
            for(int j = i; j < n - 1; j++){
                nums[j] = nums[j+1];
            }
            n--;
            }
            else{
                i++;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] a  = new int[]{2,2,3,3};
        System.out.println(removeElement(a,2 ));
        System.out.println("Done");
    }
}
