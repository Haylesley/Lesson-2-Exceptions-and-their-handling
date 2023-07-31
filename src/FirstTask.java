import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class FirstTask {
    public static void main(String[] args) {
        float number = readFloatFromUser();
        System.out.println("Вы ввели число: " + number);
    }

    public static float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float number = 0.0f;
        boolean validInput = true;

        while (validInput) {
            System.out.print("Введите дробное число: ");

            if (scanner.hasNextFloat()) {
                number = scanner.nextFloat();
                validInput = false;
            } else {
                System.out.println("Ошибка ввода. Пожалуйста, введите корректное дробное число.");
                scanner.next(); // Очистка буфера от некорректного ввода
            }
        }

        return number;
    }
}


