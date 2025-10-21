package ru.netology.stats;

public class StatsService {
    public long totalSale(long[] sales) {
        long total = 0;
        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }
        return total;
    }

    public long averageSale(long[] sales) {
        long total = 0;
        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }
        long average = total / 12;
        return average;
    }

    public int monthMaxSale(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;

            }

        }
        return monthMax + 1;
    }

    public int monthMinSale(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;

            }

        }
        return monthMin + 1;
    }

    public int monthBellowAverage(long[] sales) {
        int counter = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }

    public int monthUnderAverage(long[] sales) {
        int counter = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }
}
