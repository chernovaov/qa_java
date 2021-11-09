package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
  private Feline testFeline;

    @Before
    public void startFelineTest()  {
        testFeline= new Feline();
    }

    @Test
    public void felineGetKittensNoArgsIsResultOneKitten()  {
        int actualCountKittens = testFeline.getKittens();
        int expectedCountKittens = 1;
        assertEquals("Для метода без параметров значение kittensCount должно быть 1",
                expectedCountKittens, actualCountKittens);
    }

    @Test
    public void felineGetFamilyIsCorrectFamily()  {
        String actualFamily = testFeline.getFamily();
        String expectedFamily = "Кошачьи";
        assertEquals("Неверное семейство. Ожидается значение: Кошачьи.",
                expectedFamily, actualFamily);
    }
    @Test
    public void felineEatMeetAsPredator() throws Exception {
        List<String> expectedListFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualListFood = testFeline.eatMeat();
        assertEquals("Кошачьи - это Хищники. Список еды Хищника не совпадает с ожидаемым",
                expectedListFood, actualListFood);
    }
}
