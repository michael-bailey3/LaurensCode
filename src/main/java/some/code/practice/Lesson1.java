package some.code.practice;

public class Lesson1 {

    /**
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

}
