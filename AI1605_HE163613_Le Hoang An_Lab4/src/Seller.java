/**
 *
 * @author edward
 */
public class Seller extends Human{
    String phoneNum;

    public Seller() {
    }

    public Seller(String name, String address, String taxId,String cardNumber, String phoneNum) {
        super(name, address, taxId, cardNumber);
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return super.toString() +  " phoneNum = " + phoneNum;
    }
    
    
    
}
