package employees;

import java.text.DecimalFormat;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/12/13
 * Time: 1:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class HourlyEmployee extends Employee {
    private double hourlyPay;
    private double hoursWorked;
    private DecimalFormat format = new DecimalFormat("#.00");


    public HourlyEmployee(String employeeName, String empSSN, double hourlyPay, double hoursWorked) {
        super(employeeName, empSSN);
        this.hourlyPay = hourlyPay;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String payrollCheck() {
        return "Pay " + employeeName + " (" + empSSN + "): " + format.format(hourlyPay*hoursWorked);
    }

    public String toString() {
        return super.toString() + "\nStatus:\tHourly\nHourlyPay:\t" + format.format(hourlyPay) + "\nHoursWorked:\t" + hoursWorked;
    }

}
