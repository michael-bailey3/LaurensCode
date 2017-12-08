package some.code.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLesson1 {

    private Lesson1 lesson1 = new Lesson1();

    @Test
    public void testBlondeHairAndBlueEyes_withCorrectInput() {
      boolean result = lesson1.hasBlondeHairAndBlueEyes("Blonde","Blue");
      assertEquals(true, result);
    }

    @Test
    public void testBlondeHairAndBlueEyes_withWrongHairColour() {
        boolean result = lesson1.hasBlondeHairAndBlueEyes("Brown", "Blue");
        assertEquals(false, result);
    }


    @Test
    public void testBlondeHairAndBlueEyes_withWrongEyeColour() {
        boolean result = lesson1.hasBlondeHairAndBlueEyes("Blonde", "Brown");
        assertEquals(false, result);
    }


    @Test
    public void testBlondeHairAndBlueEyes_withBothWrongInputs() {
        boolean result = lesson1.hasBlondeHairAndBlueEyes("Red", "Green");
        assertEquals(false, result);
    }


    @Test
    public void testBlondeHairAndBlueEyes_withEmptyInputs() {
        boolean result = lesson1.hasBlondeHairAndBlueEyes("", "");
        assertEquals(false, result);
    }

    @Test
    public void testBlondeHairAndBlueEyes_withNullInputs() {
        boolean result = lesson1.hasBlondeHairAndBlueEyes(null, null);
        assertEquals(false, result);
    }

}
