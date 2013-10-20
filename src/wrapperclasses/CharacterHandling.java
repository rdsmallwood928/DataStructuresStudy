package wrapperclasses;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/12/13
 * Time: 12:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class CharacterHandling {

    public static void main(String[] args) {
        String test = "TB 56* U!";
        System.out.println(test + " after cleaning is " + cleanString(test));
    }

    public static String cleanString(String str) {
        String rtrStr = "";
        for(int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                rtrStr += Character.toUpperCase(str.charAt(i));
            }
        }
        return rtrStr;
    }
}
