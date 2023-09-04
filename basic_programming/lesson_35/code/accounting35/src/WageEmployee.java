public class WageEmployee extends Employee{

    private double wage;

    public WageEmployee( int id, String firstName, String lastName, double hour, double wage){
        super(id,firstName,lastName,hour);
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "WageEmployee{" +
                "wage=" + wage +
                '}' + super.toString();
    }

    public double calculateSalary(){
        double salary = getHour() * wage;
        if( salary <= getHour() * StateConstants.MIN_WAGE){
            salary = getHour() * StateConstants.MIN_WAGE;
        }
        return salary;
    }
}
