package Chapter9;

public class Main {

    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("adams", "john",
                "12345",200.0,0.25);


        System.out.println(commissionEmployee.toString());
        System.out.println("the employee earnings is " + commissionEmployee.earnings());

        System.out.println("***********************************");

        BaseCommissionEmployee baseCommissionEmployee = new BaseCommissionEmployee(commissionEmployee,
                300.0);

        System.out.println(baseCommissionEmployee.toString());
        System.out.println("the base salary employee earning is " + baseCommissionEmployee.earnings());
    }
}
