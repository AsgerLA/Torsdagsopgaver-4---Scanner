import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scan;
    String name;
    int age;
    int res;

    System.out.println("Please type your name");

    scan = new Scanner(System.in);

    name = scan.nextLine();
    System.out.println("Hallo "+name);

    System.out.println("Please type your age");

    age = scan.nextInt();
    scan.nextLine();

    System.out.println("You are "+age+" years old");

    res = 67-age;
    if (res < 0)
      res = 0;
    System.out.println("You have "+res+" years until retirement");
  }

}
