package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParamTest {
    Feline feline = new Feline();

        private final int checkedArgKittensCount;
        private final int expectedResultKittensCount;

        public FelineParamTest(int checkedArgKittensCount, int expectedResultKittensCount) {
            this.checkedArgKittensCount = checkedArgKittensCount;
            this.expectedResultKittensCount = expectedResultKittensCount;
        }
        @Parameterized.Parameters
        public static Object[][] getData() {
            return new Object[][] {
                    {1, 1},
                    {2, 2},
                    {0, 0},
                    {-1, 0}
            };
        }
        @Test
        public void shouldBeCorrectKittensCount()  {

            int actualKittensCount = feline.getKittens(checkedArgKittensCount);
            assertEquals("Количество детенышей не совпадает ожидаемым",
                    expectedResultKittensCount, actualKittensCount);
        }
}
