import java.math.BigInteger;

public class TwentiethTask {
    public static void main(String[] args) {
        int number = 100;
        int sum = 0;
        String stringNumber = String.valueOf(findFactorial(number));
        for (int i = 0; i < stringNumber.length(); i++) {
            sum += Character.getNumericValue(stringNumber.charAt(i));
        }
        System.out.println(sum);
    }

    public static BigInteger findFactorial(int number) {
        BigInteger factorial = new BigInteger("1");
        for (int i = number; i >= 2; i--) {
            factorial = factorial.multiply(new BigInteger("" + i));
        }
        return factorial;
    }
}
