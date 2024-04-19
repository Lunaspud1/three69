package qatechiepavanwebtesting.day10;

public class AccountMain {

    public static void main (String args [])
    {
        Encapsulation enc_obj = new Encapsulation();

        //calling setters method from Encapsulation class
        enc_obj.setAcc_no(12345);
        enc_obj.setName("Murphy");
        enc_obj.setAmount(50.50);

        //call getters
        System.out.println(enc_obj.getAcc_no());
        System.out.println(enc_obj.getName());
        System.out.println(enc_obj.getAmount());

    }
}
