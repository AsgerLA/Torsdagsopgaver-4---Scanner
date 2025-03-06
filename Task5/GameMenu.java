import java.util.ArrayList;
import java.util.Scanner;

class GameMenu {
  private ArrayList<String> actions;

  GameMenu(ArrayList<String> actions) {
    this.actions = actions;
  }

  public void displayMenu() {
    for (String s : actions)
      System.out.println(s);
  }

  public String getAction() {
    Scanner scan = new Scanner(System.in);
    String choice;

    System.out.println("Type a number to choose an action");
    this.displayMenu();

    choice = scan.nextLine();
    return choice;
  }
}
