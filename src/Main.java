import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public static String calc(String input) throws IOException {
        String[] split = input.split(" ");

        int aNoLimit = Integer.parseInt(split[0]);
        String sign = split[1];
        int bNoLimit = Integer.parseInt(split[2]);

        int a = 0;
        int b = 0;

        if ((aNoLimit <= 10 && aNoLimit >= 0) && (bNoLimit <= 10 && bNoLimit >= 0)) {
            a = aNoLimit;
            b = bNoLimit;
        } else {
            throw new IOException();
        }

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
            default:
                System.out.println("Ошибка ввода данных");
                break;
        }
        return Integer.toString(result);
    }

}

