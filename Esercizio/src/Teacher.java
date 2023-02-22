public class Teacher extends Student{
    public String teacherName;

    public Teacher(){
        System.out.println("The teacher was created");
    }

    public Teacher (String teacherName){
        System.out.println("The teacher name is " + teacherName);
    }
    public void assignGrade (Student student, int finalgrade){
        student.setGrade(finalgrade);
    }
}
