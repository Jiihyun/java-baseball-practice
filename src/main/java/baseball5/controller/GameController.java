package baseball5.controller;

import baseball5.domain.Numbers;
import baseball5.util.RandomNumberGenerator;

public class GameController {
    private final RandomNumberGenerator randomNumberGenerator;

    public GameController(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public void start() {
        Numbers conputerNumbers = randomNumberGenerator.generate();
    }
}
