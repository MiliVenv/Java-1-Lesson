public class Programer implements ProgramerBuilder {

    String FirstName;
    String LastName;
    Integer age;
    HardSkils hardSkils;
    SoftSkils softSkils;

    @Override
    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void setHardSkils(HardSkils hardSkils) {
        this.hardSkils = hardSkils;
    }

    @Override
    public void setSoftSkils(SoftSkils softSkils) {
        this.softSkils = softSkils;
    }

    @Override
    public String toString() {
        return "Programer{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", hardSkils=" + hardSkils +
                ", softSkils=" + softSkils +
                '}';
    }
}
