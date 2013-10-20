package wrapperclasses;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/12/13
 * Time: 12:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestIntegerAndDoubleWrappers {

    public static void main(String[] args) {
        int n = Integer.parseInt("45");
        double x  = Double.parseDouble("14.59");
        System.out.println("45 base-10 is " + Integer.toString(n));
        System.out.println("45 base-2 is " + Integer.toString(n, 2));
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(max + " base-10 is " + Integer.toString(max));
        System.out.println(max + " base-2 is " + Integer.toString(max, 2));
        System.out.println(min + " base-10 is " + Integer.toString(min));
        System.out.println(min + " base-2 is " + Integer.toString(min, 2));

    }
}
