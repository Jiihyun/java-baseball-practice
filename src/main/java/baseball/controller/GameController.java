package baseball.controller;

import baseball.io.Printer;
import baseball.io.Reader;
import baseball.model.BaseBallRecord;
import baseball.model.BaseballResult;
import baseball.service.GameService;
import baseball.util.RandomBaseBallRecordGenerator;
import baseball.util.RandomNumberGenerator;
import baseball.view.GameView;

import java.util.ArrayList;

public class GameController {
    Printer printer;
    Reader reader;
    GameService gameService;
    RandomNumberGenerator randomNumberGenerator;
    GameView gameview;
    RandomBaseBallRecordGenerator randomBaseBallRecordGenerator;

    public GameController(Printer printer, Reader reader, GameService gameService, RandomNumberGenerator randomNumberGenerator, RandomBaseBallRecordGenerator randomBaseBallRecordGenerator, GameView gameview) {
        this.printer = printer;
        this.reader = reader;
        this.gameService = gameService;
        this.randomNumberGenerator = randomNumberGenerator;
        this.randomBaseBallRecordGenerator = randomBaseBallRecordGenerator;
        this.gameview = gameview;
    }

    public void start() {
        BaseBallRecord randomNumber = randomBaseBallRecordGenerator.generate();
        //service 호출
        while (true) {
            printer.printPutNumInfo();
            ArrayList<Integer> numbers = reader.readNum();
            BaseBallRecord numberByUser = BaseBallRecord.from(numbers);
            BaseballResult result = gameService.gameResult(numberByUser, randomNumber);
            gameview.render(result);
            if (result.getStrikeCount() == 3) {
                break;
            }
        }
        String newStartOrNot = reader.readNewStartOrNot();
        if (newStartOrNot.equals("1")) {
            start();
        }
    }
}
