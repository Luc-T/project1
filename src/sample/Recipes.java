package sample;

import java.util.List;

/**
 * Created by u1853355 on 08/03/2019.
 */
public class Recipes {
    private String name;
    private List<String> ingredients;

    public Recipes(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString () {
        return this.getName () + "    Ingredients:" + this.getIngredients ();
    }
}
