import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
//        try {
//            ReadFileJava();
//        } catch (MyExeption e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            ReadFileJavaTwo();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        Users users = new Users();
        try {
            users.ValidateRegistration("adsa", "123", "123");
        } catch (PasswordConfirmExeption e) {
            throw new RuntimeException(e);
        } catch (EmptyLoginExeption e) {
            throw new RuntimeException(e);
        } catch (LengthExeption e) {
            throw new RuntimeException(e);
        } catch (InvalidCharacterExeption e) {
            throw new RuntimeException(e);
        }
    }

    public static void ReadFileJava() throws MyExeption {
        try {
            BufferedReader fin = new BufferedReader(new FileReader("src/Main.java"));
            String line;
            while ((line = fin.readLine()) != null) System.out.println(line);
        }catch (FileNotFoundException e){
            throw new MyExeption("Путь указан неверно", "src/Main.java");
        }catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void ReadFileJavaTwo() throws IOException {
        BufferedReader fin = new BufferedReader(new FileReader("src/Main.java"));
        String line;
        while ((line = fin.readLine()) != null) System.out.println(line);
    }
}
