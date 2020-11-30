import java.math.BigDecimal;

public class ArithmeticOperator2 {
    public static void main(String[] args) {


        // 0.1 + 0.1 * 2 + 0.1 * 3...で100を超えるのは？

        BigDecimal baseNumber = new BigDecimal("0.1");

        BigDecimal targetMultiplyNumber = new BigDecimal("1");

        BigDecimal incrementNumber = new BigDecimal("1");

        BigDecimal result = new BigDecimal("0");


        while (result.compareTo(new BigDecimal("1000")) < 0) {

            result = result.add(baseNumber.multiply(targetMultiplyNumber));

            System.out.println(targetMultiplyNumber);
            System.out.println(result);

            targetMultiplyNumber = targetMultiplyNumber.add(incrementNumber);
        }
    }
}
