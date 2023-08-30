package baseball2.domain;

import baseball2.util.NumberConsts;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Numbers {
    int firstNum;
    int secondNum;
    int thirdNum;

    public Numbers(int firstNum, int secondNum, int thirdNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.thirdNum = thirdNum;
    }

    public List<Integer> generateRandomNum() {
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(Randoms.pickNumberInRange(NumberConsts.START_INCLUSIVE, NumberConsts.END_INCLUSIVE));
        return new ArrayList<>(numberSet);
    }
}
