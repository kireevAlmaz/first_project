package homework;

import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        double numberOne = scanner.nextDouble();
        System.out.println("Введите знак операции - \"+\", \"-\", \"*\", \"/\"");
        scanner.nextLine();
        String sign = scanner.nextLine();
        System.out.println("Введите второе число");
        double numberTwo = scanner.nextDouble();
        if (sign.equals("+")) {
            System.out.println(numberOne + numberTwo);
        } else if (sign.equals("-")) {
            System.out.println(numberOne - numberTwo);
        } else if (sign.equals("/")) {
            System.out.println(numberOne / numberTwo);
        } else if (sign.equals("*")) {
            System.out.println(numberOne * numberTwo);
        } else {
            System.out.println("Ошибка");
            scanner.close();
        }

    }
}

//Необходимо написать калькулятор. Алгоритм:
//1. Вывести на экран: Введите первое число
//2. Получить число с помощью scanner.nextDouble(), сохранить его в переменную
//3. Вывести на экран: Введите знак операции - "+", "-", "*", "/"
//4. Получить текст с помощью scanner.nextLine(), сохранить его в переменную
//4. Вывести на экран: Введите второе число
//5. Получить число с помощью scanner.nextDouble(), сохранить его в переменную
//6. В зависимости от знака операции произвести соответствующую операцию. Вывести результат на экран.
//Если знак операции не относится к перечисленным выше, вывести - "Ошибка"