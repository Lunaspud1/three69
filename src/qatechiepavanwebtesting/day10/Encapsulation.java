package qatechiepavanwebtesting.day10;

public class Encapsulation {

    private int acc_no;
    private String name;
    private double amount;

    //assign data into the variables above i.e. (Setters method)

    //get method for acc_no
    public int getAcc_no() {
        return acc_no;
    }
    //set data method for acc_no
    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
