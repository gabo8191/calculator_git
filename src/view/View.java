package view;

import java.util.Scanner;

public class View {

  private Scanner scanner;

  public void showMessage(String message) {
    System.out.println(message);
  }

  public String readInput() {
    if (scanner == null) {
      scanner = new Scanner(System.in);
    }
    return scanner.nextLine();
  }

}
