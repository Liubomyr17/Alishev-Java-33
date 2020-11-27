
public class Test {
    public static void main(String[] args) {
/*
        // Upcasting dog -> animal
        Dog dog = new Dog();
        Animal animal = dog;

        // Downcasting animal -> dog
        Dog dog2 = (Dog) animal;
        dog2.bark();

 */

Animal a = new Animal();
Dog dog = (Dog)a;

    }
}