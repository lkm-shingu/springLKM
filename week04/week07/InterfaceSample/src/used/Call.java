package used;

import used.SubCalc;
import used.Calculator;

public class Call {
    public static void main(String[] args) {
        Calculator calculator = new SubCalc();
        Integer result = calculator.calc(10, 5);
        System.out.println(
                "계산 결과는 " + result + "가 되겠습니다.");
    }
}


