package billing;

import java.util.Scanner;

public class BillingApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Enter 1: Calculate Bill");
            System.out.println("Enter 2: Show Highest Paying");
            System.out.println("Enter 3: Exit");
            int num = Integer.parseInt(scan.nextLine());
            if (num < 0) {
                System.out.println("Invalid Option, Please enter 1,2 or 3.");
            } else if(num == 1) {
                System.out.println("Enter Customer Name:");
                String customerName = scan.nextLine();
                System.out.println("Enter House number: ");
                String houseNumber = scan.nextLine();
                System.out.println("Enter units consumed: ");
                double unitsConsumed = Double.parseDouble(scan.nextLine());

                Customer customer = new Customer(customerName, houseNumber, unitsConsumed);
                double billAmount = customer.calculateBill();
                BillRecords record = new BillRecords(customer, billAmount);

                if(BillRecords.addBillRecord(record)){
                    System.out.println("Record added successfully....");
                //    System.out.println("Bill Info: ");
                    record.printBill();
                }else{
                    System.out.println("Failed...");
                }
            } else if (num == 2) {
                BillRecords record = BillRecords.showHighestPayingCustomer();
                System.out.println("Customer Name: "+ record.getCustomer().getName());
                System.out.println("House Number: "+ record.getCustomer().getHouseNumber());
                System.out.println("Units Consumed: "+ record.getCustomer().getUnitConsumed());
                System.out.println("Bill Amount: "+ record.getBillAmount());

            } else if (num == 3) {
                System.out.println("Exiting.......!!");
                break;
            } else {
                System.out.println("Invalid output");
            }

        }
        scan.close();
    }
}
