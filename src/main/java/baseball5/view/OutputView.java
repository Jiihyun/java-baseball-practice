package baseball5.view;

import static baseball5.util.MessageConst.GAME_END_MSG;
import static baseball5.util.MessageConst.INPUT_NUMBER_MSG;

public class OutputView {
    public void printInputNumberMsg() {
        System.out.print(INPUT_NUMBER_MSG);
    }

    public void printGameResult(String result) {
        System.out.println(result);
    }

    public void printGameOverMsg() {
        System.out.println(GAME_END_MSG);
    }
}
