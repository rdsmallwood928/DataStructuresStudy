package employees;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/12/13
 * Time: 1:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class EmployeePayrollCheck {

    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Howard, Steve", "896-54-3217", 10.50, 40);
        SalaryEmployee salaryEmployee = new SalaryEmployee("Dunn, Moira", "456-14-3787", 800);
        System.out.println(hourlyEmployee);
        System.out.println(salaryEmployee);
    }
}
