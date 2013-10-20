package employees;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/12/13
 * Time: 1:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee {

    protected String employeeName;
    protected String empSSN;

    public Employee(String employeeName, String empSSN) {
        this.employeeName = employeeName;
        this.empSSN = empSSN;
    }

    public String payrollCheck() {
        return "";
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String toString() {
        return "Name:\t" + employeeName +
                "\nSS#:\t" + empSSN;
    }
}
