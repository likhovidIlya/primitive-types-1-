import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Выберите операцию над double/float" + "\n" +
                "1. Сравнить" + "\n" +
                "2. Округлить" + "\n" +
                "3. Отбросить дробную часть");

        number = scanner.nextInt();
        System.out.println("Введите первое число");
        double number1 = scanner.nextDouble();

        System.out.println("Введите второе число");
        double number2 = scanner.nextDouble();

        switch (number) {
            case (1): {
                String result = compare(number1, number2);
                System.out.println(result);
                break;
            }
            case (2): {
                round(number1, number2);
                break;
            }
            case (3): {
                discard(number1, number2);
                break;
            }
        }
    }

    static String compare(double number1, double number2) {
        double diff = number1 - number2;
        if (diff == 0) {
            return "Числа равны";
        } else if (diff < 0) {
            return "Первое число меньше второго";
        } else if (diff > 0) ;
        {
            return "Первое число больше второго";
        }
    }

    static void round(double number1, double number2) {
        System.out.println("Первое число " + Math.round(number1));
        System.out.println("Второе число " + Math.round(number2));
    }

    static void discard(double number1, double number2) {
        System.out.println("Первое число " + (long) number1);
        System.out.println("Второе число " + (long) number2);
    }
}