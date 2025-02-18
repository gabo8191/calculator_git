package model;

/**
 * The Calculator class provides basic arithmetic operations.
 * 
 * Methods:
 * - add: Adds two integers.
 * - subtract: Subtracts the second integer from the first.
 * - multiply: Multiplies two integers.
 * - divide: Divides the first integer by the second.
 * 
 * Author: Gabriel Castillo
 */

public class Calculator {

  
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  public int subtract(int num1, int num2) {
    return num1 - num2;
  }

  public int multiply(int num1, int num2) {
    return num1 * num2;
  }

  public int divide(int num1, int num2) {
    return num1 / num2;
  }

}
