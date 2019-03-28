package controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import entity.Ingredient;
import entity.Main;
import entity.Recipe;
import entityControllers.RecipeController;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.web.PopupFeatures;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;
import javafx.util.Callback;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class recipesSceneController implements Initializable{

    private RecipeController recipes = new RecipeController();

    @FXML
    private JFXButton goBackButton;

    @FXML
    private JFXListView<HBox> recipesListView;

    @FXML
    private Text secondsText;

    @FXML
    private Text secondsNumber;

    @FXML
    private void goToPreferencesPage(ActionEvent event) throws IOException {
        Window currentWindow = goBackButton.getScene().getWindow();
        currentWindow.setWidth(870);
        currentWindow.setHeight(655);
        Parent newRoot = FXMLLoader.load(getClass().getResource("../fxml/prefScene.fxml"));
        currentWindow.getScene().setRoot(newRoot);
    }

    private void setTimer() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            Integer interval = new Integer (30) ;
            public void run() {
                if(interval > 0)
                {
                    Platform.runLater(() -> secondsNumber.setText(interval.toString()));
                    interval--;
                }
                else {
                    goBackButton.setDisable(false);
                    timer.cancel();
                }
            }
        }, 1000,1000);
    }

    private void populateListView(){
        for (Recipe recipe:recipes.getRecipes()) {
            //System.out.println(recipe);
            HBox hBox = new HBox();
            hBox.setMinHeight(320);
            hBox.setMaxHeight(320);
            hBox.setPrefHeight(320);

            StackPane sp = new StackPane();
            sp.setPadding(new Insets(10,10,10,10));
            Image image = new Image(recipe.getImage());
            ImageView imageView = new ImageView(image);
            sp.getChildren().add(imageView);
            hBox.getChildren().add(sp);

            VBox titleVBox = new VBox();
            titleVBox.setMaxWidth(400);
            titleVBox.setMinWidth(400);
            titleVBox.setPrefWidth(400);
            String ingredientText = "Ingredients:\n";
            for (Ingredient ingredient:recipe.getIngredients()) {
                ingredientText += ingredient.getText()+"\n";
                //System.out.println(ingredient);
            }

            Text titleText = new Text(recipe.getLabel() + "\n\nServings: " + recipe.getServings()+"\n"+ ingredientText);
            titleText.setWrappingWidth(395);
            titleVBox.getChildren().add(titleText);
            hBox.getChildren().add(titleVBox);


            JFXButton recipeButton = new JFXButton("View Recipe Instructions");
            recipeButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    WebView wv = new WebView();
                    wv.getEngine().setCreatePopupHandler(new Callback<PopupFeatures, WebEngine>() {

                        @Override
                        public WebEngine call(PopupFeatures p) {
                            Stage stage = new Stage(StageStyle.UTILITY);
                            WebView wv2 = new WebView();
                            stage.setScene(new Scene(wv2));
                            stage.show();
                            return wv2.getEngine();
                        }
                    });


                    StackPane root = new StackPane();
                    root.getChildren().add(wv);

                    Scene scene = new Scene(root, 1800, 1000);
                    Stage primaryStage = new Stage();
                    primaryStage.setTitle("Recipe details");
                    primaryStage.setScene(scene);
                    primaryStage.show();
                    wv.getEngine().load(recipe.getUrl());
                    }
            });

            JFXButton nutritionButton = new JFXButton("View Nutrition Info");
            nutritionButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    WebView wv = new WebView();
                    wv.getEngine().setCreatePopupHandler(new Callback<PopupFeatures, WebEngine>() {

                        @Override
                        public WebEngine call(PopupFeatures p) {
                            Stage stage = new Stage(StageStyle.UTILITY);
                            WebView wv2 = new WebView();
                            stage.setScene(new Scene(wv2));
                            stage.show();
                            return wv2.getEngine();
                        }
                    });


                    StackPane root = new StackPane();
                    root.getChildren().add(wv);

                    Scene scene = new Scene(root, 1800, 1000);
                    Stage primaryStage = new Stage();
                    primaryStage.setTitle("Nutrition details");
                    primaryStage.setScene(scene);
                    primaryStage.show();
                    wv.getEngine().load(recipe.getShareAs());
                }
            });


            VBox vBox2 = new VBox();
            vBox2.setPadding(new Insets(10,10,10,10));
            vBox2.setSpacing(10);
            vBox2.getChildren().add(recipeButton);
            vBox2.getChildren().add(nutritionButton);
            hBox.getChildren().add(vBox2);
            recipesListView.getItems().add(hBox);
        }
    }

    private void createRecipes(){
        recipes.setRecipes(new ArrayList<>());
        try {
            recipes.getNewRecipes(Main.getLikeIngredients(),Main.getDislikeIngredients());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        createRecipes();
        System.out.println(recipes);
        goBackButton.setDisable(true);
        setTimer();
        populateListView();
    }
}
