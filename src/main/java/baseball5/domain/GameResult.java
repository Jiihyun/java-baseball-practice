package baseball5.domain;

import static baseball5.util.MessageConst.*;

public class GameResult {
    private final NumberComparator numberComparator;

    public GameResult(NumberComparator numberComparator) {
        this.numberComparator = numberComparator;
    }

    public static GameResult from(NumberComparator numberComparator) {
        return new GameResult(numberComparator);
    }

    public String getResult() {
        int ballCount = numberComparator.ballCount();
        int strikeCount = numberComparator.strikeCount();
        if (ballCount != 0 && strikeCount != 0) {
            return String.format("%d%s %d%s", ballCount, BALL, strikeCount, STRIKE);
        }
        if (ballCount == 0 && strikeCount != 0) {
            return String.format("%d%s", strikeCount, STRIKE);
        }
        if (ballCount != 0 && strikeCount == 0) {
            return String.format("%d%s", ballCount, BALL);
        }
        return NOTHING;


    }


}
