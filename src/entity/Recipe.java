package entity;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Recipe {
//    private String uri;
    private String label;
    private String image;
    private String source;
    private String url;
    private String shareAs;
    @SerializedName(value="servings",alternate = "yield")
    private float servings;
    //ArrayList < Object > dietLabels = new ArrayList < Object > ();
    //private enum healthLabels{vegan, vegetarian, paleo, dairy-free, gluten-free, wheat-free, fat-free, low-sugar, egg-free, peanut-free, tree-nut-free, soy-free, fish-free, shellfish-free};
    //ArrayList < Object > cautions = new ArrayList< Object >();
    ArrayList < String > ingredientLines = new ArrayList < String > ();
    ArrayList <Ingredient> ingredients = new ArrayList<>();
    private float calories;
    private float totalWeight;
    //TotalNutrients TotalNutrientsObject;
    //TotalDaily TotalDailyObject;
    //ArrayList < Object > digest = new ArrayList < Object > ();

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }


    // Getter Methods

//    public String getUri() {
//        return uri;
//    }

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public String getLabel() {
        return label;
    }

    public String getImage() {
        return image;
    }

    public String getSource() {
        return source;
    }

    public String getUrl() {
        return url;
    }

    public String getShareAs() {
        return shareAs;
    }

    public float getServings() {
        return servings;
    }

    public float getCalories() {
        return calories;
    }

    public float getTotalWeight() {
        return totalWeight;
    }

    //    public TotalNutrients getTotalNutrients() {
//        return TotalNutrientsObject;
//    }
//
//    public TotalDaily getTotalDaily() {
//        return TotalDailyObject;
//    }

    // Setter Methods

//    public void setUri(String uri) {
//        this.uri = uri;
//    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setShareAs(String shareAs) {
        this.shareAs = shareAs;
    }

    public void setServings(float servings) {
        this.servings = servings;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public void setTotalWeight(float totalWeight) {
        this.totalWeight = totalWeight;
    }

//    public void setTotalNutrients(TotalNutrients totalNutrientsObject) {
//        this.TotalNutrientsObject = totalNutrientsObject;
//    }
//
//    public void setTotalDaily(TotalDaily totalDailyObject) {
//        this.TotalDailyObject = totalDailyObject;
//    }


    @Override
    public String toString() {
        return "Recipe{" +
                //"uri='" + uri + '\'' +
                "label='" + label + '\'' +
                ", image='" + image + '\'' +
                ", source='" + source + '\'' +
                ", url='" + url + '\'' +
                ", shareAs='" + shareAs + '\'' +
                ", servings=" + servings +
                ", ingredients=" + ingredients +
                ", calories=" + calories +
                ", totalWeight=" + totalWeight +
                '}';
    }
}