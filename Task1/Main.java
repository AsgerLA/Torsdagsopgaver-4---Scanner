import java.util.Random;


class Main {

  public static void main(String[] args) {
    int i, j;

    Random rand = new Random();

    Team[] teams = new Team[6];

    for (i = 0; i < teams.length; i++) {
      teams[i] = new Team("team"+(i+1));
      teams[i].setRank(rand.nextInt(4)+1);
      for (j = 0; j < rand.nextInt(5); j++) {
        teams[i].addPlayer("player"+(j+1));
      }
      System.out.println(teams[i]);
    }

  }

}
