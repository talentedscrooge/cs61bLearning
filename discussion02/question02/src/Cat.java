public class Cat {
    public String name;
    public String noise;
    public static String cat_name = "feline";

    public Cat(String name, String noise) {
        this.name = name;
        this.noise = noise;
    }

    public void play() {
        System.out.println(noise + " I'm " + name + " the cat!");
    }

    public void anger() {
        noise = noise.toUpperCase();
    }

    public void calm() {
        noise = noise.toLowerCase();
    }


    public static void main(String[] args) {
        Cat a = new Cat("Cream", "Meow!");
        Cat b = new Cat("Tubbs", "Nyan!");
        a.play();
        b.play();
        a.anger();
        b.calm();
        a.play();
        b.play();
        System.out.println(Cat.cat_name);
    }
}

