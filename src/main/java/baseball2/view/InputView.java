package baseball2.view;

import baseball2.util.MessageConsts;
import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// - 1. 느슨한 분리
// controller/InputManager.java
// 1. 입력할 때 보여줄 메세지 출력 -> "숫자를 입력해주세요 :"
// 2. 사용자 입력 받음
// 3. 파싱 -> 숫자, 문자 배열 등으로 파싱

public final class InputView {
    public static List<String> readNumbers() {
        System.out.print(MessageConsts.INPUT_INFO_MSG);
        return Arrays.stream(Console.readLine().split("")).collect(Collectors.toList());
    }

    public static int readNewStartOrNot() {
        System.out.println(MessageConsts.NEW_START_INFO_MSG);
        int startOrNot = Integer.parseInt(Console.readLine());
        if (startOrNot != 1 && startOrNot != 2) {
            throw new IllegalArgumentException(MessageConsts.NEW_START_INFO_MSG);
        }
        return startOrNot;
    }

    //리터럴은 절대 null 안 됨
    //NullPointerException이 날 수 없기 때문에 이 방법 더 선호
    //"1".equals(number)

    //number가 null이 되면
    //null.equals로 NullPointerException
    //number.equals("1");
}
