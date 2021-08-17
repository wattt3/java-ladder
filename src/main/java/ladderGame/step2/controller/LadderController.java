package ladderGame.step2.controller;

import ladderGame.step2.model.Lines;
import ladderGame.step2.model.Players;
import ladderGame.step2.view.InputView;
import ladderGame.step2.view.PrintView;

public class LadderController {

  private static final String MSG_INSERT_PLAYER_NAMES = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
  private static final String MSG_INSERT_HEIGHT = "최대 사다리 높이는 몇 개인가요?";

  public static void starGame(){
    String usersName = InputView.inputUserNamesWithMessage(MSG_INSERT_PLAYER_NAMES);
    int height = InputView.inputLadderHeightWithMessage(MSG_INSERT_HEIGHT);

    Players players = new Players(Players.createUser(usersName));
    Lines lines = new Lines(height, players.count());

    PrintView.printUsersName(players);
    PrintView.createLadderView(lines);
  }

}