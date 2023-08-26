package baseball.model;

public class BaseballResult {
    private final int ballCount;
    private final int strikeCount;
    private final boolean isNothing;

    public BaseballResult(int ballCount, int strikeCount, boolean isNothing) {
        this.ballCount = ballCount;
        this.strikeCount = strikeCount;
        this.isNothing = isNothing;
    }

    public int getBallCount() {
        return ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public boolean isNothing() {
        return isNothing;
    }
}
