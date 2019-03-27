//package controllers;
//
//import entity.Recipe;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Parent;
//import javafx.scene.control.Button;
//import javafx.scene.control.ListView;
//import javafx.stage.Window;
//
//import java.io.IOException;
//import java.net.URL;
//import java.util.Arrays;
//import java.util.ResourceBundle;
//
//public class MainController implements Initializable {
//    public Button doneBtn;
//    public ListView dislikeList;
//    private ObservableList<String> ingredients = FXCollections.observableArrayList();
//    private ObservableList badIngredients = FXCollections.observableArrayList();
//    private ObservableList<Recipe> meals = FXCollections.observableArrayList();
//
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        Recipe chickenCurry = new Recipe("Chicken Curry", Arrays.asList("Chicken", "Rice", "Curry sauce", "Pepper"));
//        Recipe spagBol = new Recipe("Spaghetti Bolognese", Arrays.asList("beef mince", "onion", "chopped tomatoes", "spaghetti"));
//        Recipe vegStirFry = new Recipe("Veggie Stir Fry", Arrays.asList("Rice", "Carrot", "Pepper", "Peas"));
//
//        meals.addAll(chickenCurry, spagBol, vegStirFry);
//        dislikeList.setItems(findIngredients());
//
//    }
//    public void addDislike() {
//        if (!badIngredients.contains(dislikeList.getSelectionModel().getSelectedItem())) {
//            badIngredients.add(dislikeList.getSelectionModel().getSelectedItem());
//            System.out.println(badIngredients);
//        }
//    }
//
//    public ObservableList<String> findIngredients() {
//        for (Recipe x : meals) {
//            ingredients.addAll(x.getIngredients());
//
//        }
//        return ingredients;
//    }
//
//    public void openLikes(ActionEvent actionEvent) throws IOException {
//        Window likesWindow = doneBtn.getScene().getWindow();
//        Parent newRoot = FXMLLoader.load(getClass().getResource("../fxml/likeScene.fxml"));
//        likesWindow.getScene().setRoot(newRoot);
//    }
//}
