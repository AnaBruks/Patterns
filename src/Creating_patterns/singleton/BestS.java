package Creating_patterns.singleton;

public class BestS {
    private static BestS instance;

    public static synchronized BestS getInstance() {
        if (instance == null) {
            instance = new BestS();
        }
        return instance;
    }
}
