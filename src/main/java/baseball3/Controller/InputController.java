package baseball3.Controller;

import baseball2.util.MessageConsts;
import baseball3.view.InputView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputController {
    public List<Integer> inputStringToNumber() {
        return Arrays.stream(
                        InputView.readNumbers()
                                .split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public boolean restartOrNot() {
        String number = InputView.readRestartOrNot();
        if ("1".equals(number)) {
            return true;
        }
        if ("2".equals(number)) {
            return false;
        }
        throw new IllegalArgumentException(MessageConsts.NEW_START_INFO_MSG);
    }
    //리터럴은 절대 null 안 됨
    //NullPointerException이 날 수 없기 때문에 이 방법 더 선호
    //"1".equals(number)

    //number가 null이 되면
    //null.equals로 NullPointerException
    //number.equals("1");
}
