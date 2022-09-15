package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public static void printGreatest(int first, int second, int third) {
        int greatest;
        greatest = first >= second ? 
                first :
                second;
        greatest = greatest >= third ?
                greatest :
                third;
        System.out.println(greatest);
    }

    public static void main(String[] args) {
        printGreatest(10, 20, 30);
    }
}
