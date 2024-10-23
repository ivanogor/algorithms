import java.math.BigInteger;

public class SixteenthTask {
    public static void main(String[] args) {
        int sum = 0;
        BigInteger number = BigInteger.TWO;
        number = number.pow(1000);
        String numberString = number.toString();
        for (int i = 0; i < numberString.length(); i++) {
            sum += Character.getNumericValue(numberString.charAt(i));
        }
        System.out.println(sum);
    }
}
