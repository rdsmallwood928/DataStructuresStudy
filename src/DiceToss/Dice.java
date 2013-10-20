package DiceToss;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/12/13
 * Time: 3:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dice {

    private static Dice dice = null;
    private Random random;
    private int dice1;
    private int dice2;

    private Dice() {
        random = new Random();
        dice1 = 0;
        dice2 = 0;
    }

    public static Dice getDice() {
        if(dice == null) {
            dice = new Dice();
        }
        return dice;
    }

    public void toss() {
        dice1 = Math.abs(random.nextInt()%6);
        dice2 = Math.abs(random.nextInt()%6);
    }

    public int getDice1() {
        return dice1;
    }

    public int getDice2() {
        return dice2;
    }

    public int getTotal() {
        return dice1 + dice2;
    }

}

