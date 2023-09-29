package baseball5;

import baseball5.controller.GameController;
import baseball5.util.RandomNumberGenerator;
import baseball5.view.InputView;
import baseball5.view.OutputView;

public class Application {
    public static void main(String[] args) {
        OutputView outputView = new OutputView();
        InputView inputView = new InputView(outputView);
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        GameController gameController = new GameController(randomNumberGenerator, inputView, outputView);
        gameController.start();
    }
}
