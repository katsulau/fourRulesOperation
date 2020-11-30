import java.math.BigDecimal;
import java.math.RoundingMode;

public class ArithmeticOperator1 {

    public static void main(String[] args) {

        int result = 1;
        result += 2;

        System.out.println(String.format("result += 2 は result = result + 2 を表します。よって結果値は%dとなります",result));



        // 浮動小数点数の扱い

        double resultDouble = 0;

        resultDouble = 0.7 + 0.1;

        // 0.7999999999999999になってしまう
        System.out.println(resultDouble);

        double sample1 = 0.3;

        double sample2 = 0.6;

        System.out.println(sample1 * sample2);


        // BigDecimalを使った例

        BigDecimal bigDecimal = new BigDecimal("0.7");

        BigDecimal bigDecimal1 = new BigDecimal("0.1");

        // 足し算
        System.out.println(bigDecimal.add(bigDecimal1));

        // 引き算
        System.out.println(bigDecimal.subtract(bigDecimal1));

        // 掛け算
        System.out.println(bigDecimal.multiply(bigDecimal1));

        // 割り算
        BigDecimal bigDecimal2 = new BigDecimal("0.3");
        System.out.println(bigDecimal.divide(bigDecimal2, 15, RoundingMode.DOWN));


    }
}
