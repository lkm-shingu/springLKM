package use;

import used.SubCalc;
import used.calculator;

public class call {
    public static void main(String[] args) {
        calculator calculator = new SubCalc();
        Integer result = calculator.calc(10, 5);
        System.out.println(
                "계산 결과는 " + result + "입니다.");
    }
}
