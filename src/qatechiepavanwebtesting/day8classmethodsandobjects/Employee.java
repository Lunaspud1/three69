package qatechiepavanwebtesting.day8classmethodsandobjects;

public class Employee {
    //variables inside a cass
    int employee_id;
    String employee_name;
    String job;
    int employee_salary;

    //methods to display the data of employee's variables(return type has to be specified)
    public void display()
    {
        System.out.println(employee_id);
        System.out.println(employee_name);
        System.out.println(job);
        System.out.println(employee_salary);
    }
   /* //objects have to be created in the main methods only (using new keyword)
    public static void main (String args [])
    {
        Employee emp =new Employee();
        emp.employee_id= 101;
        emp.employee_name= "Ade Seye";
        emp.job= "AutomationTester";
        emp.employee_salary= 40000;

        //to call data of emp object
        emp.display();



        Employee emp1= new Employee();
        emp1.employee_id= 102;
        emp1.employee_name = "Ademiju Adeseye";
        emp1.job = "SDET";
        emp1.employee_salary = 50000;

        //to call data of emp2 object
        emp1.display();

    }

    */

}
