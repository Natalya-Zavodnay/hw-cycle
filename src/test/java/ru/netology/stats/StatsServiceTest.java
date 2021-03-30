package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void shouldReturnSum () {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.sum(sales);
        int expected = 180;
        assertEquals(expected,actual);
    }


    @Test
    void shouldReturnAverageAmount () {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.averageAmount(sales);
        int expected = 15;
        assertEquals(expected,actual);
    }

    @Test
    void shouldReturnMonthMaxSale () {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.maxNumberMonth(sales);
        int expected = 8;
        assertEquals(expected,actual);
    }
    @Test
    void shouldReturnMonthMinSale () {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.minNumberMonth(sales);
        int expected = 9;
        assertEquals(expected,actual);
    }
    @Test
    void shouldReturnCountMoreThanAverageAmount () {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.moreThanAverageAmount(sales);
        int expected = 5;
        assertEquals(expected,actual);
    }
    @Test
    void shouldReturnCountLessThanAverageAmount () {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.lessThanAverageAmount(sales);
        int expected = 5;
        assertEquals(expected,actual);
    }
}
