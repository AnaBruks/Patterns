package Creating_patterns.fabric_pattern;

public class FactoryMethod {
    public Bakeable getDon(DonTypes type) {
        Bakeable Don = null;
        switch (type) {
            case CHERRY:
                Don = new CherryDon();
                break;
            case CHOKO:
                Don = new ChokoDon();
                break;
            case GAVNO:
                Don = new GavnoDon();
                break;
            default:
                throw new IllegalArgumentException("Wrong doughnut type:" + type);
        }
        return Don;
    }
}
