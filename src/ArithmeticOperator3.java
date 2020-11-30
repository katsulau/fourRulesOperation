import java.math.BigDecimal;

public class ArithmeticOperator3 {
    public static void main(String[] args) {


        // 0.1, 0.2, 0.3, 0.4...の等差数列で、値が100を超えるのは何を足した時か
        BigDecimal result = new BigDecimal("0");

        BigDecimal increment = new BigDecimal("0.1");

        BigDecimal targetNumber = new BigDecimal("0.1");

        BigDecimal max = new BigDecimal("100");

        while (result.compareTo(max) < 0) {

            result = result.add(targetNumber);

            System.out.println(targetNumber);
            System.out.println(result);

            targetNumber = targetNumber.add(increment);
        }
    }


    // doubleを使って演算できなくもないが、BigDecimalを使った方が、確実に誤差が出ない。
//    public static void main(String[] args) {
//
//        double result = 0;
//
//        double increment = 0.1;
//
//        double targetNumber = 0.1;
//
//        double max = 100;
//
//        while (result < max) {
//
//            result = result + targetNumber;
//
//            System.out.println(targetNumber);
//            System.out.println(result);
//
//            targetNumber = targetNumber + increment;
//        }
//    }
}
