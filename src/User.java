import java.time.LocalDate;

public class User {
    private String login;
    private LocalDate lastLoginDate;
    private boolean isActive;
    private String pas = "secret_password";

    public String getLogin() {
        return login;
    }

    public LocalDate getLastLoginDate() {
        return lastLoginDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getPas() {
        return pas;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setLastLoginDate(LocalDate lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }

    public User(String login, LocalDate lastLoginDate, boolean isActive, String pas) {
        this.login = login;
        this.lastLoginDate = lastLoginDate;
        this.isActive = isActive;
        this.pas = pas;
    }

    @Deprecated(forRemoval = true, since = "2.0")
    public void purchase() {
        System.out.println("Купил");
    }
}
