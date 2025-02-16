package presenter;

import model.Calculator;
import view.View;

public class Presenter {

  private View view;
  private Calculator calculator;

  public Presenter() {
    view = new View();
    calculator = new Calculator();
  }

  public int showMenu() {
    view.showMessage("\n1. Add \n2. Subtract \n3. Multiply \n4. Divide \n5. Exit");
    int choice = Integer.parseInt(view.readInput());
    return choice;
  }

  public void run() {
    int choice = 0;
    do {
      choice = showMenu();
      switch (choice) {
        case 1:
          add();
          break;
        case 2:
          // subtract();
          break;
        case 3:
          // multiply();
          break;
        case 4:
          // divide();
          break;
        case 5:
          view.showMessage("Exiting...");
          break;
        default:
          view.showMessage("Invalid choice");
      }
    } while (choice != 5);
  }

  public void add() {
    view.showMessage("Enter first number: ");
    int num1 = Integer.parseInt(view.readInput());
    view.showMessage("Enter second number: ");
    int num2 = Integer.parseInt(view.readInput());
    int result = calculator.add(num1, num2);
    view.showMessage("Result: " + result);
  }

  public static void main(String[] args) {
    Presenter presenter = new Presenter();
    presenter.run();
  }

}
