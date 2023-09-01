package baseball2.domain;

public class Rules {
    private int ballCount;
    private int strikeCount;

    public Rules(int ballCount, int strikeCount) {
        this.ballCount = ballCount;
        this.strikeCount = strikeCount;
    }

    public int strikeCount(Numbers inputNums, Numbers randomNums) {
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
        int ballCountIncludeStrikeCount = 0;
        for (Integer num : inputNums.getNumList()) {
            if (randomNum.getNumList().contains(num)) {
                ballCountIncludeStrikeCount++;
            }
        }
        int strikeCount = strikeCount(inputNums, randomNum);
        ballCount = ballCountIncludeStrikeCount - strikeCount;
        return ballCount;
    }

    public boolean isNothing() {
        return strikeCount == 0 && ballCount == 0;
        //imp - strikeCount와 ballCount가 반복돼서 필드로 빼쥼
//        return (strikeCount(inputNums, randomNum) == 0) && (ballCount(inputNums, randomNum) == 0);
    }

    public String getGameResult() {
        StringBuilder sb = new StringBuilder();
        if (isNothing()) {
            return "낫싱\n";
        }
        if (ballCount > 0) {
            sb.append(String.format("%볼 ", ballCount));
//            sb.append(ballCount).append("볼 ");
        }
        if (strikeCount > 0) {
            sb.append(String.format("%스트라이크", strikeCount));
        }
        return sb.toString();
    }

}
