package qatechiepavanwebtesting.day8classmethodsandobjects;

public class  StudentMain {
    public static void main(String args[])
    {
        //create an object of the Student class as i cannot directly access the class
        //   Student std = new Student();
      /*  //approach1 : assign data using object reference
        std.student_id = 100;
        std.student_name = "Ade";
        std.grade = 'A';

        //call/print the variables inside Student methods
        std.show();
    }
      */
      /*  //approach2: assign the data using method
        std.setData(101, "AA", 'A');
        std.show();

        }
       */
        //approach3:
        //assign the data using constructor
        Student stu = new Student(102, "Kim", 'B');
        new Student(102, "Kim", 'B');
        stu.show();
    }
    }

