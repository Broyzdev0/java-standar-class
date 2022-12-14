package Programer;

import java.math.BigInteger;
//Digunakan apabila kapasityas melebihi Long

// add untuk penjumlahan
// subtract untuk pengurangan
// multiply untuk perkalian
// divide untuk pebagian
// mod untuk persen

public class Bignumber {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("10000000000000000000000000");
        BigInteger b = new BigInteger("10000000000000000000000000");

        BigInteger c = a.add(b); // add bisa di ubah sesuai yang di atas

        System.out.println(c);

        
    }
    
}
