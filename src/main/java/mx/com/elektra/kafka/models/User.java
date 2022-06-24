package mx.com.elektra.kafka.models;

public class User {
    private long id;
    private String name, lastName;
    
    public long getId() { return id; }
    public String getName() { return name; }
    public String getLastName() { return lastName; }

    public void setId(long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    @Override
    public String toString() {
        return "User [id=" + id + ", name="
            + name + ", lastName=" + lastName + "]";
    }
}
