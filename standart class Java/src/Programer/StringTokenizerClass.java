package Programer;

import java.util.StringTokenizer;

public class StringTokenizerClass {
    public static void main(String[] args) {
        
        String value = "Angga Nur Gunawan";

        StringTokenizer tokenizer = new StringTokenizer(value, "");

        while (tokenizer.hasMoreElements()) {
            String result = tokenizer.nextToken();
            System.out.println(result);
            
        }
    }
}
/*Stringtoknizerclass adalah class yang bbisa kita gunakan  untuk memotong String menjadi
token atau string yang lebih kecil*/