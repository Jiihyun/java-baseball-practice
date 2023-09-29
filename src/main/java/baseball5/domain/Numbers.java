package baseball5.domain;

import java.util.List;

public class Numbers {
    private final List<Integer> numberList;

    public Numbers(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public static Numbers from(List<Integer> numberList) {
        return new Numbers(numberList);
    }
}
