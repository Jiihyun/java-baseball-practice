package baseball.model;

import java.util.ArrayList;

public final class BaseBallRecord { // 사용자가 입력한 숫자 기록
    private final int first;
    private final int second;
    private final int third;
    private final ArrayList<Integer> numberList;

    public BaseBallRecord(
            final int first,
            final int second,
            final int third,
            final ArrayList<Integer> numberList) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.numberList = numberList;
    }

    public static BaseBallRecord from(ArrayList<Integer> numbers) { //fromArray(final Integer[] array)
        //imp -static!!! 객체가 생성되기 전에 메서드를 사용해야 하므로
        validateNumber(numbers);
        for (final Integer number : numbers) {
            validateNumber(number);
        }
        return new BaseBallRecord(
                numbers.get(0),
                numbers.get(1),
                numbers.get(2),
                numbers
        );
    }

    // 배열 길이 검증 (3이어야 함)
    private static void validateNumber(ArrayList<Integer> numbers) {
        if (numbers.size() != 3) {
            throw new IllegalArgumentException("BaseBallRecord.from에 사용될 numbers Array는 반드시 length가 3이어야 합니다.");
        }
    }

    //숫자 크기가 1~9 & null이 아니어야 함
    private static void validateNumber(Integer number) {
        if (number == null || number < 1 || number > 9) { // null을 가장 먼저 써줄 것 - 안 그러면 nullpointexceptions나므로
            throw new IllegalArgumentException("BaseBallRecord에 들어갈 숫자는 1~9 범위만 가능합니다.");
        }
    }

//    public static BaseBallRecord of (int ... numbers) { //fromArray(final Integer[] array)
//        return new BaseBallRecord(
//                numbers[0],
//                numbers[1],
//                numbers[2]
//        );
//    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getThird() {
        return third;
    }

    public ArrayList<Integer> getNumberList() {
        return numberList;
    }
}
