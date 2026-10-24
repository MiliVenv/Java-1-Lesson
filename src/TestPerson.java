public class TestPerson {
    private String name;
    private int age;
    private String location;

    public TestPerson(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    @XmlAttribute(name = "Age")
    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
