package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator { //숫자 하나 랜덤 생성
    private final int startInclusive;
    private final int endInclusive;

    public RandomNumberGenerator(
            final int startInclusive,
            final int endInclusive) {
        this.startInclusive = startInclusive;
        this.endInclusive = endInclusive;
    }

    public int generate() {
        return Randoms.pickNumberInRange(startInclusive, endInclusive);
    }
}
