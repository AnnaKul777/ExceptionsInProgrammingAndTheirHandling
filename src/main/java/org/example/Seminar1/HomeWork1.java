package org.example.Seminar1;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = sc.nextInt();
        mathematics(number1, number2);
    }
    public static void mathematics(int a, int b){
        try {
            int result = a / b;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e){
            System.out.println("Разделить на ноль невозможно");
        }
    }
}
