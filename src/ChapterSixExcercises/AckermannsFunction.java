package ChapterSixExcercises;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/14/13
 * Time: 8:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class AckermannsFunction {

    public static void main(String[] args) {
        int solution = ackermann(3,2147483647);
        System.out.println("Ackermann computed: " + solution);
    }

    public static int ackermann(int i, int j) {
        if(i==1) {
            int twoj = (int)Math.pow(2, j);
            System.out.println("i = " + i + ", j = " + j + ", A(i,j) = " + twoj);
            return twoj;
        } else if(j==1) {
            int jone = ackermann(i-1, 2);
            System.out.println("i = " + i + ", j = " + j + ", A(i,j) = " + jone);
            return jone;
        } else {
            int more = ackermann(i-1, ackermann(i, j-1));
            System.out.println("i = " + i + ", j = " + j + ", A(i,j) = " + more);
            return more;
        }
    }
}
