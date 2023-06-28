package org.example.Seminar1;
import java.util.Scanner;

public class HomeWorkZadacha2 {
    public static void main(String[] args) {
        yourAge();
    }
    public static void yourAge() {
        System.out.print("Введите ваш возраст: ");
        Scanner sc = new Scanner(System.in);
        try {
            String change = sc.nextLine();
            int age = Integer.parseInt(change);
            if (age > 0) {
                System.out.println("Ваш возраст: " + age);
            } else {
                System.out.println("Введите число больше нуля!");
                yourAge();
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: введите корректные данные.");
            yourAge();
        }
    }
}

