package IMPLEMENT_ARR;

public class TwoDimensionArray {
//    Step 1 - Declare
    int [][] arr = null;
//    Step 2 - Instantiate
    public TwoDimensionArray(int row, int col){
        arr = new int[row][col];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length;j++){
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }
//    Step 3 - Initialize
    public void insert(int row, int col, int value ){
        try{
        if(arr[row][col] == Integer.MIN_VALUE){
            arr[row][col] = value;
        }else{
            System.out.println("This index can not be occupied");
        }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Invalid index for 2D array");
        }
    }
    public void access(int row, int col){
        try{
            System.out.println(arr[row][col]);
        }catch(IndexOutOfBoundsException ex){
            System.out.println("Index not exist in arr");
        }
    }
    public void traversalArray(){
        for(int row = 0 ; row < arr.length;row++){
            for(int col = 0; col < arr[0].length; col++){
                System.out.print(arr[row][col]+ " ");
            }
        }
    }
//    Searching single value
    public void searchValue(int value){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length;j++){
                if(arr[i][j] == value){
                    System.out.println("Value found in row" + i +"and col"+j);
                    return;
                }
            }
        }
        System.out.println("Not found value in 2D dimension array");
    }
//    Delete
    public void deleteItem(int row, int col){
        try{
            System.out.println("Deleted item!");
            arr[row][col] = Integer.MIN_VALUE;
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Index row and col out of bound");
        }
    }
}
