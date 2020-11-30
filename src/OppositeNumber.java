import java.math.BigDecimal;
import java.math.RoundingMode;

public class OppositeNumber {
    public static void main(String[] args) {

        BigDecimal one = new BigDecimal("1");

        BigDecimal targetNumber = new BigDecimal("1");

        BigDecimal result = new BigDecimal("0");

        BigDecimal max = new BigDecimal("12");

        while (result.compareTo(max) < 0) {

            BigDecimal answer = one.divide(targetNumber, 100, RoundingMode.HALF_UP);

            result = result.add(answer);
            System.out.println(targetNumber);
            System.out.println(result);

            targetNumber = targetNumber.add(one);
        }
    }
}
