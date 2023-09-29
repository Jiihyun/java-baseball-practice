package baseball5.domain;

import static baseball5.util.NumberConst.NUMBER_DIGIT;

public class NumberComparator {
    private final Numbers computerNum;
    private final Numbers inputNum;

    public NumberComparator(Numbers computerNum, Numbers inputNum) {
        this.computerNum = computerNum;
        this.inputNum = inputNum;
    }

    public static NumberComparator of(Numbers computerNum, Numbers inputNum) {
        return new NumberComparator(computerNum, inputNum);
    }

    public int strikeCount() {
        int count = 0;
        for (int i = 0; i < NUMBER_DIGIT; i++) {
            if (isStrike(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isStrike(int i) {
        return computerNum.getNumberList().get(i).equals(inputNum.getNumberList().get(i));
    }

    public int ballCount() {
        int count = 0;
        for (int i = 0; i < NUMBER_DIGIT; i++) {
            if (computerNum.getNumberList().contains(inputNum.getNumberList().get(i)) && !isStrike(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean isNothing() {
        return strikeCount() + ballCount() == 0;
    }
}
