package baseball2.controller;

import baseball2.domain.Numbers;
import baseball2.domain.Rules;
import baseball2.util.MessageConsts;
import baseball2.util.RandomNumberGenerator;
import baseball2.view.InputView;
import baseball2.view.OutputView;

import java.util.List;

public class GameController {
    Rules rules;

    public GameController(Rules rules) {
        this.rules = rules;
    }

    public void start() {
        Numbers randomNums = RandomNumberGenerator.generateRandomNums();
        while (true) {
            List<String> stringNumList = InputView.readNumbers();
            Numbers inputNums = Numbers.inputNums(stringNumList);
            OutputView.printGameResult(rules, inputNums, randomNums);
            if (rules.getGameResult(inputNums, randomNums).equals("3스트라이크")) {
                System.out.println(MessageConsts.GAME_OVER_MSG);
                break;
            }
        }
        restartOrQuit();
    }

    private void restartOrQuit() {
        try {
            int startOrNot = InputView.readNewStartOrNot();
            if (startOrNot == 1) {
                start();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
