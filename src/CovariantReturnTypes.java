import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Flower {
    String whatsYourName();
}

class Jasmine implements Flower {
    @Override
    public String whatsYourName() {
        return "Jasmine";
    }
}

class Lily implements Flower {
    @Override
    public String whatsYourName() {
        return "Lily";
    }
}

abstract class Region {
    public abstract Flower yourNationalFlower();
}

class WestBengal extends Region {
    @Override
    public Flower yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    @Override
    public Flower yourNationalFlower() {
        return new Lily();
    }
}

public class CovariantReturnTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}
