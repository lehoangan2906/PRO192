/**
 *
 * @author edward
 */
public class Buyer extends Human{
    String company;
    String paymentMethod;

    public Buyer() {
    }

    public Buyer(String name, String address, String taxId, String cardNumber, String company, String paymentMethod) {
        super(name, address, taxId, cardNumber);
        this.company = company;
        this.paymentMethod = paymentMethod;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return super.toString() + "company = " + company + ", paymentMethod = " + paymentMethod ;
    }
    
    
    
}
