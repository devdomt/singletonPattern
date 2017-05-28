/**
 * Created by dominik on 28.05.2017.
 */
public class Singleton {

    private static Singleton singletonInstance;

    private Singleton() {}

    public static Singleton getSingletonInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

}
