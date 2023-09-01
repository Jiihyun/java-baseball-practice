package baseball2;

import baseball2.controller.GameController;
import baseball2.domain.Rules;

public class Application {
    public static void main(String[] args) {
        Rules rules = new Rules();
        GameController gameController = new GameController(rules);

        gameController.start();
    }
}
