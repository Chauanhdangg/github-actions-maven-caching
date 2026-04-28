import org.example.GradeClassifier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GradeClassifierTest {
    @Test
    void testClassifyGrade() {
        assertAll(
                () -> assertEquals("Weak", GradeClassifier.classifyGrade(0.0), "GPA 0.0"),
                () -> assertEquals("Weak", GradeClassifier.classifyGrade(2.5), "GPA 2.5"),
                () -> assertEquals("Weak", GradeClassifier.classifyGrade(4.9), "GPA 4.9"),

                () -> assertEquals("Average", GradeClassifier.classifyGrade(6.0), "GPA 6.0"),
                () -> assertEquals("Average", GradeClassifier.classifyGrade(6.4), "GPA 6.4"),
                () -> assertEquals("Average", GradeClassifier.classifyGrade(5.0), "GPA 5.0"),

                () -> assertEquals("Good", GradeClassifier.classifyGrade(7.0), "GPA 7.0"),
                () -> assertEquals("Good", GradeClassifier.classifyGrade(7.9), "GPA 7.9"),
                () -> assertEquals("Good", GradeClassifier.classifyGrade(6.5), "GPA 6.5"),

                () -> assertEquals("Excellent", GradeClassifier.classifyGrade(8.1), "GPA 8.1"),
                () -> assertEquals("Excellent", GradeClassifier.classifyGrade(10), "GPA 10.O")
        );
    }
    @Test
    void testInvalidGrade() {
        Exception exception1 = assertThrows(IllegalArgumentException.class, () -> {
            GradeClassifier.classifyGrade(-0.1);
        });
        assertEquals("Invalid GPA.", exception1.getMessage());

        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> {
            GradeClassifier.classifyGrade(10.1);
        });
        assertEquals("Invalid GPA.", exception2.getMessage());
    }

    @Test
    void testClassify() {
        assertEquals("Excellent", GradeClassifier.classifyGrade(9.0));
        assertEquals("Good", GradeClassifier.classifyGrade(7.5));
    }
}
