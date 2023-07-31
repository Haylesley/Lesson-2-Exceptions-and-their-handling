import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что либо:");
        String str = scanner.nextLine();

        if (str.isEmpty()) System.out.println("Пустые строки вводить нельзя!");
        else System.out.println(str);
    }
}
