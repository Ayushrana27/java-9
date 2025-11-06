import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public StudentDAO studentDAO() {
        return new StudentDAO();
    }

    @Bean
    public StudentService studentService() {
        StudentService service = new StudentService();
        service.setStudentDAO(studentDAO()); // setter injection
        return service;
    }
}
