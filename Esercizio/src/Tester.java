public class Tester {
    public static void main(String[] args) {
        System.out.println("-----------------------------");
        // creando due studenti
        Student student1 = new Student();
        Student student2 = new Student();
        student1.name = "Napoleone";
        student1.grade = 6;
        student2.name = "Marie Curie";
        student2.grade = 10;

        student1.getStudentDetails();
        student2.getStudentDetails();

        System.out.println("-----------------------------");
        // creando un insegnante + nome
        Teacher teacher = new Teacher( "Ghandi");

        System.out.println("------------------------------");
        // assegno i voti a due studenti

        teacher.assignGrade(student1,5);
        teacher.assignGrade(student2,9);
        student1.getStudentDetails();
        student2.getStudentDetails();
    }
}
