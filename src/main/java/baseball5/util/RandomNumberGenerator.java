package baseball5.util;

import baseball5.domain.Numbers;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static baseball5.util.NumberConst.*;

public class RandomNumberGenerator {
    public Numbers generate() {
        Set<Integer> numberSet = new HashSet<>();
        while (numberSet.size() < NUMBER_DIGIT) {
            numberSet.add(Randoms.pickNumberInRange(START_INCLUSIVE, END_INCLUSIVE));
        }

        return Numbers.from(new ArrayList<>(numberSet));
    }
}
