package chapterTwo;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter side x1");
        double x1 = scanner.nextDouble();
        System.out.println("enter side y1");
        double y1 = scanner.nextDouble();
        System.out.println("enter side x2");
        double x2 = scanner.nextDouble();
        System.out.println("enter side y2");
        double y2 = scanner.nextDouble();
        System.out.println("enter side x3");
        double x3 = scanner.nextDouble();
        System.out.println("enter side y3");
        double y3 = scanner.nextDouble();

        double area= 1*1.0/2*((x1*(y3-y2))+(x2*(y1-y3))+(x3*(y2-y1)));
        System.out.printf("the area is: %.2f", area);
    }
}
