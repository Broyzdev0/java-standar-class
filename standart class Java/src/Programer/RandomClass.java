package Programer;

import java.util.Random;

//Randomclass adalah class yang  bisa kita gunakan untuk men generate random number

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 1000; i++ ) {
            int value = random.nextInt(1000);
            System.out.println(value);
        }
        
    }
}
