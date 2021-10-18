import java.io.Serializable;

public class Author implements Serializable {
    public Author(){}
    private String firstName;
    private String lastName;
    private int id;

    public void setId(int id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public String toString(){
        return ("Name: " + firstName + " " + lastName + " ID: "+ id);
    }
}
