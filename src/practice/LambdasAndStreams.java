package practice;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdasAndStreams {
    public static void main(String[] args) {
        System.out.printf("Sum of 1 through 10 is: %d%n ",IntStream.rangeClosed(1,10)
                .sum());

        System.out.printf("mapping from 1 through 10 is: %d%n ",IntStream.rangeClosed(1,10)
                        .map((int x)-> {
                            return x * 2;
                        })
                .sum());

        System.out.printf("Filter, map and sum up is: %d%n ",IntStream.rangeClosed(1,10)
                        .filter((x->x%2==0))
                        .map((x)-> {return x * 3;})
                        .sum());

        SecureRandom randomNumbers = new SecureRandom();

     String numbers = randomNumbers.ints(10,1,7)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.print("The numbers are: "+ numbers + " ");

     randomNumbers.ints(10,1,7)
             .forEach(System.out::println);

     System.out.println(IntStream.of(1,2,3,4,5,6,7,8,9,10).summaryStatistics());
    }
}
