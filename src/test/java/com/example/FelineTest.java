package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
  private Feline iFeline;

    @Before
    public void startFelineTest()  {
        iFeline= new Feline();
    }

    @Test
    public void felineGetKittensNoArgsIsResultOneKitten()  {
        int actualCountKittens = iFeline.getKittens();
        int expectedCountKittens = 1;
        assertEquals("Для метода без параметров значение kittensCount должно быть 1",
                expectedCountKittens, actualCountKittens);
    }

    @Test
    public void felineGetFamilyIsCorrectFamily()  {
        String actualFamily = iFeline.getFamily();
        String expectedFamily = "Кошачьи";
        assertEquals("Неверное семейство. Ожидается значение: Кошачьи.",
                expectedFamily, actualFamily);
    }
    @Test
    public void felineEatMeetAsPredator() throws Exception {
        List<String> expectedListFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualListFood = iFeline.eatMeat();
        assertEquals("Кошачьи - это Хищники. Список еды Хищника не совпадает с ожидаемым",
                expectedListFood, actualListFood);
    }
}
