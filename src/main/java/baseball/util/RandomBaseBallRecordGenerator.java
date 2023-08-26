package baseball.util;

import baseball.model.BaseBallRecord;

import java.util.ArrayList;
import java.util.HashSet;

public final class RandomBaseBallRecordGenerator {
    private final RandomNumberGenerator randomNumberGenerator;

    public RandomBaseBallRecordGenerator(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public BaseBallRecord generate() {
        HashSet<Integer> numSet = new HashSet<>();

        while (numSet.size() < 3) {
            int num = randomNumberGenerator.generate();
            numSet.add(num);
        }

        return BaseBallRecord.from(new ArrayList<>(numSet));

//        Integer[] numArr = (Integer[]) numSet.toArray();
//
//        return new BaseBallRecord(
//                numArr[0],
//                numArr[1],
//                numArr[2]);
    }
}
