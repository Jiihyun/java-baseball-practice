package baseball3;

import baseball3.Controller.GameController;
import baseball3.Controller.InputController;
import baseball3.domain.GameResult;

public class Application {
    public static void main(String[] args) {
        GameResult gameResult = new GameResult();
        InputController inputController = new InputController();
        GameController gameController = new GameController(gameResult, inputController);
        gameController.start();
    }

}
