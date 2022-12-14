package Programer;

import java.util.Scanner;

public class ScannerClass {

    // Method di scanner class

    // nextLine => membaca string
    // nextlnt => membaca int
    //nextLong => membaca long
    //next boolean => membaca boolean
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nama : ");
        String name = scanner.nextLine();
        
        System.out.println("Umur : ");
        Integer age = scanner.nextInt(); 
    
        System.out.println("Hello " + name + " Umur anda adalah " + age);
    }
}
