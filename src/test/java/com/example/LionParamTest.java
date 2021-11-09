package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamTest {
    private final String checkedGender;
    private final boolean expectedHasMane;

    public LionParamTest(String checkedGender, boolean expectedHasMane) {
        this.checkedGender = checkedGender;
        this.expectedHasMane = expectedHasMane;
    }
    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }
    @Test
    public void shouldBeCorrectHasMane() throws Exception {
      Feline feline = new Feline();
      Lion lion = new Lion (checkedGender,feline);
      boolean actualHasMane = lion.doesHaveMane();
      assertEquals("Значение hasMane (грива есть/отсутствует) не совпадает с ожидаемым",
              expectedHasMane, actualHasMane);
    }
}
