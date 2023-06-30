/*Задача 1:
Напишите программу, которая запрашивает у пользователя число и проверяет,
вляется ли оно положительным. Если число отрицательное или равно нулю,
 программа должна выбрасывать исключение InvalidNumberException с сообщением
 "Некорректное число". В противном случае, программа должна выводить
 сообщение "Число корректно". */

package org.example.Seminar2;
import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите число: ");
                String a = sc.nextLine();
                checkNumber(a);
                System.out.println("Число корректное: " + a);
                break;
            } catch (InvalidNumberException e) {
                System.out.println("Некорректное число: " + e.getMessage());
            }
        }

    }
    public static void checkNumber(String value) throws InvalidNumberException {
        if (value.trim().isEmpty()){
            throw new InvalidNumberException("Вы ввели пустое значение! ");
            }
        int num;
        try {
            num = Integer.parseInt(value);
        } catch (NumberFormatException e) {
           throw new InvalidNumberException("Вы ввели не число! ");
        }
        if (num <= 0){
           throw new InvalidNumberException("Вы ввели 0 или отрицательное число! ");
        }
    }

}
class  InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}



