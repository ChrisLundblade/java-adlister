package personSubFolder;

public class Person {
    protected String firstName;
    protected String lastName;
    protected int id;
    protected int age;

    public Person(String firstName, String lastName, int id, int age){
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
        this.age = age;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

}
