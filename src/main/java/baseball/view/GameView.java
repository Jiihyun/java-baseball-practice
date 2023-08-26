package baseball.view;

import baseball.model.BaseballResult;

public class GameView {

    public void view(BaseballResult result) {

        int ballCount = result.getBallCount();
        int strikeCount = result.getStrikeCount();
        boolean isNothing = result.isNothing();


        if (ballCount > 0 && strikeCount > 0) {
            if (strikeCount == 3) {
                System.out.println("3스트라이크");
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n");
                return;
            }
            System.out.println(strikeCount - ballCount + "볼 " + strikeCount + "스트라이크");
            return;
        }
        if (ballCount > 0) {
            System.out.println(ballCount + "볼 ");
        }

        if (strikeCount > 0) {
            System.out.println(strikeCount + "스트라이크");

        }

        if (isNothing) {
            System.out.println("낫싱");
        }

    }

}
