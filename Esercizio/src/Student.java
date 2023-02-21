public class Student {
    public String name;
    public int grade;

    public Student(){
        System.out.println("the student is created");
    }
    void getStudentDetails(String name, int grade){
        System.out.println("The student name is " + name + " and his grade is " + grade);
    }
    //public int finalgrade;
}
