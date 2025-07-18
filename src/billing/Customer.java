package billing;

public class Customer {
    private String name;
    private String houseNumber;
    private double unitConsumed;


    public Customer(String name, String houseNumber, double unitConsumed) {
        this.name = name;
        this.houseNumber = houseNumber;
        this.unitConsumed = unitConsumed;
    }

    public double calculateBill(){
        double bill = 0;
        double remainingUnits = 0;
        if(this.unitConsumed<=10){
            bill = this.unitConsumed*10;

        } else if (this.unitConsumed<=30) {
            remainingUnits= this.unitConsumed - 10;
            bill = (remainingUnits * 12.5)+ 100;

        }else {
            remainingUnits= this.unitConsumed - 30;
            bill= 100 + 250 + (remainingUnits * 2);
        }
        return bill;
    }

    public String getName() {
        return name;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public double getUnitConsumed() {
        return unitConsumed;
    }
}