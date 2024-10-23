public class EighteenthTask {
    public static void main(String[] args) {
        int[][] triangle = {
                {75},
                {95, 64},
                {17, 47, 82},
                {18, 35, 87, 10},
                {20, 4, 82, 47, 65},
                {19, 1, 23, 75, 3, 34},
                {88, 2, 77, 73, 7, 63, 67},
                {99, 65, 4, 28, 6, 16, 70, 92},
                {41, 41, 26, 56, 83, 40, 80, 70, 33},
                {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
                {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
                {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
                {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
                {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
                {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23}
        };

        // Вычисляем максимальную сумму пути
        int maxSum = calculateMaxSum(triangle);

        // Выводим результат
        System.out.println("Максимальная сумма пути: " + maxSum);
    }

    public static int calculateMaxSum(int[][] triangle) {
        // Создаем копию треугольника для хранения максимальных сумм
        int[][] maxSums = new int[triangle.length][];
        for (int i = 0; i < triangle.length; i++) {
            maxSums[i] = triangle[i].clone();
        }

        // Проходим по треугольнику снизу вверх
        for (int row = triangle.length - 2; row >= 0; row--) {
            for (int col = 0; col < triangle[row].length; col++) {
                // Вычисляем максимальную сумму для текущей позиции
                maxSums[row][col] += Math.max(maxSums[row + 1][col], maxSums[row + 1][col + 1]);
            }
        }

        // Вершина треугольника содержит максимальную сумму пути
        return maxSums[0][0];
    }
}
