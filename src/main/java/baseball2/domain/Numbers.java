package baseball2.domain;

import baseball2.util.MessageConsts;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private final int firstNum;
    private final int secondNum;
    private final int thirdNum;
    private final List<Integer> numList;

    public Numbers(int firstNum, int secondNum, int thirdNum, List<Integer> numList) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.thirdNum = thirdNum;
        this.numList = numList;
    }

    public static Numbers inputNums(List<String> stringNumList) {
        validateLength(stringNumList);
        ArrayList<Integer> nums = new ArrayList<>();

        for (String str : stringNumList) {
            int num = Integer.parseInt(str);
            validateNumber(num);
            nums.add(num);
        }
        return new Numbers(nums.get(0), nums.get(1), nums.get(2), nums);
    }

    private static void validateLength(List<String> stringNumList) {
        if (stringNumList.size() != 3) {
            throw new IllegalArgumentException(MessageConsts.NUMBER_LENGTH_EXCEPTION);
        }
    }

    private static void validateNumber(int number) {
        if (number < 1 || number > 9) {
            throw new IllegalArgumentException(MessageConsts.NUMBER_RANGE_EXCEPTION);
        }
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

    public List<Integer> getNumList() {
        return numList;
    }

}
