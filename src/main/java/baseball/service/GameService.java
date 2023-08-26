package baseball.service;

import baseball.model.BaseBallRecord;
import baseball.model.BaseballResult;

public class GameService {
    //같은 수 같은 자리 - 스트라이크
    //같은 수 다른 자리 - 볼
    //같은 수 전혀 없으면 - 낫싱
    public BaseballResult result(BaseBallRecord numbers, BaseBallRecord randomNumber) {

        int ballCount = ballCount(numbers, randomNumber);
        int strikeCount = strikeCount(numbers, randomNumber);
        boolean isNothing = nothing(numbers, randomNumber);

        return new BaseballResult(ballCount, strikeCount, isNothing);
    }

    public int ballCount(BaseBallRecord numbers, BaseBallRecord randomNumber) {
        int ballCount = 0;
        for (Integer number : numbers.getNumberList()) {
            if (randomNumber.getNumberList().contains(number)) {
                ballCount++;
            }
        }
        return ballCount;
    }

    public int strikeCount(BaseBallRecord numbers, BaseBallRecord randomNumber) {
        int strikeCount = 0;

        if (numbers.getFirst() == randomNumber.getFirst()) {
            strikeCount++;
        }

        if (numbers.getSecond() == randomNumber.getSecond()) {
            strikeCount++;
        }

        if (numbers.getThird() == randomNumber.getThird()) {
            strikeCount++;
        }
        return strikeCount;
    }

    public boolean nothing(BaseBallRecord numbers, BaseBallRecord randomNumber) {
        //낫띵 count를 셀 필요가 있나? 반환을 "낫싱"으로 해야할 지

        for (Integer number : numbers.getNumberList()) {
            if (randomNumber.getNumberList().contains(number)) {
                return false;
            }
        }
        return true;
    }
}
