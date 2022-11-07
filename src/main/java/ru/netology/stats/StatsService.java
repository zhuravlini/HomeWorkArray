package ru.netology.stats;

public class StatsService {

    //1. сумма всех продаж

    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    //2. Среднюю сумму продаж в месяц
    public long avrSales(long[] sales) {
        long avr = sumSales(sales) / sales.length;
        return avr;
    }

    //3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    //4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //5. Количество месяцев, в которых продажи были ниже среднего (см. п.2)

    public int countDownAvrSales(long[] sales) {
        int countDownAvr = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avrSales(sales)) {
                countDownAvr++;
            }
        }
        return countDownAvr;
    }

    //6. Количество месяцев, в которых продажи были выше среднего
    public int countUpAvrSales(long[] sales) {
        int countUpAvr = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avrSales(sales)) {
                countUpAvr++;
            }
        }
        return countUpAvr;
    }
}
