package baseball3.util;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RandomNumberGenerator {
    public static List<Integer> createRandomNumber() {
        HashSet<Integer> numberSet = new HashSet<>();
        while (numberSet.size() < 3) {
            numberSet.add(Randoms.pickNumberInRange(1, 9));
        }
        return new ArrayList<>(numberSet);
    }
}
