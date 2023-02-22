public class Student {
    public String name;
    public int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(){
        System.out.println("the student is created");
    }
    void getStudentDetails(){
        System.out.println("The student name is " + name + " and his grade is " + grade);
    }

}
