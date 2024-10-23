import java.math.BigInteger;

public class FifteenthTask {
    public static void main(String[] args) {
        // Задаем размеры сетки: n - общее количество шагов, k - количество шагов в одном направлении
        int n = 40;
        int k = 20;

        // Вычисляем количество маршрутов с помощью функции binomialCoefficient
        BigInteger result = binomialCoefficient(n, k);

        // Выводим результат
        System.out.println("Количество маршрутов в сетке 20x20: " + result);
    }

    // Функция для вычисления числа сочетаний C(n, k)
    public static BigInteger binomialCoefficient(int n, int k) {
        // Вычисляем числитель - факториал от n
        BigInteger numerator = factorial(n);

        // Вычисляем знаменатель - произведение факториалов от k и (n - k)
        BigInteger denominator = factorial(k).multiply(factorial(n - k));

        // Возвращаем результат деления числителя на знаменатель
        return numerator.divide(denominator);
    }

    // Функция для вычисления факториала числа num
    public static BigInteger factorial(int num) {
        // Инициализируем результат значением 1 (факториал 0 и 1 равен 1)
        BigInteger result = BigInteger.ONE;

        // Вычисляем факториал числа num
        for (int i = 2; i <= num; i++) {
            // Умножаем текущий результат на i
            result = result.multiply(BigInteger.valueOf(i));
        }

        // Возвращаем результат
        return result;
    }
}