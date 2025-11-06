// StudentService.java
public class StudentService {
    private StudentDAO studentDAO;

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public void showStudent() {
        studentDAO.displayStudent();
    }
}

// StudentDAO.java
public class StudentDAO {
    public void displayStudent() {
        System.out.println("Student Details: [Name: Ayush, ID: 101]");
    }
}
