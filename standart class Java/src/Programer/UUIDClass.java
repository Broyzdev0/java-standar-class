package Programer;

import java.util.UUID;

//saat membuat apllikasi, kadang kita ada kasus ingin membuat data unique misal untuk kebutuhan data promary key misalnya
//java menyediakan sebuah CLASS UUID atau singkatan dari Universally Universally unique identifier
//UUID adalah format standard untuk membuat unique value yang telah terjamin

public class UUIDClass {

    public static void main(String[] args) {
        
        for(var i = 0; i < 100; i++) {

            UUID uuid = UUID.randomUUID();
            String key = uuid.toString();

            System.out.println(key);
        }
    }
    
}
