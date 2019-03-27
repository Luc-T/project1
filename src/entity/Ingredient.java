package entity;

/**
 * Created by u1863522 on 26/03/2019.
 */
public class Ingredient {
    private String text;
    private float weight;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "text='" + text + '\'' +
                ", weight=" + weight +
                '}';
    }
}
