package ucu.edu;
import ucu.edu.task1.Student;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class task1Test {
    @Test
    void testStudentBuilder() {
        Student student = Student.builder()
                .firstName("Alice")
                .lastName("Smith")
                .gender("Female")
                .email("alice.smith@example.com")
                .age(22)
                .course("Math")
                .course("Physics")
                .course("Chemistry")
                .build();

        assertEquals("Alice", student.getFirstName());
        assertEquals("Smith", student.getLastName());
        assertEquals("Female", student.getGender());
        assertEquals("alice.smith@example.com", student.getEmail());
        assertEquals(22, student.getAge());

        assertNotNull(student.getCourses());
        assertEquals(3, student.getCourses().size());
        assertTrue(student.getCourses().containsAll(List.of("Math", "Physics", "Chemistry")));
    }

    @Test
    void testEmptyCourses() {
        Student student = Student.builder()
                .firstName("Bob")
                .lastName("Jones")
                .gender("Male")
                .email("bob.jones@example.com")
                .age(25)
                .build();

        assertEquals("Bob", student.getFirstName());
        assertEquals("Jones", student.getLastName());
        assertEquals("Male", student.getGender());
        assertEquals("bob.jones@example.com", student.getEmail());
        assertEquals(25, student.getAge());

        assertNotNull(student.getCourses());
        assertTrue(student.getCourses().isEmpty());
    }

    @Test
    void testToStringMethod() {
        Student student = Student.builder()
                .firstName("Charlie")
                .lastName("Brown")
                .gender("Male")
                .email("charlie.brown@example.com")
                .age(20)
                .course("Biology")
                .build();

        String expected = "Student(firstName=Charlie, lastName=Brown, gender=Male, email=charlie.brown@example.com, age=20, courses=[Biology])";
        assertEquals(expected, student.toString());
    }
}
