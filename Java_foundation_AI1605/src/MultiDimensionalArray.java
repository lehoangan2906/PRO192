public class MultiDimensionalArray {
    public static void main(String[] args){
        int A[] = {4, 6, 5, 2};
        System.out.println("Number of elements in array A: " + A.length);
        
        int m[][] = {{4, 6, 5, 2}, {99, 100}, {1001, 1002, 1003}};
        System.out.println("Number of elements in array m: " + m.length);
        
        // in 3 gia tri  1001, 1002, 1003
        
        for(int col = 0; col < m[2].length; col++){
            System.out.println("the element in col " + col + " is " + m[2][col]);
        }
    
    }
}
