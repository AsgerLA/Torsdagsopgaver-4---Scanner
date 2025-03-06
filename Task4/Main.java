import java.util.ArrayList;

class Main {

  public static void main(String[] args) {
    ArrayList<String> actions = new ArrayList<String>(4);

    actions.add("Start game");
    actions.add("Resume game");
    actions.add("Pause game");
    actions.add("End game");

    GameMenu gmenu = new GameMenu(actions);

    gmenu.displayMenu();

  }
}
