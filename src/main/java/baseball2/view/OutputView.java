package baseball2.view;

import baseball2.domain.Numbers;
import baseball2.domain.Rules;
import baseball2.util.MessageConsts;

public class OutputView {
    public static void printGameOver() {
        System.out.println(MessageConsts.GAME_OVER_MSG);
    }

    public static void printGameResult(Rules rules, Numbers inputNums, Numbers randomNums) {
        //Todo:스트라이크, 볼, 낫싱 출력
        if (rules.strikeCount(inputNums, randomNums) == 3) {
            printGameOver();
        }
        if (rules.isBall(inputNums, randomNums)) {
            System.out.print(rules.ballCount(inputNums, randomNums) + "볼 ");
        }
        if (rules.isStrike(inputNums, randomNums)) {
            System.out.println(rules.strikeCount(inputNums, randomNums) + "스트라이크");
        }
        if (rules.isNothing(inputNums, randomNums)) {
            System.out.println("낫싱");
        }
    }
}
