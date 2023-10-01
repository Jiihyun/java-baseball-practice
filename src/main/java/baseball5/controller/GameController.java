package baseball5.controller;

import baseball5.domain.GameResult;
import baseball5.domain.Numbers;
import baseball5.util.RandomNumberGenerator;
import baseball5.view.InputView;
import baseball5.view.OutputView;

public class GameController {
    private final RandomNumberGenerator randomNumberGenerator;
    private final InputView inputView;
    private final OutputView outputView;

    public GameController(RandomNumberGenerator randomNumberGenerator, InputView inputView, OutputView outputView) {
        this.randomNumberGenerator = randomNumberGenerator;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void start() {
        Numbers computerNum = randomNumberGenerator.generate();
        while (true) {
            Numbers inputNum = inputView.inputNumber();
            GameResult gameResult = GameResult.of(computerNum, inputNum);
            outputView.printGameResult(gameResult);
            if (gameResult.getStrikeCount() == 3) {
                outputView.printGameOverMsg();
                break;
            }
        }
        restartOrNot();
    }

    private void restartOrNot() {
        try {
            boolean restart = inputView.inputRestartOrNot();
            if (restart) {
                start();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
