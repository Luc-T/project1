package entityControllers;


import com.google.gson.*;
import entity.Ingredient;
import entity.Recipe;


import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class RecipeController {

    private String APIID = "76ac4c0b";
    private String APIKEY = "cc76510f453b696d7442e5e337cc431f";

    private ArrayList<Recipe> recipes = new ArrayList<>();

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void removeRecipe(Recipe recipe) {
        this.recipes.remove(recipe);
    }


    public String replaceSpacesInString(String stringToEdit, String replacement){
        return stringToEdit.replaceAll(" ",replacement);
    }

    public URL generateUrl(String ingredients, String excludedIngredients) throws IOException {
        String query = replaceSpacesInString(ingredients, "%2C+");
        URL path = new URL("https://api.edamam.com/search?");
        if (excludedIngredients == null) {
            URL url = new URL(path +"q=" + query +"&app_id=" + APIID + "&app_key=" + APIKEY);
            return url;
        } else {
            URL url = new URL(path +"q=" + query +"&app_id=" + APIID + "&app_key=" + APIKEY);
            return url;
        }
    }


    public static String parseURL(URL url)throws IOException {
        String ret = "";
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        byte[] buffer = new byte[1024];
        int count = 0;
        while ((count = bis.read(buffer, 0, 1024)) != -1) {
            ret += new String(buffer, 0, count);
        }
        bis.close();
        return ret;
    }

    public Recipe jsonToObject(String json){
        Recipe recipe = new Gson().fromJson(json, Recipe.class);
        return(recipe);
    }

    public void jsonToRecipes(String string){
        JsonParser parser = new JsonParser();
        JsonObject rootObj = parser.parse(string).getAsJsonObject();
        JsonArray recipesArray = rootObj.getAsJsonArray("hits");
        for (JsonElement i : recipesArray) {
            String test = i.toString().substring(10,i.toString().length()-35);
            Recipe recipeObj = new Gson().fromJson(test, Recipe.class);
            if (i.toString().equals("ingredients")){
                Ingredient ingredientObj = new Gson().fromJson(i, Ingredient.class);
                recipeObj.addIngredient(ingredientObj);
            }
//            JsonArray ingredientsArray = recipesArray.forEach(recipesArray.getAsJsonObject(i));
//            for (JsonElement ingredient:
//                 ) {
//
//            }
            recipes.add(recipeObj);
//            String     quoteid     = recipe.get("quoteid").getAsString();
//            String     dateEntered = recipe.get("date_entered").getAsString();
//            BigDecimal amount      = recipe.get("amount").getAsBigDecimal();
        }

    }

    public void getNewRecipes(String ingredients, String ingredientsToExclude) throws IOException{
//        if(jsonToObject(parseURL(generateUrl(ingredients,ingredientsToExclude)))==null){
//            throw new NullPointerException("No recipes found");
//        }
//        else{
            jsonToRecipes(parseURL(generateUrl(ingredients,ingredientsToExclude)));
        }
    //}

    @Override
    public String toString() {
        return "RecipeController{" +
                "APIID='" + APIID + '\'' +
                ", APIKEY='" + APIKEY + '\'' +
                ", recipes=" + recipes +
                '}';
    }

    public static void main(String[] args) throws IOException {
        RecipeController recipes = new RecipeController();
        System.out.println(recipes.generateUrl("bread",null));
        //recipes.jsonToRecipes();
        System.out.println(recipes);
        recipes.getNewRecipes("bread bacon",null);
        System.out.println(recipes);
    }
}
