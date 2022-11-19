package org.example;
import java.util.Scanner;

public class Main {
    public static String name;
    public static String maxName;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите имя с большой буквы:");
            name = scanner.nextLine();

            if ("end".equals(name)) {
                System.out.println("Программа завершена!");
                scanner.close();
                break;
            }
            nameSearch(name);
        }
    }

    public static void nameSearch(String inputString){

        if (!Character.isUpperCase(inputString.charAt(0))) {
            throw new AssertionError("Имена нужно вводить с большой буквы!");
        }

        if (maxName == null) {
            System.out.println("Это первое введённое имя!");
            System.out.println();
            maxName = inputString;
            return;
        }

        if (inputString.length() > maxName.length()) {
            maxName = inputString;
            System.out.println("Самое длинное имя: " + maxName);
            System.out.println();
        } else if(inputString.length() == maxName.length())
        {
            System.out.println("Введённое имя равно максимальному");
            maxName = inputString;
            System.out.println("Самое длинное имя: " + maxName);
        }
        else {
            System.out.println("Самое длинное имя: " + maxName);
            System.out.println("Не хватило символов: " + (maxName.length() - inputString.length()));
            System.out.println();
        }
    }
}
