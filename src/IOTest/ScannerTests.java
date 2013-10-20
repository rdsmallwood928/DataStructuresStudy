package IOTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/12/13
 * Time: 2:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class ScannerTests {

    public static void main(String[] args) {
        try {
           Scanner fileIn = new Scanner(new FileReader("./resources/demo.dat"));
            while(fileIn.hasNext()) {
                System.out.println("Scanner found this: " + fileIn.next());
            }
            fileIn.close();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
