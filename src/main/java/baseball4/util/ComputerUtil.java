package baseball4.util;

import baseball4.constant.NumberConst;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComputerUtil {
    //컴퓨터가  생성하는 랜덤 3자리수
    public List<Integer> generateRandomNumber() {
        Set<Integer> randomNumberSet = new HashSet<>();
        while (randomNumberSet.size() < 3) {
            randomNumberSet.add(Randoms.pickNumberInRange(NumberConst.FIRST_RANGE, NumberConst.LAST_RANGE));
        }
        return new ArrayList<>(randomNumberSet);
    }
}
