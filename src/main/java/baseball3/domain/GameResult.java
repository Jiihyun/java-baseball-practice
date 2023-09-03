package baseball3.domain;

public class GameResult {
    //렌더링 할 때 필요
    //게임 결과

    //baseball Record 두 개를 비교해서
    // (하나는 정답, 하나는 사용자 입력)

    //ballCount, strikeCount 저장

    public String gameResult(BaseballRecord inputNums, BaseballRecord randomNums) {
        StringBuilder sb = new StringBuilder();
        if (inputNums.isNothing(randomNums)) {
            return "낫싱";
        }
        int ballCount = inputNums.getBallCount(randomNums);
        if (ballCount > 0) {
            sb.append(String.format("%d볼 ", ballCount));
        }
        int strikeCount = inputNums.getStrikeCount(randomNums);
        if (strikeCount > 0) {
            sb.append(String.format("%d스트라이크", strikeCount));
        }
        return sb.toString();
    }
}

