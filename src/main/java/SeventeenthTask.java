public class SeventeenthTask {
    public static void main(String[] args) {
        int totalLetters = 0;

        // Проходим по всем числам от 1 до 1000
        for (int i = 1; i <= 1000; i++) {
            String numberInWords = numberToWords(i);
            // Считаем количество букв, игнорируя пробелы и дефисы
            int letterCount = countLetters(numberInWords);
            totalLetters += letterCount;
        }

        // Выводим результат
        System.out.println("Общее количество букв: " + totalLetters);
    }

    // Функция для преобразования числа в слова
    public static String numberToWords(int number) {
        if (number == 1000) {
            return "one thousand";
        }

        StringBuilder words = new StringBuilder();

        if (number >= 100) {
            words.append(ones[number / 100]).append(" hundred");
            if (number % 100 != 0) {
                words.append(" and ");
            }
            number %= 100;
        }

        if (number >= 20) {
            words.append(tens[number / 10]);
            if (number % 10 != 0) {
                words.append("-").append(ones[number % 10]);
            }
        } else if (number > 0) {
            words.append(ones[number]);
        }

        return words.toString();
    }

    // Функция для подсчета количества букв в строке, игнорируя пробелы и дефисы
    public static int countLetters(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    // Массивы для слов от 1 до 19 и десятков
    private static final String[] ones = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };
}
