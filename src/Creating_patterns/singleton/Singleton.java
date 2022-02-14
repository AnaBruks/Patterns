package Creating_patterns.singleton;

public class Singleton {                       // Double Checked Locking & volatile
    private static Singleton INSTANCE;

    private Singleton() { }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}