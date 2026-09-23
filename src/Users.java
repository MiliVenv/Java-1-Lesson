import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Users {

    public boolean ValidateRegistration(String login, String password, String ConfirmPassword) throws PasswordConfirmExeption, EmptyLoginExeption, LengthExeption, InvalidCharacterExeption {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-1_]");
        Matcher matcher1 = pattern.matcher(login);
        Matcher matcher2 = pattern.matcher(password);
            Matcher matcher3 = pattern.matcher(ConfirmPassword);

        if ((login.trim() == "" || password.trim() == "" || ConfirmPassword.trim() == "") || login == null || password == null || ConfirmPassword == null) {
            throw new EmptyLoginExeption("Не может быть нулевым");
        }else if (login.trim().length() > 20 && password.trim().length() > 20 && ConfirmPassword.trim().length() > 20) {
            throw new LengthExeption("Нельзя больше 20");
        }else if (!(matcher1.find() || matcher2.find() || matcher3.find())) {
            throw new InvalidCharacterExeption("Не правельнные данные");
        }else if (!password.equals(ConfirmPassword)) {
            throw new PasswordConfirmExeption("Не правельный пароль");
        }else {
            return true;
        }
    }
}
