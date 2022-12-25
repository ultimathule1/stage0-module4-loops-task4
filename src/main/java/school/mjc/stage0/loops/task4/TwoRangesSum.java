package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            int countedSum = 0;
            int skippedSum = 0;
            int i = 0;
            for (; i <= lastInRow; i++) {
                if (i == numberToSkip) break;
                countedSum += i;
            }
            for (; i <= lastInRow; i++) {
                skippedSum += i;
            }
            System.out.println("skipped sum is " + skippedSum);
            System.out.println("counted sum is " + countedSum);
        }
    }
}
