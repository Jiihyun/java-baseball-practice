package baseball.io;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;

import static baseball.util.Constants.END;
import static baseball.util.Constants.NEW_START;

public class Reader {


    //사용자가 입력한 값 읽어서 int배열로 반환 -> baseballRecord의 인자로 들어가 검증 후 객체 만들어줌
    public ArrayList<Integer> readNum() {
        ArrayList<Integer> numbers = new ArrayList<>();
        String[] splitStr = Console.readLine().split("");

        for (String str : splitStr) {
            numbers.add(Integer.parseInt(str));
        }

        return numbers;
    }

    public String readNewStartOrNot() {
        String userPlayDecision = Console.readLine();
        if (userPlayDecision == null) {
            throw new IllegalArgumentException("게임여부를 입력하세요.");
        }
        if (NEW_START.equals(userPlayDecision)) {
            return NEW_START;
        }
        if (END.equals(userPlayDecision)) {
            System.out.println("게임종료");
            return END;
        }
        // 위의 값 아니면 예외 발생
        throw new IllegalArgumentException("1 혹은 2를 입력하세요.");
    }
}
