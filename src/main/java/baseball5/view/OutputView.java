package baseball5.view;

import baseball5.domain.GameResult;

import static baseball5.util.MessageConst.*;

public class OutputView {
    public void printInputNumberMsg() {
        System.out.print(INPUT_NUMBER_MSG);
    }

    public void printGameResult(GameResult result) {
        System.out.println(result);
    }

    public void printGameOverMsg() {
        System.out.println(GAME_END_MSG);
    }

    public void printRestartOrNotMsg() {
        System.out.println(GAME_RESTART_MSG);
    }
}
