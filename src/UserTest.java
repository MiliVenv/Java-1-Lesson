import java.io.*;

public class UserTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User();
        user.setName("Ваня");

        try (ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("user.dat"))) {
            ob.writeObject(user);
        }

        try (ObjectInputStream ob2 = new ObjectInputStream(new FileInputStream("user.dat"))) {
            User user2 = (User) ob2.readObject();
            System.out.println(user.equals(user2));
        }

    }
}
