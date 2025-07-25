package billing;

import java.time.LocalDate;
import java.util.ArrayList;

public class BillRecords {
    private static ArrayList<BillRecords> billRecordsList = new ArrayList<>();
    //Customer ko details
    // {customer details,bill amount, billing date}
    //TODO add a customer
    //TODO show a highest paying
    private Customer customer;
    private double billAmount;
    private LocalDate billingDate;


    public BillRecords(Customer customer, double billAmount){
        this.customer = customer;
        this.billAmount = billAmount;
        this.billingDate = LocalDate.now();
    }

    public static boolean addBillRecord(BillRecords billRecords){
        boolean isRecordAdded = false;
        if(billRecordsList.add(billRecords)){
            isRecordAdded = true;
        }
        return isRecordAdded;
    }

    public Customer getCustomer() {
        return customer;
    }
    public double getBillAmount() {
        return billAmount;
    }

    public LocalDate getBillingDate() {
        return billingDate;
    }

    public void printBill(){
        BillRecords record = BillRecords.showHighestPayingCustomer();
        System.out.println("Bill Details: ");
        System.out.println("Customer Name: "+ record.getCustomer().getName());
        System.out.println("House Number: "+ record.getCustomer().getHouseNumber());
        System.out.println("Units Consumed: "+record.getCustomer().getUnitConsumed());
        System.out.println("Bill Amount: " +record.getBillAmount());
        System.out.println("Billing Date: " +record.getBillingDate().toString());
    }

    public static BillRecords showHighestPayingCustomer(){
        BillRecords maxbillRecord = null;
        double maxBillAmount = 0;
        for (BillRecords billRecord: billRecordsList) {
            double billAmount = billRecord.getBillAmount();
            if (billAmount > maxBillAmount) {
                maxBillAmount = billAmount;
                maxbillRecord = billRecord;
            }
        }
        return maxbillRecord;
    }
}
