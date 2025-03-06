import java.util.ArrayList;

class Main {

  public static void main(String[] args) {
    ArrayList<String> actions = new ArrayList<String>(4);

    actions.add("1) Start game");
    actions.add("2) Resume game");
    actions.add("3) Pause game");
    actions.add("4) End game");

    GameMenu gmenu = new GameMenu(actions);

    String choice = gmenu.getAction();

    int action;
    try {
      action = Integer.parseInt(choice);
    } catch (Exception e) {
      System.err.println("Not a valid input");
      return;
    }

    doAction(action);
  }

  public static void doAction(int action) {
    String out;
    switch (action) {
    case 1:
      out = "Starting the game now";
      break;
    case 2:
      out = "Fetching previously saved game data";
      break;
    case 3:
      out = "Game paused";
      break;
    case 4:
      out = "Ending game";
      break;
    default:
      out = "Unknown action";
      break;
    }
    System.out.println(out);
  }
}
