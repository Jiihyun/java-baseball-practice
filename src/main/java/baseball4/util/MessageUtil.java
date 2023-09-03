package baseball4.util;

import static baseball4.constant.MessageConst.*;

public class MessageUtil {
    public void printInitMsg() {
        System.out.println(START_GAME_MSG);
    }

    public void printInputMsg() {
        System.out.println(INPUT_MSG);
    }

    public void printResultMsg(int ball, int strike) {
        StringBuilder result = new StringBuilder();

        if (ball == 0 && strike == 0) {
            System.out.println(NOTHING);
            return;
        }
        if (ball != 0) {
            result.append(ball).append(BALL).append(" ");
        }
        if (strike != 0) {
            result.append(strike).append(STRIKE);
        }
        System.out.println(result.toString().trim());
    }

    public void printSuccessMsg() {
        System.out.println(SUCCESS_MSG);
        System.out.println(GAME_CONTROL_MSG);
    }
}
