package Creating_patterns.singleton;

public class ston {
    private static ston INSTANCE;

    private ston() { }   //constructor

    public static ston getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ston();
        }
        return INSTANCE;
    }
}

