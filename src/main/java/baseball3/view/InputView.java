package baseball3.view;

import baseball2.util.MessageConsts;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String readNumbers() {
        System.out.print(MessageConsts.INPUT_INFO_MSG);
        return Console.readLine();
    }

    public static String readRestartOrNot() {
        System.out.println(MessageConsts.NEW_START_INFO_MSG);
        return Console.readLine();
    }
}
