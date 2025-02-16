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

  public void run() {
    int choice;
    do {
      choice = showMenu();
      if (choice == 5) {
        view.showMessage("Exiting...");
        break;
      }
      if (choice >= 1 && choice <= 4) {
        performOperation(choice);
      } else {
        view.showMessage("Invalid choice. Please enter a number between 1 and 5.");
      }
    } while (true);
  }

  private void performOperation(int choice) {
    int num1 = getInput("Enter first number: ");
    int num2 = getInput("Enter second number: ");

    try {
      int result = switch (choice) {
        case 1 -> calculator.add(num1, num2);
        case 2 -> calculator.subtract(num1, num2);
        case 3 -> calculator.multiply(num1, num2);
        case 4 -> {
          if (num2 == 0) {
            view.showMessage("Error: Division by zero is not allowed.");
            yield 0;
          }
          yield calculator.divide(num1, num2);
        }
        default -> 0;
      };
      view.showMessage("Result: " + result);
    } catch (Exception e) {
      view.showMessage("An error occurred: " + e.getMessage());
    }
  }

  private int getInput(String message) {
    while (true) {
      try {
        view.showMessage(message);
        return Integer.parseInt(view.readInput());
      } catch (NumberFormatException e) {
        view.showMessage("Invalid input. Please enter a valid integer.");
      }
    }
  }

  private int showMenu() {
    view.showMessage("Menu:\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
    return getInput("Choose an option: ");
  }

  public static void main(String[] args) {
    Presenter presenter = new Presenter();
    presenter.run();
  }
}
