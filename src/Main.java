import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Введите исходные данные для расчета через пробел или введите \"exit\": ");

            String str = reader.readLine();
            if (str.equals("exit"))
                break;

            System.out.println("Результат: " + calc(str));
        }
    }

    public static String calc(String input) throws InputUserException {
        String[] validNumbers = new String[]{"1", "2", "3", "4" ,"5", "6", "7", "8", "9", "10"};
        String[] validSign = new String[]{"+", "-", "*", "/"};

        String[] split = input.split(" ");

        if (split.length != 3 || !Arrays.asList(validNumbers).contains(split[0])
                || !Arrays.asList(validSign).contains(split[1])
                || !Arrays.asList(validNumbers).contains(split[2]))
            throw new InputUserException("Ошибка ввода данных! Калькулятор принимает на вход два числа от 1 до 10 включительно и один знак математической операции (+,-,*,/), расположенный между ними через пробел!");

        int a = Integer.parseInt(split[0]);
        String sign = split[1];
        int b = Integer.parseInt(split[2]);
        int result = 0;

        switch (sign) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }

        return Integer.toString(result);
    }
}

