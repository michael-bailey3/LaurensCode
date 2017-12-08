package some.code.practice;

import java.util.List;

public class Lesson1 {

    /**
     * To learn conditional checking (e.g. if statement)
     * Method to check for eye colour and hair colour
     * @param hairColour
     * @param eyeColour
     * @return true if hairColour = "Blonde" and eyeColour = "Blue"
     */
    public boolean hasBlondeHairAndBlueEyes(String hairColour, String eyeColour){
        if (hairColour == "Blonde" && eyeColour == "Blue" ){
            return true;
        }
        else return false;
    }

    /**
     * To learn loop statements ( e.g. for or while loops)
     * Method to check each finger and see if it has a ring on it.
     * @param fingers
     * @return true if any value in the list of fingers contains "Ring"
     */
    public boolean hasRingOnFinger(List<String> fingers){
        return false;
    }

}
