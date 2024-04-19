package qatechiepavanwebtesting.day12.interfaceconcept;

public class PQR extends LMN implements ABC, XYZ
{
    public void m1() {
        System.out.println("This is m1 from parent ABC interface");
    }

    public void m2() {
        System.out.println("This is m2 method from parent XYZ interface");
    }

//    void m3() {
//        super.m3();
//    }

    public static void main(String args[]) {

        PQR pqr = new PQR();
        pqr.m1();
        pqr.m2();
        pqr.m3();

    }
}