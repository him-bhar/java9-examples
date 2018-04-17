package com.himanshu.poc.java9.modules.module_2;

import com.himanshu.poc.java9.modules.module_1.CalculatorService;

public class CalculatorClient {
  public static void main(String[] args) {
    CalculatorService calcService = new CalculatorService();
    System.out.println(calcService.add(5, 9));
  }
}
