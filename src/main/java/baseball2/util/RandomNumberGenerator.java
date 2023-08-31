package baseball2.util;

import baseball2.domain.Numbers;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RandomNumberGenerator {
    public static Numbers generateRandomNums() {
        Set<Integer> numberSet = new HashSet<>();
        while (numberSet.size() < 3) {
            numberSet.add(Randoms.pickNumberInRange(NumberConsts.START_INCLUSIVE, NumberConsts.END_INCLUSIVE));
        }
        ArrayList<Integer> nums = new ArrayList<>(numberSet);
        return new Numbers(nums.get(0), nums.get(1), nums.get(2), nums);
    }
}
