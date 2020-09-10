package com.savchenko.homeworks.hometask1;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("19. y = arccos[tg(5x/π)] + x^3,2/28");
        System.out.println("Please enter the value of x");
        double x = scanner.nextDouble();
        double y = Math.acos((Math.tan((5 * x) / Math.PI))) + Math.pow(x, 3.2) / 28;  //     19. y = arccos[tg(5x/π)] + x^3,2/28;
        System.out.println("y is " + y);

        System.out.println("Please enter the value of x");
        double x1 = scanner.nextDouble();
        System.out.println("20.y = (3 √ln2 + tgcos πx)|ln x/10,5 + 1/3|");
        double y1 = ((Math.cbrt(Math.sqrt(Math.log(2))) + Math.tan(Math.cos(Math.PI * x1))) * Math.abs(Math.log(x1 / 10.5) + 1 / 3));   // 20. y = (3 √ln2 + tg cos πx)|ln x/10,5 + 1/3|
        System.out.println("y is " + y1);

        System.out.println("21. y = (4√lgx + arccos (x+3)) 1/|x+2x^2|");
        System.out.println("Please enter the value of x");
        double x2 = scanner.nextDouble();
        double y3 = ((Math.pow(Math.log(x2), 1 / 4)) + Math.acos((x2 + 3) * 1 / Math.abs(x2 + 2 * Math.pow(x2, 2)))); //21. y = (4√lgx + arccos (x+3)) 1/|x+2x^2|;
        System.out.println("y is " + y3);

        System.out.println(" 22. y = arcsin (lgx/ x^2 +5x +1) - x^3,2 /28");
        System.out.println("Please enter the value of x");
        double x3 = scanner.nextDouble();
        double y4 = (Math.asin(Math.log(x3) / Math.pow(x3, 2) + 5 * x3 + 1) - Math.pow(x3, 3.2) / 28); // 22. y = arcsin (lgx/ x^2 +5x +1) - x^3,2 /28
        System.out.println("y is " + y4);

        System.out.println("23.y = arccos [tg (5x/π)] + x^5,7/23");
        System.out.println("Please enter the value of x");
        double x4 = scanner.nextDouble();
        double y5 = (Math.acos(Math.tan(5 * x4 / Math.PI)) + Math.pow(x4, 5.7) / 23);// 23.y = arccos [tg (5x/π)] + x^5,7/23
        System.out.println("y is " + y5);

        System.out.println("24.y = arctg[|8.3-21x^2-0.8x|/3√2.5+1/x^2]");
        System.out.println("Please enter the value of x");
        double x5 = scanner.nextDouble();
        double y6 = Math.atan(Math.abs(8.3 - 21 * Math.pow(x5, 2) - 0.8 * x / Math.pow(2.5 + 1 / Math.pow(x5, 2), 1 / 3)));  //24.y = arctg[|8.3-21x^2-0.8x|/3√2.5+1/x^2]
        System.out.println("y is " + y6);

        System.out.println("25. y = 4√lg arccos[|x^3.4+2.5x^1.2-0.7|/3√e^2.5x]+1");
        System.out.println("Please enter the value of x");
        double x6 = scanner.nextDouble();
        double y7 = ((Math.pow(Math.log(Math.acos((Math.abs(Math.pow(x6, 3.4) + 2.5 * Math.pow(x6, 1.2) - 0.7)) / Math.pow(Math.exp(2.5 * x6), 1 / 3))), 1 / 4)) + 1);  // 25. y = 4√lg arccos[|x^3.4+2.5x^1.2-0.7|/3√e^2.5x]+1
        System.out.println("y is " + y7);

        System.out.println("26. y = lg|sin x| +2e^2 + 2 cos|x| +2");
        System.out.println("Please enter the value of x");
        double x7 = scanner.nextDouble();
        double y8 = Math.log(Math.abs(Math.sin(x7))) + 2 * Math.exp(2) + 2 * Math.cos(Math.abs(x7)) + 2; //26. y = lg|sinx| +2e^2 + 2 cos|x| +2;
        System.out.println("y is " + y8);

    }

}
