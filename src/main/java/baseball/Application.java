package baseball;

import baseball.controller.GameController;
import baseball.io.Printer;
import baseball.io.Reader;
import baseball.service.GameService;
import baseball.util.RandomBaseBallRecordGenerator;
import baseball.util.RandomNumberGenerator;
import baseball.view.GameView;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현

        Printer printer = new Printer();
        Reader reader = new Reader();
        GameService gameService = new GameService();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(1, 9);
        RandomBaseBallRecordGenerator randomBaseBallRecordGenerator = new RandomBaseBallRecordGenerator(randomNumberGenerator);
        GameView gameview = new GameView();
        GameController gameController = new GameController(printer, reader, gameService, randomNumberGenerator, randomBaseBallRecordGenerator, gameview);

        gameController.start();
    }
}
