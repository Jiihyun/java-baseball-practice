package baseball4.validation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static baseball4.constant.MessageConst.*;
import static baseball4.constant.NumberConst.*;

public class InputValidation {
    public List<Integer> validateInputNum(String input) {
        validateInputLength(input);
        List<Integer> inputList = changeStrToIntList(input);
        validateInputRange(inputList);
        validateInputDuplicated(inputList);

        return inputList;
    }

    private List<Integer> changeStrToIntList(String input) {
        return Arrays.stream(input.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private void validateInputLength(String input) {
        if (input.length() != INPUT_LENGTH) {
            throw new IllegalArgumentException(INPUT_LENGTH_EXCEPTION_MSG);
        }
    }

    private void validateInputRange(List<Integer> inputList) {
        boolean checkRange = inputList.stream().
                allMatch(num -> FIRST_RANGE >= num && num <= LAST_RANGE);

        if (!checkRange) {
            throw new IllegalArgumentException(INPUT_RANGE_EXCEPTION_MSG);
        }
    }

    private void validateInputDuplicated(List<Integer> inputList) {
        if (inputList.stream().distinct().count() != INPUT_LENGTH) {
            throw new IllegalArgumentException(INPUT_DUPLICATE_EXCEPTION_MSG);
        }
    }
}
