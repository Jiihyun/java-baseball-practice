package baseball2.view;

import baseball2.domain.Numbers;
import baseball2.domain.Rules;
import baseball2.util.MessageConsts;

public class OutputView {
    public static void printGameOver() {
        System.out.println(MessageConsts.GAME_OVER_MSG);
    }

    public static void printGameResult(Rules rules, Numbers inputNums, Numbers randomNums) {
        if (rules.isNothing()) {
            System.out.println("낫싱");
        }
        if (rules.strikeCount(inputNums, randomNums) == 3) {
            printGameOver();
        }
        rules.getGameResult();
        System.out.println();
//        System.out.print(rules.ballCount(inputNums, randomNums) + "볼 ");
//        System.out.println(rules.strikeCount(inputNums, randomNums) + "스트라이크");

    }
}
