import java.util.Date;

public class Invoice {
    private int invoiceID;
    private Date date;
    private float finalPrice;
    private float tax;
    private float licenseFee;
    private String customerSignature;

    public Invoice(int invoiceID, Date date, float finalPrice, float tax, float licenseFee, String customerSignature) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.finalPrice = finalPrice;
        this.tax = tax;
        this.licenseFee = licenseFee;
        this.customerSignature = customerSignature;
    }
}