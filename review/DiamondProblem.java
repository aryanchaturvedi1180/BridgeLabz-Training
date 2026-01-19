package review;

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Puppy extends Animal {
    void sound() {
        System.out.println("Puppy sound");
    }
}
class D extends Dog, Puppy {
}

public class DiamondProblem {
    public static void main(String[] args) {
        D d = new D();
        d.sound();
    }
}
