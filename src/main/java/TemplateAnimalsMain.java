import java.util.ArrayList;
import java.util.List;

public class TemplateAnimalsMain {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog("Rex"));
        animalList.add(new Cat("Kiki"));
        printAnimals(animalList);
    }

    static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }
}

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}