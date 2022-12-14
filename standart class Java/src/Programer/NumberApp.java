package Programer;

public class NumberApp {
    public static void main(String[] args) {
        
        Integer intValue = 10;
    Long longValue = intValue.longValue();
    Double doubleValue = longValue.doubleValue();
    Short shortValue = doubleValue.shortValue();

    String contoh = "100A00";
    // String contoh1 = "10A238";

    Double contohInteger = Double.valueOf(contoh);
    System.out.println(contohInteger);

    // Short contoh1Integer = Short.valueOf(contoh1);
    // System.out.println(contoh1);
    }
    
}
