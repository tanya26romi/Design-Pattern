import java.util.HashMap;

public class Toppings {

    HashMap<String, Float> topping = new HashMap<>();

    public HashMap<String, Float> getTopping() {
        return topping;
    }

    public void setTopping() {
        topping.put("Tomato", 5.0f);
        topping.put("Onion", 3.0f);
        topping.put("Bell Pepper", 7.0f);
        topping.put("Mushrooms", 7.0f);
        topping.put("Panner", 6.0f);
        topping.put("Olives", 9.0f);
        topping.put("Jalpinoes", 10.f);
    }
}
