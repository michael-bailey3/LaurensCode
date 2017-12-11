package some.code.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testHasRingOnFinger_WithOneFinger_WithRing() {
        List<String> fingers = new ArrayList<String>();
        fingers.add("Ring");
        boolean result = lesson1.hasRingOnFinger(fingers);
        assertEquals(true, result);

    }

    @Test
    public void testHasRingOnFinger_WithOneFinger_WithoutRing() {
        List<String> fingers = new ArrayList<String>();
        fingers.add("NoRing");
        boolean result = lesson1.hasRingOnFinger(fingers);
        assertEquals(false, result);

    }

    @Test
    public void testHasRingOnFinger_WithManyFingers_WithRing() {
        List<String> fingers = new ArrayList<String>();
        fingers.add("Ring");
        fingers.add("NoRing");
        boolean result = lesson1.hasRingOnFinger(fingers);
        assertEquals(true, result);
    }

    @Test
    public void testHasRingOnFinger_WithManyFingers_WithoutRing() {
        List<String> fingers = new ArrayList<String>();
        fingers.add("NoRing");
        fingers.add("NoRing");
        boolean result = lesson1.hasRingOnFinger(fingers);
        assertEquals(false, result);
    }

    @Test
    public void testHasRingOnFinger_WithEmptyFingersListParam() {
        List<String> fingers = new ArrayList<String>();
        fingers.add("");
        fingers.add("");
        boolean result = lesson1.hasRingOnFinger(fingers);
        assertEquals(false, result);
    }

    @Test
    public void testHasRingOnFinger_WithNullFingersListParam() {
        boolean result = lesson1.hasRingOnFinger(null);
        assertEquals(false, result);
    }
}
