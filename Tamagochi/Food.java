public class Food {
    private final String foodName;
    private final int nutrition;

    public Food(String foodName, int nutrition) {
        this.foodName = foodName;
        this.nutrition = nutrition;
    }

    public int getNutrition() {
        return nutrition;
    }

    public String getFoodName() {
        return foodName;
    }
}