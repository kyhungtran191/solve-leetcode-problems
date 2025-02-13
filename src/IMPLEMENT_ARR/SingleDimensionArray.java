package IMPLEMENT_ARR;

public class SingleDimensionArray {
    int arr[]= null;
//   Initial Array Constructor
    public SingleDimensionArray(int size) {
        arr = new int[size];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int position, int value){
        /*
        * Logic: If no value, can be insert, if not log error
        *
        * */
        try{
            if(arr[position] == Integer.MIN_VALUE){
                arr[position] = value;
                System.out.println("Successfully inserted value: " + value);
            }else{
                System.out.println("Value already inserted");
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }
    }
//    Array Traversal
    public void traversalArray(){
        try{
            for(int i = 0 ; i < arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }catch(Exception e){
            System.out.println("Array is no longer exits");
        }
    }
//    Search for an element in the given array
    public void searchItem(int value){
        for(int i = 0; i < arr.length;i++){
            if(arr[i]==value){
                System.out.println("Value is found in "+ i);
                return;
            }
        }
        System.out.println("Value is not found in arr");
    }
//    Delete value from array
    public void deleteItemInArray(int index){
        try{
            arr[index] = Integer.MIN_VALUE;
            System.out.println("Item is deleted!");
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Index is out of bound in array");
        }
    }
}
