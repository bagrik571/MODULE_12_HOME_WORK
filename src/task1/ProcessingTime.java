package task1;

import java.util.Calendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class ProcessingTime {
    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);
        scheduler.schedule(
                () -> System.out.println("Start"),
                0,
                TimeUnit.SECONDS
        );
        //scheduleAtFixedRate відлік часу починається як тільки попередня задача почала виконання
        scheduler.scheduleWithFixedDelay(
                () -> System.out.println("Минуло " + Calendar.getInstance().get(Calendar.MINUTE)+ " хвилин " + Calendar.getInstance().get(Calendar.SECOND) + " секунд"),
                0,
                1,
                TimeUnit.SECONDS
        );
        //scheduleWithFixedDelay відлік часу для нової задачі яка починається тільки після
        // того як попредня задача завершила виконання
        scheduler.scheduleWithFixedDelay(
                () -> System.out.println("Минуло 5 секунд"),
                5,
                5,
                TimeUnit.SECONDS
        );
    }
}
