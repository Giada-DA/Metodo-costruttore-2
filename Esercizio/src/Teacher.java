public class Teacher extends Student{
    public String teacherName;
    // ho l'insegnate
    public Teacher(){
        System.out.println("The teacher was created");
    }
    // assegno il nome
    public Teacher (String teacherName){
        System.out.println("The teacher name is " + teacherName);
    }
    public void assignGrade (Student student, int finalgrade){
        System.out.println("The final vote of " + student.name + " is " + finalgrade);
    }
}
