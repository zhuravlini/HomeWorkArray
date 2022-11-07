package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StatsServiceTest {

    @Test
    public void sumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumSales = 180;
        long actualSumSales = service.sumSales(sales);
        Assertions.assertEquals(expectedSumSales, actualSumSales);


//        @ParameterizedTest
//        @CsvFileSource(files = "src/test/resources/data01.csv")
//        public void sumSales(int expected, long[] sales) {
//            StatsService service = new StatsService();
//            long actual = service.sumSales(sales);
//            Assertions.assertEquals(expected, actual);
//        }
    }

    @Test
    public void avrSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAvrSales = 15;
        long actualAvrSales = service.avrSales(sales);
        Assertions.assertEquals(expectedAvrSales, actualAvrSales);

    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSales = 8;
        long actualMaxSales = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSales = 9;
        long actualMinSales = service.minSales(sales);
        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void countDownAvrSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDownAvr = 5;
        long actualDownAvr = service.countDownAvrSales(sales);
        Assertions.assertEquals(expectedDownAvr, actualDownAvr);
    }

    @Test
    public void countUpAvrSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedUpAvr = 5;
        long actualUpAvr = service.countUpAvrSales(sales);
        Assertions.assertEquals(expectedUpAvr, actualUpAvr);
    }


}


