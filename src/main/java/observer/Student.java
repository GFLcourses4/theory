package observer;

public class Student implements Subscriber{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " receive new message: " + message);
    }
}
