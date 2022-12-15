package Programer;

public class RuntimeClass {

    //Method Runtime Class
    
    //int availableProcessors() => Mendapatkan jumlah core CPU
    //long freeMemory() => Mendapatkan jumlah memory bebas di JVM
    //long totalMemory() => Mendapatkan jumlah total memory  di JVM
    //long maxMemory() => Mendapatkan jumlah maksimum memory  di JVM
    //void gc() => menjalankan garbage collector untuk menghilangkan data di memory yang sudah tidak terpakai


    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.totalMemory());
        
    }
    //ketika aplikasi Java kita berjalan, kita bisa melihat informasi environment tempat aplikasi java berjalan
    //informasi itu terdapat di class runtime
    //Class Runtime tidak bisa di buat secara otomatis java akan membuat single object. kita bisa mengakses object tersebut menggunkan static menthod getRuntime() milik class Runtime
    
}
