public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " berkata: Meong meong!");
    }

    @Override
    public void play() {
        super.play();
        System.out.println(getName() + " bermain bola benang dan terlihat bahagia.");
    }
}