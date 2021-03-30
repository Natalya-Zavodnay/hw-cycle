package ru.netology.stats;

public class StatsService {

    public int sum(int[] items) {
        int sum = 0;
        for (int item : items) {
            sum += item;
        }
        return sum;
    }

    public int averageAmount(int[] items) {
        int sum = sum(items);


        return sum / items.length;
    }


    public int maxNumberMonth(int[] items) {
        int max = items[0];
        for (int item : items) {
            if (item > max) {
                max = item;
            }
        }

        int monthCount = 0;
        int resultMonth = 0;
        for (int item : items) {
            monthCount++;
            if (item == max) {
                resultMonth = monthCount;
            }
        }

        return resultMonth;
    }

    public int minNumberMonth(int[] items) {
        int min = items[0];
        for (int item : items) {
            if (item < min) {
                min = item;
            }
        }

        int monthCount = 0;
        int resultMonth = 0;
        for (int item : items) {
            monthCount++;
            if (item == min) {
                resultMonth = monthCount;
            }
        }

        return resultMonth;
    }

    public int moreThanAverageAmount(int[] items) {
        int monthCount = 0;
        int averageAmount = averageAmount(items);
        for (int item : items) {
            if (item > averageAmount) {
                monthCount++;
            }
        }

        return monthCount;
    }

    public int lessThanAverageAmount(int[] items) {
        int monthCount = 0;
        int averageAmount = averageAmount(items);
        for (int item : items) {
            if (item < averageAmount) {
                monthCount++;
            }
        }

        return monthCount;
    }
}
