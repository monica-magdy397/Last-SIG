package SIG_Model;

import SIG_Controller.ActionsListener;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * monica
 */
public class Header {
    private int invoiceNumber;
    private Date invoiceDate;
    private String customer;
    private ArrayList<Items> lines;
    public Header() {
    }
    public Header(int invoiceNumber, Date invoiceDate, String customer) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.customer = customer;
    }
    public int getInvoiceNumber() {
        return invoiceNumber;
    }
    public Date getInvoiceDate() {
        return invoiceDate;
    }
    public String getcustomer() {
        return customer;
    }
    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    public void setcustomer(String customer) {
        this.customer = customer;
    }
    public void setLines(ArrayList<Items> lines) {
        this.lines = lines;
    }
    public ArrayList<Items> getLines() {
        if (lines == null){
            lines = new ArrayList<>();
        }
        return lines;
    }
    public double getTotal() {
        double total = 0.0;
        for (int i=0 ; i < getLines().size() ; i++ ){
            total += getLines().get(i).getItemTotal();
        }
        return total;
    }
    @Override
    public String toString() {
        return invoiceNumber + "," + ActionsListener.simpleDateFormat.format(invoiceDate) + "," + customer;
    }
}

