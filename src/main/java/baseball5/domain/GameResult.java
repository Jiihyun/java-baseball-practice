package baseball5.domain;

import static baseball5.util.MessageConst.*;
import static baseball5.util.NumberConst.NUMBER_DIGIT;

public class GameResult {
    private final int strikeCount;
    private final int ballCount;

    public GameResult(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public static GameResult of(Numbers computerNum, Numbers inputNum) {
        int ballCount = 0;
        int strikeCount = 0;
        for (int i = 0; i < NUMBER_DIGIT; i++) {
            if (computerNum.compareAt(i, inputNum)) {
                strikeCount++;
                continue;
            }
            if (computerNum.containAt(i, inputNum)) {
                ballCount++;
            }
        }
        return new GameResult(strikeCount, ballCount);
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    @Override
    public String toString() {
        String result = "";
        if (ballCount == 0 && strikeCount == 0) {
            return NOTHING;
        }
        if (ballCount > 0) {
            result += String.format("%d%s ", ballCount, BALL);
        }
        if (strikeCount > 0) {
            result += String.format("%d%s", strikeCount, STRIKE);
        }
        return result;
    }
}
