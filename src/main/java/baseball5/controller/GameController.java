package baseball5.controller;

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
        Numbers conputerNumbers = randomNumberGenerator.generate();
        Numbers inputNumber = inputView.inputNumber();

    }
}
