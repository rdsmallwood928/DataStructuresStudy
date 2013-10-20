package time;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/12/13
 * Time: 1:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class PunchInPunchOut {

    public static void main(String[] args) {
        TimeCard timeCard = new TimeCard("1234-5678", 16.56, 8, 30);
        System.out.println(timeCard.payWorker(18, 30));
    }
}
