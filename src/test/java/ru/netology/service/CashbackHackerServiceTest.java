package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerServiceTest {
    CashbackHackerService service = new CashbackHackerService();

    @Test
    public void shouldBelowLimit() {
        int amount = 940;

        int actual = service.remain(amount);
        int expected = 60;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldLimit() {
        int amount = 1_000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAboveLimit() {
        int amount = 1_550;

        int actual = service.remain(amount);
        int expected = 450;

        assertEquals(actual, expected);
    }

}
