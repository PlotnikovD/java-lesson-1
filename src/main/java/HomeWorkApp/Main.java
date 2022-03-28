package HomeWorkApp;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        chekSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void chekSumSign() {
        int a = 10;
        int b = 20;
        int sum  = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101;

        if (value > 100) {
            System.out.println("Зеленый");
        } else if (0 < value && value <=100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Красный");
        }
    }

    public static void compareNumbers() {
        int a = 46;
        int b = 36;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
