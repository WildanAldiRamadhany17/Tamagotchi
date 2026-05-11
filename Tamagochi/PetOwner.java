public class PetOwner {
    private final String ownerName;
    private final Pet pet;

    public PetOwner(String ownerName, Pet pet) {
        this.ownerName = ownerName;
        this.pet = pet;
    }

    public void feedPet() {
        Food defaultFood = new Food("Makanan Biasa", 20);
        pet.eat(defaultFood);
        System.out.println(ownerName + " memberi " + defaultFood.getFoodName() + " ke " + pet.getName() + ".");
    }

    public void feedPet(Food food) {
        pet.eat(food);
        System.out.println(ownerName + " memberi " + food.getFoodName() + " ke " + pet.getName() + ".");
    }

    public void playWithPet() {
        pet.play();
        System.out.println(ownerName + " bermain bersama " + pet.getName() + ".");
    }

    public void putPetToSleep() {
        pet.sleep();
        System.out.println(ownerName + " menidurkan " + pet.getName() + ".");
    }

    public Pet getPet() {
        return pet;
    }
}