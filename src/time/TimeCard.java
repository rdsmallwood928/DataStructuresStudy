package time;

import java.text.DecimalFormat;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/12/13
 * Time: 12:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class TimeCard {

    private String workerId;
    private double payrate;
    private Time24 punchInTime;
    private Time24 punchOutTime;

    public TimeCard(String workerId, double payrate, int startHour, int startMinute) {
        this.workerId = workerId;
        this.payrate = payrate;
        this.punchInTime = new Time24(startHour, startMinute);
        this.punchOutTime = new Time24();
    }

    public String payWorker(int punchOutHour, int punchOutMinute) {
        punchOutTime.setTime(punchOutHour, punchOutMinute);
        Time24 timeWorked = punchInTime.interval(punchOutTime);
        double hoursWorked = timeWorked.getHour() + timeWorked.getMinute()/60;
        DecimalFormat format = new DecimalFormat("0.00");
        return "Worker: " + workerId + "\n" +
                "StartTime: " + punchInTime + "\n" +
                "EndTime: " + punchOutTime + "\n" +
                "TotalTime: " + format.format(hoursWorked) + "\n" +
                "TotalPay: $" + format.format(hoursWorked*payrate);
    }
}

