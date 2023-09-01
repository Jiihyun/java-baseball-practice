package baseball3.view;

import baseball3.util.MessageConst;

public class OutputView {
    public static void printGameOver() {
        System.out.println(MessageConst.GAME_OVER_MSG);
    }

    public static void printResult(String result) {
        System.out.println(result);
    }
}
