package task2;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzString {
    public static void main(String[] args) {
        FizzBuzz fizz = new FizzBuzz((n) -> {
            if (n % 3 == 0 && n % 5 != 0) {
                System.out.println("fizz");
            }
        });
        FizzBuzz buzz = new FizzBuzz((n) -> {
            if (n % 3 != 0 && n % 5 == 0) {
                System.out.println("buzz");
            }
        });
        FizzBuzz fizzBuzz = new FizzBuzz((n) -> {
            if (n % 5 == 0 && n % 3 == 0) {
                System.out.println("fizzbuzz");
            }
        });
        FizzBuzz number = new FizzBuzz((n) -> {
            if (n % 5 != 0 && n % 3 != 0) {
                System.out.println(n);
            }
        });

        List<FizzBuzz> fbs = new ArrayList<>();
        fbs.add(fizz);
        fbs.add(buzz);
        fbs.add(fizzBuzz);
        fbs.add(number);

        for (FizzBuzz fb : fbs) {
            fb.start();
        }

        for (int i = 1; i <= 20; i++) {
            for (FizzBuzz fb : fbs) {
                fb.process(i);
            }

            while (true) {
                int processedNumbersCount = 0;
                for (FizzBuzz fb : fbs) {
                    if (fb.isNumberProcessed()) {
                        processedNumbersCount++;
                    }
                }
                if (processedNumbersCount == fbs.size()) {
                    break;
                }
            }
        }
    }
}
