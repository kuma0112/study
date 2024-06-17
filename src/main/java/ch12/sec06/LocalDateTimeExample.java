package ch12.sec06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        // 백엔드에서 날짜, 시간 데이터 전송할 때 json을 사용해야 하는데
        // 이전 api 들은 json serialize에 문제가 있기 때문에
        // 되도록이면 ㅣocaldatetime 타입을 쓰는 것이 좋다.
        String str = "1986-04-08 12:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
        System.out.println(dateTime);
        System.out.println(dateTime.getYear());
        System.out.println(dateTime.getMonth()); // Text
        System.out.println(dateTime.getMonthValue()); // Number
        System.out.println(dateTime.getDayOfMonth());
        System.out.println(dateTime.getHour());
        System.out.println(dateTime.getMinute());
        System.out.println(dateTime.getSecond());

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getMonth()); // Text
        System.out.println(now.getMonthValue()); // Number
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
    }
}
