public class Bird extends Pet {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " berkata: Cuit cuit!");
    }

    @Override
    public void play() {
        super.play();
        System.out.println(getName() + " terbang kecil mengelilingi kandang.");
    }
}