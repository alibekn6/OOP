class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat () {
        System.out.println(name + " is eating");
    }

    public void makeSound() {
        System.out.println("Animal making sound");
    }


}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("default dog");
    }

    @Override
    public void eat() {
        System.out.println("Doggy " + name + " is eating his");
    }


    // overriding

    @Override
    public void makeSound() {
        System.out.println("Bark Bark!!!");
    }

    // overloading
    public void makeSound(int times, String sound) {
        for (int i = 0; i < times; i++) {
            System.out.print(sound + " ");
        }
    }

    public String getName() {
        return this.name;
    }
}


public class Problem1 {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        System.out.println("Dog 1 nam: " + d1.getName());
        d1.eat();
        d1.makeSound();
        d1.makeSound(3, "goof!");

        System.out.println();


        Dog d2 = new Dog("Buddy");
        System.out.println("Dog 2 name: " + d2.getName());
        d2.eat();
        d2.makeSound();
        d2.makeSound(2, "Arf---");

        System.out.println();

        Animal a = new Dog("Rex");
        a.eat();
        a.makeSound();
    }
}