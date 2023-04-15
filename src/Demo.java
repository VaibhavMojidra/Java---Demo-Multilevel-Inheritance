class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking.");
    }
}

class Labrador extends Dog {
    public void fetch() {
        System.out.println("The Labrador is fetching.");
    }
}

public class Demo {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat(); // inherited from Animal
        labrador.bark(); // inherited from Dog
        labrador.fetch(); // inherited from Labrador
    }
}
