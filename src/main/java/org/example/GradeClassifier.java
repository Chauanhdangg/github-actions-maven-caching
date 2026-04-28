package org.example;

public class GradeClassifier {
    public static String classifyGrade(double gpa) {
        if (gpa < 0.0 || gpa > 10.0) {
            throw new IllegalArgumentException("Invalid GPA.");
        }
        if (gpa < 5.0) return "Weak";
        if (gpa < 6.5) return "Average";
        if (gpa < 8.0)  return "Good";
        return "Excellent";
    }
}
