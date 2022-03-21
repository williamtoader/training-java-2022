import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Hello {
    public static void main(String[] args) {
        List<Automobile> myList = new ArrayList<>();
        myList.add(new Dacia());
        myList.add(new BMW());
        myList.add(new Automobile());
        myList.add(new Tesla());
        listAutomobiles(myList);
    }

    public static void listAutomobiles(List<? extends Automobile> myList) {
        for (Automobile a : myList) System.out.println(a.getType());
    }
}

class Automobile {
    protected String type = "Automobile";

    public String getType() {
        return type;
    }
}

class Dacia extends Automobile {
    public Dacia() {
        type = "Dacia";
    }
}

class BMW extends Automobile {
    public BMW() {
        type = "BMW";
    }
}

class Tesla extends Automobile {
    public Tesla() {
        type = "Tesla";
    }
}