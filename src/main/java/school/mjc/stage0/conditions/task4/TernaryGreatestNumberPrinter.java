package school.mjc.stage0.conditions.task4;

import static school.mjc.stage0.conditions.task4.TernaryPrinter.printWhichIsBigger;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int greatest = first > second ?
                first :
                second;
        System.out.println(greatest);
    }

    public static void main(String[] args) {
        printWhichIsBigger(10, 20);
    }
}
