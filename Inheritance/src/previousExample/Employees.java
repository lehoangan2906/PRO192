package previousExample;
import java.util.Date;

public class Employees {
    String Emid;
    String firstname;
    String lastname;
    Date DoB;
    
    public Employees(){
        Emid = "E9999999";
        firstname = "Anonymous";
        lastname = null;
        DoB = new Date(1900, 1, 1);
    }

    public Employees(String Emid, String firstname, String lastname, Date DoB) {
        this.Emid = Emid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.DoB = DoB;
    }

    public String getEmid() {
        return Emid;
    }

    public void setEmid(String Emid) {
        this.Emid = Emid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDoB() {
        return DoB;
    }

    public void setDoB(Date DoB) {
        this.DoB = DoB;
    }

    @Override
    public String toString() {
        return "Emid = " + Emid + ", firstname = " + firstname + ", lastname = " + lastname + ", DoB = " + DoB ;
    }
    
    
}
