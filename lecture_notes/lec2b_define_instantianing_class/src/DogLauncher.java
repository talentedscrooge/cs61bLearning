public class DogLauncher {
    public static void main(String[] args) {
//        Two ways of constructing array of objects
        Dog[] dog_array = new Dog[2];
        dog_array[0] = new Dog(2);
        dog_array[1] = new Dog(100);
        dog_array[0].makeNoise();
        dog_array[1].makeNoise();

        Dog[] dogs = new Dog[]{new Dog(2), new Dog(70)};
        dogs[0].makeNoise();
        dogs[1].makeNoise();
        

        // static vs instance method
        Dog d1 = new Dog(15);
        Dog d2 = new Dog(100);
        Dog bigger_dog = Dog.maxDog(d1, d2);
        bigger_dog.makeNoise();

        Dog bigger_non_static = d1.maxDog(d2);
        bigger_non_static.makeNoise();

        // print out the class variable
        System.out.println(Dog.binomen);
    }
}
