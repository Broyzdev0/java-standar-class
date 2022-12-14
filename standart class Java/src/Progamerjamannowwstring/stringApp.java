package Progamerjamannowwstring;

public class stringApp {

    public static void main(String[] args) {
        String name = "Angga Nur Gunawan";
        String nameLowercase = name.toLowerCase();
        String nameUppercase = name.toUpperCase();

        System.out.println(name); //Huruf  Sesuai dengan Di atas
        System.out.println(nameLowercase); //huruf kecil semua
        System.out.println(nameUppercase); //Huruf Besar Semua
        System.out.println(name.length()); //mengecek berapa panjang string (spasi di hitung karakter)
        System.out.println(name.startsWith("Angga"));
        System.out.println(name.endsWith("Nur Gunawan"));

        String[] names = name.split(" ");
        for(var value : names){
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(0));

        //char[] chars = name.toCharArray();
    }
    
}
