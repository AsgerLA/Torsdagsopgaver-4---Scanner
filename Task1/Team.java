import java.util.ArrayList;


class Team {
  private String name;
  private int rank;
  private ArrayList<String> players;

  public Team(String name) {
    this.name = name;
    this.rank = 0;
    this.players = new ArrayList<String>();
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

  public void addPlayer(String player) {
    this.players.add(player);
  }

  @Override
  public String toString() {
    String out = String.format("Hold: %s Rang: %d", this.name, this.rank);
    for (String s : this.players)
      out += "\n  " + s;
    return out;
  }

}
