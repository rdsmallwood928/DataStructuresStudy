package ChapterSixExcercises;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/14/13
 * Time: 8:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class RecursiveTest {

    public static void main(String[] args) {
        System.out.println(factorial(4));

        System.out.println(showBase(4, 3));
    }

    public static int factorial(int factorial) {
        if(factorial == 1) return factorial;
        else return factorial * factorial(factorial-1);
    }

    public static String showBase(int n, int b) {
        String digitChar = "0123456789abcdef";
        if(n == 0)  return "";
        else {
            return showBase(n/b, b) + digitChar.charAt(n % b);
        }
    }
}
