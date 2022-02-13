package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerServiceTest {
    CashbackHackerService service = new CashbackHackerService();


    @Test
    public void shouldBelowLimit() {
        int amount = 850;

        int actual = service.remain(amount);
        int expected = 150;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldLimit() {
        int amount = 1_000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveLimit() {
        int amount = 1_350;

        int actual = service.remain(amount);
        int expected = 650;

        assertEquals(expected, actual);
    }

}