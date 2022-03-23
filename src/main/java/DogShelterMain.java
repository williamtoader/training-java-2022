import java.util.*;

public class DogShelterMain {
    public static void main(String[] args) {
        LinkedList<AnimalX> animalList = new LinkedList<>();
        TreeSet<AnimalX> animalSet = new TreeSet<>();

        /*

        [[value] next] -> [[otherValue] next] -> [[otherOtherValue] next] ...

         */


        AnimalX animal1 = new AnimalX();
        AnimalX animal2 = new AnimalX();
        AnimalX animal3 = new AnimalX();

        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);

        animalSet.add(animal1);
        animalSet.add(animal2);
        animalSet.add(animal3);
    }
}
