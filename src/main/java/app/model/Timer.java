package app.model;



import org.springframework.stereotype.Component;
import java.time.LocalTime;

@Component                             // Определяем как Spring-бин
public class Timer {
    private final LocalTime time;

    public Timer() {
        this.time = LocalTime.now(); // Сохраняем текущее время при создании объекта
    }

    public Long getTime() {
        return (long) time.getNano(); // Возвращаем сохранённое время
    }
}

