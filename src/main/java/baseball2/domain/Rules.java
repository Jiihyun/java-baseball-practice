package baseball2.domain;

public class Rules {

    public int strikeCount(Numbers inputNums, Numbers randomNums) {
        int strikeCount = 0;
        if (inputNums.getFirstNum() == randomNums.getFirstNum()) {
            strikeCount++;
        }
        if (inputNums.getSecondNum() == randomNums.getSecondNum()) {
            strikeCount++;
        }
        if (inputNums.getThirdNum() == randomNums.getThirdNum()) {
            strikeCount++;
        }
        return strikeCount;
    }

    //ballCount가 strike조건까지 포함하는디,,
    public int ballCount(Numbers inputNums, Numbers randomNum) {
        int ballCount = 0;
        for (Integer num : inputNums.getNumList()) {
            if (randomNum.getNumList().contains(num)) {
                ballCount++;
            }
        }
        int strikeCount = strikeCount(inputNums, randomNum);
        return ballCount - strikeCount;
    }

    public boolean isNothing(Numbers inputNums, Numbers randomNum) {
        return (strikeCount(inputNums, randomNum) == 0) && (ballCount(inputNums, randomNum) == 0);
    }

    public boolean isStrike(Numbers inputNums, Numbers randomNum) {
        return strikeCount(inputNums, randomNum) > 0;
    }

    public boolean isBall(Numbers inputNums, Numbers randomNum) {
        return ballCount(inputNums, randomNum) > 0;
    }


}
