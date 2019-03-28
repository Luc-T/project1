package entity;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    private static ArrayList<String> likeIngredients = new ArrayList<>();
    private static ArrayList<String> dislikeIngredients = new ArrayList<>();

    public static ArrayList<String> getLikeIngredients() {
        return likeIngredients;
    }

    public static void setLikeIngredients(ArrayList<String> likeIngredients) {
        Main.likeIngredients = likeIngredients;
    }

    public static ArrayList<String> getDislikeIngredients() {
        return dislikeIngredients;
    }

    public static void setDislikeIngredients(ArrayList<String> dislikeIngredients) {
        Main.dislikeIngredients = dislikeIngredients;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("prefScene.fxml"));
        primaryStage.setTitle("Scran Plan");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
