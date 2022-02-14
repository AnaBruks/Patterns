package Structural_Patterns.Decorator;

public interface DataSource {
    //Интерфейс, задающий базовые операции чтения и записи данных

    void writeData(String data);
    String readData();
}
