import java.util.Scanner;

class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое цисло");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Кокую операцию вы хотите провести (+, -, *, /)");
        char opper =sc.next().charAt(0);

        if (opper == '+') {
            int result = a + b;
            System.out.println("Сложение ровна " + result);
            }
        if (opper == '-') {
            int result = a - b;
            System.out.println("Раность ровна " + result);
        }
        if (opper == '*') {
            int result = a * b;
            System.out.println("Умножение чисел равно " + result);
        }
        if (opper == '/') {
            int result = a / b;
            System.out.println("Деление чисел равно " + result);
        }
    }
}