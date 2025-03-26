package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private final Animal animal;
    private final Timer timer;

    @Autowired
    public AnimalsCage(@Qualifier("dog") Animal animal, Timer timer) {
        this.timer = timer;
        this.animal = animal;
    }
    public void makeSound() {
        System.out.println("MakeSound:" + animal.makeSound());
        System.out.println("Time:" + timer.getTime());
    }



    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());  // Убедитесь, что Animal имеет хороший toString()
        System.out.println("At:");
                                         // Используйте уже внедрённый Timer, а не создавайте новый объект
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }



    public Timer getTimer() {
        return timer;
    }

}
