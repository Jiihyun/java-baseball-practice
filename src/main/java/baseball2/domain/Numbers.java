package baseball2.domain;

import baseball2.util.NumberConsts;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
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

    public int getFirstNum() {
        return firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public int getThirdNum() {
        return thirdNum;
    }

    public Numbers generateRandomNum() {
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(Randoms.pickNumberInRange(NumberConsts.START_INCLUSIVE, NumberConsts.END_INCLUSIVE));
        ArrayList<Integer> integers = new ArrayList<>(numberSet);
        return new Numbers(integers.get(0), integers.get(1), integers.get(2));
    }
}
