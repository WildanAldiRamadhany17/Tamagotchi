public abstract class Pet {
    private final String name;
    private int age;
    private int hunger;
    private int energy;
    private int mood;
    private int health;

    public Pet(String name) {
        this.name = name;
        this.age = 0;
        this.hunger = 50;
        this.energy = 70;
        this.mood = 70;
        this.health = 80;
    }

    public void eat() {
        applyNutrition(20);
    }

    public void eat(Food food) {
        if (food == null) {
            eat();
            return;
        }
        applyNutrition(food.getNutrition());
    }

    public void sleep() {
        energy += 30;
        hunger += 10;
        mood += 5;
        clampAllStats();
    }

    public void play() {
        energy -= 15;
        hunger += 10;
        mood += 15;
        health += 1;
        clampAllStats();
    }

    public abstract void makeSound();

    public void showstatus() {
        System.out.println("\n===== STATUS PET =====");
        System.out.println("Nama   : " + name);
        System.out.println("Umur   : " + age + " hari");
        System.out.println("Lapar  : " + hunger + "/100 (semakin kecil semakin baik)");
        System.out.println("Energi : " + energy + "/100");
        System.out.println("Mood   : " + mood + "/100");
        System.out.println("Sehat  : " + health + "/100");
        System.out.println("======================\n");
    }

    public void passTime() {
        age += 1;
        hunger += 8;
        energy -= 5;
        mood -= 4;

        if (hunger > 80) {
            health -= 8;
            mood -= 5;
        }
        if (energy < 20) {
            health -= 5;
        }
        if (mood < 20) {
            health -= 3;
        }

        clampAllStats();
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    private void applyNutrition(int nutrition) {
        int normalizedNutrition = Math.max(5, Math.min(40, nutrition));
        hunger -= normalizedNutrition;
        energy += normalizedNutrition / 4;
        mood += normalizedNutrition / 5;
        health += normalizedNutrition / 8;
        clampAllStats();
    }

    private void clampAllStats() {
        hunger = clamp(hunger);
        energy = clamp(energy);
        mood = clamp(mood);
        health = clamp(health);
    }

    private int clamp(int value) {
        return Math.max(0, Math.min(100, value));
    }
}