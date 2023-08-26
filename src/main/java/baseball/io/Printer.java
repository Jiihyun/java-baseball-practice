package baseball.io;

public class Printer {
    public void printPutNumInfo() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void printResultOfNum() {
        ////스트라이크, 볼 출력

    }

    public void printGameOverInfo() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        //if문 돌려서 만약 입력값이 2면 게임 종료, 1이면 게임 다시 시작 - controller.start다시하면 될 듯
    }


}
