//write a java programme to display System Time.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class SystemTime{
    public static void main(String args[]){


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM//dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        //print date and time
        System.out.println(dtf.format(now));
    }
}