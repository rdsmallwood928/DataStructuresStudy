package employees;

import java.text.DecimalFormat;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/12/13
 * Time: 1:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class SalaryEmployee extends Employee {

    private DecimalFormat format = new DecimalFormat("#.00");
    private double salary;

    public SalaryEmployee(String employeeName, String empSSN, double salary) {
        super(employeeName, empSSN);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String payrollCheck() {
        return "Pay " + employeeName + " (" + empSSN + ")" + ":\t$" + format.format(salary);
    }

    public String toString() {
        return super.toString() + "\nStatus:\tSalaried" + "\nSalary:\t" + format.format(salary);
    }
}
