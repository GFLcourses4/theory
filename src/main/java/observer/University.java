package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University implements Publisher{
    public static String MATH_COURSE = "Math";
    public static String ENGLISH_COURSE = "English";
    public static String PROGRAMMING_COURSE = "Programming";

    Map<String, List<Subscriber>> courses;

    public University() {
        courses = new HashMap<>();
        courses.put(MATH_COURSE, new ArrayList<>());
        courses.put(ENGLISH_COURSE, new ArrayList<>());
        courses.put(PROGRAMMING_COURSE, new ArrayList<>());
    }

    @Override
    public void subscribe(String courseName, Subscriber student) {
        courses.get(courseName).add(student);
    }

    @Override
    public void unsubscribe(String courseName, Subscriber student) {
        courses.get(courseName).remove(student);
    }

    @Override
    public void publishMessage() {
        List<Subscriber> mathStudents = courses.get(MATH_COURSE);
        publish(mathStudents, "Math lesson will be tomorrow at 9 o'clock");
        List<Subscriber> englishStudents = courses.get(ENGLISH_COURSE);
        publish(englishStudents, "English lesson won't be today at 5 o'clock");
        List<Subscriber> programmingStudents = courses.get(PROGRAMMING_COURSE);
        publish(programmingStudents, "Programming lesson will be today at 10 o'clock, not at 8 o'clock");
    }

    private void publish(List<Subscriber> students, String message) {
        students.forEach(student -> student.receiveMessage(message));
    }
}
