package qatechiepavanwebtesting.day8classmethodsandobjects;

public class EmloyeeMain {
    //objects have to be created in the main methods only (using new keyword)
    public static void main(String args[]) {
        //create an objects of employee method
        Employee emp = new Employee();
        emp.employee_id = 101;
        emp.employee_name = "Ade Seye";
        emp.job = "AutomationTester";
        emp.employee_salary = 40000;

        //to call data/properties of emp object
        emp.display();

        Employee emp1 = new Employee();
        emp1.employee_id = 102;
        emp1.employee_name = "Ademiju Adeseye";
        emp1.job = "SDET";
        emp1.employee_salary = 50000;

        //to call data of emp2 object

    }
}