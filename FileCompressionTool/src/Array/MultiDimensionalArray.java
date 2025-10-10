// Multi-dimensional arrays are used to store the data  in rows and columns where each row can represent another individual array.

import java.io.*;

public class MultiDimensionalArray {
    public static void main(String[] args){
        // Multidimensional arry declaration
        int [] [] arr;

        // Initializing the values
        arr = new int [1] [3];

        //Initializing the values
        arr[0][0] = 3;
        arr[0][1] = 5;
        arr[0][2] = 7;

        // Display the value of the values in the index
        System.out.println("arr[0][0] = " + arr[0][0] );
        System.out.println("arr[0][1] = " + arr[0][1] );
        System.out.println("arr[0][2] = " + arr[0][2] );
    }
}

// The parameters are:
//1. data type: The type of data to be stored in the array
//2. Dimension: The dimension of the array create, could be 1D, 2D etc
//3. Array name: Name of the array
//4. size1,size2,size3......: Sizes of the dimension respectively.

// The size can be calculated by multiplying the size of all the dimensions or the arrat and have the dimensions ie: 3 x 5 = 15


// TWO DIMENSIONAL ARRAY: