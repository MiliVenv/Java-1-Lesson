import java.lang.reflect.*;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        User user = new User("Jane", LocalDate.now(), true, "dasda1321");
        Class<User> userClass = User.class;
        System.out.println(userClass.getSuperclass());

        Class<? extends User> userClassObject = user.getClass();
        System.out.println(userClass.equals(userClassObject));

        Field field = userClass.getDeclaredField("pas");
        field.setAccessible(true);
        System.out.println(field.get(user));
        field.set(user, "publicpas");
        System.out.println(user.getPas());
        Method method = userClass.getDeclaredMethod("purchase");
        System.out.println(method.getName());
        System.out.println(method.getReturnType());
        System.out.println(Arrays.toString(method.getDeclaredAnnotations()));
        int modifier = method.getModifiers();
        System.out.println(Modifier.isPublic(modifier));

        method.invoke(user);

    }
}
