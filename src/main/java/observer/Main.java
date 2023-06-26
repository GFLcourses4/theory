package observer;

public class Main {
    public static void main(String[] args) {
        Publisher university = new University();

        Subscriber firstStudent = new Student("Katya");
        Subscriber secondStudent = new Student("Dima");
        Subscriber thirdStudent = new Student("Anna");

        university.subscribe("Math", firstStudent);
        university.subscribe("English", firstStudent);
        university.subscribe("Programming", firstStudent);

        university.subscribe("English", secondStudent);
        university.subscribe("Programming", secondStudent);

        university.subscribe("Math", thirdStudent);

        university.publishMessage();
        System.out.println("--------------------------------");

        university.unsubscribe("Math", firstStudent);
        university.unsubscribe("English", thirdStudent);

        university.publishMessage();
        System.out.println("--------------------------------");

        university.unsubscribe("English", secondStudent);

        university.publishMessage();
        System.out.println("--------------------------------");
    }
}
