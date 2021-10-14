package lab1;
import lab1.Uni;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Aufgabe 1:");
	    Uni u = new Uni();
        int[] grades = new int[] {50, 40, 38, 25, 10, 99, 23};
        int[] failingGrades = u.failingGrade(grades);
        System.out.println("Failing grades:");
        u.printGrades(failingGrades);
        System.out.println("Average:");
        System.out.println(u.averageGrade(grades));
        int[] roundGrades = u.roundedGrade(grades);
        System.out.println("Rounded grades:");
        u.printGrades(roundGrades);
        System.out.println("Maximal grade");
        System.out.println(u.maxGrade(grades));
        System.out.println();

        System.out.println("Aufgabe2:");
        int[] values = new int[] {4, 8, 3, 10, 17};
        Array a = new Array(values);
        System.out.println("Max value: " + a.maxValue());
        System.out.println("Min value: " + a.minValue());
        System.out.println("Max sum: " + a.maxSum());
        System.out.println("Min sum: " + a.minSum());
        System.out.println();

        System.out.println("Aufgabe3:");
        int[] nr1 = new int[] {2, 8, 0, 0, 0, 0};
        int[] nr2 = new int[] {1, 9, 3, 7, 2, 5};
        BigNumbers bn = new BigNumbers(nr2, nr1);
        int[] sum = bn.sum();
        System.out.println("Sum:");
        bn.printArray(sum);
        int[] dif = bn.dif();
        System.out.println("Difference:");
        bn.printArray(dif);
        int[] mul = bn.mul(2);
        System.out.println("Multiplication:");
        bn.printArray(mul);
        int[] div = bn.div(3);
        System.out.println("Division:");
        bn.printArray(div);

        System.out.println();

        System.out.println("Aufgabe4:");
        int[] keyboards = new int[] {40, 35, 75, 50, 20, 45};
        int[] usb = new int[] {20, 15, 5, 40, 25};
        Electronics shop = new Electronics(usb, keyboards);
        System.out.println("Cheapest keyboard: " + shop.cheapestKeyboard());
        System.out.println("Most expensive object: " + shop.mostExpensiveObject());
        System.out.println("Most expensive USB within the budget: " + shop.mostExpensiveUSB(30));
        System.out.println("Maximum expenses within the budget: " + shop.maxExpenses(60));
    }
}
