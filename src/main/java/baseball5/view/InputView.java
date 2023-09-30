package baseball5.view;

import baseball5.domain.Numbers;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;

import static baseball5.util.MessageConst.NUMBER_INPUT_EXCEPTION;

public class InputView {
    private final OutputView outputView;

    public InputView(OutputView outputView) {
        this.outputView = outputView;
    }

    private static void validateNumber(String numStr) {
        for (int i = 0; i < numStr.length(); i++) {
            if (!Character.isDigit(numStr.charAt(i))) {
                throw new IllegalArgumentException(NUMBER_INPUT_EXCEPTION);
            }
        }
    }

    public Numbers inputNumber() {
        outputView.printInputNumberMsg();
        ArrayList<Integer> userNums = new ArrayList<>();
        String numStr = Console.readLine();
        validateNumber(numStr);
        String[] splitNum = numStr.split("");
        for (String num : splitNum) {
            userNums.add(Integer.parseInt(num));
        }
        return Numbers.from(userNums);
    }

}
