package previousExample;

import java.util.Date;

public class FulltimeEmp extends Employees{
    double basicSalary;
    double bonus;

    public FulltimeEmp() {
        super();
        basicSalary = 3600000;
        bonus = 0;
    }

    public FulltimeEmp(String Emid, String firstname, String lastname, Date DoB, double basicSalary, double bonus) {
        super(Emid, firstname, lastname, DoB);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() +  ", basicSalary = " + basicSalary + ", bonus = " + bonus;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double getSalary() {
        return (basicSalary + bonus);
        
    }
    
    
}
