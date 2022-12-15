package Programer;
//Method system class

//String getenv(key) =>mendapatkan environment variabel sistem operasi
//void exit (status) => menghentikan program java
//long currentTimeMilis() => mendapatkan waktu saat ini dalam milisecond
//long long nanoTime() => mendapatkan waktu saat ini dalam nanosecond
//void gc() => Menjalankan java garbage collection

public class SystemClass {

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv("HOME"));
        System.out.println(System.getenv("APP"));

        System.gc();

        System.exit(1);

        System.out.println("Hi");


        
    }
    
}
