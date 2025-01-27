package array;

public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    //1295. Find Numbers with Even Number of Digits
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
    public int findNumbers(int[] nums) {
        int sumEvenDigits = 0;
        for(int num : nums) {
            if(countDigitNumber(num) % 2 == 0) sumEvenDigits++;
        }
        return sumEvenDigits;
    }

    public int countDigitNumber(int n){
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }


    public static void main(String[] args) {
    }
}
