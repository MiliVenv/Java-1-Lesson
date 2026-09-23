import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager ();
        manager.AddNewUser(new User ("misha", "12154", LocalDate.of(2020, 10, 10)));
        manager.AddNewUser(new User ("vaniax", "goule", LocalDate.now())) ;
        manager.AddNewUser(new User ("petr", "pokemon", LocalDate.of(2021, 10, 10))) ;
        manager.AddNewUser(new User ("ira", "root", LocalDate.of(2022, 10,10)));
        System.out.println();
        manager.getAllUsers();
    }
}
