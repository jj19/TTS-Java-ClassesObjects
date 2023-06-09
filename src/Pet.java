public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

    // Empty constructor
    public Pet() {
    }

    // Constructor with all attributes
    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Setter for location
    public void setLocation(String location) {
        this.location = location;
    }
}
