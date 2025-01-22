package Role;

public class User {

    private String id;
    private String password;
    private String name;

    private char sex;
    private int age;
    private String city;
    private String type;

    public User(String id, String password, String name, char sex, int age, String city, String type) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.city = city;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
