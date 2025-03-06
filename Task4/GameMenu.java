import java.util.ArrayList;

class GameMenu {
  private ArrayList<String> actions;

  GameMenu(ArrayList<String> actions) {
    this.actions = actions;
  }

  public void displayMenu() {
    for (String s : actions)
      System.out.println(s);
  }
}
