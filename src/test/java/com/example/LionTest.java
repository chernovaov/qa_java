package com.example;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Feline mockFeline;

    private Lion lionFemale;

    @Before
    public void startLionTest() throws Exception {
        lionFemale = new Lion("Самка", mockFeline);
    }

    @Test
    public void lionGetFoodAsPredator() throws Exception {
        List<String> expectedListFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(mockFeline.getFood("Хищник")).thenReturn(expectedListFood);
        List<String> actualListFood = lionFemale.getFood();
        assertEquals("Самка льва - это Хищник. Список еды Хищника не совпадает с ожидаемым",
                expectedListFood, actualListFood);
    }

    @Test // перепроверить
    public void lionConstructorWrongGenderIsCorrectExceptionText()  {
        String expectedExceptionText = "Используйте допустимые значения пола животного - самец или самка";
        Exception exception = assertThrows(
                Exception.class,
                () -> new Lion("Саме", mockFeline)
        );
        assertEquals("Текст исключения при неверном значении пола не совпадает с ожидаемым",
                expectedExceptionText, exception.getMessage());
    }



    @Test
    public void lionGetKittensIsResultOneKitten()  {
        Mockito.when(mockFeline.getKittens()).thenReturn(1);
        int actualCountKittens = lionFemale.getKittens();
        int expectedCountKittens = 1;
        assertEquals("У самки льва 1 детеныш. Значение kittensCount должно быть 1",
                expectedCountKittens, actualCountKittens);
    }

}


