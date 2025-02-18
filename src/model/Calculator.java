package model;

/**
 * La clase Calculator proporciona operaciones aritméticas básicas.
 * 
 * Métodos:
 * - add: Suma dos enteros.
 * - subtract: Resta el segundo entero del primero.
 * - multiply: Multiplica dos enteros.
 * - divide: Divide el primer entero por el segundo.
 * 
 * Autor: Gabriel Castillo
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
