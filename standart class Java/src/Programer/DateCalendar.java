package Programer;

import java.util.Date;
import java.util.Calendar;

public class DateCalendar {
    public static void main(String[] args) {
        

        Date tanggal = new Date(2358720000L);

        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.HOUR_OF_DAY, 10);

        Date result = calendar.getTime();
        System.out.println(result);


    }
    
}
