package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public static void printGreatest(int first, int second, int third) {
        int greatest;
        if (first >= second) {
            greatest = first;
        } else {
            greatest = second;
        }
        if (greatest >= third) {
            System.out.println(greatest);
        } else {
            System.out.println(third);
        }

    }

    public static void main(String[] args) {
        printGreatest(1, 2, 3);
    }
}
