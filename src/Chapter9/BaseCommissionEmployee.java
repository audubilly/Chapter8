package Chapter9;

public class BaseCommissionEmployee {

    public CommissionEmployee commissionEmployee;
    public double baseSalary;


    public  BaseCommissionEmployee(CommissionEmployee commissionEmployee, double baseSalary){
            this.commissionEmployee = commissionEmployee;


            if(baseSalary < 0.0){
                throw new IllegalArgumentException("base salary must be >= 0.0");
            }
            this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {

        if(baseSalary < 0.0){
            throw new IllegalArgumentException("base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;

    }


    public double earnings(){
        return commissionEmployee.earnings() + getBaseSalary();
    }

    @Override
    public String toString() {
        return String.format("%s  and base salary is %.2f",commissionEmployee.toString(),getBaseSalary());
    }
}




