package baseball3.domain;

import baseball3.util.MessageConst;

import java.util.List;

public class BaseballRecord {

    //first, second, third
    //getList, validate, create, 비교(index, BaseballRecord) - compare, contain
    private final List<Integer> numberList;


    public BaseballRecord(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public static BaseballRecord from(List<Integer> numberList) {
        validateNumber(numberList);
        return new BaseballRecord(numberList);
    }

    private static void validateNumber(List<Integer> numberList) {
        if (numberList.size() != 3) {
            throw new IllegalArgumentException(MessageConst.NUMBER_LENGTH_EXCEPTION);
        }
        numberList.forEach(BaseballRecord::validateNumberRange);
    }

    private static void validateNumberRange(Integer number) {
        if (number == null || number < 1 || number > 9) {
            throw new IllegalArgumentException(MessageConst.NUMBER_LENGTH_EXCEPTION);
        }
    }

    public int getStrikeCount(BaseballRecord numbers) {
        int strikeCount = 0;
        for (int index = 0; index < numberList.size(); index++) {
            Integer expectNum = numberList.get(index);
            Integer actualNum = numbers.numberList.get(index);
            if (expectNum.equals(actualNum)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public int getBallCount(BaseballRecord numbers) {
        int containCount = 0;
        int ballCount;
        int strikeCount = getStrikeCount(numbers);
        for (int index = 0; index < numberList.size(); index++) {
            if (numberList.contains(numbers.numberList.get(index))) {
                containCount++;
            }
        }
        ballCount = containCount - strikeCount;
        return ballCount;
    }

    public boolean isNothing(BaseballRecord numbers) {
        return getStrikeCount(numbers) + getBallCount(numbers) == 0;
    }
}
