package Programer;

public class NumberApp {
    public static void main(String[] args) {
        
        Integer intValue = 10;
    Long longValue = intValue.longValue();
    Double doubleValue = longValue.doubleValue();
    Short shortValue = doubleValue.shortValue();

    String contoh = "100A00";

    Integer contohInteger = Integer.valueOf(contoh);
    System.out.println(contohInteger);
    }
    
}
