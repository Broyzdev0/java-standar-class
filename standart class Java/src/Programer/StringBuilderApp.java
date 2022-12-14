package Programer;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Angga");
        builder.append(" ");
        builder.append("Nur");
        builder.append(" ");
        builder.append("Gunawan");
        builder.append("");

        String name = builder.toString();
        System.out.println(name);

        //Konsumsi memory jadi lebih sedikit menggunakan builder

    }
}
