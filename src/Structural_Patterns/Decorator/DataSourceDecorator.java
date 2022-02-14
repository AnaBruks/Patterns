package Structural_Patterns.Decorator;

public class DataSourceDecorator implements DataSource {
    // Базовый декоратор

    private DataSource wrappee;
    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }
    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }
    @Override
    public String readData() {
        return wrappee.readData();
    }
}
