package baseball2.view;

import baseball2.domain.Numbers;
import baseball2.domain.Rules;
import baseball2.util.MessageConsts;

public class OutputView {
    public static void printGameOver() {
        System.out.println(MessageConsts.GAME_OVER_MSG);
    }

    public static void printGameResult(Rules rules, Numbers inputNums, Numbers randomNums) {
        System.out.println(rules.getGameResult(inputNums, randomNums));
    }
}
