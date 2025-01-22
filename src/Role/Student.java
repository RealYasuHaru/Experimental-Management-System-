package Role;

public class Student extends User {
    private int mark;

    public Student(String id, String password, String name, char sex, int age, String city, String type) {
        super(id, password, name, sex, age, city, type);
    }


}
