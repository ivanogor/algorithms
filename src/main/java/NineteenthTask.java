public class NineteenthTask {
    public static void main(String[] args) {
        // Начальный день недели для 1 января 1901 года
        int dayOfWeek = 2; // 1 января 1901 года - вторник (понедельник + 1 день)
        int sundayCount = 0;

        // Проходим по годам с 1901 по 2000
        for (int year = 1901; year <= 2000; year++) {
            for (int month = 1; month <= 12; month++) {
                // Проверяем, является ли первое число месяца воскресеньем
                if (dayOfWeek == 0) {
                    sundayCount++;
                }

                // Обновляем день недели для первого числа следующего месяца
                dayOfWeek = (dayOfWeek + daysInMonth(year, month)) % 7;
            }
        }

        // Выводим результат
        System.out.println("Количество воскресений, выпадающих на первое число месяца в XX веке: " + sundayCount);
    }

    // Функция для определения количества дней в месяце
    public static int daysInMonth(int year, int month) {
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> 31;
        };
    }

    // Функция для определения, является ли год високосным
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
