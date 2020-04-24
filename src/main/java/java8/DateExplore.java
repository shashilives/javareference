package java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExplore {
    public static void main(String[] args) {
        String pattern = "MMM dd, yyyy HH:mm:ss.SSSSSSSS";
        String timestampAsString = "Nov 12, 2018 13:02:56.12345678";
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern(pattern);
        LocalDateTime localDateTime  = LocalDateTime.from(formatter.parse(timestampAsString));

//        String pattern = "MMM dd, yyyy HH:mm:ss.SSSSSSSS";
//        String timestampAsString = "Nov 12, 2018 13:02:56.12345678";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
//        LocalDateTime localDateTime = LocalDateTime.from(formatter.parse(timestampAsString));
//
        System.out.println(localDateTime);
    }
}
