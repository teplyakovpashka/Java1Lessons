package lesson2;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(within10and20(10, 5));
        isPositiveOrNegative(100);
        System.out.println(isNegative(-5));
        printWordNTimes("Hello", 5);
    }
    public static boolean within10and20(int x1, int x2) {
        if (x1 + x2 >= 10 && x1 + x2 <= 20) {
            return true;
        }
        else return false;
    }
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Передали положительное число");
        } else {
            System.out.println("Передали отрицательное число");
        }
    }
    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
}
