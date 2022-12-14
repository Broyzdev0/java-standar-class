package Programer;

import java.util.StringJoiner;

public class StringjoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner  = new StringJoiner( ",","[", "]" );

        joiner.add("Angga");
        joiner.add("Nur");
        joiner.add("Gunawan");

        String value = joiner.toString();
        System.out.println(value);


    }
    
}

//untuk menggabung gabungkan
