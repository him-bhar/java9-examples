package com.himanshu.poc.java9.modules.module_1.internal;

/**
 * ̥Since this package is not exported as per the module-info.java for module-1.
 * Hence this class cannot be used apart from this module only.
 */
public class CalculatorUtil {
  public static void printResult(Object arg) {
    System.out.println("Result is : " + arg);
  }
}
