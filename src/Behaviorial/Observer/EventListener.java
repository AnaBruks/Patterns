package Behaviorial.Observer;

import java.io.File;

public interface EventListener {                // Интерфейс подписчиков
    void update(String eventType, File file);
}
