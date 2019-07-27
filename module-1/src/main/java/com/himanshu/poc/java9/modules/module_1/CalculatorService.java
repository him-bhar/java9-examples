package com.himanshu.poc.java9.modules.module_1;

import com.himanshu.poc.java9.modules.module_1.internal.CalculatorUtil;

public class CalculatorService {
  public int add (int a, int b) {
    int result = a+b;
    CalculatorUtil.printResult(result);
    return result;
  }
}
