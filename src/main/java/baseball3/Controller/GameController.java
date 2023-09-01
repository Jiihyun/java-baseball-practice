package baseball3.Controller;

import baseball3.domain.BaseballRecord;
import baseball3.domain.GameResult;
import baseball3.util.RandomNumberGenerator;
import baseball3.view.OutputView;

import java.util.List;

public class GameController {
    private final GameResult gameResult;
    private final InputController inputController;

    public GameController(GameResult gameResult, InputController inputController) {
        this.gameResult = gameResult;
        this.inputController = inputController;
    }

    private static boolean printResult(String result) {
        OutputView.printResult(result);
        if (result.equals("3스트라이크")) {
            OutputView.printGameOver();
            return true;
        }
        return false;
    }

    public void start() {
        List<Integer> randomNums = RandomNumberGenerator.createRandomNumber();
        while (true) {
            List<Integer> inputNums = inputController.inputStringToNumber();
            BaseballRecord expectNums = BaseballRecord.from(inputNums);
            BaseballRecord actualNums = BaseballRecord.from(randomNums);
            String result = gameResult.gameResult(expectNums, actualNums);
            if (printResult(result)) {
                break;
            }
        }
        restartOrQuit();
    }

    private void restartOrQuit() {
        boolean restartOrNot = inputController.restartOrNot();
        if (restartOrNot) {
            start();
        }
    }
}
