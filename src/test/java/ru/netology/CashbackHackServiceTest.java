package ru.netology;

class CashbackHackServiceTest {

    @org.testng.annotations.Test
    void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        org.testng.Assert.assertEquals(actual, expected);
    }


    @org.testng.annotations.Test
     public void bonus() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1500;

        int actual = cashbackHackService.bonus(amount);
        int expected = 100;

        org.testng.Assert.assertEquals(actual, expected);
    }
}