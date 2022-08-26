package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAskBonusIfAmountMoreThan1000() {
        int actual = service.remain(1800);
        int expected = 200;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldAskBonusIfAmountLessThan1000() {
        int actual = service.remain(500);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldAskBonusIfNoAmount() {
        int actual = service.remain(0);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void shouldNotAskForBonus() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

}