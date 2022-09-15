package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public static void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int result;
        result = first > second ?
                10 :
                -10;
        System.out.println(result);
    }

    public static void main(String[] args) {
        assignAndPrintBasedOnWhichBigger(10, 20);
    }
}
