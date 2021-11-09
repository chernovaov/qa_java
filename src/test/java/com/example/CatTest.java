package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline mockFeline;

    private Cat miniCat;

    @Before
    public void startLionTest() {
        miniCat = new Cat(mockFeline);
    }

    @Test
    public void catGetSoundIsCorrect()  {
        String expectedCatSound = "Мяу";
        String actualCatSound = miniCat.getSound();
        assertEquals("Значение издаваемых звуков у кота не совпадает с ожидаемым",
                expectedCatSound, actualCatSound);
    }

    @Test
    public void catGetFoodIsCorrect() throws Exception {
        List<String> expectedListFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(mockFeline.eatMeat()).thenReturn(expectedListFood);
        List<String> actualListFood = miniCat.getFood();
        assertEquals("Кот - это Хищник. Список еды Хищника не совпадает с ожидаемым",
                expectedListFood, actualListFood);
    }
}
