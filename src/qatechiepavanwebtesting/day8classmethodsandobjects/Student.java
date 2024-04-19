package qatechiepavanwebtesting.day8classmethodsandobjects;

public class Student {
    int student_id;
    String student_name;
    char grade;

    //approach1
    void show()
    {
        System.out.println(student_id+ "   "+ student_name+ "   "+ grade);
    }

    //approach2
    void setData(int id, String name, char g)
    {
        student_id=id;
        student_name=name;
        grade=g;
    }

    //approach3 (constructor)
    Student(int id, String name, char g)
    {
        student_id = id;
        student_name= name;
        grade=g;
    }
}

