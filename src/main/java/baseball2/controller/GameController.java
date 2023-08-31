package baseball2.controller;

import baseball2.domain.Numbers;
import baseball2.domain.Rules;
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
            if (rules.strikeCount(inputNums, randomNums) == 3) {
                break;
            }
        }
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
