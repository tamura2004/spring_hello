package chapter03.use;

import chapter03.used.SubCalc;
import chapter03.used.Calculator;

/**
 * インターフェース依存を確認する
 */
public class Call {

  public static void main(String[] args) {
    Calculator calculator = new SubCalc();
    Integer result = calculator.calc(10, 5);
    System.out.printf("計算結果は[%d]です。\n", result);
  }

}
