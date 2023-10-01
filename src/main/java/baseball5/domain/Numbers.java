package baseball5.domain;

import java.util.List;

import static baseball5.util.MessageConst.NUMBER_DUPLICATED_EXCEPTION;
import static baseball5.util.MessageConst.NUMBER_SIZE_EXCEPTION;
import static baseball5.util.NumberConst.NUMBER_DIGIT;

public class Numbers {
    private final List<Integer> numberList;

    public Numbers(List<Integer> numberList) {
        validateNumberSize(numberList);
        validateDuplicatedNum(numberList);
        this.numberList = numberList;
    }

    public static Numbers from(List<Integer> numberList) {
        return new Numbers(numberList);
    }

    private void validateNumberSize(List<Integer> numberList) {
        if (numberList.size() != 3) {
            throw new IllegalArgumentException(NUMBER_SIZE_EXCEPTION);
        }
    }

    private void validateDuplicatedNum(List<Integer> numberList) {
        if (numberList.stream().distinct().count() != NUMBER_DIGIT) {
            throw new IllegalArgumentException(NUMBER_DUPLICATED_EXCEPTION);
        }
    }

    public boolean compareAt(int index, Numbers other) {
        return numberList.get(index).equals(other.numberList.get(index));
    }

    public boolean containAt(int index, Numbers other) {
        return numberList.contains(other.numberList.get(index));
    }
}
