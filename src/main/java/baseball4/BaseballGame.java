package baseball4;

import baseball4.util.ComputerUtil;
import baseball4.util.MessageUtil;
import baseball4.util.UserUtil;
import baseball4.validation.InputValidation;

import java.util.List;

import static baseball4.constant.NumberConst.MAX_STRIKE;
import static baseball4.constant.NumberConst.RESTART_NUM;

public class BaseballGame {
    private final UserUtil userUtil = new UserUtil();
    private final MessageUtil messageUtil = new MessageUtil();
    private final InputValidation inputValidation = new InputValidation();
    private final ComputerUtil computerUtil = new ComputerUtil();
    private List<Integer> computerNums;

    private int checkStrikeCount(int strike) {
        int gameControlInput = RESTART_NUM;

        if (strike == MAX_STRIKE) {
            messageUtil.printSuccessMsg();
            gameControlInput = Integer.parseInt(userUtil.getInputNumber());
            inputValidation.validateGameControlInput(gameControlInput);

            checkRestartNumAndMakeComputerNum(gameControlInput);
        }
        return gameControlInput;
    }

    private void checkRestartNumAndMakeComputerNum(int gameControlInput) {
        if (gameControlInput == RESTART_NUM) {
            computerNums = computerUtil.generateRandomNumber();
        }
    }

    private static class ResultCount {
        int ballCount;
        int strikeCount;

        public ResultCount(int ballCount, int strikeCount) {
            this.ballCount = ballCount;
            this.strikeCount = strikeCount;
        }
    }
}

