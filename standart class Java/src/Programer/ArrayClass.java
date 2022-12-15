package Programer;

import java.lang.reflect.Array;
import java.util.Arrays;


//arrray class adalah class yang berisikan static method yang bisa kita gunakan untuk memanipulasi data array, seperti pencarian dan pengurutan

//method array class
//binarySearch(array, value) => Mencari value array
//copyOf(...) => menyalin data array
//equals(array1, array2) => membandingkan array1 dan array2
//sort(array) => mengurutkan array
//toString(array) => mengembalikan representasi string

public class ArrayClass {
    public static void main(String[] args) {
        
        int[] numbers = {
            1, 4, 234, 5, 6, 19, 5, 67, 4, 67, 4, 6, 7
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 7));
        System.out.println(Arrays.binarySearch(numbers, 234));
        System.out.println(Arrays.binarySearch(numbers, 100));


        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(result2));
    }
    
}
