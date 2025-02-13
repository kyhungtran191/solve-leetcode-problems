package IMPLEMENT_ARR;


import java.util.Arrays;

public class knowledge {
    public static void main(String[] args) {
//        SingleDimensionArray arr1 = new SingleDimensionArray(2);
//        arr1.insert(0, 1);
//        arr1.insert(1, 3);
        TwoDimensionArray arr2 = new TwoDimensionArray(2,2);
        arr2.insert(0,0,1);
        arr2.insert(0,1,2);
        arr2.insert(1,0,3);
        arr2.insert(1,1,4);
        arr2.traversalArray();
    }
}
