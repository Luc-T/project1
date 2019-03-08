package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Button doneBtn;
    public ListView dislikeList;
    private ObservableList<String> ingredients = FXCollections.observableArrayList();
    private ObservableList badIngredients = FXCollections.observableArrayList();
    private ObservableList<Recipes> meals = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Recipes chickenCurry = new Recipes("Chicken Curry", Arrays.asList("Chicken", "Rice", "Curry sauce", "Pepper"));
        Recipes spagBol = new Recipes("Spaghetti Bolognese", Arrays.asList("beef mince", "onion", "chopped tomatoes", "spaghetti"));
        Recipes vegStirFry = new Recipes("Veggie Stir Fry", Arrays.asList("Rice", "Carrot", "Pepper", "Peas"));

        meals.addAll(chickenCurry, spagBol, vegStirFry);
        dislikeList.setItems(findIngredients());

    }
    public void addDislike() {
        if (!badIngredients.contains(dislikeList.getSelectionModel().getSelectedItem())) {
            badIngredients.add(dislikeList.getSelectionModel().getSelectedItem());
            System.out.println(badIngredients);
        }
    }

    public ObservableList<String> findIngredients() {
        for (Recipes x : meals) {
            ingredients.addAll(x.getIngredients());

        }
        return ingredients;
    }

    public void openLikes(ActionEvent actionEvent) throws IOException {
        Window likesWindow = doneBtn.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("likeScene.fxml"));
        likesWindow.getScene().setRoot(newRoot);
    }
}
