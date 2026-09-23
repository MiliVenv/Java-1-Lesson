import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Manager {
    private static Map<String, User> MapUser = new HashMap<>();

    boolean AddNewUser(User user) {
        if (MapUser.containsKey(user.getLogin())) {
            System.out.println("Пользователь под таким именем уже существует");
            return false;
        }else{
            System.out.println("Успешная регистрация");
            MapUser.put(user.getLogin(), user);
            return true;
        }
    }

    boolean LoginUser(String login, int password) {
        if (!MapUser.containsKey(login)) {
            System.out.println("Пользователя не существует");
            return false;
        }else if (MapUser.get(login).getPassword().equals(password)) {
            System.out.println("Успешный вход");
            return true;
        }else {
            System.out.println("Неверный логин или пароль");
            return false;
        }
    }

    boolean DeleteUser(String login) {
        if (MapUser.containsKey(login)) {
            MapUser.remove(login);
            System.out.println("Пользователь удалён");
            return true;
        }else {
            System.out.println("Пользователя не существует");
            return false;
        }
    }

    void getAllUsers() {
        System.out.println(MapUser.keySet());
    }

    boolean EditUser(User user) {
        if (!MapUser.containsKey(user.getLogin())) {
            System.out.println("Пользователя не существует");
            return false;
        }else{
            MapUser.put(user.getLogin(), user);
            return true;
        }
    }

}
