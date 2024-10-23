public class TwelveTask {
    public static void main(String[] args) {
        // Проходим по всем натуральным числам, начиная с 1
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            // Получаем i-е треугольное число
            int triangleNumber = getTriangleNumber(i);

            // Вычисляем количество делителей этого треугольного числа
            int countOfDivisors = getCountOfDivisors(triangleNumber);

            // Если количество делителей больше или равно 500, выводим номер треугольного числа и завершаем цикл
            if (countOfDivisors >= 500) {
                System.out.println("Первое треугольное число с более чем 500 делителями: " + triangleNumber);
                System.out.println("Номер этого треугольного числа: " + i);
                break;
            }
        }
    }

    // Функция для вычисления количества делителей числа
    public static int getCountOfDivisors(int number) {
        int count = 0;
        // Вычисляем квадратный корень числа для оптимизации поиска делителей
        int sqrt = (int) Math.sqrt(number);

        // Проходим по всем числам от 1 до квадратного корня числа
        for (long i = 1; i <= sqrt; i++) {
            // Если i является делителем числа
            if (number % i == 0) {
                // Увеличиваем счетчик делителей
                count++;
                // Если i не является точным квадратным корнем числа, добавляем также и число number / i
                if (i != number / i) {
                    count++;
                }
            }
        }
        // Возвращаем общее количество делителей
        return count;
    }

    // Функция для вычисления i-го треугольного числа
    public static int getTriangleNumber(int number) {
        int result = 0;
        // Суммируем все натуральные числа от 1 до number
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        // Возвращаем результат
        return result;
    }
}