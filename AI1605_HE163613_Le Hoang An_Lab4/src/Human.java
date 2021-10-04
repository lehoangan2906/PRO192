/**
 *
 * @author edward
 */
public class Human {
    private String name;
    private String address;
    private String taxId;
    private String cardNumber;

    public Human() {
    }

    public Human(String name, String address, String taxId, String cardNumber) {
        this.name = name;
        this.address = address;
        this.taxId = taxId;
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "name = " + name + ", address = " + address + ", taxId = " + taxId + " cardNumber = " + cardNumber;
    }
    
    
    
    
}
