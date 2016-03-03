package p1;

public class Main {

    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple()};

        for (Object each : objects) {
            if (each instanceof Edible)
                System.out.println(((Edible) each).HowToEat());
            if (each instanceof Animal)
                System.out.println(((Animal) each).sound());
        }
    }
}

interface Edible {
    public abstract String HowToEat();
}

abstract class Animal {
    //This is an abstract method that MUST be defined in non-abstract subclasses
    public abstract String sound();

}

class Chicken extends Animal implements Edible {

    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }

    @Override
    public String HowToEat() {
        return "Chicken: fry it";
    }
}

class Tiger extends Animal {

    @Override
    public String sound() {
        return "Tiger: ROAR";
    }
}

abstract class Fruit implements Edible {

}

class Apple extends Fruit {

    @Override
    public String HowToEat() {
        return "Apple: make apple cider";
    }
}

class Orange extends Fruit {

    @Override
    public String HowToEat() {
        return "Orange: make orange juice";
    }
}